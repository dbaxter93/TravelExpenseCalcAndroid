package com.example.travelexpenses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    TextView r;
    Travel expenses = new Travel();
    DecimalFormat df = new DecimalFormat("Your travel expenses equal $#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        r = findViewById(R.id.result);
        Intent i = getIntent();

        String miles = i.getStringExtra("miles");
        String MPG = i.getStringExtra("MPG");
        String cost = i.getStringExtra("cost");

        double m = Double.parseDouble(miles);
        double mpg = Double.parseDouble(MPG);
        double gasCost = Double.parseDouble(cost);

        expenses.CalcTrip(m, mpg, gasCost);

        r.setText(df.format(expenses.getTrip()));

    }
}