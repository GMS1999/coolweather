package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        //enqueue开启一个子线程去执行Http请求，并将最终的请求结果回调到okhttp3.Callback当中。
        client.newCall(request).enqueue(callback);
    }
}
