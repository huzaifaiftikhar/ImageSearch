package org.huzaifa.iftikhar.imagesearch.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import org.huzaifa.iftikhar.imagesearch.R;
import org.huzaifa.iftikhar.imagesearch.models.ImageResult;

import java.util.List;

public class ImageResultArrayAdapter extends ArrayAdapter<ImageResult> {

    public ImageResultArrayAdapter(Context context, List<ImageResult> images) {
        super(context, android.R.layout.simple_list_item_1, images);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        ImageResult imageResult = getItem(position);
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_image_result, parent, false);
        }
        ImageView ivImage = convertView.findViewById(R.id.ivImage);
        ivImage.setImageResource(0);
        Picasso.with(getContext()).load(imageResult.getThumbUrl()).into(ivImage);
        return convertView;
    }
}
