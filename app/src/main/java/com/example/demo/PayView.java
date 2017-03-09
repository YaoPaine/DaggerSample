package com.example.demo;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/**
 * 说明：
 * <p>
 * 参数：
 * <p>
 * 来源：
 * <p>
 * Created by heyao on 2017/3/2.
 */

public class PayView extends View {
    public PayView(Context context) {
        super(context, null);
    }

    public PayView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public PayView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.PayView);

    }
}
