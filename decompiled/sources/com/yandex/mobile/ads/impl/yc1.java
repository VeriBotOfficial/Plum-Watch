package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class yc1 {

    /* renamed from: a, reason: collision with root package name */
    private final vn1 f17412a;
    private final wn1 b;

    public final xc1 a(up1<?> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String a2 = this.b.a(request);
        if (a2 == null) {
            return null;
        }
        try {
            this.f17412a.getClass();
            un1 a3 = vn1.a(a2);
            byte[] bytes = a3.a().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new xc1(200, bytes, a3.b(), false);
        } catch (JSONException unused) {
            return null;
        }
    }

    public /* synthetic */ yc1() {
        this(new vn1(), wn1.b.a());
    }

    public yc1(vn1 readyResponseDecoder, wn1 readyResponseStorage) {
        Intrinsics.checkNotNullParameter(readyResponseDecoder, "readyResponseDecoder");
        Intrinsics.checkNotNullParameter(readyResponseStorage, "readyResponseStorage");
        this.f17412a = readyResponseDecoder;
        this.b = readyResponseStorage;
    }
}
