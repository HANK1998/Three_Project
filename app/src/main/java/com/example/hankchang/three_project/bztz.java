package com.example.hankchang.three_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class bztz extends AppCompatActivity {
private EditText sr;
private RadioGroup radioGroup;
private RadioButton rb01,rb02;
private Button b003;
private TextView s001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bztz);

        sr=findViewById(R.id.bz01);
        radioGroup=findViewById(R.id.rg01);
        rb01=findViewById(R.id.rb01);
        rb02=findViewById(R.id.rb02);
        b003=findViewById(R.id.b003);
        s001=findViewById(R.id.s001);

        b003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb01.isChecked()){
                    Double sg=(Double.parseDouble(sr.getText().toString())-80)*0.7;
                    s001.setText(format(sg));
                }
                else if (rb02.isChecked()){
                    Double sg=(Double.parseDouble(sr.getText().toString())-70)*0.6;
                    s001.setText(format(sg));
                }
                else {
                    s001.setText("请选择性别！");
                }
            }
        });
    }
    private String format(double num){
        NumberFormat formatter=new DecimalFormat("0.00");
        String s=formatter.format(num);
        return s;
    }
}
