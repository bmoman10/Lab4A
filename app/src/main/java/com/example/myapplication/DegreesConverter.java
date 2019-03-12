package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DegreesConverter extends AppCompatActivity {

    String f = "";
    String c = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degrees_converter);
    }

    public void convertPressed(View v) {
        EditText fField = findViewById(R.id.fahrenheitField);
        EditText cField = findViewById(R.id.celsiusField);
        f = fField.getText().toString();
        c = cField.getText().toString();


        if(!f.matches("") && !c.matches("")){
            String s = Double.toString(convertMtoKM());
            cField.setText(s);
        }

        else if(!f.matches("") && c.matches("")) {
            String s = Double.toString(convertMtoKM());
            cField.setText(s);
        }

        else if(f.matches("") && !c.matches("")) {
            String s = Double.toString(convertKMtoM());
            fField.setText(s);
        }

    }

    public double convertMtoKM() {
        double i = (Double.parseDouble(f) - 32) * 1.8;
        return i;
    }

    public double convertKMtoM() {
        double i = (Double.parseDouble(c) * 1.8) + 32;
        return i;
    }
}
