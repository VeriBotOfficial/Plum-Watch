package com.baidu.platform.comapi.bmsdk;

/* loaded from: classes13.dex */
public class BmFinalizerObject {
    private BmFinalizerObject() {
    }

    public static void a(long j) {
        if (j != 0) {
            nativeFinalizer(j);
        }
    }

    private static native void nativeFinalizer(long j);
}
