package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface iq {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15843a = a.f15844a;

    String a();

    String b();

    String c();

    public static final class a {
        private static volatile kq b;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f15844a = new a();
        private static final Object c = new Object();

        @JvmStatic
        public static iq a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b == null) {
                synchronized (c) {
                    if (b == null) {
                        b = jq.a(context);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            kq kqVar = b;
            if (kqVar != null) {
                return kqVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        private a() {
        }
    }
}
