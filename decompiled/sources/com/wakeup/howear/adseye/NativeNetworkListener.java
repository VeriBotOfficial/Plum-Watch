package com.wakeup.howear.adseye;

import kotlin.Metadata;

/* compiled from: AdsEyeNativeAdDataSource.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, d2 = {"Lcom/wakeup/howear/adseye/NativeNetworkListener;", "", "onNativeAdLoaded", "", "onNativeAdLoadFail", "desc", "", "code", "", "msg", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NativeNetworkListener {
    void onNativeAdLoadFail(String desc, int code, String msg);

    void onNativeAdLoaded();
}
