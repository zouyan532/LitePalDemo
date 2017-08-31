package com.zouyan.demo.litepaldemo;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by Boosal on 2017/8/31.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
