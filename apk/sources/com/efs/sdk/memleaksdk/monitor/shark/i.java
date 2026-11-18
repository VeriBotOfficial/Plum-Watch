package com.efs.sdk.memleaksdk.monitor.shark;

import java.io.Closeable;

/* JADX INFO: loaded from: classes11.dex */
public class i {
    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }
}
