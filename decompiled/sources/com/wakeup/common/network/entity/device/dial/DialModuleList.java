package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialModuleList;", "", "bigModuleList", "", "Lcom/wakeup/common/network/entity/device/dial/DialModule;", "smallModuleList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getBigModuleList", "()Ljava/util/List;", "getSmallModuleList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialModuleList {
    private final List<DialModule> bigModuleList;
    private final List<DialModule> smallModuleList;

    /* JADX WARN: Multi-variable type inference failed */
    public DialModuleList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialModuleList copy$default(DialModuleList dialModuleList, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dialModuleList.bigModuleList;
        }
        if ((i & 2) != 0) {
            list2 = dialModuleList.smallModuleList;
        }
        return dialModuleList.copy(list, list2);
    }

    public final List<DialModule> component1() {
        return this.bigModuleList;
    }

    public final List<DialModule> component2() {
        return this.smallModuleList;
    }

    public final DialModuleList copy(List<DialModule> bigModuleList, List<DialModule> smallModuleList) {
        Intrinsics.checkNotNullParameter(bigModuleList, "bigModuleList");
        Intrinsics.checkNotNullParameter(smallModuleList, "smallModuleList");
        return new DialModuleList(bigModuleList, smallModuleList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialModuleList)) {
            return false;
        }
        DialModuleList dialModuleList = (DialModuleList) other;
        return Intrinsics.areEqual(this.bigModuleList, dialModuleList.bigModuleList) && Intrinsics.areEqual(this.smallModuleList, dialModuleList.smallModuleList);
    }

    public int hashCode() {
        return (this.bigModuleList.hashCode() * 31) + this.smallModuleList.hashCode();
    }

    public String toString() {
        return "DialModuleList(bigModuleList=" + this.bigModuleList + ", smallModuleList=" + this.smallModuleList + Separators.RPAREN;
    }

    public DialModuleList(List<DialModule> bigModuleList, List<DialModule> smallModuleList) {
        Intrinsics.checkNotNullParameter(bigModuleList, "bigModuleList");
        Intrinsics.checkNotNullParameter(smallModuleList, "smallModuleList");
        this.bigModuleList = bigModuleList;
        this.smallModuleList = smallModuleList;
    }

    public /* synthetic */ DialModuleList(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<DialModule> getBigModuleList() {
        return this.bigModuleList;
    }

    public final List<DialModule> getSmallModuleList() {
        return this.smallModuleList;
    }
}
