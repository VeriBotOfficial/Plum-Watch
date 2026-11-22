package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaginatedSongs.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/wakeup/feature/aimusic/model/PaginatedSongs;", "", "styleId", "", "styleName", "total", "", "page", "pageSize", FirebaseAnalytics.Param.ITEMS, "", "Lcom/wakeup/feature/aimusic/model/Song;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;)V", "getStyleId", "()Ljava/lang/String;", "getStyleName", "getTotal", "()I", "getPage", "getPageSize", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PaginatedSongs {

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<Song> items;

    @SerializedName("page")
    private final int page;

    @SerializedName("page_size")
    private final int pageSize;

    @SerializedName(MapBundleKey.MapObjKey.OBJ_STYLE_ID)
    private final String styleId;

    @SerializedName("style_name")
    private final String styleName;

    @SerializedName("total")
    private final int total;

    public PaginatedSongs() {
        this(null, null, 0, 0, 0, null, 63, null);
    }

    public static /* synthetic */ PaginatedSongs copy$default(PaginatedSongs paginatedSongs, String str, String str2, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = paginatedSongs.styleId;
        }
        if ((i4 & 2) != 0) {
            str2 = paginatedSongs.styleName;
        }
        if ((i4 & 4) != 0) {
            i = paginatedSongs.total;
        }
        if ((i4 & 8) != 0) {
            i2 = paginatedSongs.page;
        }
        if ((i4 & 16) != 0) {
            i3 = paginatedSongs.pageSize;
        }
        if ((i4 & 32) != 0) {
            list = paginatedSongs.items;
        }
        int i5 = i3;
        List list2 = list;
        return paginatedSongs.copy(str, str2, i, i2, i5, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStyleId() {
        return this.styleId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStyleName() {
        return this.styleName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    public final List<Song> component6() {
        return this.items;
    }

    public final PaginatedSongs copy(String styleId, String styleName, int total, int page, int pageSize, List<Song> items) {
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        Intrinsics.checkNotNullParameter(items, "items");
        return new PaginatedSongs(styleId, styleName, total, page, pageSize, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedSongs)) {
            return false;
        }
        PaginatedSongs paginatedSongs = (PaginatedSongs) other;
        return Intrinsics.areEqual(this.styleId, paginatedSongs.styleId) && Intrinsics.areEqual(this.styleName, paginatedSongs.styleName) && this.total == paginatedSongs.total && this.page == paginatedSongs.page && this.pageSize == paginatedSongs.pageSize && Intrinsics.areEqual(this.items, paginatedSongs.items);
    }

    public int hashCode() {
        return (((((((((this.styleId.hashCode() * 31) + this.styleName.hashCode()) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.pageSize)) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "PaginatedSongs(styleId=" + this.styleId + ", styleName=" + this.styleName + ", total=" + this.total + ", page=" + this.page + ", pageSize=" + this.pageSize + ", items=" + this.items + Separators.RPAREN;
    }

    public PaginatedSongs(String styleId, String styleName, int i, int i2, int i3, List<Song> items) {
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        Intrinsics.checkNotNullParameter(items, "items");
        this.styleId = styleId;
        this.styleName = styleName;
        this.total = i;
        this.page = i2;
        this.pageSize = i3;
        this.items = items;
    }

    public /* synthetic */ PaginatedSongs(String str, String str2, int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? 20 : i3, (i4 & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getStyleId() {
        return this.styleId;
    }

    public final String getStyleName() {
        return this.styleName;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final List<Song> getItems() {
        return this.items;
    }
}
