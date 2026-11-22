package com.xmly.businesssdk.network.bean;

import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: HistoryInfo.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u0014J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/xmly/businesssdk/network/bean/HistoryInfo;", "", "album", "Lcom/xmly/businesssdk/network/bean/AlbumInfo;", ARPScriptEnvironment.KEY_DATA_PIP_TRACK, "Lcom/xmly/businesssdk/network/bean/TrackInfo;", "breakSecond", "", "(Lcom/xmly/businesssdk/network/bean/AlbumInfo;Lcom/xmly/businesssdk/network/bean/TrackInfo;I)V", "getAlbum", "()Lcom/xmly/businesssdk/network/bean/AlbumInfo;", "getBreakSecond", "()I", "getTrack", "()Lcom/xmly/businesssdk/network/bean/TrackInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "getFormattedBreakTime", "", "getPlayProgress", "", "hashCode", "isCompleted", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HistoryInfo {

    @SerializedName("album")
    private final AlbumInfo album;

    @SerializedName("break_second")
    private final int breakSecond;

    @SerializedName(ARPScriptEnvironment.KEY_DATA_PIP_TRACK)
    private final TrackInfo track;

    public HistoryInfo() {
        this(null, null, 0, 7, null);
    }

    public HistoryInfo(AlbumInfo albumInfo, TrackInfo trackInfo, int i) {
        this.album = albumInfo;
        this.track = trackInfo;
        this.breakSecond = i;
    }

    public static /* synthetic */ HistoryInfo copy$default(HistoryInfo historyInfo, AlbumInfo albumInfo, TrackInfo trackInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            albumInfo = historyInfo.album;
        }
        if ((i2 & 2) != 0) {
            trackInfo = historyInfo.track;
        }
        if ((i2 & 4) != 0) {
            i = historyInfo.breakSecond;
        }
        return historyInfo.copy(albumInfo, trackInfo, i);
    }

    /* renamed from: component1, reason: from getter */
    public final AlbumInfo getAlbum() {
        return this.album;
    }

    /* renamed from: component2, reason: from getter */
    public final TrackInfo getTrack() {
        return this.track;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBreakSecond() {
        return this.breakSecond;
    }

    public final HistoryInfo copy(AlbumInfo album, TrackInfo track, int breakSecond) {
        return new HistoryInfo(album, track, breakSecond);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryInfo)) {
            return false;
        }
        HistoryInfo historyInfo = (HistoryInfo) other;
        return Intrinsics.areEqual(this.album, historyInfo.album) && Intrinsics.areEqual(this.track, historyInfo.track) && this.breakSecond == historyInfo.breakSecond;
    }

    public final AlbumInfo getAlbum() {
        return this.album;
    }

    public final int getBreakSecond() {
        return this.breakSecond;
    }

    public final String getFormattedBreakTime() {
        int i = this.breakSecond;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    public final float getPlayProgress() {
        TrackInfo trackInfo = this.track;
        if (trackInfo != null && trackInfo.getDuration() == 0) {
            return 0.0f;
        }
        return (this.breakSecond / (this.track != null ? r1.getDuration() : 1)) * 100;
    }

    public final TrackInfo getTrack() {
        return this.track;
    }

    public int hashCode() {
        AlbumInfo albumInfo = this.album;
        int hashCode = (albumInfo == null ? 0 : albumInfo.hashCode()) * 31;
        TrackInfo trackInfo = this.track;
        return Integer.hashCode(this.breakSecond) + ((hashCode + (trackInfo != null ? trackInfo.hashCode() : 0)) * 31);
    }

    public final boolean isCompleted() {
        TrackInfo trackInfo = this.track;
        return trackInfo != null && this.breakSecond >= trackInfo.getDuration();
    }

    public String toString() {
        return c.a("HistoryInfo(album=").append(this.album).append(", track=").append(this.track).append(", breakSecond=").append(this.breakSecond).append(')').toString();
    }

    public /* synthetic */ HistoryInfo(AlbumInfo albumInfo, TrackInfo trackInfo, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : albumInfo, (i2 & 2) != 0 ? null : trackInfo, (i2 & 4) != 0 ? 0 : i);
    }
}
