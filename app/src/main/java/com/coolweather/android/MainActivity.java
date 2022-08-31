package com.coolweather.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ListView listView = (ListView) findViewById(R.id.list_item_1);
//        List<String> data = new ArrayList<>();
//        for(int i=0;i<10;i++){
//            data.add("ghms"+i);
//        }
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
//        listView.setAdapter(adapter);
    }
}