package com.example.tenma.walkapp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Tenma on 2017/12/15.
 */

public class AppStatus extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
    }
    public void MainBack(View view){
        Intent intent = new Intent(this, AppMain_battle.class);
        //遷移先の画面を起動
        startActivity(intent);
    }
}
