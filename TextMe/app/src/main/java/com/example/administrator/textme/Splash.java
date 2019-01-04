package com.example.administrator.textme;

/**
 * Created by Administrator on 12/9/2018.
 */
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Splash extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.anim_down);
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setAnimation(anim1);




        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(Splash.this,MainActivity.class));
                finish();

            }
        }, 5000);
    }
}

