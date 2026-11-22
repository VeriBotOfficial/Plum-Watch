package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j32 {
    private static volatile j32 b;
    private static final Object c = new Object();
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f15880a;

    public static final class a {
        public static j32 a() {
            if (j32.b == null) {
                synchronized (j32.c) {
                    if (j32.b == null) {
                        j32.b = new j32(0);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            j32 j32Var = j32.b;
            if (j32Var != null) {
                return j32Var;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final void b(xq0 referenceType, Object keepingObject) {
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(keepingObject, "keepingObject");
        synchronized (c) {
            Set set = (Set) this.f15880a.get(referenceType);
            if (set == null) {
                set = new LinkedHashSet();
                this.f15880a.put(referenceType, set);
            }
            set.add(keepingObject);
        }
    }

    private j32() {
        this.f15880a = new LinkedHashMap();
    }

    public final void a(xq0 referenceType, Object keepingObject) {
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(keepingObject, "keepingObject");
        synchronized (c) {
            Set set = (Set) this.f15880a.get(referenceType);
            if (set != null) {
                set.remove(keepingObject);
            }
        }
    }

    public /* synthetic */ j32(int i) {
        this();
    }
}
