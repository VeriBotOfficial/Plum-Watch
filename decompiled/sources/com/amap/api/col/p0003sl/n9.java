package com.amap.api.col.p0003sl;

import android.content.Context;

/* compiled from: AAIDManager.java */
/* loaded from: classes11.dex */
public class n9 {

    /* renamed from: a, reason: collision with root package name */
    private static n9 f1792a;

    private n9(Context context) {
    }

    public static n9 a(Context context) {
        if (f1792a == null) {
            synchronized (n9.class) {
                if (f1792a == null) {
                    f1792a = new n9(context);
                }
            }
        }
        return f1792a;
    }
}
