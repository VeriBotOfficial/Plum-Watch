package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w02 implements x {

    /* renamed from: a, reason: collision with root package name */
    private final String f17210a;
    private final List<z02> b;

    public w02(String actionType, ArrayList items) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f17210a = actionType;
        this.b = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w02)) {
            return false;
        }
        w02 w02Var = (w02) obj;
        return Intrinsics.areEqual(this.f17210a, w02Var.f17210a) && Intrinsics.areEqual(this.b, w02Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17210a.hashCode() * 31);
    }

    public final String toString() {
        return "SocialAction(actionType=" + this.f17210a + ", items=" + this.b + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.x
    public final String a() {
        return this.f17210a;
    }

    public final List<z02> c() {
        return this.b;
    }
}
