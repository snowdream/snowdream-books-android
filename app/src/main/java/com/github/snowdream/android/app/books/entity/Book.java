package com.github.snowdream.android.app.books.entity;

import android.text.TextUtils;
import org.parceler.Parcel;
import org.parceler.Transient;

import java.util.List;

/**
 * Created by hui.yang on 2015/1/24.
 */
@Parcel(Parcel.Serialization.METHOD)
public class Book {
    private List<BookItem> list = null;
    private BookItem cacheBookItem = null;
    private String language = null;

    /**
     * get from cache
     *
     * @param language
     * @return
     */
    @Transient
    private BookItem getBookItemFromCache(String language){
        if (!TextUtils.isEmpty(this.language) && this.language.equalsIgnoreCase(language)){
            return cacheBookItem;
        }
        return null;
    }

    /**
     * set to cache
     *
     * @param item
     * @param language
     */
    @Transient
    private void setBookItemToCache(BookItem item,String language){
            this.language = language;
            this.cacheBookItem = item;
    }


    /**
     * whether the book is empty.
     *
     * @return
     */
    private boolean isEmpty(){
        if (list == null || list.isEmpty()){
            return true;
        }

        return false;
    }

    @Transient
    private BookItem getBookItem(String language){
        if (isEmpty()){
            return null;
        }
        BookItem bookItem = null;
        BookItem defaultBookItem = null;

        //get from cache
        BookItem cachebookItem = getBookItemFromCache(language);
        if (cachebookItem != null){
            bookItem = cachebookItem;
            return bookItem;
        }

        for (BookItem item: list){
            if (TextUtils.isEmpty(language)){
                if (item.isDefault()){
                    bookItem = item;
                    defaultBookItem = item;
                    break;
                }
            }else{
                if (item.isDefault()){
                    defaultBookItem = item;
                }

                if (language.equalsIgnoreCase(item.getLanguage())){
                    bookItem = item;
                    break;
                }
            }
        }

        if (bookItem == null && defaultBookItem != null){
            bookItem = defaultBookItem;
        }


        //set to cache
        if (bookItem != null && !TextUtils.isEmpty(language)){
            setBookItemToCache(bookItem,language);
        }

        return bookItem;
    }

    @Transient
    public String getLanguage(String language) {
        BookItem item = getBookItem(language);
        if (item != null){
            return item.getLanguage();
        }

        return null;
    }

    @Transient
    public String getCountry(String language) {
        BookItem item = getBookItem(language);
        if (item != null){
            return item.getCountry();
        }

        return null;
    }

    @Transient
    public String getAuthor(String language) {
        BookItem item = getBookItem(language);
        if (item != null){
            return item.getAuthor();
        }

        return null;
    }

    @Transient
    public String getTitle(String language) {
        BookItem item = getBookItem(language);
        if (item != null){
            return item.getTitle();
        }

        return null;
    }

    @Transient
    public String getDesc(String language) {
        BookItem item = getBookItem(language);
        if (item != null){
            return item.getDesc();
        }

        return null;
    }

    public boolean isDefault(String language) {
        BookItem item = getBookItem(language);
        if (item != null){
            return item.isDefault();
        }

        return false;
    }

    @Transient
    public String getUrl(String language) {
        BookItem item = getBookItem(language);
        if (item != null){
            return item.getUrl();
        }

        return null;
    }

    @Transient
    public String getImg(String language) {
        BookItem item = getBookItem(language);
        if (item != null){
            return item.getImg();
        }

        return null;
    }

    public List<BookItem> getList() {
        return list;
    }

    public void setList(List<BookItem> list) {
        this.list = list;
    }
}
