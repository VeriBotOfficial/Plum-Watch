package com.xmly.businesssdk.trace;

import com.xmly.businesssdk.c;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsListener.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/xmly/businesssdk/trace/PlayRecordEvent;", "", "albumId", "", "trackId", "playSeconds", "", "startAt", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getAlbumId", "()Ljava/lang/String;", "getPlaySeconds", "()J", "getStartAt", "getTrackId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlayRecordEvent {
    private final String albumId;
    private final long playSeconds;
    private final long startAt;
    private final String trackId;

    public PlayRecordEvent(String str, String str2, long j, long j2) {
        this.albumId = str;
        this.trackId = str2;
        this.playSeconds = j;
        this.startAt = j2;
    }

    public static /* synthetic */ PlayRecordEvent copy$default(PlayRecordEvent playRecordEvent, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playRecordEvent.albumId;
        }
        if ((i & 2) != 0) {
            str2 = playRecordEvent.trackId;
        }
        if ((i & 4) != 0) {
            j = playRecordEvent.playSeconds;
        }
        if ((i & 8) != 0) {
            j2 = playRecordEvent.startAt;
        }
        long j3 = j2;
        return playRecordEvent.copy(str, str2, j, j3);
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
    public final long getPlaySeconds() {
        return this.playSeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartAt() {
        return this.startAt;
    }

    public final PlayRecordEvent copy(String albumId, String trackId, long playSeconds, long startAt) {
        return new PlayRecordEvent(albumId, trackId, playSeconds, startAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayRecordEvent)) {
            return false;
        }
        PlayRecordEvent playRecordEvent = (PlayRecordEvent) other;
        return Intrinsics.areEqual(this.albumId, playRecordEvent.albumId) && Intrinsics.areEqual(this.trackId, playRecordEvent.trackId) && this.playSeconds == playRecordEvent.playSeconds && this.startAt == playRecordEvent.startAt;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final long getPlaySeconds() {
        return this.playSeconds;
    }

    public final long getStartAt() {
        return this.startAt;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        String str = this.albumId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trackId;
        return Long.hashCode(this.startAt) + a.a(this.playSeconds, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        return c.a("PlayRecordEvent(albumId=").append(this.albumId).append(", trackId=").append(this.trackId).append(", playSeconds=").append(this.playSeconds).append(", startAt=").append(this.startAt).append(')').toString();
    }
}
