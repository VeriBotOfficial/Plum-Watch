package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class p6 implements fn0 {
    private static final int c = R.string.monetization_ads_internal_instream_ad_position;

    /* renamed from: a, reason: collision with root package name */
    private final int f16525a;
    private final int b;

    @Override // com.yandex.mobile.ads.impl.fn0
    public final void a(ob2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView b = uiElements.b();
        if (b != null) {
            String string = b.getContext().getResources().getString(c);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f16525a), Integer.valueOf(this.b)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            b.setText(format);
        }
    }

    public p6(int i, int i2) {
        this.f16525a = i;
        this.b = i2;
    }
}
