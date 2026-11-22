package com.xmly.businesssdk.network.bean;

import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayListInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/xmly/businesssdk/network/bean/PlayListInfo;", "", "currentPosition", "", "playlistSize", "hasNextPage", "", "hasPreviousPage", "playMode", "", "(IIZZLjava/lang/String;)V", "getCurrentPosition", "()I", "getHasNextPage", "()Z", "getHasPreviousPage", "getPlayMode", "()Ljava/lang/String;", "getPlaylistSize", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayListInfo {
    private final int currentPosition;
    private final boolean hasNextPage;
    private final boolean hasPreviousPage;
    private final String playMode;
    private final int playlistSize;

    public PlayListInfo(int i, int i2, boolean z, boolean z2, String playMode) {
        Intrinsics.checkNotNullParameter(playMode, "playMode");
        this.currentPosition = i;
        this.playlistSize = i2;
        this.hasNextPage = z;
        this.hasPreviousPage = z2;
        this.playMode = playMode;
    }

    public static /* synthetic */ PlayListInfo copy$default(PlayListInfo playListInfo, int i, int i2, boolean z, boolean z2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = playListInfo.currentPosition;
        }
        if ((i3 & 2) != 0) {
            i2 = playListInfo.playlistSize;
        }
        if ((i3 & 4) != 0) {
            z = playListInfo.hasNextPage;
        }
        if ((i3 & 8) != 0) {
            z2 = playListInfo.hasPreviousPage;
        }
        if ((i3 & 16) != 0) {
            str = playListInfo.playMode;
        }
        String str2 = str;
        boolean z3 = z;
        return playListInfo.copy(i, i2, z3, z2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlaylistSize() {
        return this.playlistSize;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlayMode() {
        return this.playMode;
    }

    public final PlayListInfo copy(int currentPosition, int playlistSize, boolean hasNextPage, boolean hasPreviousPage, String playMode) {
        Intrinsics.checkNotNullParameter(playMode, "playMode");
        return new PlayListInfo(currentPosition, playlistSize, hasNextPage, hasPreviousPage, playMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayListInfo)) {
            return false;
        }
        PlayListInfo playListInfo = (PlayListInfo) other;
        return this.currentPosition == playListInfo.currentPosition && this.playlistSize == playListInfo.playlistSize && this.hasNextPage == playListInfo.hasNextPage && this.hasPreviousPage == playListInfo.hasPreviousPage && Intrinsics.areEqual(this.playMode, playListInfo.playMode);
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    public final String getPlayMode() {
        return this.playMode;
    }

    public final int getPlaylistSize() {
        return this.playlistSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a2 = b.a(this.playlistSize, Integer.hashCode(this.currentPosition) * 31, 31);
        boolean z = this.hasNextPage;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a2 + i) * 31;
        boolean z2 = this.hasPreviousPage;
        return this.playMode.hashCode() + ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("PlayListInfo(currentPosition=").append(this.currentPosition).append(", playlistSize=").append(this.playlistSize).append(", hasNextPage=").append(this.hasNextPage).append(", hasPreviousPage=").append(this.hasPreviousPage).append(", playMode="), this.playMode, ')');
    }
}
