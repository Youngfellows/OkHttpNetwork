package com.zhy.http.okhttp.callback;


public interface IGenericsSerializator {
    <T> T transform(String response, Class<T> classOfT);
}
