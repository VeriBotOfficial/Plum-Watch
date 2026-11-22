package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* loaded from: classes14.dex */
public class rlu {
    public static void fxn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
