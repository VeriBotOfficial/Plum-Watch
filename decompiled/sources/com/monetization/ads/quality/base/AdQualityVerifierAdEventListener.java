package com.monetization.ads.quality.base;

import com.qumeng.overseas.advlib.trdparty.unionset.common.k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/monetization/ads/quality/base/AdQualityVerifierAdEventListener;", "", "onAdClicked", "", k.w, "onAdWillDisplay", "onInvalidated", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AdQualityVerifierAdEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdWillDisplay();

    void onInvalidated();
}
