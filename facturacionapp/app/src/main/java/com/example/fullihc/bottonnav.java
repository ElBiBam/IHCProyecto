package com.example.fullihc;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class bottonnav extends AppCompatActivity {

    private TextView mTextMessage;
    private FrameLayout main;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment g ;
            switch (item.getItemId()) {

                case R.id.navigation_home:

                    g = new Frag2();
                    FragmentTransaction fra = getSupportFragmentManager().beginTransaction();
                    fra.replace(R.id.main_nav, g);
                    fra.commit();

                    return true;
                case R.id.navigation_dashboard:

                    return true;
                case R.id.navigation_notifications:

                    return true;
            }

            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottonnav);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.nave);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

}
