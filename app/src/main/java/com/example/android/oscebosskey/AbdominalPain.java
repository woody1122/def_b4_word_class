package com.example.android.oscebosskey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AbdominalPain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_list);


        ArrayList<Record> records = new ArrayList<Record>();

        records.add(new Record("Wash Hands"));
        records.add(new Record("Introduce Pain"));
        records.add(new Record("Examine the Abdomen"));

        RecordAdapter adapter =
                new RecordAdapter(this, records, R.color.colorTan);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}