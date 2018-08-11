package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;


/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "joke")  //Here the name of the API method
    public MyBean joke() {
        //above we just call the class Mybean and return it, this we will consume in EndpointsAsyncTask
        MyBean response = new MyBean();
        return response;
    }

//    @ApiMethod(name = "joke")  //Here the name of the API method
//    public MyBean joke(MyBean response) {
//        //above we just call the class Mybean and return it, this we will consume in EndpointsAsyncTask
//        return response;
//    }

//    /** A simple endpoint method that takes a name and says Hi back */
//    @ApiMethod(name = "sayHi")
//    public MyBean sayHi(@Named("name") String name) {
//        MyBean response = new MyBean();
//        response.setData("Hi, " + name);
//
//        return response;
//    }

}
