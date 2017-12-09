package com.example.pinkd.vinesoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(R.raw.shower);
            }
        });
    }

    public void playSound(int sound) {
        mp = MediaPlayer.create(this, sound);
        mp.start();
        if (!mp.isPlaying()) {
            mp.release();
        }
    }
}
