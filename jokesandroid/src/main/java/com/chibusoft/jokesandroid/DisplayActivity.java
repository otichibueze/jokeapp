package com.chibusoft.jokesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class DisplayActivity extends AppCompatActivity {

    TextView jokeText;
    ImageView jokeImage;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        jokeText = (TextView) findViewById(R.id.joke_text);
        jokeImage = (ImageView) findViewById(R.id.funny_image);

        //Set a random image to display
        random = new Random();
        int val = random.nextInt(4);
        if(val == 0)jokeImage.setImageResource(R.drawable.funnya);
        else if(val == 1)jokeImage.setImageResource(R.drawable.funnyb);
        else if(val == 2)jokeImage.setImageResource(R.drawable.funnyc);
        else if(val == 3)jokeImage.setImageResource(R.drawable.funnyd);
        else jokeImage.setImageResource(R.drawable.funnyd);

        Intent intent = getIntent();
        if(intent.hasExtra("JOKE")) {
            String joke = intent.getStringExtra("JOKE");
            jokeText.setText(joke);
        }
    }
}
