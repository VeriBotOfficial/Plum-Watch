package com.alipay.android.phone.mrpc.core;

import android.util.Log;
import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes7.dex */
public class af implements HttpRequestRetryHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1272a = "af";

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int r3, HttpContext httpContext) {
        String str;
        String str2;
        if (r3 >= 3) {
            return false;
        }
        if (iOException instanceof NoHttpResponseException) {
            str = f1272a;
            str2 = "exception instanceof NoHttpResponseException";
        } else {
            if ((!(iOException instanceof SocketException) && !(iOException instanceof SSLException)) || iOException.getMessage() == null || !iOException.getMessage().contains("Broken pipe")) {
                return false;
            }
            str = f1272a;
            str2 = "exception instanceof SocketException:Broken pipe";
        }
        Log.v(str, str2);
        return true;
    }
}
