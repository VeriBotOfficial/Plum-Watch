package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n42 implements ct {
    @Override // com.yandex.mobile.ads.impl.ct
    public final boolean a(String host) {
        Socket socket;
        Intrinsics.checkNotNullParameter(host, "host");
        try {
            socket = new Socket();
        } catch (Throwable unused) {
            socket = null;
        }
        try {
            socket.connect(new InetSocketAddress(host, 80), 5000);
            boolean isConnected = socket.isConnected();
            try {
                socket.close();
                return isConnected;
            } catch (Throwable unused2) {
                sp0.c(new Object[0]);
                return isConnected;
            }
        } catch (Throwable unused3) {
            try {
                sp0.c(new Object[0]);
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Throwable unused4) {
                        sp0.c(new Object[0]);
                    }
                }
                return false;
            } catch (Throwable th) {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Throwable unused5) {
                        sp0.c(new Object[0]);
                    }
                }
                throw th;
            }
        }
    }
}
