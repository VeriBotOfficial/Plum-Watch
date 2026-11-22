package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class se1 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile re1 f16856a;
    private static final Object b = new Object();

    @JvmStatic
    public static final re1 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f16856a == null) {
            synchronized (b) {
                if (f16856a == null) {
                    int i = rs0.b;
                    Intrinsics.checkNotNullParameter(context, "context");
                    f16856a = new re1(rs0.a(context, "YadPreferenceFile"));
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        re1 re1Var = f16856a;
        if (re1Var != null) {
            return re1Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
