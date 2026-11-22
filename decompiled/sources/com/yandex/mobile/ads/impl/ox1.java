package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ox1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16500a = a.f16501a;

    String a();

    void a(String str);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f16501a = new a();
        private static final Object b = new Object();
        private static volatile ox1 c;

        public static ox1 a(Context context) {
            ox1 ox1Var;
            Intrinsics.checkNotNullParameter(context, "context");
            ox1 ox1Var2 = c;
            if (ox1Var2 != null) {
                return ox1Var2;
            }
            synchronized (b) {
                ox1Var = c;
                if (ox1Var == null) {
                    int i = rs0.b;
                    Intrinsics.checkNotNullParameter(context, "context");
                    ox1Var = new px1(rs0.a(context, "YadPreferenceFile"));
                    c = ox1Var;
                }
            }
            return ox1Var;
        }

        private a() {
        }
    }
}
