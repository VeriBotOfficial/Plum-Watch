package com.xmly.businesssdk.service;

import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.network.bean.album.Album;
import com.xmly.businesssdk.network.bean.track.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayerRequestData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/xmly/businesssdk/service/PlayerRequestData;", "", "album", "Lcom/xmly/businesssdk/network/bean/album/Album;", ARPScriptEnvironment.KEY_DATA_PIP_TRACK, "Lcom/xmly/businesssdk/network/bean/track/Track;", "breakSecond", "", "(Lcom/xmly/businesssdk/network/bean/album/Album;Lcom/xmly/businesssdk/network/bean/track/Track;Ljava/lang/Double;)V", "getAlbum", "()Lcom/xmly/businesssdk/network/bean/album/Album;", "getBreakSecond", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTrack", "()Lcom/xmly/businesssdk/network/bean/track/Track;", "component1", "component2", "component3", "copy", "(Lcom/xmly/businesssdk/network/bean/album/Album;Lcom/xmly/businesssdk/network/bean/track/Track;Ljava/lang/Double;)Lcom/xmly/businesssdk/service/PlayerRequestData;", "equals", "", "other", "hashCode", "", "toString", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlayerRequestData {
    private final Album album;
    private final Double breakSecond;
    private final Track track;

    public PlayerRequestData(Album album, Track track, Double d) {
        this.album = album;
        this.track = track;
        this.breakSecond = d;
    }

    public static /* synthetic */ PlayerRequestData copy$default(PlayerRequestData playerRequestData, Album album, Track track, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            album = playerRequestData.album;
        }
        if ((i & 2) != 0) {
            track = playerRequestData.track;
        }
        if ((i & 4) != 0) {
            d = playerRequestData.breakSecond;
        }
        return playerRequestData.copy(album, track, d);
    }

    /* renamed from: component1, reason: from getter */
    public final Album getAlbum() {
        return this.album;
    }

    /* renamed from: component2, reason: from getter */
    public final Track getTrack() {
        return this.track;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getBreakSecond() {
        return this.breakSecond;
    }

    public final PlayerRequestData copy(Album album, Track track, Double breakSecond) {
        return new PlayerRequestData(album, track, breakSecond);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerRequestData)) {
            return false;
        }
        PlayerRequestData playerRequestData = (PlayerRequestData) other;
        return Intrinsics.areEqual(this.album, playerRequestData.album) && Intrinsics.areEqual(this.track, playerRequestData.track) && Intrinsics.areEqual((Object) this.breakSecond, (Object) playerRequestData.breakSecond);
    }

    public final Album getAlbum() {
        return this.album;
    }

    public final Double getBreakSecond() {
        return this.breakSecond;
    }

    public final Track getTrack() {
        return this.track;
    }

    public int hashCode() {
        Album album = this.album;
        int hashCode = (album == null ? 0 : album.hashCode()) * 31;
        Track track = this.track;
        int hashCode2 = (hashCode + (track == null ? 0 : track.hashCode())) * 31;
        Double d = this.breakSecond;
        return hashCode2 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return c.a("PlayerRequestData(album=").append(this.album).append(", track=").append(this.track).append(", breakSecond=").append(this.breakSecond).append(')').toString();
    }
}
