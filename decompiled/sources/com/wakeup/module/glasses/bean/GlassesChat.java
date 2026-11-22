package com.wakeup.module.glasses.bean;

import com.wakeup.common.DeviceFeatures;
import io.livekit.android.room.SignalClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesChatBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesChat;", "", "question", "", SignalClient.SD_TYPE_ANSWER, "imgPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuestion", "()Ljava/lang/String;", "setQuestion", "(Ljava/lang/String;)V", "getAnswer", "setAnswer", "getImgPath", "setImgPath", "languageId", "", "getLanguageId", "()I", "setLanguageId", "(I)V", "isAnswerEnd", "", "()Z", "setAnswerEnd", "(Z)V", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlassesChat {
    private String answer;
    private String imgPath;
    private boolean isAnswerEnd;
    private int languageId;
    private String question;

    public GlassesChat(String question, String answer, String imgPath) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(imgPath, "imgPath");
        this.question = question;
        this.answer = answer;
        this.imgPath = imgPath;
        this.languageId = DeviceFeatures.AUDIO_MEMORANDUM;
    }

    public /* synthetic */ GlassesChat(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getImgPath() {
        return this.imgPath;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final void setAnswer(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.answer = str;
    }

    public final void setImgPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imgPath = str;
    }

    public final void setQuestion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.question = str;
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
