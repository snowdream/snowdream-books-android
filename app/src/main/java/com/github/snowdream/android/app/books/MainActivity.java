/*
 * Copyright (C) 2014 Snowdream Mobile <yanghui1986527@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.snowdream.android.app.books;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.*;
import com.github.snowdream.android.util.Log;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import fr.castorflex.android.smoothprogressbar.SmoothProgressBar;

import java.util.Locale;


public class MainActivity extends Activity {
    private static final String TEST_DEVICE_ID = "INSERT_YOUR_TEST_DEVICE_ID_HERE";

    private WebView webView = null;
    private SmoothProgressBar progressbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }

    private void initUI() {
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        progressbar = (SmoothProgressBar) findViewById(R.id.progressbar);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setUseWideViewPort(true);
        String appCachePath = getApplicationContext().getCacheDir().getAbsolutePath();
        webSettings.setAppCachePath(appCachePath);
        webSettings.setAppCacheEnabled(true);


        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressbar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressbar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                progressbar.setVisibility(View.INVISIBLE);
            }
        });
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                return super.onJsAlert(view, url, message, result);
            }
        });

        webView.loadUrl("http://denisshevchenko.github.io/ohaskell/");


        // The "loadAdOnCreate" and "testDevices" XML attributes no longer available.
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice(TEST_DEVICE_ID)
                .build();
        adView.loadAd(adRequest);


        //for test
//        Locale[] locals = Locale.getAvailableLocales();
//        for (Locale locale : locals) {
//            StringBuilder builder = new StringBuilder();
//            builder.append("Local Country: ");
//            builder.append( locale.getCountry());
//            builder.append(" Language: ");
//            builder.append( locale.getLanguage());
//            builder.append(" Variant: ");
//            builder.append(locale.getVariant());
//            builder.append(" DisplayCountry: ");
//            builder.append( locale.getDisplayCountry());
//            builder.append( " DisplayLanguage: " );
//            builder.append(locale.getDisplayLanguage());
//            builder.append("  DisplayName:  ");
//            builder.append( locale.getDisplayName());
//            builder.append(" DisplayVariant: ");
//            builder.append(locale.getDisplayVariant());
//            Log.i(builder.toString());
//        }

    }

    @Override
    protected void onDestroy() {
        webView.stopLoading();
        webView.destroy();
        super.onDestroy();
    }

    public boolean onKeyDown(int keyCoder, KeyEvent event) {
        if (webView.canGoBack() && keyCoder == KeyEvent.KEYCODE_BACK) {
            webView.goBack();

            return true;
        }
        return false;
    }

}
