package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* loaded from: classes14.dex */
public class rmu {
    private static volatile Context fxn = null;
    private static int gff = -1;
    private static volatile iwp<com.bytedance.sdk.openadsdk.hm.fxn> kg;

    public static Context fxn() {
        if (fxn == null) {
            kg(null);
        }
        return fxn;
    }

    public static Context fxn(Context context) {
        if (context == null) {
            context = fxn();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static void kg(Context context) {
        if (fxn == null) {
            synchronized (rmu.class) {
                if (fxn == null) {
                    if (context != null) {
                        fxn = context;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            fxn = applicationContext;
                        }
                        return;
                    }
                    try {
                        Application fxn2 = fxn.fxn();
                        if (fxn2 != null) {
                            fxn = fxn2;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static int kg() {
        Context fxn2;
        if (gff < 0 && (fxn2 = fxn()) != null) {
            gff = ViewConfiguration.get(fxn2).getScaledTouchSlop();
        }
        return gff;
    }

    public static iwp<com.bytedance.sdk.openadsdk.hm.fxn> gff() {
        if (kg == null) {
            synchronized (rmu.class) {
                if (kg == null) {
                    kg = new jz(fxn);
                }
            }
        }
        return kg;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.bh hm() {
        return com.bytedance.sdk.openadsdk.core.settings.rlu.jt();
    }

    public static com.bytedance.sdk.openadsdk.ckl.gff.gff rb() {
        if (!com.bytedance.sdk.openadsdk.core.settings.jq.fxn()) {
            return com.bytedance.sdk.openadsdk.ckl.gff.hm.fxn();
        }
        return com.bytedance.sdk.openadsdk.hm.fxn.hm.fxn();
    }

    private static class fxn {
        private static volatile Application fxn;

        public static Application fxn() {
            return fxn;
        }

        static {
            try {
                Object kg = kg();
                fxn = (Application) kg.getClass().getMethod("getApplication", new Class[0]).invoke(kg, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dx.fxn("MyApplication", "application get failed", th);
            }
        }

        private static Object kg() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dx.fxn("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
