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

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_list);


        final ArrayList<Record> records = new ArrayList<Record>();

        records.add(new Record("Chest Pain", ChestPain.class));
        records.add(new Record("Abdominal Pain", AbdominalPain.class));
        records.add(new Record("Headache", Headache.class));

        RecordAdapter adapter =
                new RecordAdapter(this, records, R.color.colorTan);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Record record = records.get(position);
                Intent intent = new Intent(getApplicationContext(), record.getListedItemId());
                startActivity(intent);
            }
            });

    }
}
