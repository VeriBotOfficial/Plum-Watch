package com.xmly.businesssdk.db.entity;

import com.anythink.core.d.l;
import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaybackHistoryEntity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/xmly/businesssdk/db/entity/PlaybackHistoryEntity;", "", "albumId", "", "trackId", "positionMs", "", l.a.ac, "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getAlbumId", "()Ljava/lang/String;", "getPositionMs", "()J", "getTrackId", "getUpdateTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlaybackHistoryEntity {
    private final String albumId;
    private final long positionMs;
    private final String trackId;
    private final long updateTime;

    public PlaybackHistoryEntity(String albumId, String trackId, long j, long j2) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        this.albumId = albumId;
        this.trackId = trackId;
        this.positionMs = j;
        this.updateTime = j2;
    }

    public static /* synthetic */ PlaybackHistoryEntity copy$default(PlaybackHistoryEntity playbackHistoryEntity, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playbackHistoryEntity.albumId;
        }
        if ((i & 2) != 0) {
            str2 = playbackHistoryEntity.trackId;
        }
        if ((i & 4) != 0) {
            j = playbackHistoryEntity.positionMs;
        }
        if ((i & 8) != 0) {
            j2 = playbackHistoryEntity.updateTime;
        }
        long j3 = j2;
        return playbackHistoryEntity.copy(str, str2, j, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAlbumId() {
        return this.albumId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPositionMs() {
        return this.positionMs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final PlaybackHistoryEntity copy(String albumId, String trackId, long positionMs, long updateTime) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        return new PlaybackHistoryEntity(albumId, trackId, positionMs, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackHistoryEntity)) {
            return false;
        }
        PlaybackHistoryEntity playbackHistoryEntity = (PlaybackHistoryEntity) other;
        return Intrinsics.areEqual(this.albumId, playbackHistoryEntity.albumId) && Intrinsics.areEqual(this.trackId, playbackHistoryEntity.trackId) && this.positionMs == playbackHistoryEntity.positionMs && this.updateTime == playbackHistoryEntity.updateTime;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final long getPositionMs() {
        return this.positionMs;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return Long.hashCode(this.updateTime) + a.a(this.positionMs, com.xmly.businesssdk.config.a.a(this.trackId, this.albumId.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return c.a("PlaybackHistoryEntity(albumId=").append(this.albumId).append(", trackId=").append(this.trackId).append(", positionMs=").append(this.positionMs).append(", updateTime=").append(this.updateTime).append(')').toString();
    }
}
