package com.xmly.businesssdk.player.util;

import com.facebook.react.uimanager.ViewProps;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: PlaybackResumeSession.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xmly/businesssdk/player/util/PlaybackResumeSession;", "", "()V", ViewProps.ENABLED, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "", "setEnabled", "", "value", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class PlaybackResumeSession {
    public static final PlaybackResumeSession INSTANCE = new PlaybackResumeSession();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    private PlaybackResumeSession() {
    }

    @JvmStatic
    public static final boolean isEnabled() {
        return enabled.get();
    }

    @JvmStatic
    public static final void setEnabled(boolean value) {
        enabled.set(value);
    }
}
