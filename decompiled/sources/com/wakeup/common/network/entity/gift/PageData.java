package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/gift/PageData;", "T", "", "list", "", "total", "", "page", "", "size", "<init>", "(Ljava/util/List;JII)V", "getList", "()Ljava/util/List;", "getTotal", "()J", "getPage", "()I", "getSize", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PageData<T> {
    private final List<T> list;
    private final int page;
    private final int size;
    private final long total;

    public PageData() {
        this(null, 0L, 0, 0, 15, null);
    }

    public static /* synthetic */ PageData copy$default(PageData pageData, List list, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = pageData.list;
        }
        if ((i3 & 2) != 0) {
            j = pageData.total;
        }
        if ((i3 & 4) != 0) {
            i = pageData.page;
        }
        if ((i3 & 8) != 0) {
            i2 = pageData.size;
        }
        return pageData.copy(list, j, i, i2);
    }

    public final List<T> component1() {
        return this.list;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final PageData<T> copy(List<? extends T> list, long total, int page, int size) {
        return new PageData<>(list, total, page, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageData)) {
            return false;
        }
        PageData pageData = (PageData) other;
        return Intrinsics.areEqual(this.list, pageData.list) && this.total == pageData.total && this.page == pageData.page && this.size == pageData.size;
    }

    public int hashCode() {
        List<T> list = this.list;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + Long.hashCode(this.total)) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.size);
    }

    public String toString() {
        return "PageData(list=" + this.list + ", total=" + this.total + ", page=" + this.page + ", size=" + this.size + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PageData(List<? extends T> list, long j, int i, int i2) {
        this.list = list;
        this.total = j;
        this.page = i;
        this.size = i2;
    }

    public /* synthetic */ PageData(List list, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? 10 : i2);
    }

    public final List<T> getList() {
        return this.list;
    }

    public final long getTotal() {
        return this.total;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getSize() {
        return this.size;
    }
}
