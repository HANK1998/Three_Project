package com.example.hankchang.three_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button b001,b002,b003;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b001=findViewById(R.id.b001);
        b002=findViewById(R.id.b002);
        b003=findViewById(R.id.b003);

        b001.setOnClickListener(this);
        b002.setOnClickListener(this);
        b003.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.b001:
                Intent intent1=new Intent(this,jmzh.class);
                startActivity(intent1);
                break;
            case R.id.b002:
                Intent intent2=new Intent(this,bztz.class);
                startActivity(intent2);
                break;
            case R.id.b003:
                Intent intent3=new Intent(this,tuodong.class);
                startActivity(intent3);
                break;
        }
    }
}
