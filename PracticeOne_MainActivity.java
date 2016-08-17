package com.happyleo.android.practiceapp;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare variables  for views
    TextView paragrphOneTextView;
    TextView paragrphTwoTextView;
    TextView paragrphThrTextView;
    TextView paragrphForTextView;
    TextView paragrphFivTextView;
    Button colorChangButtonView;
    Button resetColorButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initiaize variables
        paragrphOneTextView = (TextView) findViewById(R.id.paragraphOneTextView);
        paragrphTwoTextView = (TextView) findViewById(R.id.paragraphTwoTextView);
        paragrphThrTextView = (TextView) findViewById(R.id.paragraphThreeTextView);
        paragrphForTextView = (TextView) findViewById(R.id.paragraphFourTextView);
        paragrphFivTextView = (TextView) findViewById(R.id.paragraphFiveTextView);
        colorChangButtonView = (Button) findViewById(R.id.changeColorButtonView);
        resetColorButtonView = (Button) findViewById(R.id.resetButtonView);

        //create click listeners for colorchange and reset buttons
       colorChangButtonView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                //swap text colors around
                paragrphOneTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_3_color));
                paragrphTwoTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_5_color));
                paragrphThrTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_1_color));
                paragrphForTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_2_color));
                paragrphFivTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_4_color));



                //Working depreciated functions
                /*
                paragrphOneTextView.setTextColor(getResources().getColor(R.color.paragraph_3_color));
                paragrphTwoTextView.setTextColor(getResources().getColor(R.color.paragraph_5_color));
                paragrphThrTextView.setTextColor(getResources().getColor(R.color.paragraph_1_color));
                paragrphForTextView.setTextColor(getResources().getColor(R.color.paragraph_2_color));
                paragrphFivTextView.setTextColor(getResources().getColor(R.color.paragraph_4_color));
                */
            }
        });

        resetColorButtonView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //return text colors to original
                paragrphOneTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_1_color));
                paragrphTwoTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_2_color));
                paragrphThrTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_3_color));
                paragrphForTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_4_color));
                paragrphFivTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.paragraph_5_color));

                //Working depreciated functions
                /*
                paragrphOneTextView.setTextColor(getResources().getColor(R.color.paragraph_1_color));
                paragrphTwoTextView.setTextColor(getResources().getColor(R.color.paragraph_2_color));
                paragrphThrTextView.setTextColor(getResources().getColor(R.color.paragraph_3_color));
                paragrphForTextView.setTextColor(getResources().getColor(R.color.paragraph_4_color));
                paragrphFivTextView.setTextColor(getResources().getColor(R.color.paragraph_5_color));
                */
            }
        });

        }

}
