package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class f32 implements hr1<String> {
    @Override // com.yandex.mobile.ads.impl.hr1
    public final String a(wq1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        byte[] a2 = networkResponse.a().a();
        if (a2 == null) {
            return null;
        }
        try {
            return new String(a2, nf0.a(networkResponse.b()));
        } catch (Exception unused) {
            return new String(a2, Charsets.UTF_8);
        }
    }
}
