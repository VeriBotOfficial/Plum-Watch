package com.wakeup.module.video.interfaces;

import com.applovin.sdk.AppLovinMediationProvider;
import kotlin.Metadata;

/* compiled from: OnProgressVideoListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/wakeup/module/video/interfaces/OnProgressVideoListener;", "", "updateProgress", "", "time", "", AppLovinMediationProvider.MAX, "scale", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OnProgressVideoListener {
    void updateProgress(float time, float max, float scale);
}
