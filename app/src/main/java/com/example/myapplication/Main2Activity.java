package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Enviar(View view) {
        Intent i2End = new Intent(this, Main2ActivityEnd.class);
        EditText et1 = (EditText) findViewById(R.id.txt_text1);
        i2End.putExtra("text", et1.getText().toString());
        startActivity(i2End);

    }
}
