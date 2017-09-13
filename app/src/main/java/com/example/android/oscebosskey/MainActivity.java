package com.example.android.oscebosskey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    TextView history = (TextView) findViewById(R.id.history);
    history.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
            startActivity(historyIntent);
        }
    });

    TextView examination = (TextView) findViewById(R.id.examination);
    examination.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent examinationIntent = new Intent(MainActivity.this, ExaminationActivity.class);
            startActivity(examinationIntent);
        }
    });

    TextView other = (TextView) findViewById(R.id.other);
    other.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent otherIntent = new Intent(MainActivity.this, OtherActivity.class);
            startActivity(otherIntent);
        }
    });

    }
}
