package com.example.android.tipcalculator_doraj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText amount;
    private EditText taxP;
    private EditText tipP;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText)findViewById(R.id.amount);
        taxP = (EditText)findViewById(R.id.tax);
        tipP = (EditText)findViewById(R.id.tip);
        calculate = (Button)findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("AMOUNT", amount.getText().toString());
                intent.putExtra("TAX", taxP.getText().toString());
                intent.putExtra("TIP", tipP.getText().toString());
                MainActivity.this.startActivity(intent);
            }
        });


    }
}
