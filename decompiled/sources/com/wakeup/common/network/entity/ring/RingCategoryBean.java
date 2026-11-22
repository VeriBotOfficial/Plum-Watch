package com.wakeup.common.network.entity.ring;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RingCategoryBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/ring/RingCategoryBean;", "", "pageNum", "", "pageSize", "total", "data", "", "Lcom/wakeup/common/network/entity/ring/PersonalRingEntity;", "<init>", "(IIILjava/util/List;)V", "getPageNum", "()I", "getPageSize", "getTotal", "getData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RingCategoryBean {
    private final List<PersonalRingEntity> data;
    private final int pageNum;
    private final int pageSize;
    private final int total;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RingCategoryBean copy$default(RingCategoryBean ringCategoryBean, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = ringCategoryBean.pageNum;
        }
        if ((i4 & 2) != 0) {
            i2 = ringCategoryBean.pageSize;
        }
        if ((i4 & 4) != 0) {
            i3 = ringCategoryBean.total;
        }
        if ((i4 & 8) != 0) {
            list = ringCategoryBean.data;
        }
        return ringCategoryBean.copy(i, i2, i3, list);
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

    public final List<PersonalRingEntity> component4() {
        return this.data;
    }

    public final RingCategoryBean copy(int pageNum, int pageSize, int total, List<PersonalRingEntity> data) {
        return new RingCategoryBean(pageNum, pageSize, total, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RingCategoryBean)) {
            return false;
        }
        RingCategoryBean ringCategoryBean = (RingCategoryBean) other;
        return this.pageNum == ringCategoryBean.pageNum && this.pageSize == ringCategoryBean.pageSize && this.total == ringCategoryBean.total && Intrinsics.areEqual(this.data, ringCategoryBean.data);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.pageNum) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.total)) * 31;
        List<PersonalRingEntity> list = this.data;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "RingCategoryBean(pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + ", data=" + this.data + Separators.RPAREN;
    }

    public RingCategoryBean(int i, int i2, int i3, List<PersonalRingEntity> list) {
        this.pageNum = i;
        this.pageSize = i2;
        this.total = i3;
        this.data = list;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getTotal() {
        return this.total;
    }

    public final List<PersonalRingEntity> getData() {
        return this.data;
    }
}
