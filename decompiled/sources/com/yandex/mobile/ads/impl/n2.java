package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.m2;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n2 {
    private static final Set<mq1> b = SetsKt.setOf((Object[]) new mq1[]{mq1.c, mq1.e, mq1.d});
    private static final Object c = new Object();
    private static volatile n2 d;
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final l2 f16298a;

    private n2(l2 l2Var) {
        this.f16298a = l2Var;
    }

    public /* synthetic */ n2(l2 l2Var, int i) {
        this(l2Var);
    }

    public final void a(mq1 requestType, Integer num) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        if (b.contains(requestType)) {
            if (num != null && num.intValue() < 500) {
                this.f16298a.a();
            } else {
                this.f16298a.c();
            }
        }
    }

    public static final class a {
        public static n2 a(Context context) {
            n2 n2Var;
            int i = n2.e;
            int i2 = m2.d;
            l2 adBlockerStateStorage = m2.a.a(context).c();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adBlockerStateStorage, "adBlockerStateStorage");
            n2 n2Var2 = n2.d;
            if (n2Var2 != null) {
                return n2Var2;
            }
            synchronized (n2.c) {
                n2Var = n2.d;
                if (n2Var == null) {
                    n2Var = new n2(adBlockerStateStorage, 0);
                    n2.d = n2Var;
                }
            }
            return n2Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public final void a(Boolean bool, g2 requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        if (bool != null) {
            l2.a(this.f16298a, bool, requestPolicy, Long.valueOf(System.currentTimeMillis()), null, 8);
        }
    }
}
