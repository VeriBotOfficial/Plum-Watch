package com.wakeup.module.ai.port;

import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoeAgiStreamListener.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/ai/port/MoeAgiStreamListener;", "", "onOpen", "", "onThinkingChunk", "text", "", "onAnswerChunk", Constants.ON_COMPLETE_KEY, "onError", "message", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MoeAgiStreamListener {

    /* compiled from: MoeAgiStreamListener.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onThinkingChunk(MoeAgiStreamListener moeAgiStreamListener, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
        }
    }

    void onAnswerChunk(String text);

    void onComplete();

    void onError(String message);

    void onOpen();

    void onThinkingChunk(String text);
}
