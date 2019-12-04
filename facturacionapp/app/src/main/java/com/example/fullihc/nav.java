package com.example.fullihc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class nav extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottonnav);

        BottomNavigationView bonav = findViewById(R.id.nave);
        bonav.setOnNavigationItemSelectedListener(navlis);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navlis = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            navigation f;

            switch (menuItem.getItemId()) {

                case 0:
                    f = new navigation();
            }



            return true;
        }
    };


}