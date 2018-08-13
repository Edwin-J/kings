package minjae.history_israel_juda;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Minjae on 2018-08-13.
 */

public class GalleryAdapter extends BaseAdapter {
    Context context;
    int layout;
    int img[];
    LayoutInflater inflater;

    public GalleryAdapter(Context context, int layout, int[] img) {
        this.context = context;
        this.layout = layout;
        this.img = img;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int pos) {
        return null;
    }

    @Override
    public long getItemId(int pos) {
        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        if (view == null)
            view = inflater.inflate(layout, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        imageView.setImageResource(img[pos]);
        return view;
    }
}
