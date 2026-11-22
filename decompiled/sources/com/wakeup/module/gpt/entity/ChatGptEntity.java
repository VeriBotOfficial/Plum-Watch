package com.wakeup.module.gpt.entity;

import android.gov.nist.core.Separators;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.chatGpt.ChatGptClassify;
import io.livekit.android.room.SignalClient;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatGptEntity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J1\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010+\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0015¨\u00060"}, d2 = {"Lcom/wakeup/module/gpt/entity/ChatGptEntity;", "", "id", "", "classify", "Lcom/wakeup/commponent/module/chatGpt/ChatGptClassify;", "question", "", "realQuestion", "<init>", "(ILcom/wakeup/commponent/module/chatGpt/ChatGptClassify;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getClassify", "()Lcom/wakeup/commponent/module/chatGpt/ChatGptClassify;", "getQuestion", "()Ljava/lang/String;", "getRealQuestion", SignalClient.SD_TYPE_ANSWER, "getAnswer", "setAnswer", "(Ljava/lang/String;)V", "todoTime", "", "getTodoTime", "()J", "setTodoTime", "(J)V", "isComplete", "", "()Z", "setComplete", "(Z)V", "isPlaying", "setPlaying", "languageCode", "getLanguageCode", "setLanguageCode", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChatGptEntity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String answer;
    private final ChatGptClassify classify;
    private final int id;
    private boolean isComplete;
    private boolean isPlaying;
    private String languageCode;
    private final String question;
    private final String realQuestion;
    private long todoTime;

    public static /* synthetic */ ChatGptEntity copy$default(ChatGptEntity chatGptEntity, int i, ChatGptClassify chatGptClassify, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatGptEntity.id;
        }
        if ((i2 & 2) != 0) {
            chatGptClassify = chatGptEntity.classify;
        }
        if ((i2 & 4) != 0) {
            str = chatGptEntity.question;
        }
        if ((i2 & 8) != 0) {
            str2 = chatGptEntity.realQuestion;
        }
        return chatGptEntity.copy(i, chatGptClassify, str, str2);
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
    public final ChatGptClassify getClassify() {
        return this.classify;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRealQuestion() {
        return this.realQuestion;
    }

    public final ChatGptEntity copy(int id2, ChatGptClassify classify, String question, String realQuestion) {
        Intrinsics.checkNotNullParameter(classify, "classify");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(realQuestion, "realQuestion");
        return new ChatGptEntity(id2, classify, question, realQuestion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatGptEntity)) {
            return false;
        }
        ChatGptEntity chatGptEntity = (ChatGptEntity) other;
        return this.id == chatGptEntity.id && this.classify == chatGptEntity.classify && Intrinsics.areEqual(this.question, chatGptEntity.question) && Intrinsics.areEqual(this.realQuestion, chatGptEntity.realQuestion);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.classify.hashCode()) * 31) + this.question.hashCode()) * 31) + this.realQuestion.hashCode();
    }

    public String toString() {
        return "ChatGptEntity(id=" + this.id + ", classify=" + this.classify + ", question=" + this.question + ", realQuestion=" + this.realQuestion + Separators.RPAREN;
    }

    public ChatGptEntity(int i, ChatGptClassify classify, String question, String realQuestion) {
        Intrinsics.checkNotNullParameter(classify, "classify");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(realQuestion, "realQuestion");
        this.id = i;
        this.classify = classify;
        this.question = question;
        this.realQuestion = realQuestion;
        this.languageCode = "";
    }

    public final int getId() {
        return this.id;
    }

    public final ChatGptClassify getClassify() {
        return this.classify;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getRealQuestion() {
        return this.realQuestion;
    }

    /* compiled from: ChatGptEntity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/wakeup/module/gpt/entity/ChatGptEntity$Companion;", "", "<init>", "()V", "generateId", "", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public final long getTodoTime() {
        return this.todoTime;
    }

    public final void setTodoTime(long j) {
        this.todoTime = j;
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

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.languageCode = str;
    }
}
