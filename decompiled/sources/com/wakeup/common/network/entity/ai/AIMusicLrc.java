package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIMusicBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AIMusicLrc;", "", "id", "", "lyric", "audioUser", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLyric", "getAudioUser", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AIMusicLrc {
    private final String audioUser;
    private final String id;
    private final String lyric;
    private final String status;

    public static /* synthetic */ AIMusicLrc copy$default(AIMusicLrc aIMusicLrc, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aIMusicLrc.id;
        }
        if ((i & 2) != 0) {
            str2 = aIMusicLrc.lyric;
        }
        if ((i & 4) != 0) {
            str3 = aIMusicLrc.audioUser;
        }
        if ((i & 8) != 0) {
            str4 = aIMusicLrc.status;
        }
        return aIMusicLrc.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLyric() {
        return this.lyric;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAudioUser() {
        return this.audioUser;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final AIMusicLrc copy(String id2, String lyric, String audioUser, String status) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new AIMusicLrc(id2, lyric, audioUser, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIMusicLrc)) {
            return false;
        }
        AIMusicLrc aIMusicLrc = (AIMusicLrc) other;
        return Intrinsics.areEqual(this.id, aIMusicLrc.id) && Intrinsics.areEqual(this.lyric, aIMusicLrc.lyric) && Intrinsics.areEqual(this.audioUser, aIMusicLrc.audioUser) && Intrinsics.areEqual(this.status, aIMusicLrc.status);
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.lyric;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audioUser;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AIMusicLrc(id=" + this.id + ", lyric=" + this.lyric + ", audioUser=" + this.audioUser + ", status=" + this.status + Separators.RPAREN;
    }

    public AIMusicLrc(String id2, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.lyric = str;
        this.audioUser = str2;
        this.status = str3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLyric() {
        return this.lyric;
    }

    public final String getAudioUser() {
        return this.audioUser;
    }

    public final String getStatus() {
        return this.status;
    }
}
