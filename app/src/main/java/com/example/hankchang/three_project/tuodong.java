package com.example.hankchang.three_project;

import android.app.Service;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class tuodong extends AppCompatActivity {
    private Vibrator mVibrator01;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuodong);

    /*����ToggleButton�Ķ���*/
        mVibrator01 = ( Vibrator )getApplication().getSystemService
                (Service.VIBRATOR_SERVICE);

        final ToggleButton mtogglebutton1 =
                (ToggleButton) findViewById(R.id.myTogglebutton1);

        final ToggleButton mtogglebutton2 =
                (ToggleButton) findViewById(R.id.myTogglebutton2);

        final ToggleButton mtogglebutton3 =
                (ToggleButton) findViewById(R.id.myTogglebutton3);

    /* ������ */
        mtogglebutton1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (mtogglebutton1.isChecked())
                {
          /* �����𶯵����� */
                    mVibrator01.vibrate( new long[]{100,10,100,1000},-1);
          /*��Toast��ʾ��������*/
                    Toast.makeText
                            (
                                    tuodong.this,
                                    "OK",
                                    Toast.LENGTH_SHORT
                            ).show();
                }
                else
                {
          /* ȡ������ */
                    mVibrator01.cancel();
          /*��Toast��ʾ�����ѱ�ȡ��*/
                    Toast.makeText
                            (
                                    tuodong.this,
                                    "Ok",
                                    Toast.LENGTH_SHORT
                            ).show();
                }
            }
        });

    /* ������ */
        mtogglebutton2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (mtogglebutton2.isChecked())
                {
          /*�����𶯵�����*/
                    mVibrator01.vibrate(new long[]{100,100,100,1000},0);

          /*��Toast��ʾ��������*/
                    Toast.makeText
                            (
                                    tuodong.this,
                                    "OK",
                                    Toast.LENGTH_SHORT
                            ).show();
                }
                else
                {
          /* ȡ������ */
                    mVibrator01.cancel();

          /* ��Toast��ʾ����ȡ�� */
                    Toast.makeText
                            (
                                    tuodong.this,
                                    "OK",
                                    Toast.LENGTH_SHORT
                            ).show();
                }
            }
        });

    /* �������� */
        mtogglebutton3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (mtogglebutton3.isChecked())
                {
          /* �����𶯵����� */
                    mVibrator01.vibrate( new long[]{1000,50,1000,50,1000},0);

          /*��Toast��ʾ��������*/
                    Toast.makeText
                            (
                                    tuodong.this, "OK",
                                    Toast.LENGTH_SHORT
                            ).show();
                }
                else
                {
          /* ȡ������ */
                    mVibrator01.cancel();
          /* ��Toast��ʾ����ȡ�� */
                    Toast.makeText
                            (
                                    tuodong.this,
                                    "OK",
                                    Toast.LENGTH_SHORT
                            ).show();
                }
            }
        });
    }
}
