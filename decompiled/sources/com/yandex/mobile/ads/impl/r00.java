package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r00 implements gz {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16717a;

    public r00(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16717a = context;
    }

    @Override // com.yandex.mobile.ads.impl.gz
    public final ig<?> a() {
        CharSequence text = this.f16717a.getResources().getText(R.string.monetization_ads_internal_instream_sponsored_default);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return new ig<>("sponsored", "string", text, null, false, true);
    }
}
