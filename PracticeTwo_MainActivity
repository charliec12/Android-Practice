package com.happyleo.android.practice_2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView catImageView;
    Button meowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catImageView = (ImageView)findViewById(R.id.picImageView);
        meowButton = (Button)findViewById(R.id.meowButtonView);

        final MediaPlayer catMeow = MediaPlayer.create(this,R.raw.meow);

        meowButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                catMeow.start();
            }

        });
    }


}
