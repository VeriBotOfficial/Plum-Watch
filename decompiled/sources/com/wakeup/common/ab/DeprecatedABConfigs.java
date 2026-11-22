package com.wakeup.common.ab;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: DeprecatedABConfigs.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/common/ab/DeprecatedABConfigs;", "", "<init>", "()V", "isGiftRewardEnabled", "", "isImageTextEnabled", "isPublishImageTextEnabled", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeprecatedABConfigs {
    public static final DeprecatedABConfigs INSTANCE = new DeprecatedABConfigs();

    @JvmStatic
    public static final boolean isGiftRewardEnabled() {
        return false;
    }

    @JvmStatic
    public static final boolean isImageTextEnabled() {
        return false;
    }

    @JvmStatic
    public static final boolean isPublishImageTextEnabled() {
        return false;
    }

    private DeprecatedABConfigs() {
    }
}
