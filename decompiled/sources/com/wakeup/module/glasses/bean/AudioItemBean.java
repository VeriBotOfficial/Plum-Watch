package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import com.wakeup.module.ai.audioRecord.AudioRecordBean;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesAlbumBean.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006*"}, d2 = {"Lcom/wakeup/module/glasses/bean/AudioItemBean;", "Ljava/io/Serializable;", "file", "", "name", "createTime", "", "duration", "", "isSelect", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JIZ)V", "getFile", "()Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getCreateTime", "()J", "getDuration", "()I", "()Z", "setSelect", "(Z)V", "audioRecordBean", "Lcom/wakeup/module/ai/audioRecord/AudioRecordBean;", "getAudioRecordBean", "()Lcom/wakeup/module/ai/audioRecord/AudioRecordBean;", "setAudioRecordBean", "(Lcom/wakeup/module/ai/audioRecord/AudioRecordBean;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AudioItemBean implements Serializable {
    private AudioRecordBean audioRecordBean;
    private final long createTime;
    private final int duration;
    private final String file;
    private boolean isSelect;
    private String name;

    public static /* synthetic */ AudioItemBean copy$default(AudioItemBean audioItemBean, String str, String str2, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = audioItemBean.file;
        }
        if ((i2 & 2) != 0) {
            str2 = audioItemBean.name;
        }
        if ((i2 & 4) != 0) {
            j = audioItemBean.createTime;
        }
        if ((i2 & 8) != 0) {
            i = audioItemBean.duration;
        }
        if ((i2 & 16) != 0) {
            z = audioItemBean.isSelect;
        }
        long j2 = j;
        return audioItemBean.copy(str, str2, j2, i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final AudioItemBean copy(String file, String name, long createTime, int duration, boolean isSelect) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        return new AudioItemBean(file, name, createTime, duration, isSelect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioItemBean)) {
            return false;
        }
        AudioItemBean audioItemBean = (AudioItemBean) other;
        return Intrinsics.areEqual(this.file, audioItemBean.file) && Intrinsics.areEqual(this.name, audioItemBean.name) && this.createTime == audioItemBean.createTime && this.duration == audioItemBean.duration && this.isSelect == audioItemBean.isSelect;
    }

    public int hashCode() {
        return (((((((this.file.hashCode() * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.duration)) * 31) + Boolean.hashCode(this.isSelect);
    }

    public String toString() {
        return "AudioItemBean(file=" + this.file + ", name=" + this.name + ", createTime=" + this.createTime + ", duration=" + this.duration + ", isSelect=" + this.isSelect + Separators.RPAREN;
    }

    public AudioItemBean(String file, String name, long j, int i, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        this.file = file;
        this.name = name;
        this.createTime = j;
        this.duration = i;
        this.isSelect = z;
    }

    public /* synthetic */ AudioItemBean(String str, String str2, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, i, (i2 & 16) != 0 ? false : z);
    }

    public final String getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final AudioRecordBean getAudioRecordBean() {
        return this.audioRecordBean;
    }

    public final void setAudioRecordBean(AudioRecordBean audioRecordBean) {
        this.audioRecordBean = audioRecordBean;
    }
}
