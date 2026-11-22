package com.bykv.vk.openvk.fxn.fxn.kg.kg;

import android.os.Looper;

/* loaded from: classes13.dex */
public final class fxn {
    public static boolean fxn() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
