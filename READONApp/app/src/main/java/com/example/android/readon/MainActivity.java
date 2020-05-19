package com.example.android.readon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<CommonData> categories = new ArrayList<CommonData>();


        categories.add(new CommonData(getResources().getString(R.string.heading_workshop),getResources().getString(R.string.description_workshop),R.color.category_workshop,1,1));
        categories.add(new CommonData(getResources().getString(R.string.heading_program),getResources().getString(R.string.description_program),R.color.category_cprogramming,2,1));
        //categories.add(new CommonData(getResources().getString(R.string.heading_simulation),getResources().getString(R.string.description_simulation),R.color.category_simulation,3,1));
        //categories.add(new CommonData(getResources().getString(R.string.heading_science),getResources().getString(R.string.description_science),R.color.category_science,4,1));



        HomeAdapter itemAdapter = new HomeAdapter(this, categories);

        final ListView listView = (ListView) findViewById(R.id.common_list);

        listView.setAdapter(itemAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CommonData data = categories.get(position);

                if (data.getmPosition() == 2){
                    Intent programIntent = new Intent(MainActivity.this, ProgramingActivity.class );
                    startActivity(programIntent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
                }


            }
        });

   /*     setContentView(R.layout.common_list);


        final ArrayList<CommonData> categoriesHome = new ArrayList<CommonData>();

        categoriesHome.add(new CommonData("Heading1", "Description1", R.drawable.color_red, R.drawable.color_green));

        CommonAdapter itemAdapter = new CommonAdapter(this, categoriesHome);

        final ListView listView = (ListView) findViewById(R.id.common_list);

        listView.setAdapter(itemAdapter);

*/
    }
}
