package com.example.android.oscebosskey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ChestPain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_list);


        ArrayList<Record> specifictickoff = new ArrayList<Record>();

        specifictickoff.add(new Record("Introduce yourself"));
        specifictickoff.add(new Record("Wash hands"));
        specifictickoff.add(new Record("Dance"));

        RecordAdapter adaptertwo =
                new RecordAdapter(this, specifictickoff, R.color.colorTan);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptertwo);

    }

}
