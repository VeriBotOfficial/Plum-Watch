package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vf0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f17157a = new Object();
    private static volatile ge0 b;

    @JvmStatic
    public static final ge0 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (b == null) {
            synchronized (f17157a) {
                if (b == null) {
                    b = new ge0(context, "com.huawei.hms.location.LocationServices");
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        ge0 ge0Var = b;
        if (ge0Var != null) {
            return ge0Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
