package com.baidu.vi;

import android.content.Context;

/* JADX INFO: loaded from: classes15.dex */
public class VIContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Context f9048a;

    public static Context getContext() {
        return f9048a;
    }

    public static void init(Context context) {
        f9048a = context;
    }
}
