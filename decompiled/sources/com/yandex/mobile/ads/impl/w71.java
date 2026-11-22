package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;

/* loaded from: classes5.dex */
public final class w71 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f17227a = new Object();
    private static volatile w71 b;
    public static final /* synthetic */ int c = 0;

    public static final class a {
        @JvmStatic
        public static w71 a() {
            w71 w71Var;
            w71 w71Var2 = w71.b;
            if (w71Var2 != null) {
                return w71Var2;
            }
            synchronized (w71.f17227a) {
                w71Var = w71.b;
                if (w71Var == null) {
                    w71Var = new w71(0);
                    w71.b = w71Var;
                }
            }
            return w71Var;
        }
    }

    public final boolean c() {
        return true;
    }

    private w71() {
    }

    public /* synthetic */ w71(int i) {
        this();
    }
}
