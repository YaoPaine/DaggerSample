package com.example.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.demo.object.A;
import com.example.demo.object.AModule;
import com.example.demo.object.DaggerAComponent;
import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Inject
    A a;
    @Inject
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        a = DaggerAComponent.builder().build().a();
        DaggerAComponent.builder().aModule(new AModule()).build().inject(this);
        a.setField("...为什么这样子...");
        String json = gson.toJson(a);
        Log.e(TAG, "onCreate: " + json);
        a.doSomething();
    }
}
