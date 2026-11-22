package com.zj.easyfloat.floatingview.utils;

import android.app.Application;

/* loaded from: classes5.dex */
public class EnContext {
    private static final Application INSTANCE;

    static {
        Application application;
        Application application2 = null;
        try {
            application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
            if (application == null) {
                try {
                    try {
                        throw new IllegalStateException("Static initialization of Applications must be on main thread.");
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        try {
                            application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                            e.printStackTrace();
                            INSTANCE = application;
                            return;
                        }
                        INSTANCE = application;
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    application2 = application;
                    INSTANCE = application2;
                    throw th;
                }
            }
            INSTANCE = application;
        } catch (Exception e2) {
            e = e2;
            application = null;
        } catch (Throwable th2) {
            th = th2;
            INSTANCE = application2;
            throw th;
        }
    }

    public static Application get() {
        return INSTANCE;
    }
}
