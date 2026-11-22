package com.efs.sdk.memleaksdk.monitor.shark;

import java.io.Closeable;

/* loaded from: classes14.dex */
public class i {
    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }
}
