package com.xmly.businesssdk.player.playrecord;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PlayHistory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006("}, d2 = {"Lcom/xmly/businesssdk/player/playrecord/PlayHistory;", "", "content_type", "", "album_id", "track_id", "break_second", "play_begin_at", "", "play_end_at", "(IIIIJJ)V", "getAlbum_id", "()I", "setAlbum_id", "(I)V", "getBreak_second", "setBreak_second", "getContent_type", "setContent_type", "getPlay_begin_at", "()J", "setPlay_begin_at", "(J)V", "getPlay_end_at", "setPlay_end_at", "getTrack_id", "setTrack_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlayHistory {

    @SerializedName("album_id")
    private int album_id;

    @SerializedName("break_second")
    private int break_second;

    @SerializedName("content_type")
    private int content_type;

    @SerializedName("play_begin_at")
    private long play_begin_at;

    @SerializedName("play_end_at")
    private long play_end_at;

    @SerializedName("track_id")
    private int track_id;

    public PlayHistory() {
        this(0, 0, 0, 0, 0L, 0L, 63, null);
    }

    public PlayHistory(int i, int i2, int i3, int i4, long j, long j2) {
        this.content_type = i;
        this.album_id = i2;
        this.track_id = i3;
        this.break_second = i4;
        this.play_begin_at = j;
        this.play_end_at = j2;
    }

    public static /* synthetic */ PlayHistory copy$default(PlayHistory playHistory, int i, int i2, int i3, int i4, long j, long j2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = playHistory.content_type;
        }
        if ((i5 & 2) != 0) {
            i2 = playHistory.album_id;
        }
        if ((i5 & 4) != 0) {
            i3 = playHistory.track_id;
        }
        if ((i5 & 8) != 0) {
            i4 = playHistory.break_second;
        }
        if ((i5 & 16) != 0) {
            j = playHistory.play_begin_at;
        }
        if ((i5 & 32) != 0) {
            j2 = playHistory.play_end_at;
        }
        long j3 = j2;
        long j4 = j;
        return playHistory.copy(i, i2, i3, i4, j4, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getContent_type() {
        return this.content_type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAlbum_id() {
        return this.album_id;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTrack_id() {
        return this.track_id;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBreak_second() {
        return this.break_second;
    }

    /* renamed from: component5, reason: from getter */
    public final long getPlay_begin_at() {
        return this.play_begin_at;
    }

    /* renamed from: component6, reason: from getter */
    public final long getPlay_end_at() {
        return this.play_end_at;
    }

    public final PlayHistory copy(int content_type, int album_id, int track_id, int break_second, long play_begin_at, long play_end_at) {
        return new PlayHistory(content_type, album_id, track_id, break_second, play_begin_at, play_end_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayHistory)) {
            return false;
        }
        PlayHistory playHistory = (PlayHistory) other;
        return this.content_type == playHistory.content_type && this.album_id == playHistory.album_id && this.track_id == playHistory.track_id && this.break_second == playHistory.break_second && this.play_begin_at == playHistory.play_begin_at && this.play_end_at == playHistory.play_end_at;
    }

    public final int getAlbum_id() {
        return this.album_id;
    }

    public final int getBreak_second() {
        return this.break_second;
    }

    public final int getContent_type() {
        return this.content_type;
    }

    public final long getPlay_begin_at() {
        return this.play_begin_at;
    }

    public final long getPlay_end_at() {
        return this.play_end_at;
    }

    public final int getTrack_id() {
        return this.track_id;
    }

    public int hashCode() {
        return Long.hashCode(this.play_end_at) + a.a(this.play_begin_at, b.a(this.break_second, b.a(this.track_id, b.a(this.album_id, Integer.hashCode(this.content_type) * 31, 31), 31), 31), 31);
    }

    public final void setAlbum_id(int i) {
        this.album_id = i;
    }

    public final void setBreak_second(int i) {
        this.break_second = i;
    }

    public final void setContent_type(int i) {
        this.content_type = i;
    }

    public final void setPlay_begin_at(long j) {
        this.play_begin_at = j;
    }

    public final void setPlay_end_at(long j) {
        this.play_end_at = j;
    }

    public final void setTrack_id(int i) {
        this.track_id = i;
    }

    public String toString() {
        return c.a("PlayHistory(content_type=").append(this.content_type).append(", album_id=").append(this.album_id).append(", track_id=").append(this.track_id).append(", break_second=").append(this.break_second).append(", play_begin_at=").append(this.play_begin_at).append(", play_end_at=").append(this.play_end_at).append(')').toString();
    }

    public /* synthetic */ PlayHistory(int i, int i2, int i3, int i4, long j, long j2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? 0L : j, (i5 & 32) != 0 ? 0L : j2);
    }
}
