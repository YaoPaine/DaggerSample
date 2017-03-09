package com.example.demo.object;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * 说明：
 * <p>
 * 参数：
 * <p>
 * 来源：
 * <p>
 * Created by heyao on 2017/3/6.
 */
@Module
public class AModule {

    @Provides
    public A provideAModule() {
        return new A();
    }

    @Provides
    public Gson provideGson() {
        return new Gson();
    }

}
