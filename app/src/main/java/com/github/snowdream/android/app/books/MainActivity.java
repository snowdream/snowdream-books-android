package com.github.snowdream.android.app.books;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;
import com.github.snowdream.android.app.books.controller.BookManager;
import com.github.snowdream.android.app.books.controller.CallBack;
import com.github.snowdream.android.app.books.entity.Book;
import com.github.snowdream.android.app.books.entity.Subject;
import com.github.snowdream.android.util.Log;
import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity implements NavigationDrawerCallbacks {

    private Toolbar mToolbar;
    private NavigationDrawerFragment mNavigationDrawerFragment;
    private  List<NavigationItem> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mNavigationDrawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_drawer);
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);

        items = new ArrayList<NavigationItem>();
        items.add(new NavigationItem(new Subject("REC000000","Recommend","https://raw.githubusercontent.com/snowdream/android-books/master/docs/test/recomend.json"), getResources().getDrawable(R.drawable.ic_menu_check)));

        mNavigationDrawerFragment.setMenu(items);
        mNavigationDrawerFragment.refresh();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        NavigationItem item  = items.get(position);
        Subject subject = item.getSubject();

        BookManager.getBooks(subject.getUrl(), new CallBack<List<Book>>() {
            @Override
            public void callback(List<Book> books) {
                Log.i(books.toString());
                if (books != null && !books.isEmpty()) {
                    SubjectFragment fragment = new SubjectFragment();

                    Bundle bundle = new Bundle();
                    bundle.putParcelable(SubjectFragment.KEY_SUBJECT_BOOKS, Parcels.wrap(books));
                    fragment.setArguments(bundle);

                    getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).addToBackStack(null).commit();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }
}
