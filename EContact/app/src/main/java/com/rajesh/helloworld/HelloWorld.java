package com.rajesh.helloworld;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.List;

public class HelloWorld extends Application {

    public static final String APPLICATION_ID = "F9402A92-AE1B-A76A-FF40-0291D3B3B600";
    public static final String API_KEY = "AD565A55-755E-9606-FF3D-6D663E2B1A00";
    public static final String SERVER_URL = "https://api.backendless.com";

    public static BackendlessUser user;
    public static List<Contact> contacts;
    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }
}
