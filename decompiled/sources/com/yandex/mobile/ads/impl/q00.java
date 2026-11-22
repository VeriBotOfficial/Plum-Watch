package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q00 implements gz {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16614a;

    public q00(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16614a = context;
    }

    @Override // com.yandex.mobile.ads.impl.gz
    public final ig<?> a() {
        CharSequence text = this.f16614a.getResources().getText(R.string.monetization_ads_internal_instream_sponsored_social);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return new ig<>("sponsored", "string", text, null, false, true);
    }
}
