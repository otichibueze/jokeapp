package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.chibusoft.jokesandroid.DisplayActivity;
import com.chibusoft.jokelib.jokes;


public class MainActivity extends AppCompatActivity implements  EndpointsAsyncTask.PostExecuteListener {

    private String joke = "";
    public static ProgressBar spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.GONE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void tellJoke(View view) {
        spinner.setVisibility(View.VISIBLE);
        new EndpointsAsyncTask(this, this).execute();
    }


    //Listener to start activity when joke is done loading
    @Override
    public void onPostExecuteListener(String joke) {
        Intent myIntent = new Intent(this, DisplayActivity.class);
        myIntent.putExtra("JOKE", joke);
        MainActivity.spinner.setVisibility(View.GONE);
        startActivity(myIntent);
    }
}
