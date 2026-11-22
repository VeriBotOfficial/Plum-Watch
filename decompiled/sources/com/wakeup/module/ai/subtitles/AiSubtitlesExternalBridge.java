package com.wakeup.module.ai.subtitles;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: AiSubtitlesExternalBridge.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/ai/subtitles/AiSubtitlesExternalBridge;", "", "<init>", "()V", "onStarted", "Lkotlin/Function0;", "", "getOnStarted", "()Lkotlin/jvm/functions/Function0;", "setOnStarted", "(Lkotlin/jvm/functions/Function0;)V", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiSubtitlesExternalBridge {
    public static final AiSubtitlesExternalBridge INSTANCE = new AiSubtitlesExternalBridge();
    private static volatile Function0<Unit> onStarted;

    private AiSubtitlesExternalBridge() {
    }

    public final Function0<Unit> getOnStarted() {
        return onStarted;
    }

    public final void setOnStarted(Function0<Unit> function0) {
        onStarted = function0;
    }
}
