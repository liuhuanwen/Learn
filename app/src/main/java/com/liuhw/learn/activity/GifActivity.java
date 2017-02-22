package com.liuhw.learn.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liuhw.learn.R;
import com.liuhw.learn.widget.GifView;

public class GifActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        GifView gifView = (GifView) findViewById(R.id.gifview);
        gifView.setMovieResource(R.raw.a2_flash);
    }
}
