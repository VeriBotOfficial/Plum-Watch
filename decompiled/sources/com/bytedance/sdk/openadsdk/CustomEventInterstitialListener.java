package com.bytedance.sdk.openadsdk;

/* loaded from: classes14.dex */
public interface CustomEventInterstitialListener {
    void onInterstitialClicked();

    void onInterstitialDismissed();

    void onInterstitialImpression();

    void onInterstitialShowFail();

    void onInterstitialShown();

    void onLeaveApplication();
}
