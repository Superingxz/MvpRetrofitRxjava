package com.xologood.mvpretrofitrxjava;

import android.content.Context;
import android.content.res.Resources;

import com.xologood.mvpframework.baseapp.BaseApplication;


/**
 * Created by xiao on 2016/12/20 0020.
 */
public class Qpadapplication extends BaseApplication {
    private static Qpadapplication baseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
    }

    public static Context getAppContext() {
        return baseApplication;
    }
    public static Resources getAppResources() {
        return baseApplication.getResources();
    }
    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    /**
     * 分包
     * @param base
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
      //  MultiDex.install(this);
    }
}
