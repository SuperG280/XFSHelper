package com.superg280.dev.xfshelper;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final ImageView icon = findViewById(R.id.imageView_about);

        icon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Animation rotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim);
                icon.startAnimation(rotateAnimation);
            }
        });

    }
}
