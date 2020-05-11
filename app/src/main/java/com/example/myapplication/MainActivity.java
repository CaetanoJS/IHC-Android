package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Enviar(View view) {
        switch (view.getId()) {
            case R.id.btn_send1:
                Intent i3 = new Intent(this, Main3Activity.class);
                startActivity(i3);
                break;
            case R.id.btn_send2:
                Intent i2 = new Intent(this, Main2Activity.class);
                startActivity(i2);
                break;
            case R.id.btn_send3:
                Intent i4 = new Intent(this, Main4Activity.class);
                startActivity(i4);
                break;
            case R.id.btn_send4:
                Intent i5 = new Intent(this, Main5Activity.class);
                startActivity(i5);
                break;
            case R.id.btn_send5:
                Intent i6 = new Intent(this, Main6Activity.class);
                startActivity(i6);
                break;
            case R.id.btn_send6:
                Intent i7 = new Intent(this, Main7Activity.class);
                startActivity(i7);
                break;
        }

    }
}
