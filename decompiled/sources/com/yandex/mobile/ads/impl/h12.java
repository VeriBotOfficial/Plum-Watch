package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h12 implements gc {

    /* renamed from: a, reason: collision with root package name */
    private final i12 f15643a;

    public h12(i12 socialAdInfo) {
        Intrinsics.checkNotNullParameter(socialAdInfo, "socialAdInfo");
        this.f15643a = socialAdInfo;
    }

    @Override // com.yandex.mobile.ads.impl.fn0
    public final void a(ob2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView p = uiElements.p();
        if (p != null) {
            p.setText(R.string.monetization_ads_internal_instream_sponsored_social);
            p.setVisibility(0);
            p.setOnClickListener(new g12(this.f15643a, new y82(new x82())));
        }
        ImageView o = uiElements.o();
        if (o != null) {
            o.setImageDrawable(ContextCompat.getDrawable(o.getContext(), R.drawable.monetization_ads_instream_internal_advertiser_social));
            o.setVisibility(0);
            o.setOnClickListener(new g12(this.f15643a, new y82(new x82())));
        }
    }
}
