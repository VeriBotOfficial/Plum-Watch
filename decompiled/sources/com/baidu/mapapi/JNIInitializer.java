package com.baidu.mapapi;

import android.app.Application;
import android.content.Context;
import com.baidu.vi.VIContext;

/* loaded from: classes13.dex */
public class JNIInitializer {

    /* renamed from: a, reason: collision with root package name */
    private static Context f7799a;

    public static Context getCachedContext() {
        return f7799a;
    }

    public static void setContext(Application application) {
        if (application == null) {
            throw new RuntimeException();
        }
        if (f7799a == null) {
            f7799a = application;
        }
        VIContext.init(application);
    }
}
