package com.wakeup.common.common.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomizeTypeConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/common/config/CustomizeTypeConfig;", "", "<init>", "()V", AppIdConfig.WP, "", "PHANCY", "HF_FIT", "MAX_LINGO", "LENOVO_WATCH", "DAAFIT", "XIZANG", "THINKPLUS", "getCustomizeType", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomizeTypeConfig {
    public static final String DAAFIT = "5";
    public static final String HF_FIT = "2";
    public static final CustomizeTypeConfig INSTANCE = new CustomizeTypeConfig();
    public static final String LENOVO_WATCH = "4";
    public static final String MAX_LINGO = "3";
    public static final String PHANCY = "1";
    public static final String THINKPLUS = "7";
    public static final String WP = "0";
    public static final String XIZANG = "6";

    private CustomizeTypeConfig() {
    }

    public final String getCustomizeType() {
        String currentChannel = ChannelConfig.INSTANCE.getCurrentChannel();
        return Intrinsics.areEqual(currentChannel, ChannelConfig.LENOVO) ? "4" : Intrinsics.areEqual(currentChannel, ChannelConfig.HF_GLASSES) ? "3" : "0";
    }
}
