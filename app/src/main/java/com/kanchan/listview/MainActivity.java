package com.kanchan.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView simpleListView;
String[] text = {"CLOUD","FLOWER", "PERSON", "HEADSET", "SMILEY", "STAR"};
int[] img = {R.drawable.ic_filter_drama_black_24dp,
              R.drawable.ic_filter_vintage_black_24dp,
              R.drawable.ic_folder_shared_black_24dp,
              R.drawable.ic_headset_black_24dp,
              R.drawable.ic_insert_emoticon_black_24dp,
              R.drawable.ic_star_half_black_24dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView = findViewById(R.id.simpleListView);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), text, img);
        simpleListView.setAdapter(customAdapter);
    }
}
