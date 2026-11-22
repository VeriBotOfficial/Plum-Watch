package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class te0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile se0 f16955a;
    private static final Object b = new Object();

    @JvmStatic
    public static final se0 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f16955a == null) {
            synchronized (b) {
                if (f16955a == null) {
                    int i = rs0.b;
                    Intrinsics.checkNotNullParameter(context, "context");
                    f16955a = new se0(rs0.a(context, "YadPreferenceFile"));
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        se0 se0Var = f16955a;
        if (se0Var != null) {
            return se0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
