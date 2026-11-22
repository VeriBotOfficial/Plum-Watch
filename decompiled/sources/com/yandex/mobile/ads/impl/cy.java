package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cy {

    /* renamed from: a, reason: collision with root package name */
    private final String f15230a;
    private final int b;
    private final Integer c;
    private final int d;

    public cy(String text, int i, Integer num, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f15230a = text;
        this.b = i;
        this.c = num;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        return Intrinsics.areEqual(this.f15230a, cyVar.f15230a) && this.b == cyVar.b && Intrinsics.areEqual(this.c, cyVar.c) && this.d == cyVar.d;
    }

    public final int hashCode() {
        int a2 = dy1.a(this.b, this.f15230a.hashCode() * 31, 31);
        Integer num = this.c;
        return Integer.hashCode(this.d) + ((a2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugPanelTextWithIcon(text=" + this.f15230a + ", color=" + this.b + ", icon=" + this.c + ", style=" + this.d + Separators.RPAREN;
    }

    public final String d() {
        return this.f15230a;
    }

    public final int a() {
        return this.b;
    }

    public final Integer b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public /* synthetic */ cy(String str, int i, Integer num, int i2, int i3) {
        this(str, (i3 & 2) != 0 ? R.attr.debug_panel_label_primary : i, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? R.style.DebugPanelText_Body1 : i2);
    }
}
