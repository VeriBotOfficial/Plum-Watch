package com.wakeup.common.network.entity.sport;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportFeaturedPlayBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportFeaturedPlayBean;", "", "pageNum", "", "pageSize", "total", "data", "", "Lcom/wakeup/common/network/entity/sport/SportPlaylistDetailsBean;", "<init>", "(IIILjava/util/List;)V", "getPageNum", "()I", "setPageNum", "(I)V", "getPageSize", "setPageSize", "getTotal", "setTotal", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SportFeaturedPlayBean {
    private List<SportPlaylistDetailsBean> data;
    private int pageNum;
    private int pageSize;
    private int total;

    public SportFeaturedPlayBean() {
        this(0, 0, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportFeaturedPlayBean copy$default(SportFeaturedPlayBean sportFeaturedPlayBean, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sportFeaturedPlayBean.pageNum;
        }
        if ((i4 & 2) != 0) {
            i2 = sportFeaturedPlayBean.pageSize;
        }
        if ((i4 & 4) != 0) {
            i3 = sportFeaturedPlayBean.total;
        }
        if ((i4 & 8) != 0) {
            list = sportFeaturedPlayBean.data;
        }
        return sportFeaturedPlayBean.copy(i, i2, i3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPageNum() {
        return this.pageNum;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final List<SportPlaylistDetailsBean> component4() {
        return this.data;
    }

    public final SportFeaturedPlayBean copy(int pageNum, int pageSize, int total, List<SportPlaylistDetailsBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new SportFeaturedPlayBean(pageNum, pageSize, total, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportFeaturedPlayBean)) {
            return false;
        }
        SportFeaturedPlayBean sportFeaturedPlayBean = (SportFeaturedPlayBean) other;
        return this.pageNum == sportFeaturedPlayBean.pageNum && this.pageSize == sportFeaturedPlayBean.pageSize && this.total == sportFeaturedPlayBean.total && Intrinsics.areEqual(this.data, sportFeaturedPlayBean.data);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.pageNum) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.total)) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "SportFeaturedPlayBean(pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + ", data=" + this.data + Separators.RPAREN;
    }

    public SportFeaturedPlayBean(int i, int i2, int i3, List<SportPlaylistDetailsBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.pageNum = i;
        this.pageSize = i2;
        this.total = i3;
        this.data = data;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final void setPageNum(int i) {
        this.pageNum = i;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final void setPageSize(int i) {
        this.pageSize = i;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    public /* synthetic */ SportFeaturedPlayBean(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<SportPlaylistDetailsBean> getData() {
        return this.data;
    }

    public final void setData(List<SportPlaylistDetailsBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }
}
