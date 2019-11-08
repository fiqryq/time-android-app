package com.autumnleaves.time_android_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        String currenDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textView = findViewById(R.id.view_date);
        textView.setText(currenDate);
    }
}
