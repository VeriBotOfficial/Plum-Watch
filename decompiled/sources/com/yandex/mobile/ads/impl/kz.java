package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kz implements gz {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16062a;

    public kz(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16062a = context;
    }

    @Override // com.yandex.mobile.ads.impl.gz
    public final ig<?> a() {
        CharSequence text = this.f16062a.getResources().getText(R.string.monetization_ads_internal_instream_call_to_action);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return new ig<>("call_to_action", "string", text, null, true, true);
    }
}
