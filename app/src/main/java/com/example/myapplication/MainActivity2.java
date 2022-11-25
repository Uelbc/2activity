package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private int[] a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            a = bundle.getIntArray("123");
        }
        textView5=findViewById(R.id.textView8);
        textView5.setText(Integer.toString(a[0]));
        textView6=findViewById(R.id.textView10);
        textView6.setText(Integer.toString(a[1]+a[0]));

    }
}