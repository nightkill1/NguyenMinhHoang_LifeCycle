package com.example.nguyenminhhoang_59130802_androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate Called");
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
        Log.d("LifeCycle","addContentView Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume Called");
        txtTG = findViewById(R.id.ViewTG);
        SimpleDateFormat spDF = new SimpleDateFormat("HH:mm:ss");
        String strDate = spDF.format(new Date());
        txtTG.setText(strDate);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy Called");
    }
}
