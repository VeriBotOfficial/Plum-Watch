package com.xmly.businesssdk.network.bean.album;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchAlbumInfo.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/xmly/businesssdk/network/bean/album/LastUptrack;", "", "trackId", "", "trackTitle", "", "duration", "", "createdAt", "updatedAt", "(JLjava/lang/String;FJJ)V", "getCreatedAt", "()J", "getDuration", "()F", "getTrackId", "getTrackTitle", "()Ljava/lang/String;", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LastUptrack {

    @SerializedName("created_at")
    private final long createdAt;

    @SerializedName("duration")
    private final float duration;

    @SerializedName("track_id")
    private final long trackId;

    @SerializedName("track_title")
    private final String trackTitle;

    @SerializedName("updated_at")
    private final long updatedAt;

    public LastUptrack() {
        this(0L, null, 0.0f, 0L, 0L, 31, null);
    }

    public LastUptrack(long j, String trackTitle, float f, long j2, long j3) {
        Intrinsics.checkNotNullParameter(trackTitle, "trackTitle");
        this.trackId = j;
        this.trackTitle = trackTitle;
        this.duration = f;
        this.createdAt = j2;
        this.updatedAt = j3;
    }

    public static /* synthetic */ LastUptrack copy$default(LastUptrack lastUptrack, long j, String str, float f, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lastUptrack.trackId;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            str = lastUptrack.trackTitle;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            f = lastUptrack.duration;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            j2 = lastUptrack.createdAt;
        }
        return lastUptrack.copy(j4, str2, f2, j2, (i & 16) != 0 ? lastUptrack.updatedAt : j3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTrackId() {
        return this.trackId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrackTitle() {
        return this.trackTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final float getDuration() {
        return this.duration;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component5, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final LastUptrack copy(long trackId, String trackTitle, float duration, long createdAt, long updatedAt) {
        Intrinsics.checkNotNullParameter(trackTitle, "trackTitle");
        return new LastUptrack(trackId, trackTitle, duration, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastUptrack)) {
            return false;
        }
        LastUptrack lastUptrack = (LastUptrack) other;
        return this.trackId == lastUptrack.trackId && Intrinsics.areEqual(this.trackTitle, lastUptrack.trackTitle) && Float.compare(this.duration, lastUptrack.duration) == 0 && this.createdAt == lastUptrack.createdAt && this.updatedAt == lastUptrack.updatedAt;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final long getTrackId() {
        return this.trackId;
    }

    public final String getTrackTitle() {
        return this.trackTitle;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return Long.hashCode(this.updatedAt) + a.a(this.createdAt, (Float.hashCode(this.duration) + com.xmly.businesssdk.config.a.a(this.trackTitle, Long.hashCode(this.trackId) * 31, 31)) * 31, 31);
    }

    public String toString() {
        return c.a("LastUptrack(trackId=").append(this.trackId).append(", trackTitle=").append(this.trackTitle).append(", duration=").append(this.duration).append(", createdAt=").append(this.createdAt).append(", updatedAt=").append(this.updatedAt).append(')').toString();
    }

    public /* synthetic */ LastUptrack(long j, String str, float f, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 0L : j3);
    }
}
