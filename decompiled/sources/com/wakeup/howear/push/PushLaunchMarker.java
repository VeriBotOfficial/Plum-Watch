package com.wakeup.howear.push;

import com.anythink.expressad.foundation.d.j;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: PushLaunchMarker.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/wakeup/howear/push/PushLaunchMarker;", "", "<init>", "()V", "VALID_DURATION_MS", "", "markTimeMs", j.cV, "", "launchSource", "", "getLaunchSource$annotations", "getLaunchSource", "()Ljava/lang/String;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushLaunchMarker {
    public static final PushLaunchMarker INSTANCE = new PushLaunchMarker();
    private static final long VALID_DURATION_MS = 90000;
    private static volatile long markTimeMs;

    @JvmStatic
    public static /* synthetic */ void getLaunchSource$annotations() {
    }

    private PushLaunchMarker() {
    }

    public final void mark() {
        markTimeMs = System.currentTimeMillis();
    }

    public static final String getLaunchSource() {
        if (System.currentTimeMillis() - markTimeMs <= 90000) {
            return "push";
        }
        return null;
    }
}
