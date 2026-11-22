package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileToTextBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/ai/Words;", "", "word", "", "beginTime", "", "endTime", RemoteMessageConst.Notification.CHANNEL_ID, "<init>", "(Ljava/lang/String;III)V", "getWord", "()Ljava/lang/String;", "getBeginTime", "()I", "getEndTime", "getChannelId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Words {
    private final int beginTime;
    private final int channelId;
    private final int endTime;
    private final String word;

    public static /* synthetic */ Words copy$default(Words words, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = words.word;
        }
        if ((i4 & 2) != 0) {
            i = words.beginTime;
        }
        if ((i4 & 4) != 0) {
            i2 = words.endTime;
        }
        if ((i4 & 8) != 0) {
            i3 = words.channelId;
        }
        return words.copy(str, i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWord() {
        return this.word;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBeginTime() {
        return this.beginTime;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getChannelId() {
        return this.channelId;
    }

    public final Words copy(String word, int beginTime, int endTime, int channelId) {
        Intrinsics.checkNotNullParameter(word, "word");
        return new Words(word, beginTime, endTime, channelId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Words)) {
            return false;
        }
        Words words = (Words) other;
        return Intrinsics.areEqual(this.word, words.word) && this.beginTime == words.beginTime && this.endTime == words.endTime && this.channelId == words.channelId;
    }

    public int hashCode() {
        return (((((this.word.hashCode() * 31) + Integer.hashCode(this.beginTime)) * 31) + Integer.hashCode(this.endTime)) * 31) + Integer.hashCode(this.channelId);
    }

    public String toString() {
        return "Words(word=" + this.word + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", channelId=" + this.channelId + Separators.RPAREN;
    }

    public Words(String word, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(word, "word");
        this.word = word;
        this.beginTime = i;
        this.endTime = i2;
        this.channelId = i3;
    }

    public final String getWord() {
        return this.word;
    }

    public final int getBeginTime() {
        return this.beginTime;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getChannelId() {
        return this.channelId;
    }
}
