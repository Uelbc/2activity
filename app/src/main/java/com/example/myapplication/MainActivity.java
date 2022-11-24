package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public SeekBar seekBar1;
    public SeekBar seekBar2;
    public SeekBar seekBar3;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private Button btn;
    public static final String VALUE="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        seekBar1=findViewById(R.id.seekBar);
        seekBar2=findViewById(R.id.seekBar4);
        seekBar3=findViewById(R.id.seekBar6);
        textView1=findViewById(R.id.textView11);
        textView2=findViewById(R.id.textView12);
        textView3=findViewById(R.id.textView13);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView1.setText(String.valueOf(seekBar1.getProgress()*10000));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView2.setText(String.valueOf(seekBar2.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView3.setText(String.valueOf(seekBar3.getProgress()*10000));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A0=seekBar1.getProgress()*10000;
                double st= 3;
                int ans = 0;
                int M=seekBar3.getProgress()*10000;
                for (int i = 0; i<seekBar2.getProgress()*12; i+=1){
                    ans+= A0+(A0*st*30/365)/100;
                    A0+=ans+M;
                }
                int [] b = new int[] {A0, A0-(seekBar1.getProgress()*10000+seekBar3.getProgress()*10000*12*seekBar2.getProgress())};

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(VALUE, b);
                startActivity(intent);
            }
        });

    }
}