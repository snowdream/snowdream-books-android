package com.github.snowdream.android.app.books;

import android.graphics.drawable.Drawable;
import com.github.snowdream.android.app.books.entity.Subject;

/**
 * Created by poliveira on 24/10/2014.
 */
public class NavigationItem {
    private Subject mSubject;
    private Drawable mDrawable;

    public NavigationItem(Subject subject, Drawable drawable) {
        mSubject = subject;
        mDrawable = drawable;
    }

    public Subject getSubject() {
        return mSubject;
    }

    public void setText(Subject subject) {
        mSubject = subject;
    }

    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }
}
