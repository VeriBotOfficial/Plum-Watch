package com.wakeup.module.ai.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VadSilenceDetector.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/wakeup/module/ai/utils/VadSilenceDetector;", "", "config", "Lcom/wakeup/module/ai/utils/VadSilenceConfig;", "<init>", "(Lcom/wakeup/module/ai/utils/VadSilenceConfig;)V", "judgment", "Lcom/wakeup/module/ai/utils/VadJudgment;", "speechFrames", "", "silenceFrames", "update", "Lcom/wakeup/module/ai/utils/VadDecision;", "probability", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VadSilenceDetector {
    private final VadSilenceConfig config;
    private VadJudgment judgment;
    private int silenceFrames;
    private int speechFrames;

    /* JADX WARN: Multi-variable type inference failed */
    public VadSilenceDetector() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public VadSilenceDetector(VadSilenceConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.judgment = VadJudgment.SILENCE;
    }

    public /* synthetic */ VadSilenceDetector(VadSilenceConfig vadSilenceConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new VadSilenceConfig(0.0f, 0, 0, 7, null) : vadSilenceConfig);
    }

    public final VadDecision update(float probability) {
        if (probability >= this.config.getSpeechThreshold()) {
            int i = this.speechFrames + 1;
            this.speechFrames = i;
            this.silenceFrames = 0;
            if (i >= this.config.getSpeechFramesRequired()) {
                this.judgment = VadJudgment.SPEECH;
            }
        } else if (probability <= this.config.getSilenceThreshold()) {
            int i2 = this.silenceFrames + 1;
            this.silenceFrames = i2;
            this.speechFrames = 0;
            if (i2 >= this.config.getSilenceFramesRequired()) {
                this.judgment = VadJudgment.SILENCE;
            }
        } else {
            this.speechFrames = 0;
            this.silenceFrames = 0;
        }
        return new VadDecision(this.judgment, this.speechFrames, this.silenceFrames);
    }
}
