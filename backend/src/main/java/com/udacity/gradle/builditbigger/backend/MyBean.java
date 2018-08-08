package com.udacity.gradle.builditbigger.backend;

//import com.chibusoft.jokelib.jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {


//    private jokes myjoke;
//
//    public MyBean()
//    {
//        myjoke = new jokes();
//    }
//
//    public String getJoke() {
//        return myjoke.getjoke();
//    }

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}