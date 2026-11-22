package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ze2 {
    public static final a c = new a(0);
    private static volatile ze2 d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17513a;
    private final iq1 b;

    private ze2(Context context) {
        Context appContext = context.getApplicationContext();
        this.f17513a = appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        this.b = hl2.a(appContext, 4);
    }

    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Context context = this.f17513a;
        Intrinsics.checkNotNullExpressionValue(context, "appContext");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.b.a(new kh1(context, url, new yi2()));
    }

    public /* synthetic */ ze2(Context context, int i) {
        this(context);
    }

    public static final class a {
        @JvmStatic
        public final ze2 a(Context context) {
            ze2 ze2Var;
            Intrinsics.checkNotNullParameter(context, "context");
            ze2 ze2Var2 = ze2.d;
            if (ze2Var2 != null) {
                return ze2Var2;
            }
            synchronized (this) {
                ze2Var = ze2.d;
                if (ze2Var == null) {
                    ze2Var = new ze2(context, 0);
                    ze2.d = ze2Var;
                }
            }
            return ze2Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
