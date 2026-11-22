package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pu1 {
    private static final Object b = new Object();
    private static volatile pu1 c;
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f16599a;

    public static final class a {
        public static pu1 a() {
            pu1 pu1Var;
            pu1 pu1Var2 = pu1.c;
            if (pu1Var2 != null) {
                return pu1Var2;
            }
            synchronized (pu1.b) {
                pu1Var = pu1.c;
                if (pu1Var == null) {
                    pu1Var = new pu1(0);
                    pu1.c = pu1Var;
                }
            }
            return pu1Var;
        }
    }

    private pu1() {
        this.f16599a = new HashMap();
    }

    public final void a(Context context, ju1 sdkConfiguration) {
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        synchronized (b) {
            hashSet = new HashSet(this.f16599a.keySet());
            int i = pw1.l;
            pw1.a.a().a(context, sdkConfiguration);
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zu1) it.next()).a(context, sdkConfiguration);
        }
    }

    public /* synthetic */ pu1(int i) {
        this();
    }

    public final void a(lu1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (b) {
            if (!this.f16599a.containsKey(listener)) {
                this.f16599a.put(listener, null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
