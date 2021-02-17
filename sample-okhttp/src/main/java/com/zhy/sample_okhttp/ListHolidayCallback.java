package com.zhy.sample_okhttp;


import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.zhy.http.okhttp.callback.Callback;
import com.zhy.sample_okhttp.pojo.Holiday;

import java.util.List;

import okhttp3.Response;

public abstract class ListHolidayCallback extends Callback<List<Holiday>> {

    private String TAG = this.getClass().getSimpleName();

    @Override
    public List<Holiday> parseNetworkResponse(Response response, int id) throws Exception {
        String string = response.body().string();
        Log.d(TAG, "parseNetworkResponse:: " + string);
        //List<Holiday> holidays = new Gson().fromJson(string, List.class);
        List<Holiday> holidays = JSON.parseArray(string, Holiday.class);

        return holidays;
    }
}
