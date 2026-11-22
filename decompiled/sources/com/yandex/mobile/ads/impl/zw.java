package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zw {

    /* renamed from: a, reason: collision with root package name */
    private final String f17563a;
    private final int b;
    private final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw)) {
            return false;
        }
        zw zwVar = (zw) obj;
        return Intrinsics.areEqual(this.f17563a, zwVar.f17563a) && this.b == zwVar.b && this.c == zwVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dy1.a(this.b, this.f17563a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelColoredText(text=" + this.f17563a + ", color=" + this.b + ", style=" + this.c + Separators.RPAREN;
    }

    public zw(int i, int i2, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f17563a = text;
        this.b = i;
        this.c = i2;
    }

    public final String c() {
        return this.f17563a;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public /* synthetic */ zw(String str, int i) {
        this(i, R.style.DebugPanelText_Body2, str);
    }
}
