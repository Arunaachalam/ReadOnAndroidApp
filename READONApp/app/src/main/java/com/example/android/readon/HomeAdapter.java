package com.example.android.readon;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class HomeAdapter extends ArrayAdapter<CommonData> {

    public HomeAdapter (Activity context, ArrayList<CommonData> data){
        super(context,0,data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main,parent,false);


        }

        CommonData currentData = getItem(position);

        TextView headingTextView = (TextView) listItemView.findViewById(R.id.heading);

        headingTextView.setText(currentData.getmHeading());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);

        descriptionTextView.setText(currentData.getmDescription());

        View textContainer = listItemView.findViewById(R.id.home_layout);
        int color = ContextCompat.getColor(getContext(),currentData.getmBackgroundColor());

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
