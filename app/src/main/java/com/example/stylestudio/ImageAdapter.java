package com.example.stylestudio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * الخطوة 4: كلاس مخصص من نوع ImageAdapter يعرض صور الأزياء وأسماء الأنماط في الـ GridView.
 */
public class ImageAdapter extends BaseAdapter {

    private final Context context;
    private final int[] images;    // مصفوفة الصور
    private final String[] styles; // أسماء الأنماط

    public ImageAdapter(Context context, int[] images, String[] styles) {
        this.context = context;
        this.images = images;
        this.styles = styles;
    }

    // عدد العناصر في الشبكة
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // بناء الخانة الواحدة: نضع الصورة واسم النمط داخل التصميم grid_item
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        ImageView image = convertView.findViewById(R.id.itemImage);
        TextView style = convertView.findViewById(R.id.itemStyle);

        image.setImageResource(images[position]);
        style.setText(styles[position]);

        return convertView;
    }
}
