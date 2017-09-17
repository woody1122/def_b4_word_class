package com.example.android.oscebosskey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AbdominalPain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_list);


        ArrayList<String> records = new ArrayList<String>();

        records.add(new String("Wash Hands"));
        records.add(new String("Introduce Yourself"));
        records.add(new String("Dance Second time"));

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, R.layout.end_list_item, records);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}