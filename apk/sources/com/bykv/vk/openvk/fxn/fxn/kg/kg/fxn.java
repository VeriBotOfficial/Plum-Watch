package com.bykv.vk.openvk.fxn.fxn.kg.kg;

import android.os.Looper;

/* JADX INFO: loaded from: classes15.dex */
public final class fxn {
    public static boolean fxn() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
