package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.iy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pf0 extends ky<iy.e> {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f16559a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.item_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f16559a = (TextView) findViewById;
    }

    @Override // com.yandex.mobile.ads.impl.ky
    public final void a(iy.e eVar) {
        iy.e unit = eVar;
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f16559a.setText(unit.a());
    }
}
