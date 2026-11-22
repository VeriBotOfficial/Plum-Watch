package com.wakeup.module.xmly.bean;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XimalayaResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/xmly/bean/XimalayaPlayParams;", "", "albumId", "", "albumInfo", "Lcom/wakeup/module/xmly/bean/AlbumInfo;", "<init>", "(JLcom/wakeup/module/xmly/bean/AlbumInfo;)V", "getAlbumId", "()J", "getAlbumInfo", "()Lcom/wakeup/module/xmly/bean/AlbumInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "module-xmly_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class XimalayaPlayParams {

    @SerializedName("album_id")
    private final long albumId;

    @SerializedName("album_info")
    private final AlbumInfo albumInfo;

    public static /* synthetic */ XimalayaPlayParams copy$default(XimalayaPlayParams ximalayaPlayParams, long j, AlbumInfo albumInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ximalayaPlayParams.albumId;
        }
        if ((i & 2) != 0) {
            albumInfo = ximalayaPlayParams.albumInfo;
        }
        return ximalayaPlayParams.copy(j, albumInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAlbumId() {
        return this.albumId;
    }

    /* renamed from: component2, reason: from getter */
    public final AlbumInfo getAlbumInfo() {
        return this.albumInfo;
    }

    public final XimalayaPlayParams copy(long albumId, AlbumInfo albumInfo) {
        Intrinsics.checkNotNullParameter(albumInfo, "albumInfo");
        return new XimalayaPlayParams(albumId, albumInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XimalayaPlayParams)) {
            return false;
        }
        XimalayaPlayParams ximalayaPlayParams = (XimalayaPlayParams) other;
        return this.albumId == ximalayaPlayParams.albumId && Intrinsics.areEqual(this.albumInfo, ximalayaPlayParams.albumInfo);
    }

    public int hashCode() {
        return (Long.hashCode(this.albumId) * 31) + this.albumInfo.hashCode();
    }

    public String toString() {
        return "XimalayaPlayParams(albumId=" + this.albumId + ", albumInfo=" + this.albumInfo + Separators.RPAREN;
    }

    public XimalayaPlayParams(long j, AlbumInfo albumInfo) {
        Intrinsics.checkNotNullParameter(albumInfo, "albumInfo");
        this.albumId = j;
        this.albumInfo = albumInfo;
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final AlbumInfo getAlbumInfo() {
        return this.albumInfo;
    }
}
