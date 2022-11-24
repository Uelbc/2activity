package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private int[] a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            a = bundle.getIntArray("123");
        }
        textView2=findViewById(R.id.textView8);
        textView2.setText(a[0]);
        textView3=findViewById(R.id.textView10);
        textView3.setText(a[1]);

    }
}