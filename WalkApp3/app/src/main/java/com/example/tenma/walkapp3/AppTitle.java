package com.example.tenma.walkapp3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yuuma on 2017/12/20.
 */

public class AppTitle extends AppCompatActivity {
    Timer timer = null;
    Handler handle = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rogo);
        findViewById(R.id.imageView2).startAnimation(AnimationUtils.loadAnimation(this, R.anim.senni6));
        if (timer == null) {
            timer = new Timer();
            timer.schedule(new MyTimer(), 5000); // ミリ秒でセット
        }
    }
    public void AppStart(View view){
        Intent intent = new Intent(this, SccrenTitle.class);
        //遷移先の画面を起動
        startActivity(intent);
        timer.cancel();



    }

    class MyTimer extends TimerTask {
        @Override
        public void run() {
            handle.post(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(AppTitle.this, Epilogue.class);
                    //遷移先の画面を起動
                    startActivity(intent);
                    // アニメーションの設定
                    overridePendingTransition(R.anim.senni5, R.anim.senni6);
//                    tv1 = (TextView) findViewById(R.id.textView2);
//                    tv1.setText("ん");
//                    tv1.setTextColor(Color.WHITE);

                }
            });
        }
    }
}

