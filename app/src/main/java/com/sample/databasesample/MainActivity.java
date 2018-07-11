package com.sample.databasesample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sample.databasesample.activitys.SampleDatabase;
import com.sample.databasesample.activitys.SampleDatabaseQuery;

public class MainActivity extends AppCompatActivity {

    Button btnProject1;
    Button btnProject2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProject1 = findViewById(R.id.btnProject1);
        btnProject2 = findViewById(R.id.btnProject2);


        btnProject1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SampleDatabase.class));
            }
        });
        btnProject2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SampleDatabaseQuery.class));
            }
        });
    }
}
