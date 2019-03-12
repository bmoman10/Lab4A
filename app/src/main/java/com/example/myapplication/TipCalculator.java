package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

import android.widget.*;

public class TipCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }

    public void calculatePressed(View v) {
        EditText totalField = findViewById(R.id.totalBillField);
        EditText percentageField = findViewById(R.id.percentageField);
        EditText numPeopleField = findViewById(R.id.numPeopleField);
        TextView t = findViewById(R.id.tipPerPersonView);
        double total = Double.parseDouble(totalField.getText().toString());
        double percentage = Double.parseDouble(percentageField.getText().toString())/100;
        int numPeople = Integer.parseInt(numPeopleField.getText().toString());

        double tipPerPerson = ((total * percentage)/numPeople);

        String text = "$" + String.format("%.2f", tipPerPerson);

        t.setText(text);
    }
}
