package com.jair.topnews.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import com.jair.topnews.MainActivity;
import com.jair.topnews.R;

public class WelcomeActivity extends Activity {
    View mView;
    private AlphaAnimation mStart_Anima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = View.inflate(this, R.layout.activity_welcome, null);
        setContentView(mView);
        initView();
        initData();
    }

    private void initData() {
        mStart_Anima = new AlphaAnimation(0.3f, 1.0f);
        mStart_Anima.setDuration(2000);
        mView.startAnimation(mStart_Anima);
        mStart_Anima.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                redirectTo();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    private void initView() {
    }

    private void redirectTo() {
        startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        this.finish();
    }


}
