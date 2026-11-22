package com.anythink.nativead.api;

import com.anythink.core.api.AdError;

/* loaded from: classes12.dex */
public interface ATNativeNetworkListener {
    void onNativeAdLoadFail(AdError adError);

    void onNativeAdLoaded();
}
