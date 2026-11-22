package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f16505a = new p0();
    private static q0 b;

    @JvmStatic
    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f16505a) {
            if (b == null) {
                Context applicationContext = context.getApplicationContext();
                Activity activity = null;
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    Activity activity2 = context instanceof Activity ? (Activity) context : null;
                    if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                        activity = activity2;
                    }
                    q0 q0Var = new q0(new s0(activity));
                    b = q0Var;
                    application.registerActivityLifecycleCallbacks(q0Var);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final Activity b() {
        Activity b2;
        synchronized (f16505a) {
            q0 q0Var = b;
            b2 = q0Var != null ? q0Var.b() : null;
        }
        return b2;
    }

    private p0() {
    }

    @JvmStatic
    public static final Activity a() {
        Activity a2;
        synchronized (f16505a) {
            q0 q0Var = b;
            a2 = q0Var != null ? q0Var.a() : null;
        }
        return a2;
    }
}
