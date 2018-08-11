package com.chibusoft.jokesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class DisplayActivity extends AppCompatActivity {

    private TextView jokeText;
    private ImageView jokeImage;
    private Random random;
    public static final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        jokeText = (TextView) findViewById(R.id.joke_text);
        jokeImage = (ImageView) findViewById(R.id.funny_image);

        //Set a random image to display
        random = new Random();
        int val = random.nextInt(4);
        switch (val) {
            case 0:
                jokeImage.setImageResource(R.drawable.funnya);
                break;
            case 1:
                jokeImage.setImageResource(R.drawable.funnyb);
                break;
            case 2:
                jokeImage.setImageResource(R.drawable.funnyc);
                break;
            case 3:
                jokeImage.setImageResource(R.drawable.funnyd);
                break;
            default:
                jokeImage.setImageResource(R.drawable.funnyd);
                break;
        }

        Intent intent = getIntent();
        if(intent.hasExtra(JOKE)) {
            String joke = intent.getStringExtra(JOKE);
            jokeText.setText(joke);
        }
    }
}
