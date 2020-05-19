package com.example.android.readon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;

public class Basiccpp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_list);

        final ArrayList<CommonData> lectureList = new ArrayList<CommonData>();

        lectureList.add(new CommonData("Lecture 1", "Desc1", "eiGdsH1g20k"));
        lectureList.add(new CommonData("Lecture 2", "Desc2", "5nyFfZnsyNY"));
        lectureList.add(new CommonData("Lecture 3", "Desc3", "KRnaogqpPOM"));
        lectureList.add(new CommonData("Lecture 4", "Desc4", "Cz1rJtlGHVs"));

        CommonAdapter itemAdapter = new CommonAdapter(this, lectureList);

        final ListView listView = (ListView) findViewById(R.id.common_list);

        listView.setAdapter(itemAdapter);

        //MediaPlayer mediaPlayer = new MediaPlayer();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CommonData data = lectureList.get(position);
                String youtubeLink = getResources().getString(R.string.youtube) + data.getmYoutubeLink();

                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(youtubeLink));
                intent.putExtra("force_fullscreen",true);
                startActivity(intent);
                //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeLink)));
            }
        });


    }
}
