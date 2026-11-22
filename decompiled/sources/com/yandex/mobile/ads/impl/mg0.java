package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class mg0 extends zj<String> implements q3 {
    private final t8 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mg0(Context context, o8<String> adResponse) {
        this(context, adResponse, new t8());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
    }

    public final t8 i() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg0(Context context, o8<String> adResponse, t8 adResultReceiver) {
        super(context, adResponse);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        this.d = adResultReceiver;
        adResultReceiver.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.zj
    public synchronized void b() {
        this.d.a(null);
    }
}
