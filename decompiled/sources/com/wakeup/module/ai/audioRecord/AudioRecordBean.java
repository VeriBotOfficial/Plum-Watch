package com.wakeup.module.ai.audioRecord;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioRecordBean.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0013\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u001bHÖ\u0001J\t\u0010&\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/wakeup/module/ai/audioRecord/AudioRecordBean;", "Ljava/io/Serializable;", "createTime", "", "<init>", "(J)V", "getCreateTime", "()J", "isSelect", "", "()Z", "setSelect", "(Z)V", "filePath", "", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "opusPath", "getOpusPath", "setOpusPath", "isEnd", "setEnd", "isConvert", "setConvert", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "component1", "copy", "equals", "other", "", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AudioRecordBean implements Serializable {
    private final long createTime;
    private boolean isConvert;
    private boolean isEnd;
    private boolean isSelect;
    private String filePath = "";
    private String opusPath = "";
    private int duration = -1;

    public static /* synthetic */ AudioRecordBean copy$default(AudioRecordBean audioRecordBean, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = audioRecordBean.createTime;
        }
        return audioRecordBean.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final AudioRecordBean copy(long createTime) {
        return new AudioRecordBean(createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AudioRecordBean) && this.createTime == ((AudioRecordBean) other).createTime;
    }

    public int hashCode() {
        return Long.hashCode(this.createTime);
    }

    public String toString() {
        return "AudioRecordBean(createTime=" + this.createTime + Separators.RPAREN;
    }

    public AudioRecordBean(long j) {
        this.createTime = j;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }

    public final String getOpusPath() {
        return this.opusPath;
    }

    public final void setOpusPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.opusPath = str;
    }

    /* renamed from: isEnd, reason: from getter */
    public final boolean getIsEnd() {
        return this.isEnd;
    }

    public final void setEnd(boolean z) {
        this.isEnd = z;
    }

    /* renamed from: isConvert, reason: from getter */
    public final boolean getIsConvert() {
        return this.isConvert;
    }

    public final void setConvert(boolean z) {
        this.isConvert = z;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }
}
