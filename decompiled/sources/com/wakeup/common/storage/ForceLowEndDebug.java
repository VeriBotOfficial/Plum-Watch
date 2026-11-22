package com.wakeup.common.storage;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: ForceLowEndDebug.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/storage/ForceLowEndDebug;", "", "<init>", "()V", "KEY", "", "value", "", ViewProps.ENABLED, "getEnabled$annotations", "getEnabled", "()Z", "setEnabled", "(Z)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ForceLowEndDebug {
    public static final ForceLowEndDebug INSTANCE = new ForceLowEndDebug();
    private static final String KEY = "devtool_force_low_end_perf";

    public static final boolean getEnabled() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void getEnabled$annotations() {
    }

    public static final void setEnabled(boolean z) {
    }

    private ForceLowEndDebug() {
    }
}
