package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.iy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class bh2 extends Lambda implements Function1<iy.c.a, Unit> {
    public static final bh2 b = new bh2();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15110a;

        static {
            int[] iArr = new int[iy.c.a.values().length];
            try {
                iy.c.a aVar = iy.c.a.b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15110a = iArr;
        }
    }

    bh2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(iy.c.a aVar) {
        iy.c.a actionType = aVar;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        int i = a.f15110a[actionType.ordinal()];
        return Unit.INSTANCE;
    }
}
