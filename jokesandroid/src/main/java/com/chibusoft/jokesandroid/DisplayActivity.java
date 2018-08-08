package com.chibusoft.jokesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayActivity extends AppCompatActivity {

    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        jokeText = (TextView) findViewById(R.id.joke_text) ;

        Intent intent = getIntent();
        if(intent.hasExtra("JOKE")) {
            String joke = intent.getStringExtra("JOKE");
            jokeText.setText(joke);
        }
    }
}
