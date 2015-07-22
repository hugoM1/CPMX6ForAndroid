package com.cpmx6.devf.cpmx6.app;

import android.app.Application;

import com.cpmx6.devf.cpmx6.api.GiphyApiManager;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by hugo on 7/19/15.
 */
public class GiphyApplication extends Application {
    private static GiphyApiManager giphyApiManager;

    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);

        giphyApiManager = new GiphyApiManager();
    }

    public static synchronized GiphyApiManager getGiphyApiManager(){
        return giphyApiManager;
    }
}
