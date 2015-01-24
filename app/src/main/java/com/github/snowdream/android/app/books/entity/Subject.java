package com.github.snowdream.android.app.books.entity;

import android.text.TextUtils;

import java.util.Locale;

/**
 * Created by hui.yang on 2015/1/24.
 */
public class Subject {
    private String zh_name = null;
    private String en_name = null;
    /**
     * for example, ANT000000 as a key for Antiques & Collectibles
     */
    private String key = null;
    private String url = null;
    private String language = null;

   private Subject(){
   };

    public Subject(String key, String en_name, String zh_name,String url){
        this.key = key;
        this.en_name = en_name;
        this.zh_name = zh_name;
        this.url = url;

        language = Locale.getDefault().getLanguage();
    }

    /**
     * Whether the subject is valid.
     *
     * @return
     */
    public boolean isValid() {
        return !TextUtils.isEmpty(key) && !TextUtils.isEmpty(en_name) &&  !TextUtils.isEmpty(url);
    }

    public String getZh_name() {
        return zh_name;
    }

    public void setZh_name(String zh_name) {
        this.zh_name = zh_name;
    }

    public String getEn_name() {
        return en_name;
    }

    public void setEn_name(String en_name) {
        this.en_name = en_name;
    }

    public String getName() {
        if (language.equalsIgnoreCase("zh")){
            return  getZh_name();
        }else{
            return getEn_name();
        }
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
