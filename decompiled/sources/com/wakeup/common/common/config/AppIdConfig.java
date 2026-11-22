package com.wakeup.common.common.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppIdConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/common/common/config/AppIdConfig;", "", "<init>", "()V", AppIdConfig.WP, "", "LENOVO", "HF_GLASSES", "getAppID", "getBuryAppId", "getRnBuryAppId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppIdConfig {
    public static final String HF_GLASSES = "WAKEOK";
    public static final AppIdConfig INSTANCE = new AppIdConfig();
    public static final String LENOVO = "LSH";
    public static final String WP = "WP";

    private AppIdConfig() {
    }

    private final String getAppID() {
        String currentChannel = ChannelConfig.INSTANCE.getCurrentChannel();
        return Intrinsics.areEqual(currentChannel, ChannelConfig.LENOVO) ? LENOVO : Intrinsics.areEqual(currentChannel, ChannelConfig.HF_GLASSES) ? HF_GLASSES : WP;
    }

    public final String getBuryAppId() {
        return ChannelConfig.INSTANCE.isWP() ? "" : getAppID() + "_APP";
    }

    public final String getRnBuryAppId() {
        return getAppID() + "_RN";
    }
}
