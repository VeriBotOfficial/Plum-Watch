package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m30 implements DivTypefaceProvider {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16204a;

    public m30(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16204a = context;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface a2;
        ec0 a3 = fc0.a(this.f16204a);
        return (a3 == null || (a2 = a3.a()) == null) ? Typeface.DEFAULT_BOLD : a2;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        ec0 a2 = fc0.a(this.f16204a);
        if (a2 != null) {
            return a2.b();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        ec0 a2 = fc0.a(this.f16204a);
        if (a2 != null) {
            return a2.c();
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        ec0 a2 = fc0.a(this.f16204a);
        if (a2 != null) {
            return a2.d();
        }
        return null;
    }
}
