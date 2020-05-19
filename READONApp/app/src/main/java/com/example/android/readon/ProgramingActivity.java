package com.example.android.readon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProgramingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_list);

        final ArrayList<CommonData> courseDetails = new ArrayList<CommonData>();

        courseDetails.add(new CommonData(1,getResources().getString(R.string.basiccpp),getResources().getString(R.string.basiccpp_desc),R.drawable.color_red));
        courseDetails.add(new CommonData(2,getResources().getString(R.string.intercpp),getResources().getString(R.string.intercpp_desc),R.drawable.color_red));
        courseDetails.add(new CommonData(3,getResources().getString(R.string.advancecpp),getResources().getString(R.string.advancecpp_desc),R.drawable.color_red));
        courseDetails.add(new CommonData(4,getResources().getString(R.string.misccpp),getResources().getString(R.string.misccpp_desc),R.drawable.color_red));
        courseDetails.add(new CommonData(5,getResources().getString(R.string.hardwarecpp),getResources().getString(R.string.hardwarecpp_desc),R.drawable.color_red));

        CommonAdapter itemAdapter = new CommonAdapter(this,courseDetails);

        final ListView listView = (ListView) findViewById(R.id.common_list);

        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CommonData data = courseDetails.get(position);

                if (data.getmPosition() == 1){
                    Intent programIntent = new Intent(ProgramingActivity.this, Basiccpp.class);
                    startActivity(programIntent);
                }

                else {
                    Toast.makeText(ProgramingActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
