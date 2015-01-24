package com.github.snowdream.android.app.books;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.snowdream.android.app.books.entity.Book;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.List;
import java.util.Locale;

/**
 * Created by hui.yang on 2015/1/24.
 */
public class SubjectAdapter extends BaseAdapter {
    private Context context = null;
    private List<Book> list = null;
    private LayoutInflater inflater = null;
    private String language = null;
    DisplayImageOptions options = null;

    private SubjectAdapter(){}

    public SubjectAdapter(Context context, List<Book> list) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        language = Locale.getDefault().getLanguage();

        options =  new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.ic_book)
                .showImageForEmptyUri(R.drawable.ic_book)
                .showImageOnFail(R.drawable.ic_book)
                .displayer(new FadeInBitmapDisplayer(500))
                .build();

    }

    @Override
    public int getCount() {
        if (list != null && !list.isEmpty()){
            return list.size();
        }

        return 0;
    }

    @Override
    public Book getItem(int position) {
        if (position >=  0 && position < getCount()){
            return  list.get(position);
        }
            return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            holder = new ViewHolder();

            convertView = inflater.inflate(
                    R.layout.fragment_subject_item, null);
            holder.imageView = (ImageView)convertView.findViewById(R.id.image);
            holder.title = (TextView)convertView.findViewById(R.id.title);
            holder.subtitle = (TextView)convertView.findViewById(R.id.subtitle);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        Book book = getItem(position);
        if (book != null){
            holder.title.setText(book.getTitle(language));
            holder.subtitle.setText(book.getDesc(language));
            ImageLoader.getInstance().displayImage(book.getImg(language), holder.imageView,options);
        }

        return convertView;
    }

    public final class ViewHolder {
        ImageView imageView;
        TextView title;
        TextView subtitle;
    }
}
