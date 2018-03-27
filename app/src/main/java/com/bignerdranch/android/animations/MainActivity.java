package com.bignerdranch.android.animations;

import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        Log.i("Info", "Imageview tapped");

        ImageView imageViewBart = (ImageView) findViewById(R.id.imageViewBart);

        ImageView imageViewHomer = (ImageView) findViewById(R.id.imageViewHomer);

        imageViewBart.animate().translationXBy(1000).rotation(3600).setDuration(2000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewBart = (ImageView) findViewById(R.id.imageViewBart);

        imageViewBart.setX(-1000);


    }
}
