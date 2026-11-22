package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class ad1 implements zc1 {

    /* renamed from: a, reason: collision with root package name */
    private final sj f14997a;

    @Override // com.yandex.mobile.ads.impl.zc1
    public final String a(wq1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        byte[] a2 = networkResponse.a().a();
        if (a2 == null) {
            return null;
        }
        if (!nf0.a(networkResponse.b(), vh0.e0, true)) {
            return new String(a2, Charsets.UTF_8);
        }
        this.f14997a.getClass();
        return sj.a(a2);
    }

    public /* synthetic */ ad1() {
        this(new sj());
    }

    public ad1(sj base64Decoder) {
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.f14997a = base64Decoder;
    }
}
