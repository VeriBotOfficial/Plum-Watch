package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes5.dex */
public class rh0 extends uv {
    public final int d;

    private static int a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public rh0(int i) {
        super(a(i, 1));
        this.d = 1;
    }

    public static rh0 a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !fg.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        if (i2 == 2007) {
            return new qh0(iOException);
        }
        return new rh0(iOException, i2, i);
    }

    public rh0(IOException iOException, int i, int i2) {
        super(iOException, a(i, i2));
        this.d = i2;
    }

    public rh0(String str, int i) {
        super(a(i, 1), str);
        this.d = 1;
    }

    public rh0(String str, IOException iOException, int i) {
        super(a(i, 1), str, iOException);
        this.d = 1;
    }
}
