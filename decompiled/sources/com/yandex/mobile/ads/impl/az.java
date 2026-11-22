package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class az implements gc {
    @Override // com.yandex.mobile.ads.impl.fn0
    public final void a(ob2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView p = uiElements.p();
        if (p != null) {
            p.setText(R.string.monetization_ads_internal_instream_sponsored_default);
            p.setVisibility(0);
        }
        ImageView o = uiElements.o();
        if (o != null) {
            o.setImageDrawable(ContextCompat.getDrawable(o.getContext(), R.drawable.monetization_ads_instream_internal_advertiser));
            o.setVisibility(0);
        }
    }
}
