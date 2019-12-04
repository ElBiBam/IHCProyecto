package com.example.fullihc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void entrarel(View v){

        Intent i = new Intent(this,bottonnav.class);
        startActivity(i);
    }

    public void entrar1(View v){

        Intent i = new Intent(this,login.class);
        startActivity(i);
    }
}
