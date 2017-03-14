package com.example.nicklin.vectordrawabletest;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.widget.ImageView;

/**
 * Created by nicklin on 17/2/8.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ImageView imageView = (AppCompatImageView)findViewById(R.id.animatedview);
        Drawable animation = imageView.getDrawable();
        ((AnimatedVectorDrawableCompat)animation).start();
    }
}
