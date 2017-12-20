package com.example.tenma.walkapp3;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

/**
 * Created by Tenma and yuuma on 2017/12/15.
 */

public class AppLog extends AppCompatActivity{
    CalendarView calendarView;
    TextView dateDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        calendarView = (CalendarView) findViewById(R.id.calendarView);

        dateDisplay = (TextView) findViewById(R.id.date_display);
        dateDisplay.setText("日付をタップしてください");
//        dateDisplay.setTextSize(20.0f);
        // ～～～～～～～～～～～～～カレンダー～～～～～～～～～～～～～～～～～～～～～～～～～～
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {

                dateDisplay.setText((i1 + 1) + " 月 " + i2 + "日です");
//                dateDisplay.setTextSize(16.0f);
            }
        });
    }
    public void MainBack(View view){
        Intent intent = new Intent(this, AppMain_battle.class);
        //遷移先の画面を起動
        startActivity(intent);
    }
}
