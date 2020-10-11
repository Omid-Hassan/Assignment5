package com.example.assignment5;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        song = new MediaPlayer();
        song = MediaPlayer.create(this, R.raw.song);
        song.seekTo(8000);
        song.start();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                finish();
                song.pause();
                startActivity(new Intent(Splash.this, RecipeListActivity.class));

            }
        };
        Timer oppening= new Timer();
        oppening.schedule(task,5000);
    }
}
