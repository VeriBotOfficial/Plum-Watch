package com.applovin.mediation;

/* loaded from: classes12.dex */
public interface MaxError {
    @Deprecated
    String getAdLoadFailureInfo();

    int getCode();

    int getMediatedNetworkErrorCode();

    String getMediatedNetworkErrorMessage();

    String getMessage();

    long getRequestLatencyMillis();

    MaxAdWaterfallInfo getWaterfall();
}
