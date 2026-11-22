package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class d32 {

    /* renamed from: a, reason: collision with root package name */
    private final uj f15244a;

    public final String a(Context context, String body) {
        l50 l50Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(body, "body");
        int i = pw1.l;
        ju1 a2 = pw1.a.a().a(context);
        if (a2 == null || (l50Var = a2.u()) == null) {
            l50Var = l50.c;
        }
        x01 x01Var = new x01(l50Var.c(), l50Var.b());
        byte[] bytes = body.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] a3 = x01Var.a(bytes);
        if (a3 == null) {
            return null;
        }
        this.f15244a.getClass();
        return uj.a(a3);
    }

    public /* synthetic */ d32() {
        this(new uj());
    }

    public d32(uj base64Encoder) {
        Intrinsics.checkNotNullParameter(base64Encoder, "base64Encoder");
        this.f15244a = base64Encoder;
    }
}
