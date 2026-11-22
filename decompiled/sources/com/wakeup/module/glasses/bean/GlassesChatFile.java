package com.wakeup.module.glasses.bean;

import com.wakeup.common.DeviceFeatures;
import io.livekit.android.room.SignalClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesChatFileBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesChatFile;", "", "question", "", SignalClient.SD_TYPE_ANSWER, "audio", "Lcom/wakeup/module/glasses/bean/AudioItemBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/module/glasses/bean/AudioItemBean;)V", "getQuestion", "()Ljava/lang/String;", "getAnswer", "setAnswer", "(Ljava/lang/String;)V", "getAudio", "()Lcom/wakeup/module/glasses/bean/AudioItemBean;", "setAudio", "(Lcom/wakeup/module/glasses/bean/AudioItemBean;)V", "languageId", "", "getLanguageId", "()I", "setLanguageId", "(I)V", "isAnswerEnd", "", "()Z", "setAnswerEnd", "(Z)V", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlassesChatFile {
    private String answer;
    private AudioItemBean audio;
    private boolean isAnswerEnd;
    private int languageId;
    private final String question;

    public GlassesChatFile(String question, String answer, AudioItemBean audioItemBean) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.question = question;
        this.answer = answer;
        this.audio = audioItemBean;
        this.languageId = DeviceFeatures.AUDIO_MEMORANDUM;
    }

    public /* synthetic */ GlassesChatFile(String str, String str2, AudioItemBean audioItemBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : audioItemBean);
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final void setAnswer(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.answer = str;
    }

    public final AudioItemBean getAudio() {
        return this.audio;
    }

    public final void setAudio(AudioItemBean audioItemBean) {
        this.audio = audioItemBean;
    }

    public final int getLanguageId() {
        return this.languageId;
    }

    public final void setLanguageId(int i) {
        this.languageId = i;
    }

    /* renamed from: isAnswerEnd, reason: from getter */
    public final boolean getIsAnswerEnd() {
        return this.isAnswerEnd;
    }

    public final void setAnswerEnd(boolean z) {
        this.isAnswerEnd = z;
    }
}
