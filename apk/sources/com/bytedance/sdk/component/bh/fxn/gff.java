package com.bytedance.sdk.component.bh.fxn;

/* JADX INFO: loaded from: classes15.dex */
public class gff {
    public static void fxn(Object obj, String str) {
        if (obj == null) {
            fxn(str);
        }
    }

    public static void fxn(String str) {
        throw new IllegalArgumentException(str);
    }
}
