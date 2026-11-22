package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gz1;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class rb0 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final gz1.a f16750a;
    private final int b;
    private final int c;
    private final String d;

    public rb0(int i, int i2, gz1.a sizeType) {
        Intrinsics.checkNotNullParameter(sizeType, "sizeType");
        this.f16750a = sizeType;
        this.b = (i >= 0 || -1 == i) ? i : 0;
        this.c = (i2 >= 0 || -2 == i2) ? i2 : 0;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.d = format;
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.c;
        return -2 == i ? wh2.b(context) : i;
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.c;
        if (-2 != i) {
            return wh2.a(context, i);
        }
        int i2 = wh2.b;
        return eb0.a(context, "context").heightPixels;
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.b;
        return -1 == i ? wh2.c(context) : i;
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.b;
        if (-1 != i) {
            return wh2.a(context, i);
        }
        int i2 = wh2.b;
        return eb0.a(context, "context").widthPixels;
    }

    public final int hashCode() {
        return this.f16750a.hashCode() + v3.a(this.d, ((this.b * 31) + this.c) * 31, 31);
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final gz1.a a() {
        return this.f16750a;
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int getWidth() {
        return this.b;
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int getHeight() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(rb0.class, obj.getClass())) {
            rb0 rb0Var = (rb0) obj;
            if (this.b == rb0Var.b && this.c == rb0Var.c && this.f16750a == rb0Var.f16750a) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.d;
    }
}
