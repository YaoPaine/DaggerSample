package com.example.demo.object;

import com.example.demo.MainActivity;

import dagger.Component;

/**
 * 说明：
 * <p>
 * 参数：
 * <p>
 * 来源：
 * <p>
 * Created by heyao on 2017/3/6.
 */
@Component(modules = {AModule.class})
public interface AComponent {
    void inject(MainActivity activity);
}
