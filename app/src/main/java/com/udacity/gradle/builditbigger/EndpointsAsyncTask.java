package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;
import com.udacity.gradle.builditbigger.backend.myApi.model.MyBean;
import java.io.IOException;

public class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {
    private static MyApi myApiService = null;
    private Context context;
    private String results;
    //private String myipAddress = BuildConfig.My_ip_Address;

    private final PostExecuteListener postExecuteListener;

    public interface PostExecuteListener {
        void onPostExecuteListener(String joke);
    }

    public EndpointsAsyncTask(Context context, PostExecuteListener listener) {
        this.context = context;
        postExecuteListener = listener;
    }


    @Override
    protected String doInBackground(Void... params) {

        if(myApiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    //.setRootUrl("https://jokeapp861904.appspot.com/_ah/api/") //google cloud
                        .setRootUrl("http://10.0.2.2:8080/_ah/api/")     //emulator
                    //.setRootUrl("http://<computer ip>:8080/_ah/api/") //computer ip4 address
                    .setApplicationName("jokeapp")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            myApiService = builder.build();
        }


        try {
            return myApiService.joke(new MyBean()).execute().getJoke();
            // return myApiService.sayHi(name).execute().getData(); //this is where we call method from my backend/myendpoint
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
       super.onPostExecute(result);
        results = result;
       if (postExecuteListener != null) postExecuteListener.onPostExecuteListener(result);
    }



}