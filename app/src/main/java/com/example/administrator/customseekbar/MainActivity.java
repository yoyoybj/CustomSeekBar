package com.example.administrator.customseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CustomSeekBar customSeekBar;
    private CustomSeekBar customSeekBar1;
    private CustomSeekBar customSeekBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customSeekBar=findViewById(R.id.seek_bar);
        customSeekBar1=findViewById(R.id.seek_bar1);
        customSeekBar2=findViewById(R.id.seek_bar2);
        customSeekBar.getConfigBuilder()
                .progress(0)//进度
                .showThumbText()//
                .touchToSeek()
                .build();
        customSeekBar1.getConfigBuilder()
                .progress(50)//进度
                .showThumbText()//
                .touchToSeek()
                .build();
        customSeekBar2.getConfigBuilder()
                .progress(100)//进度
                .showThumbText()//
                .touchToSeek()
                .build();
    }
}
