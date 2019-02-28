package com.example.android.tipcalculator_doraj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private double amount;
    private double taxPercentage;
    private double tipPercentage;
    private TextView result;
    private double total;
    private double tax;
    private double tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView)findViewById(R.id.result);
        Intent intent = getIntent();

        amount = Double.parseDouble(intent.getStringExtra("AMOUNT"));
        taxPercentage = Double.parseDouble(intent.getStringExtra("TAX"));
        tipPercentage = Double.parseDouble(intent.getStringExtra("TIP"));


        tax =  Math.round(amount*taxPercentage*100.0)/100.0;
        tip  = Math.round(amount*tipPercentage*100.0)/100.0;
        total = Math.round((amount + tax + tip)*100.0)/100.0;

        result.setText("Total: " + amount + "\nSales Tax: " + tax + "\nTip: " + tip + "\nGrand Total: " + total);

    }
}
