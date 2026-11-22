package com.wakeup.module.ai.robot;

import android.gov.nist.core.Separators;
import com.wakeup.common.temp.BleUtil;
import io.livekit.android.room.SignalClient;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J'\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010!\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010#\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010%\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018¨\u00060"}, d2 = {"Lcom/wakeup/module/ai/robot/ChatEntity;", "", "id", "", "question", "", "realQuestion", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getQuestion", "()Ljava/lang/String;", "setQuestion", "(Ljava/lang/String;)V", "getRealQuestion", "setRealQuestion", SignalClient.SD_TYPE_ANSWER, "getAnswer", "setAnswer", "isComplete", "", "()Z", "setComplete", "(Z)V", "isPlaying", "setPlaying", "languageId", "getLanguageId", "setLanguageId", "(I)V", "isFail", "setFail", "isRecording", "setRecording", "isCancelAnswer", "setCancelAnswer", "isTip", "setTip", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "Companion", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChatEntity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String answer;
    private final int id;
    private boolean isCancelAnswer;
    private boolean isComplete;
    private boolean isFail;
    private boolean isPlaying;
    private boolean isRecording;
    private boolean isTip;
    private int languageId;
    private String question;
    private String realQuestion;

    public static /* synthetic */ ChatEntity copy$default(ChatEntity chatEntity, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatEntity.id;
        }
        if ((i2 & 2) != 0) {
            str = chatEntity.question;
        }
        if ((i2 & 4) != 0) {
            str2 = chatEntity.realQuestion;
        }
        return chatEntity.copy(i, str, str2);
    }

    @JvmStatic
    public static final int generateId() {
        return INSTANCE.generateId();
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRealQuestion() {
        return this.realQuestion;
    }

    public final ChatEntity copy(int id2, String question, String realQuestion) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(realQuestion, "realQuestion");
        return new ChatEntity(id2, question, realQuestion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEntity)) {
            return false;
        }
        ChatEntity chatEntity = (ChatEntity) other;
        return this.id == chatEntity.id && Intrinsics.areEqual(this.question, chatEntity.question) && Intrinsics.areEqual(this.realQuestion, chatEntity.realQuestion);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.question.hashCode()) * 31) + this.realQuestion.hashCode();
    }

    public String toString() {
        return "ChatEntity(id=" + this.id + ", question=" + this.question + ", realQuestion=" + this.realQuestion + Separators.RPAREN;
    }

    public ChatEntity(int i, String question, String realQuestion) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(realQuestion, "realQuestion");
        this.id = i;
        this.question = question;
        this.realQuestion = realQuestion;
    }

    public final int getId() {
        return this.id;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final void setQuestion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.question = str;
    }

    public final String getRealQuestion() {
        return this.realQuestion;
    }

    public final void setRealQuestion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.realQuestion = str;
    }

    /* compiled from: ChatEntity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/wakeup/module/ai/robot/ChatEntity$Companion;", "", "<init>", "()V", "generateId", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final int generateId() {
            return BleUtil.crcTable(BleUtil.longToBytes(System.currentTimeMillis() / 1000));
        }
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final void setAnswer(String str) {
        this.answer = str;
    }

    /* renamed from: isComplete, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public final void setComplete(boolean z) {
        this.isComplete = z;
    }

    /* renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    public final int getLanguageId() {
        return this.languageId;
    }

    public final void setLanguageId(int i) {
        this.languageId = i;
    }

    /* renamed from: isFail, reason: from getter */
    public final boolean getIsFail() {
        return this.isFail;
    }

    public final void setFail(boolean z) {
        this.isFail = z;
    }

    /* renamed from: isRecording, reason: from getter */
    public final boolean getIsRecording() {
        return this.isRecording;
    }

    public final void setRecording(boolean z) {
        this.isRecording = z;
    }

    /* renamed from: isCancelAnswer, reason: from getter */
    public final boolean getIsCancelAnswer() {
        return this.isCancelAnswer;
    }

    public final void setCancelAnswer(boolean z) {
        this.isCancelAnswer = z;
    }

    /* renamed from: isTip, reason: from getter */
    public final boolean getIsTip() {
        return this.isTip;
    }

    public final void setTip(boolean z) {
        this.isTip = z;
    }
}
