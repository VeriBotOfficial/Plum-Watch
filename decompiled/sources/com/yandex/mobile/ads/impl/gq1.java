package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.iq1;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gq1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f15622a = new Object();
    private static volatile gq1 b;
    public static final /* synthetic */ int c = 0;

    public static final class a {
        @JvmStatic
        public static gq1 a() {
            gq1 gq1Var;
            gq1 gq1Var2 = gq1.b;
            if (gq1Var2 != null) {
                return gq1Var2;
            }
            synchronized (gq1.f15622a) {
                gq1Var = gq1.b;
                if (gq1Var == null) {
                    gq1Var = new gq1();
                    gq1.b = gq1Var;
                }
            }
            return gq1Var;
        }
    }

    public static void a(Context context, final Object tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        hd1.a(context).a(new iq1.b() { // from class: com.yandex.mobile.ads.impl.gq1$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.iq1.b
            public final boolean a(up1 up1Var) {
                boolean a2;
                a2 = gq1.a(tag, up1Var);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Object tag, up1 up1Var) {
        Intrinsics.checkNotNullParameter(tag, "$tag");
        return Intrinsics.areEqual(tag, up1Var.i());
    }
}
