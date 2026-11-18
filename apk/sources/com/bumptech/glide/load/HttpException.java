package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(int r2) {
        this("Http request failed", r2);
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int r3) {
        this(str, r3, null);
    }

    public HttpException(String str, int r3, Throwable th) {
        super(str + ", status code: " + r3, th);
        this.statusCode = r3;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
