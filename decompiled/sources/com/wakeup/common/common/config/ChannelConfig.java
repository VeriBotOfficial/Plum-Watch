package com.wakeup.common.common.config;

import com.wakeup.common.config.AppBuildConfigManager;
import com.wakeup.common.storage.SkipSplashAdDebug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChannelConfig.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/common/config/ChannelConfig;", "", "<init>", "()V", AppIdConfig.WP, "", "WEARFIT2", "LENOVO", "HF_GLASSES", "currentChannel", "getCurrentChannel", "()Ljava/lang/String;", "LENOVO_APP_NAME", "isLenovo", "", "()Z", "isWP", "isWP2", "isUseRn", "skipAd", "isUseRnDomain", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChannelConfig {
    public static final String HF_GLASSES = "hf_glasses";
    public static final ChannelConfig INSTANCE = new ChannelConfig();
    public static final String LENOVO = "lenovo";
    public static final String LENOVO_APP_NAME = "联想健康生活";
    public static final String WEARFIT2 = "wearfit2";
    public static final String WP = "wp";

    private ChannelConfig() {
    }

    public final String getCurrentChannel() {
        return AppBuildConfigManager.INSTANCE.getChannel();
    }

    public final boolean isLenovo() {
        return Intrinsics.areEqual(getCurrentChannel(), LENOVO);
    }

    public final boolean isWP() {
        return Intrinsics.areEqual(getCurrentChannel(), "wp");
    }

    public final boolean isWP2() {
        return Intrinsics.areEqual(getCurrentChannel(), WEARFIT2);
    }

    public final boolean isUseRn() {
        return (Intrinsics.areEqual(getCurrentChannel(), "wp") || Intrinsics.areEqual(getCurrentChannel(), WEARFIT2)) ? false : true;
    }

    public final boolean skipAd() {
        return SkipSplashAdDebug.getEnabled() || Intrinsics.areEqual(getCurrentChannel(), LENOVO) || Intrinsics.areEqual(getCurrentChannel(), HF_GLASSES);
    }

    public final boolean isUseRnDomain() {
        return Intrinsics.areEqual(getCurrentChannel(), HF_GLASSES);
    }
}
