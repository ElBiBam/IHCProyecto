package com.example.fullihc;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class actividad extends AppCompatActivity {

    private Toolbar toolbar;
    BarChart barChart;
    ArrayList<BarEntry> barEntryArrayList;
    ArrayList<String> label;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad);

        setTitle("Actividad Semanal");

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        barChart = findViewById(R.id.grap2);
        label = new ArrayList<>();
        barEntryArrayList = new ArrayList<>();


        label.add("Lunes");
        label.add("Martes");
        label.add("Miercoles");
        label.add("Jueves");
        label.add("Viernes");
        label.add("Sabado");
        label.add("Domingo");
        barEntryArrayList.add(new BarEntry(0,20));
        barEntryArrayList.add(new BarEntry(1,40));
        barEntryArrayList.add(new BarEntry(2,40));
        barEntryArrayList.add(new BarEntry(3,50));
        barEntryArrayList.add(new BarEntry(4,60));
        barEntryArrayList.add(new BarEntry(5,20));
        barEntryArrayList.add(new BarEntry(6,10));

        Legend a = barChart.getLegend();
        a.setTextColor(Color.WHITE);
        BarDataSet barDataSet = new BarDataSet(barEntryArrayList,"Actividad Semanal");

        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        Description description = new Description();
        description.setText("Act");
        barChart.setDescription(description);
        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);

        XAxis xAxis = barChart.getXAxis();
        YAxis yAxis = barChart.getAxisLeft();
        yAxis.setTextColor(Color.WHITE);
        YAxis yAxis2 = barChart.getAxisRight();
        yAxis2.setTextColor(Color.WHITE);
        xAxis.setValueFormatter(new IndexAxisValueFormatter(label));
        xAxis.setTextColor(Color.WHITE);


        barChart.invalidate();






    }



    public void entrar2(View v){

        Intent i = new Intent(this,navigation.class);
        startActivity(i);
    }
}
