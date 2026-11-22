package com.xmly.businesssdk.utils;

import com.google.gson.JsonParseException;
import com.xmly.businesssdk.c;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.ParseException;
import org.json.JSONException;
import retrofit2.HttpException;

/* loaded from: classes3.dex */
public class RxErrorHandler {

    public static class NetworkException extends RuntimeException {
        public NetworkException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static Throwable error(Throwable th) {
        if (!(th instanceof HttpException)) {
            return ((th instanceof JsonParseException) || (th instanceof JSONException) || (th instanceof ParseException)) ? new NetworkException("解析错误", th) : th instanceof ConnectException ? new NetworkException("连接失败", th) : th instanceof UnknownHostException ? new NetworkException("网络未连接", th) : th instanceof SocketTimeoutException ? new NetworkException("服务器响应超时", th) : th;
        }
        HttpException httpException = (HttpException) th;
        httpException.code();
        return new NetworkException(c.a("网络异常 ").append(httpException.code()).toString(), httpException);
    }
}
