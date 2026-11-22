package com.anythink.interstitial.api;

import com.anythink.core.api.AdError;

/* loaded from: classes12.dex */
public interface ATInterstitialAutoLoadListener {
    void onInterstitialAutoLoadFail(String str, AdError adError);

    void onInterstitialAutoLoaded(String str);
}
