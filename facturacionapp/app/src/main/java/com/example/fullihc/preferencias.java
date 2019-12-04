package com.example.fullihc;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import androidx.annotation.ColorLong;

public class preferencias extends AppCompatActivity {

    private Toolbar toolbar;
    PieChart pie;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferencias);

        setTitle("Preferencias");

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        pie=findViewById(R.id.grap);
        creap();




    }
    void creap(){

        Description description = new Description();
        description.setText("Preferencias de Busqueda");
        description.setTextSize(15);
        description.setTextColor(Color.WHITE);

        pie.setDescription(description);
        pie.setUsePercentValues(true);

        Legend legend = pie.getLegend();
        legend.setTextColor(Color.WHITE);

        legend.setTextSize(15);


        ArrayList<PieEntry> pieEntries = new ArrayList<>();

        pieEntries.add(new PieEntry(50,"Electronica"));
        pieEntries.add(new PieEntry(30,"Hogar"));
        pieEntries.add(new PieEntry(20,"Deporte"));


        PieDataSet pieDataSet = new PieDataSet(pieEntries, "");
        pieDataSet.setFormSize(20);
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData pieData = new PieData(pieDataSet);
        pieData.setValueTextSize(20);
        pieData.setValueTextColor(Color.WHITE);

        pie.setData(pieData);

    }



    public void entrar2(View v){

        Intent i = new Intent(this,navigation.class);
        startActivity(i);
    }
}
