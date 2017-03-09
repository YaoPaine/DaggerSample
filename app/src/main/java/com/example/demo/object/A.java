package com.example.demo.object;

import android.util.Log;

import javax.inject.Inject;

/**
 * 说明：
 * <p>
 * 参数：
 * <p>
 * 来源：
 * <p>
 * Created by heyao on 2017/3/6.
 */

public class A {

    private String TAG = A.class.getSimpleName();

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    private String field;

    @Inject
    public A() {

    }

    public void doSomething() {
        Log.e(TAG, "doSomething: ");
    }

}
