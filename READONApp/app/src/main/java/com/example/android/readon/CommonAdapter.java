package com.example.android.readon;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CommonAdapter extends ArrayAdapter<CommonData> {

    public CommonAdapter (Activity context, ArrayList<CommonData> data){
        super (context,0,data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.common_item,parent,false);

        }


        CommonData currentData = getItem(position);

        TextView headingTextView = (TextView) listItemView.findViewById(R.id.course_heading);

        headingTextView.setText(currentData.getmHeading());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.course_description);

        descriptionTextView.setText(currentData.getmDescription());

        return listItemView;
    }
}
