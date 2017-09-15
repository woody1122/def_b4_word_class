package com.example.android.oscebosskey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_list);

        ArrayList<Record> records = new ArrayList<Record>();

        records.add(new Record("Weird station 1"));
        records.add(new Record("Weird 2"));
        records.add(new Record("Weird 3"));

        RecordAdapter adapter =
                new RecordAdapter(this, records, R.color.colorTan);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
