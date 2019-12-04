package com.example.fullihc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;

public class navigation extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewpage;
    private ViewPage adapter;

    private TabLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTitle("Corp. Mery Cruz");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        viewpage = findViewById(R.id.pager);
        adapter = new ViewPage(getSupportFragmentManager(),getApplicationContext());
        viewpage.setAdapter(adapter);

        table = findViewById(R.id.tabs);
        table.setupWithViewPager(viewpage);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.extr, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.navigation_home:
                entrar1(null);
                return true;
            case R.id.navigation_dos:
                    entrar2(null);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void entrar1(View v){

        Intent i = new Intent(this,preferencias.class);
        startActivity(i);
    }
    public void entrar2(View v){

        Intent i = new Intent(this,actividad.class);
        startActivity(i);
    }
    public void entrar3(View v){

        Intent i = new Intent(this,supermercado.class);
        startActivity(i);
    }




}
