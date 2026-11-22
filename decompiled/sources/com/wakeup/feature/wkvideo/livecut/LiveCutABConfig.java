package com.wakeup.feature.wkvideo.livecut;

import kotlin.Metadata;

/* compiled from: LiveCutABConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/LiveCutABConfig;", "", "<init>", "()V", "useNewVideoPlayFragment", "", "getUseNewVideoPlayFragment", "()Z", "setUseNewVideoPlayFragment", "(Z)V", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LiveCutABConfig {
    public static final LiveCutABConfig INSTANCE = new LiveCutABConfig();
    private static boolean useNewVideoPlayFragment;

    private LiveCutABConfig() {
    }

    public final boolean getUseNewVideoPlayFragment() {
        return useNewVideoPlayFragment;
    }

    public final void setUseNewVideoPlayFragment(boolean z) {
        useNewVideoPlayFragment = z;
    }
}
