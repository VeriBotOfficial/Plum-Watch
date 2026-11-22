package com.wakeup.common.common.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DomainConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/wakeup/common/common/config/DomainConfig;", "", "<init>", "()V", AppIdConfig.WP, "", "getWP", "()Ljava/lang/String;", "LENOVO", "getLENOVO", "HF_GLASSES", "getHF_GLASSES", "getDomain", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomainConfig {
    public static final DomainConfig INSTANCE = new DomainConfig();
    private static final String WP = "super-app.iwhop.com";
    private static final String LENOVO = "lenovo-api-en.vkcto.com";
    private static final String HF_GLASSES = "new-app.iwhopodm.com";

    private DomainConfig() {
    }

    public final String getWP() {
        return WP;
    }

    public final String getLENOVO() {
        return LENOVO;
    }

    public final String getHF_GLASSES() {
        return HF_GLASSES;
    }

    public final String getDomain() {
        String currentChannel = ChannelConfig.INSTANCE.getCurrentChannel();
        return Intrinsics.areEqual(currentChannel, ChannelConfig.LENOVO) ? LENOVO : Intrinsics.areEqual(currentChannel, ChannelConfig.HF_GLASSES) ? HF_GLASSES : WP;
    }
}
