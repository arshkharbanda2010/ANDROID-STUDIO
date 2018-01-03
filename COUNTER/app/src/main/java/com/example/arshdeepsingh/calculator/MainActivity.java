package com.example.arshdeepsingh.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button click;
    TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click =findViewById(R.id.button);
        hello =findViewById(R.id.textView2);
        click =findViewById(R.id.button2);
    }
    public void Counter(View view){
        String s=hello.getText().toString();
        int i= Integer.parseInt(s);
        i=i+1;
        hello.setText(i+"");
        Toast.makeText( this,"Counter = "+i,Toast.LENGTH_SHORT).show();

        hello.setText(i+"");
    }
    public void Reset(View view){
        int i=0;
        hello.setText(i+"");
    }
}
