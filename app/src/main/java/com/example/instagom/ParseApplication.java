package com.example.instagom;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("j5YmXHFdnZwo4SixCjBNYmsTW0JLrJFsftfAADHd")
                .clientKey("0Qts1zOV7s9wR5vGmDECL7HZ0JSggC02k11xwamm")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
