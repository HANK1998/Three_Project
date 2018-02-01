package com.example.hankchang.three_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jmzh extends AppCompatActivity {
private Button b101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jmzh);
        b101=findViewById(R.id.b101);
        b101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tz();
            }
        });
    }

    private void tz() {
        //setContentView实现了页面转换，但是跳转过去的页面，只显示页面，不实现页面内控件的功能，
        // 当需要实现功能，需要重新定义。
        setContentView(R.layout.activity_main);
    }
}
