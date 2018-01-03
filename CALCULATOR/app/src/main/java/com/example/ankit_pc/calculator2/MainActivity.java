package com.example.ankit_pc.calculator2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.ankit_pc.calculator2.R.*;
import static com.example.ankit_pc.calculator2.R.id.*;

public class MainActivity extends Activity {

    TextView t1, t2;
    Button div, mul, add, sub;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView5);
        t2 = findViewById(R.id.textView2);

        e1 = findViewById(id.editText);
        e2 = findViewById(id.editText2);

        add = findViewById(R.id.button);
        div = findViewById(R.id.button5);
        sub = findViewById(R.id.button3);
        mul = findViewById(R.id.button4);

    }

    public void add(View view) {
        String n1 = e1.getText().toString();
        String n2 = e2.getText().toString();
        double d1, d2, d3;
        d1 = Double.parseDouble(n1);
        d2 = Double.parseDouble(n2);
        d3 = d1 + d2;
        t2.setText(d3 + "");
    }

    public void subtract(View view) {
        String n1 = e1.getText().toString();
        String n2 = e2.getText().toString();
        double d1, d2, d3;
        d1 = Double.parseDouble(n1);
        d2 = Double.parseDouble(n2);
        d3 = d1 - d2;
        t2.setText(d3 + "");
    }

    public void multiply(View view) {
        String n1 = e1.getText().toString();
        String n2 = e2.getText().toString();
        double d1, d2, d3;
        d1 = Double.parseDouble(n1);
        d2 = Double.parseDouble(n2);
        d3 = d1 * d2;
        t2.setText(d3 + "");
    }

    public void divide(View view) {
        String n1 = e1.getText().toString();
        String n2 = e2.getText().toString();
        double d1, d2, d3;
        d1 = Double.parseDouble(n1);
        d2 = Double.parseDouble(n2);
        d3 = d1 / d2;
        t2.setText(d3 + "");
    }

}

