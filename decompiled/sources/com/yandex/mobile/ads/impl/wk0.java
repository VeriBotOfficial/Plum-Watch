package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.op1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wk0 {

    /* renamed from: a, reason: collision with root package name */
    private static final vk0 f17259a = new vk0(op1.b.S, op1.b.R, op1.b.T, op1.b.U);
    private static final vk0 b = new vk0(op1.b.y, op1.b.x, op1.b.z, op1.b.A);

    public static vk0 a(s9 adStructureType) {
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        int ordinal = adStructureType.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return f17259a;
        }
        if (ordinal == 2) {
            return b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
