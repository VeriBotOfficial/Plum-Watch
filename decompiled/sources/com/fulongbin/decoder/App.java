package com.fulongbin.decoder;

import android.app.Application;
import android.util.Log;

/* loaded from: classes14.dex */
public class App {
    public static final Application INSTANCE;

    static {
        Application application;
        Application application2 = null;
        try {
            try {
                application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
                if (application == null) {
                    try {
                        throw new IllegalStateException("Static initialization of Applications must be on main thread.");
                    } catch (Exception e) {
                        e = e;
                        Log.e("Silk_v3_decoder", "Failed to get current application from AppGlobals." + e.getMessage());
                        try {
                            application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                            Log.e("Silk_v3_decoder", "Failed to get current application from ActivityThread." + e.getMessage());
                        }
                        INSTANCE = application;
                        return;
                    }
                }
                INSTANCE = application;
            } catch (Throwable th) {
                th = th;
                application2 = application;
                INSTANCE = application2;
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            application = null;
        } catch (Throwable th2) {
            th = th2;
            INSTANCE = application2;
            throw th;
        }
    }
}
