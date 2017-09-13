package com.example.android.oscebosskey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        ArrayList<String> stations = new ArrayList<String>();
        stations.add("Chest Pain");
        stations.add("Abdominal Pain");
        stations.add("Headache");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, stations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
