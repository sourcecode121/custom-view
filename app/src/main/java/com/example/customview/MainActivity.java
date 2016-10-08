package com.example.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = (Timer) findViewById(R.id.timer);
    }

    @Override
    protected void onResume() {
        super.onResume();

        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        timer.stop();
    }
}
