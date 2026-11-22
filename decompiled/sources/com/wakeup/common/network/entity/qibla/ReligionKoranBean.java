package com.wakeup.common.network.entity.qibla;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QiblaBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/qibla/ReligionKoranBean;", "Ljava/io/Serializable;", "aya", "", "content", "duration", "", "playing", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getAya", "()Ljava/lang/String;", "getContent", "getDuration", "()I", "getPlaying", "()Z", "setPlaying", "(Z)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReligionKoranBean implements Serializable {
    private final String aya;
    private final String content;
    private final int duration;
    private boolean playing;

    public ReligionKoranBean(String aya, String content, int i, boolean z) {
        Intrinsics.checkNotNullParameter(aya, "aya");
        Intrinsics.checkNotNullParameter(content, "content");
        this.aya = aya;
        this.content = content;
        this.duration = i;
        this.playing = z;
    }

    public /* synthetic */ ReligionKoranBean(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    public final String getAya() {
        return this.aya;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final boolean getPlaying() {
        return this.playing;
    }

    public final void setPlaying(boolean z) {
        this.playing = z;
    }
}
