package com.xmly.businesssdk.network.bean.album;

import com.xmly.businesssdk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchAlbumInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xmly/businesssdk/network/bean/album/BatchAlbumResponse;", "", "albums", "", "Lcom/xmly/businesssdk/network/bean/album/BatchAlbumInfo;", "(Ljava/util/List;)V", "getAlbums", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BatchAlbumResponse {
    private final List<BatchAlbumInfo> albums;

    /* JADX WARN: Multi-variable type inference failed */
    public BatchAlbumResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BatchAlbumResponse(List<BatchAlbumInfo> albums) {
        Intrinsics.checkNotNullParameter(albums, "albums");
        this.albums = albums;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchAlbumResponse copy$default(BatchAlbumResponse batchAlbumResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchAlbumResponse.albums;
        }
        return batchAlbumResponse.copy(list);
    }

    public final List<BatchAlbumInfo> component1() {
        return this.albums;
    }

    public final BatchAlbumResponse copy(List<BatchAlbumInfo> albums) {
        Intrinsics.checkNotNullParameter(albums, "albums");
        return new BatchAlbumResponse(albums);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BatchAlbumResponse) && Intrinsics.areEqual(this.albums, ((BatchAlbumResponse) other).albums);
    }

    public final List<BatchAlbumInfo> getAlbums() {
        return this.albums;
    }

    public int hashCode() {
        return this.albums.hashCode();
    }

    public String toString() {
        return c.a("BatchAlbumResponse(albums=").append(this.albums).append(')').toString();
    }

    public /* synthetic */ BatchAlbumResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
