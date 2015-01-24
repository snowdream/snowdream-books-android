package com.github.snowdream.android.app.books.entity;

import org.parceler.Parcel;

/**
 * Created by hui.yang on 2015/1/24.
 */
@Parcel(Parcel.Serialization.METHOD)
public class BookItem {
    private String language = null;
    private String country = null;
    private String author = null;
    private String title = null;
    private String desc = null;
    private boolean isDefault = false;
    private String url = null;
    private String img = null;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
