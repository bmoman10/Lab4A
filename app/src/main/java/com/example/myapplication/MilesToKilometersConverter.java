package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

import android.widget.*;

public class MilesToKilometersConverter extends AppCompatActivity {

    String miles = "";
    String km = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles_to_kilometers_converter);
    }

    public void convertPressed(View v) {
        EditText milesField = findViewById(R.id.milesField);
        EditText kilometersField = findViewById(R.id.kilometersField);
        miles = milesField.getText().toString();
        km = kilometersField.getText().toString();


        if(!miles.matches("") && !km.matches("")){
            String s = Double.toString(convertMtoKM());
            kilometersField.setText(s);
        }

        else if(!miles.matches("") && km.matches("")) {
            String s = Double.toString(convertMtoKM());
            kilometersField.setText(s);
        }

        else if(miles.matches("") && !km.matches("")) {
            String s = Double.toString(convertKMtoM());
            milesField.setText(s);
        }

    }

    public double convertMtoKM() {
        double i = Double.parseDouble(miles) * 1.60934;
        return i;
    }

    public double convertKMtoM() {
        double i = Double.parseDouble(km) * 0.6214;
        return i;
    }
}
