package com.bytedance.sdk.component.utils;

import java.io.Closeable;

/* JADX INFO: loaded from: classes15.dex */
public class hie {
    public static void fxn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
