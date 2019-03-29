package com.fwhite.synthesizer_frankie;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private final int WHOLE_NOTE = 1000;
    private MediaPlayerThread mpt;

    public class SynthesizerActivity extends AppCompatActivity {

        private final int WHOLE_NOTE = 1000;
}

    private void delayPlaying(int WHOLE_NOTE) {
    try{
        Thread.sleep(WHOLE_NOTE);
    } catch (InterruptedException e) {

    }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
         mpt = new MediaPlayerThread(MainActivity.this);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mpt.playNote(R.raw.scalee, 1000);
                mpt.playNote(R.raw.scalef, 1000);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mpt.playNote(R.raw.scalee, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalefs, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalegs, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalea, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scaleb, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalec, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scaleds, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalehighe, 1000);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mpt.playNote(R.raw.scalea, 500);
                mpt.playNote(R.raw.scalea, 500);
                mpt.playNote(R.raw.scalehighe, 500);
                mpt.playNote(R.raw.scalehighe, 500);
                mpt.playNote(R.raw.scalehighfs, 500);
                mpt.playNote(R.raw.scalehighfs, 500);
                mpt.playNote(R.raw.scalehighe, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scaled, 500);
                mpt.playNote(R.raw.scaled, 500);
                mpt.playNote(R.raw.scalecs, 500);
                mpt.playNote(R.raw.scalecs, 500);
                mpt.playNote(R.raw.scaleb, 500);
                mpt.playNote(R.raw.scaleb, 500);
                mpt.playNote(R.raw.scalea,1000);            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mpt.playNote(R.raw.scalea, 500);
                mpt.playNote(R.raw.scalea, 500);
                mpt.playNote(R.raw.scalehighe, 500);
                mpt.playNote(R.raw.scalehighe, 500);
                mpt.playNote(R.raw.scalehighfs, 500);
                mpt.playNote(R.raw.scalehighfs, 500);
                mpt.playNote(R.raw.scalehighe, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scaled, 500);
                mpt.playNote(R.raw.scaled, 500);
                mpt.playNote(R.raw.scalecs, 500);
                mpt.playNote(R.raw.scalecs, 500);
                mpt.playNote(R.raw.scaleb, 500);
                mpt.playNote(R.raw.scaleb, 500);
                mpt.playNote(R.raw.scalea,1000);            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mpt.playNote(R.raw.scalea, 500);
                mpt.playNote(R.raw.scalea, 500);
                mpt.playNote(R.raw.scalehighe, 500);
                mpt.playNote(R.raw.scalehighe, 500);
                mpt.playNote(R.raw.scalehighfs, 500);
                mpt.playNote(R.raw.scalehighfs, 500);
                mpt.playNote(R.raw.scalehighe, 1000);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scaled, 500);
                mpt.playNote(R.raw.scaled, 500);
                mpt.playNote(R.raw.scalecs, 500);
                mpt.playNote(R.raw.scalecs, 500);
                mpt.playNote(R.raw.scaleb, 500);
                mpt.playNote(R.raw.scaleb, 500);
                mpt.playNote(R.raw.scalea,1000);            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalee, 250);
                delayPlaying(WHOLE_NOTE);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalea, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalee, 250);
                delayPlaying(WHOLE_NOTE);
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalee, 250);
                delayPlaying(WHOLE_NOTE);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalea, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scaleds, 250);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scalee, 250);
                mpt.playNote(R.raw.scaled, 250);
                mpt.playNote(R.raw.scaled, 250);
                mpt.playNote(R.raw.scaled, 250);
                mpt.playNote(R.raw.scaled, 250);
                mpt.playNote(R.raw.scaled, 250);
                mpt.playNote(R.raw.scaled, 250);
                mpt.playNote(R.raw.scaled, 250);
                mpt.playNote(R.raw.scalecs, 250);
                mpt.playNote(R.raw.scalecs, 250);
                mpt.playNote(R.raw.scalecs, 250);
                mpt.playNote(R.raw.scalecs, 250);
                mpt.playNote(R.raw.scalecs, 250);
                mpt.playNote(R.raw.scalecs, 250);
                delayPlaying(WHOLE_NOTE/2);
                mpt.playNote(R.raw.scalefs, 250);
                mpt.playNote(R.raw.scalegs, 250);
                mpt.playNote(R.raw.scalee, 250);
                       }
        }); }


}
