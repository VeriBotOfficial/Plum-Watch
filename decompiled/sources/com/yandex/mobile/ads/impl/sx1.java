package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface sx1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16904a = a.f16905a;

    String a();

    void a(String str);

    public static final class a {
        private static volatile tx1 b;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f16905a = new a();
        private static final Object c = new Object();

        @JvmStatic
        public static sx1 a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b == null) {
                synchronized (c) {
                    if (b == null) {
                        int i = rs0.b;
                        Intrinsics.checkNotNullParameter(context, "context");
                        b = new tx1(rs0.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            tx1 tx1Var = b;
            if (tx1Var != null) {
                return tx1Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        private a() {
        }
    }
}
