package com.example.fullihc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class login extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }



    public void entrar2(View v){

        Intent i = new Intent(this,navigation.class);
        startActivity(i);
    }
}
