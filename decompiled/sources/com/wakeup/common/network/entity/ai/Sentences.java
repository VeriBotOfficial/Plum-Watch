package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileToTextBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/ai/Sentences;", "", "emotionValue", "", "beginTime", "", "silenceDuration", "speakerId", "endTime", "text", "", "speechRate", RemoteMessageConst.Notification.CHANNEL_ID, "<init>", "(FIIIILjava/lang/String;II)V", "getEmotionValue", "()F", "getBeginTime", "()I", "getSilenceDuration", "getSpeakerId", "getEndTime", "getText", "()Ljava/lang/String;", "getSpeechRate", "getChannelId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Sentences {
    private final int beginTime;
    private final int channelId;
    private final float emotionValue;
    private final int endTime;
    private final int silenceDuration;
    private final int speakerId;
    private final int speechRate;
    private final String text;

    public static /* synthetic */ Sentences copy$default(Sentences sentences, float f, int i, int i2, int i3, int i4, String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f = sentences.emotionValue;
        }
        if ((i7 & 2) != 0) {
            i = sentences.beginTime;
        }
        if ((i7 & 4) != 0) {
            i2 = sentences.silenceDuration;
        }
        if ((i7 & 8) != 0) {
            i3 = sentences.speakerId;
        }
        if ((i7 & 16) != 0) {
            i4 = sentences.endTime;
        }
        if ((i7 & 32) != 0) {
            str = sentences.text;
        }
        if ((i7 & 64) != 0) {
            i5 = sentences.speechRate;
        }
        if ((i7 & 128) != 0) {
            i6 = sentences.channelId;
        }
        int i8 = i5;
        int i9 = i6;
        int i10 = i4;
        String str2 = str;
        return sentences.copy(f, i, i2, i3, i10, str2, i8, i9);
    }

    /* renamed from: component1, reason: from getter */
    public final float getEmotionValue() {
        return this.emotionValue;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBeginTime() {
        return this.beginTime;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSilenceDuration() {
        return this.silenceDuration;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSpeakerId() {
        return this.speakerId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSpeechRate() {
        return this.speechRate;
    }

    /* renamed from: component8, reason: from getter */
    public final int getChannelId() {
        return this.channelId;
    }

    public final Sentences copy(float emotionValue, int beginTime, int silenceDuration, int speakerId, int endTime, String text, int speechRate, int channelId) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new Sentences(emotionValue, beginTime, silenceDuration, speakerId, endTime, text, speechRate, channelId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sentences)) {
            return false;
        }
        Sentences sentences = (Sentences) other;
        return Float.compare(this.emotionValue, sentences.emotionValue) == 0 && this.beginTime == sentences.beginTime && this.silenceDuration == sentences.silenceDuration && this.speakerId == sentences.speakerId && this.endTime == sentences.endTime && Intrinsics.areEqual(this.text, sentences.text) && this.speechRate == sentences.speechRate && this.channelId == sentences.channelId;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.emotionValue) * 31) + Integer.hashCode(this.beginTime)) * 31) + Integer.hashCode(this.silenceDuration)) * 31) + Integer.hashCode(this.speakerId)) * 31) + Integer.hashCode(this.endTime)) * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.speechRate)) * 31) + Integer.hashCode(this.channelId);
    }

    public String toString() {
        return "Sentences(emotionValue=" + this.emotionValue + ", beginTime=" + this.beginTime + ", silenceDuration=" + this.silenceDuration + ", speakerId=" + this.speakerId + ", endTime=" + this.endTime + ", text=" + this.text + ", speechRate=" + this.speechRate + ", channelId=" + this.channelId + Separators.RPAREN;
    }

    public Sentences(float f, int i, int i2, int i3, int i4, String text, int i5, int i6) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.emotionValue = f;
        this.beginTime = i;
        this.silenceDuration = i2;
        this.speakerId = i3;
        this.endTime = i4;
        this.text = text;
        this.speechRate = i5;
        this.channelId = i6;
    }

    public final float getEmotionValue() {
        return this.emotionValue;
    }

    public final int getBeginTime() {
        return this.beginTime;
    }

    public final int getSilenceDuration() {
        return this.silenceDuration;
    }

    public final int getSpeakerId() {
        return this.speakerId;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getText() {
        return this.text;
    }

    public final int getSpeechRate() {
        return this.speechRate;
    }

    public final int getChannelId() {
        return this.channelId;
    }
}
