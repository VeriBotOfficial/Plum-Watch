package com.anythink.splashad.api;

/* loaded from: classes12.dex */
public class ATSplashAdExtraInfo {
    private IATSplashEyeAd atSplashEyeAd;
    private int dismissType;

    public ATSplashAdExtraInfo(int i, IATSplashEyeAd iATSplashEyeAd) {
        this.dismissType = i;
        this.atSplashEyeAd = iATSplashEyeAd;
    }

    public int getDismissType() {
        return this.dismissType;
    }

    public IATSplashEyeAd getAtSplashEyeAd() {
        return this.atSplashEyeAd;
    }
}
