package com.baidu.ar.ihttp;

import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* loaded from: classes12.dex */
public class HttpException extends Exception {
    public static final int HTTP_ERROR = 4;
    public static final int INVOKE_ERROR = 3;
    public static final int LIB_ERROR = 2;
    public static final int NET_ERROR = 1;
    public static final int UNKNOWN_ERROR = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f6994a;

    public HttpException(int i, Exception exc) {
        super(exc);
        this.f6994a = i;
    }

    public HttpException(int i, String str) {
        super(str);
        this.f6994a = i;
    }

    public HttpException(IOException iOException) {
        super(iOException);
        a(iOException);
    }

    public final void a(IOException iOException) {
        this.f6994a = ((iOException instanceof ConnectException) || (iOException instanceof SocketTimeoutException) || (iOException instanceof NoRouteToHostException) || (iOException instanceof UnknownHostException)) ? 1 : iOException instanceof IOException ? -1 : 2;
    }

    public int getCode() {
        return this.f6994a;
    }
}
