package com.xologood.mvpframework;

import android.content.Context;
import android.content.res.Resources;

import com.xologood.mvpframework.baseapp.BaseApplication;
import com.xologood.mvpframework.util.SpUtil;


/**
 * Created by baixiaokang on 16/4/23.
 */
public class App extends BaseApplication {
    private static App mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        SpUtil.init(this);
    }

    public static Context getAppContext() {
        return mApp;
    }

    public static Resources getAppResources() {
        return mApp.getResources();
    }

}
