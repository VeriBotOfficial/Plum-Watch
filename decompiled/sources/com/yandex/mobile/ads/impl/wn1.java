package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wn1 {
    public static final a b = new a(0);
    private static final Object c = new Object();
    private static volatile wn1 d;

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f17269a;

    private wn1() {
        this.f17269a = new WeakHashMap();
    }

    public /* synthetic */ wn1(int i) {
        this();
    }

    public final String a(up1<?> request) {
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (c) {
            str = (String) this.f17269a.get(request);
            this.f17269a.remove(request);
        }
        return str;
    }

    public final void a(ak request, String response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        synchronized (c) {
            this.f17269a.put(request, response);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final class a {
        @JvmStatic
        public final wn1 a() {
            wn1 wn1Var;
            wn1 wn1Var2 = wn1.d;
            if (wn1Var2 != null) {
                return wn1Var2;
            }
            synchronized (this) {
                wn1Var = wn1.d;
                if (wn1Var == null) {
                    wn1Var = new wn1(0);
                    wn1.d = wn1Var;
                }
            }
            return wn1Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
