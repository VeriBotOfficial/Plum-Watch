package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ud1 {

    /* renamed from: a, reason: collision with root package name */
    private final q62 f17044a;
    private final n92 b;

    public ud1(q62 notice, n92 validationResult) {
        Intrinsics.checkNotNullParameter(notice, "notice");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        this.f17044a = notice;
        this.b = validationResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud1)) {
            return false;
        }
        ud1 ud1Var = (ud1) obj;
        return Intrinsics.areEqual(this.f17044a, ud1Var.f17044a) && Intrinsics.areEqual(this.b, ud1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17044a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.f17044a + ", validationResult=" + this.b + Separators.RPAREN;
    }

    public final q62 a() {
        return this.f17044a;
    }

    public final n92 b() {
        return this.b;
    }
}
