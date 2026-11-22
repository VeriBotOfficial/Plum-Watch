package com.wakeup.common.ab;

import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: AdOptConfig.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u001c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/ab/AdOptConfig;", "", "<init>", "()V", "KEY", "", "cfg", "Lorg/json/JSONObject;", "getCfg", "()Lorg/json/JSONObject;", "enable", "", "getEnable", "()Z", "splashTimeoutMs", "", "getSplashTimeoutMs", "()I", "splashPreloadOnDismiss", "getSplashPreloadOnDismiss", "intersPreloadOnShow", "getIntersPreloadOnShow", "intersThrottleMs", "", "getIntersThrottleMs", "()J", "bannerLifecycleOpt", "getBannerLifecycleOpt", "homeBannerLifecycleOpt", "getHomeBannerLifecycleOpt", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdOptConfig {
    public static final AdOptConfig INSTANCE = new AdOptConfig();
    private static final String KEY = "superAppSocialPageConfig";

    private AdOptConfig() {
    }

    private final JSONObject getCfg() {
        return NorthStarABManager.getABTestJSONObject(KEY, new JSONObject());
    }

    public final boolean getEnable() {
        return getCfg().optBoolean("enable", false);
    }

    public final int getSplashTimeoutMs() {
        if (getEnable()) {
            return getCfg().optInt("splashTimeoutMs", 5000);
        }
        return 5000;
    }

    public final boolean getSplashPreloadOnDismiss() {
        return getEnable() && getCfg().optBoolean("splashPreloadOnDismiss", false);
    }

    public final boolean getIntersPreloadOnShow() {
        return getEnable() && getCfg().optBoolean("intersPreloadOnShow", false);
    }

    public final long getIntersThrottleMs() {
        if (getEnable()) {
            return getCfg().optLong("intersThrottleMs", 0L);
        }
        return 0L;
    }

    public final boolean getBannerLifecycleOpt() {
        return getEnable() && getCfg().optBoolean("bannerLifecycleOpt", false);
    }

    public final boolean getHomeBannerLifecycleOpt() {
        return getEnable() && getCfg().optBoolean("homeBannerLifecycleOpt", false);
    }
}
