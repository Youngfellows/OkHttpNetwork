package com.zhy.sample_okhttp;

import android.util.Log;

import okhttp3.logging.HttpLoggingInterceptor;


public class HttpLogger implements HttpLoggingInterceptor.Logger {
    @Override
    public void log(String message) {
        Log.w("HttpLogger ==>>>", message);
    }
}

