package com.happyleo.android.practice_3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton catImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catImageButton = (ImageButton)findViewById(R.id.catImageButtonView);
        final MediaPlayer meowPlayer = MediaPlayer.create(this, R.raw.meow);

        catImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meowPlayer.start();
            }
        });
    }
}
