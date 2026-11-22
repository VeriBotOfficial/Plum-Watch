package com.alipay.android.phone.mrpc.core;

import android.os.Looper;

/* loaded from: classes11.dex */
public class ac {
    public static boolean a() {
        return Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
    }
}
