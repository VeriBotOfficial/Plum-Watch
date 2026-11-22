package com.wakeup.common.network.entity.sport;

import android.gov.nist.core.Separators;
import com.facebook.hermes.intl.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportShareMusicBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/sport/Music;", "", "musicName", "", "singer", "filePath", "cover", Constants.SORT, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getMusicName", "()Ljava/lang/String;", "getSinger", "getFilePath", "getCover", "getSort", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Music {
    private final String cover;
    private final String filePath;
    private final String musicName;
    private final String singer;
    private final int sort;

    public static /* synthetic */ Music copy$default(Music music, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = music.musicName;
        }
        if ((i2 & 2) != 0) {
            str2 = music.singer;
        }
        if ((i2 & 4) != 0) {
            str3 = music.filePath;
        }
        if ((i2 & 8) != 0) {
            str4 = music.cover;
        }
        if ((i2 & 16) != 0) {
            i = music.sort;
        }
        int i3 = i;
        String str5 = str3;
        return music.copy(str, str2, str5, str4, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMusicName() {
        return this.musicName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSinger() {
        return this.singer;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final Music copy(String musicName, String singer, String filePath, String cover, int sort) {
        Intrinsics.checkNotNullParameter(musicName, "musicName");
        Intrinsics.checkNotNullParameter(singer, "singer");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(cover, "cover");
        return new Music(musicName, singer, filePath, cover, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Music)) {
            return false;
        }
        Music music = (Music) other;
        return Intrinsics.areEqual(this.musicName, music.musicName) && Intrinsics.areEqual(this.singer, music.singer) && Intrinsics.areEqual(this.filePath, music.filePath) && Intrinsics.areEqual(this.cover, music.cover) && this.sort == music.sort;
    }

    public int hashCode() {
        return (((((((this.musicName.hashCode() * 31) + this.singer.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.cover.hashCode()) * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "Music(musicName=" + this.musicName + ", singer=" + this.singer + ", filePath=" + this.filePath + ", cover=" + this.cover + ", sort=" + this.sort + Separators.RPAREN;
    }

    public Music(String musicName, String singer, String filePath, String cover, int i) {
        Intrinsics.checkNotNullParameter(musicName, "musicName");
        Intrinsics.checkNotNullParameter(singer, "singer");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(cover, "cover");
        this.musicName = musicName;
        this.singer = singer;
        this.filePath = filePath;
        this.cover = cover;
        this.sort = i;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final String getSinger() {
        return this.singer;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getCover() {
        return this.cover;
    }

    public final int getSort() {
        return this.sort;
    }
}
