package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Main2ActivityEnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_end);
        TextView ed1 = (TextView) findViewById(R.id.textView);
        String data = getIntent().getStringExtra("text");
        ed1.setText("Text from activity 1: " + data);
    }
}
