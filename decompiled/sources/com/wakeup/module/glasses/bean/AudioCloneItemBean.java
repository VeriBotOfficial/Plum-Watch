package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesAlbumBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/wakeup/module/glasses/bean/AudioCloneItemBean;", "", "file", "", "name", "time", "", "isPlay", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZ)V", "getFile", "()Ljava/lang/String;", "getName", "getTime", "()J", "()Z", "setPlay", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AudioCloneItemBean {
    private final String file;
    private boolean isPlay;
    private final String name;
    private final long time;

    public static /* synthetic */ AudioCloneItemBean copy$default(AudioCloneItemBean audioCloneItemBean, String str, String str2, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioCloneItemBean.file;
        }
        if ((i & 2) != 0) {
            str2 = audioCloneItemBean.name;
        }
        if ((i & 4) != 0) {
            j = audioCloneItemBean.time;
        }
        if ((i & 8) != 0) {
            z = audioCloneItemBean.isPlay;
        }
        boolean z2 = z;
        return audioCloneItemBean.copy(str, str2, j, z2);
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
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPlay() {
        return this.isPlay;
    }

    public final AudioCloneItemBean copy(String file, String name, long time, boolean isPlay) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        return new AudioCloneItemBean(file, name, time, isPlay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioCloneItemBean)) {
            return false;
        }
        AudioCloneItemBean audioCloneItemBean = (AudioCloneItemBean) other;
        return Intrinsics.areEqual(this.file, audioCloneItemBean.file) && Intrinsics.areEqual(this.name, audioCloneItemBean.name) && this.time == audioCloneItemBean.time && this.isPlay == audioCloneItemBean.isPlay;
    }

    public int hashCode() {
        return (((((this.file.hashCode() * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Boolean.hashCode(this.isPlay);
    }

    public String toString() {
        return "AudioCloneItemBean(file=" + this.file + ", name=" + this.name + ", time=" + this.time + ", isPlay=" + this.isPlay + Separators.RPAREN;
    }

    public AudioCloneItemBean(String file, String name, long j, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        this.file = file;
        this.name = name;
        this.time = j;
        this.isPlay = z;
    }

    public /* synthetic */ AudioCloneItemBean(String str, String str2, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? false : z);
    }

    public final String getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final long getTime() {
        return this.time;
    }

    public final boolean isPlay() {
        return this.isPlay;
    }

    public final void setPlay(boolean z) {
        this.isPlay = z;
    }
}
