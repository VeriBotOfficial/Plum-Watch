package com.xmly.businesssdk.network.bean.album;

import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlbumDetailData.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/xmly/businesssdk/network/bean/album/AlbumDetailData;", "", "album", "Lcom/xmly/businesssdk/network/bean/album/Album;", "isBoughtAlbum", "", "isRefresh", "(Lcom/xmly/businesssdk/network/bean/album/Album;ZZ)V", "getAlbum", "()Lcom/xmly/businesssdk/network/bean/album/Album;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AlbumDetailData {
    private final Album album;
    private final boolean isBoughtAlbum;
    private final boolean isRefresh;

    public AlbumDetailData(Album album, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(album, "album");
        this.album = album;
        this.isBoughtAlbum = z;
        this.isRefresh = z2;
    }

    public static /* synthetic */ AlbumDetailData copy$default(AlbumDetailData albumDetailData, Album album, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            album = albumDetailData.album;
        }
        if ((i & 2) != 0) {
            z = albumDetailData.isBoughtAlbum;
        }
        if ((i & 4) != 0) {
            z2 = albumDetailData.isRefresh;
        }
        return albumDetailData.copy(album, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final Album getAlbum() {
        return this.album;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBoughtAlbum() {
        return this.isBoughtAlbum;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRefresh() {
        return this.isRefresh;
    }

    public final AlbumDetailData copy(Album album, boolean isBoughtAlbum, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(album, "album");
        return new AlbumDetailData(album, isBoughtAlbum, isRefresh);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlbumDetailData)) {
            return false;
        }
        AlbumDetailData albumDetailData = (AlbumDetailData) other;
        return Intrinsics.areEqual(this.album, albumDetailData.album) && this.isBoughtAlbum == albumDetailData.isBoughtAlbum && this.isRefresh == albumDetailData.isRefresh;
    }

    public final Album getAlbum() {
        return this.album;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.album.hashCode() * 31;
        boolean z = this.isBoughtAlbum;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isRefresh;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isBoughtAlbum() {
        return this.isBoughtAlbum;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public String toString() {
        return c.a("AlbumDetailData(album=").append(this.album).append(", isBoughtAlbum=").append(this.isBoughtAlbum).append(", isRefresh=").append(this.isRefresh).append(')').toString();
    }

    public /* synthetic */ AlbumDetailData(Album album, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(album, z, (i & 4) != 0 ? false : z2);
    }
}
