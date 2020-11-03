package com.example.himasifor;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class SplashScreen extends AppCompatActivity {

    ImageView GambarGif;
    private int waktu_loading=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(SplashScreen.this, Welcome.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
        GambarGif=(ImageView)findViewById(R.id.imageView);
        Glide.with(SplashScreen.this)
                .load(R.drawable.unnamed__3_)
                .asGif()
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(GambarGif);
    }
}
