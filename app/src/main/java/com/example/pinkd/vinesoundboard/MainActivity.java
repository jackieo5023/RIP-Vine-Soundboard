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

        final Button shower = (Button) findViewById(R.id.button_id);
        shower.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { playSound(R.raw.shower); }
        });
        final Button breakfast = (Button) findViewById(R.id.button_id2);
        breakfast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { playSound(R.raw.breakfast); }
        });
        final Button wednesday = (Button) findViewById(R.id.button_id3);
        wednesday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { playSound(R.raw.wednesday); }
        });
        final Button homework = (Button) findViewById(R.id.button_id4);
        homework.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { playSound(R.raw.homework); }
        });
        final Button aaaaa = (Button) findViewById(R.id.button_id5);
        aaaaa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { playSound(R.raw.aaaaa); }
        });
        final Button jello = (Button) findViewById(R.id.button_id6);
        jello.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { playSound(R.raw.jello); }
        });
        final Button profanity = (Button) findViewById(R.id.button_id7);
        profanity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { playSound(R.raw.profanity); }
        });
        final Button tuition = (Button) findViewById(R.id.button_id8);
        tuition.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { playSound(R.raw.tuition); }
        });
    }

    public void playSound(int sound) {
        mp = MediaPlayer.create(this, sound);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
}
