package com.example.tween;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mImage;
    private Button mGo1;
    private Button mGo2;
    private Button mGo3;
    private Button mGo4;
    private Button mGo5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImage = (ImageView) findViewById(R.id.image);
        mGo1 = (Button) findViewById(R.id.go1);
        mGo2 = (Button) findViewById(R.id.go2);
        mGo3 = (Button) findViewById(R.id.go3);
        mGo4 = (Button) findViewById(R.id.go4);
        mGo5 = (Button) findViewById(R.id.go5);
    }

    void go1(View view){
        ScaleAnimation scaleAnimation = new ScaleAnimation
                (0.05f,2f,0.05f,2f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnimation.setDuration(6000);
        scaleAnimation.setRepeatCount(5);
        scaleAnimation.setRepeatMode(Animation.REVERSE);
        mImage.startAnimation(scaleAnimation);
    }
    void go2(View view){
        AlphaAnimation alphaAnimation = new AlphaAnimation(1f,0.01f);
        //动画执行周期
        alphaAnimation.setDuration(3000);
        //动画执行次数
        alphaAnimation.setRepeatCount(5);
        //设置重复模式
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        alphaAnimation.setStartOffset(2000);
        //保留动画最后效果
        alphaAnimation.setFillAfter(true);
        mImage.startAnimation(alphaAnimation);

    }
    void go3(View view){
        TranslateAnimation translateAnimation = new TranslateAnimation(0,300,0,300);
        translateAnimation.setDuration(3000);
        translateAnimation.setRepeatCount(3);
        mImage.startAnimation(translateAnimation);
    }
    void go4(View view){
        RotateAnimation rotateAnimation = new RotateAnimation(0,1080,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(5000);
        mImage.startAnimation(rotateAnimation);
    }
    void go5(View view){
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation
                (0.1f,2f,0.1f,2f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnimation.setDuration(5000);
        scaleAnimation.setRepeatCount(3);
        scaleAnimation.setRepeatMode(Animation.REVERSE);
        animationSet.addAnimation(scaleAnimation);

        RotateAnimation rotateAnimation = new RotateAnimation(0,1080,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(5000);
        rotateAnimation.setRepeatCount(3);
        rotateAnimation.setRepeatMode(Animation.REVERSE);
        animationSet.addAnimation(rotateAnimation);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0.05f,1f);
        //动画执行周期
        alphaAnimation.setDuration(5000);
        //动画执行次数
        alphaAnimation.setRepeatCount(3);
        //设置重复模式
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        animationSet.addAnimation(alphaAnimation);

        animationSet.setDuration(5000);
        animationSet.setFillAfter(true);
        mImage.startAnimation(animationSet);


    }
}
