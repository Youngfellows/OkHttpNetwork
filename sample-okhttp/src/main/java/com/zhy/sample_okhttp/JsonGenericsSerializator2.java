package com.zhy.sample_okhttp;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.zhy.http.okhttp.callback.IGenericsSerializator;

/**
 * Created by JimGong on 2016/6/23.
 */
public class JsonGenericsSerializator2 implements IGenericsSerializator {
    //Gson mGson = new Gson();
    @Override
    public <T> T transform(String response, Class<T> classOfT) {
        return JSON.parseObject(response, classOfT);
    }
}
