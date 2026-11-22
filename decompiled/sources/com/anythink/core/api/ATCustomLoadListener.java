package com.anythink.core.api;

/* loaded from: classes11.dex */
public interface ATCustomLoadListener {
    void onAdCacheLoaded(BaseAd... baseAdArr);

    void onAdDataLoaded();

    void onAdLoadError(String str, String str2);
}
