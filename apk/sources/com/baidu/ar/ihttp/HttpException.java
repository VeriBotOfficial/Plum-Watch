package com.baidu.ar.ihttp;

import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes16.dex */
public class HttpException extends Exception {
    public static final int HTTP_ERROR = 4;
    public static final int INVOKE_ERROR = 3;
    public static final int LIB_ERROR = 2;
    public static final int NET_ERROR = 1;
    public static final int UNKNOWN_ERROR = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6994a;

    public HttpException(int r1, Exception exc) {
        super(exc);
        this.f6994a = r1;
    }

    public HttpException(int r1, String str) {
        super(str);
        this.f6994a = r1;
    }

    public HttpException(IOException iOException) {
        super(iOException);
        a(iOException);
    }

    public final void a(IOException iOException) {
        int r2;
        if ((iOException instanceof ConnectException) || (iOException instanceof SocketTimeoutException) || (iOException instanceof NoRouteToHostException) || (iOException instanceof UnknownHostException)) {
            r2 = 1;
        } else {
            r2 = iOException instanceof IOException ? -1 : 2;
        }
        this.f6994a = r2;
    }

    public int getCode() {
        return this.f6994a;
    }
}
