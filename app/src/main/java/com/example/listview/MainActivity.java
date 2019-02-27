package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG="MainActivity";
    ArrayList<String> List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.ListOfNames);

        List.add("Apple");
        List.add("Orange");
        List.add("Banana");
        List.add("Grapes");
        List.add("PineApple");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,List);


        listView.setAdapter(adapter);


    }

}

