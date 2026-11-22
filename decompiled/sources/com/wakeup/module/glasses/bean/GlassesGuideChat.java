package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import io.livekit.android.room.SignalClient;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesGuideChat.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0013\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018¨\u0006+"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesGuideChat;", "Ljava/io/Serializable;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "question", "getQuestion", "setQuestion", "imgPath", "getImgPath", "setImgPath", SignalClient.SD_TYPE_ANSWER, "getAnswer", "setAnswer", "outAudioPath", "getOutAudioPath", "setOutAudioPath", "isAnswerEnd", "", "()Z", "setAnswerEnd", "(Z)V", "questionSelect", "getQuestionSelect", "setQuestionSelect", "imgPathSelect", "getImgPathSelect", "setImgPathSelect", "answerSelect", "getAnswerSelect", "setAnswerSelect", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesGuideChat implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String answer;
    private boolean answerSelect;
    private final String id;
    private String imgPath;
    private boolean imgPathSelect;
    private boolean isAnswerEnd;
    private String outAudioPath;
    private String question;
    private boolean questionSelect;

    public static /* synthetic */ GlassesGuideChat copy$default(GlassesGuideChat glassesGuideChat, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glassesGuideChat.id;
        }
        return glassesGuideChat.copy(str);
    }

    @JvmStatic
    public static final String generateId() {
        return INSTANCE.generateId();
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final GlassesGuideChat copy(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new GlassesGuideChat(id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GlassesGuideChat) && Intrinsics.areEqual(this.id, ((GlassesGuideChat) other).id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return "GlassesGuideChat(id=" + this.id + Separators.RPAREN;
    }

    /* compiled from: GlassesGuideChat.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesGuideChat$Companion;", "", "<init>", "()V", "generateId", "", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String generateId() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            return uuid;
        }
    }

    public GlassesGuideChat(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.question = "";
        this.imgPath = "";
        this.answer = "";
        this.outAudioPath = "";
    }

    public final String getId() {
        return this.id;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final void setQuestion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.question = str;
    }

    public final String getImgPath() {
        return this.imgPath;
    }

    public final void setImgPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imgPath = str;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final void setAnswer(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.answer = str;
    }

    public final String getOutAudioPath() {
        return this.outAudioPath;
    }

    public final void setOutAudioPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.outAudioPath = str;
    }

    /* renamed from: isAnswerEnd, reason: from getter */
    public final boolean getIsAnswerEnd() {
        return this.isAnswerEnd;
    }

    public final void setAnswerEnd(boolean z) {
        this.isAnswerEnd = z;
    }

    public final boolean getQuestionSelect() {
        return this.questionSelect;
    }

    public final void setQuestionSelect(boolean z) {
        this.questionSelect = z;
    }

    public final boolean getImgPathSelect() {
        return this.imgPathSelect;
    }

    public final void setImgPathSelect(boolean z) {
        this.imgPathSelect = z;
    }

    public final boolean getAnswerSelect() {
        return this.answerSelect;
    }

    public final void setAnswerSelect(boolean z) {
        this.answerSelect = z;
    }
}
