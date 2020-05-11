package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void soma(View view) {
        EditText et1 = (EditText) findViewById(R.id.txt_number1); // ID from component
        EditText et2 = (EditText) findViewById(R.id.txt_number2);
        TextView tv3 = (TextView) findViewById(R.id.tv_1);

        Integer sum = (Integer.parseInt(et1.getText().toString()) + Integer.parseInt(et2.getText().toString()));
        tv3.setText("Resultado: " + sum.toString());
        Toast.makeText(this, "Value: " + sum, Toast.LENGTH_SHORT).show();
    }
}
