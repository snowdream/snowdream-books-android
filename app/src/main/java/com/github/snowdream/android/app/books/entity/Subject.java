package com.github.snowdream.android.app.books.entity;

import android.text.TextUtils;

/**
 * Created by hui.yang on 2015/1/24.
 */
public class Subject {
    private String name = null;
    /**
     * for example, ANT000000 as a key for Antiques & Collectibles
     */
    private String key = null;
    private String url = null;

   private Subject(){
   };

    public Subject(String key, String name,String url){
        this.key = key;
        this.name = name;
        this.url = url;
    }

    /**
     * Whether the subject is valid.
     *
     * @return
     */
    public boolean isValid() {
        return !TextUtils.isEmpty(key) && !TextUtils.isEmpty(name) &&  !TextUtils.isEmpty(url);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
