package com.wakeup.feature.wkvideo.livecut.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveCutCommerceModels.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutOrder;", "", "orderNo", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutCartItem;", "totalFen", "", "logisticsNodes", "Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutLogisticsNode;", "<init>", "(Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V", "getOrderNo", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getTotalFen", "()I", "getLogisticsNodes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LiveCutOrder {
    private final List<LiveCutCartItem> items;
    private final List<LiveCutLogisticsNode> logisticsNodes;
    private final String orderNo;
    private final int totalFen;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveCutOrder copy$default(LiveCutOrder liveCutOrder, String str, List list, int i, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveCutOrder.orderNo;
        }
        if ((i2 & 2) != 0) {
            list = liveCutOrder.items;
        }
        if ((i2 & 4) != 0) {
            i = liveCutOrder.totalFen;
        }
        if ((i2 & 8) != 0) {
            list2 = liveCutOrder.logisticsNodes;
        }
        return liveCutOrder.copy(str, list, i, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    public final List<LiveCutCartItem> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalFen() {
        return this.totalFen;
    }

    public final List<LiveCutLogisticsNode> component4() {
        return this.logisticsNodes;
    }

    public final LiveCutOrder copy(String orderNo, List<LiveCutCartItem> items, int totalFen, List<LiveCutLogisticsNode> logisticsNodes) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(logisticsNodes, "logisticsNodes");
        return new LiveCutOrder(orderNo, items, totalFen, logisticsNodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCutOrder)) {
            return false;
        }
        LiveCutOrder liveCutOrder = (LiveCutOrder) other;
        return Intrinsics.areEqual(this.orderNo, liveCutOrder.orderNo) && Intrinsics.areEqual(this.items, liveCutOrder.items) && this.totalFen == liveCutOrder.totalFen && Intrinsics.areEqual(this.logisticsNodes, liveCutOrder.logisticsNodes);
    }

    public int hashCode() {
        return (((((this.orderNo.hashCode() * 31) + this.items.hashCode()) * 31) + Integer.hashCode(this.totalFen)) * 31) + this.logisticsNodes.hashCode();
    }

    public String toString() {
        return "LiveCutOrder(orderNo=" + this.orderNo + ", items=" + this.items + ", totalFen=" + this.totalFen + ", logisticsNodes=" + this.logisticsNodes + Separators.RPAREN;
    }

    public LiveCutOrder(String orderNo, List<LiveCutCartItem> items, int i, List<LiveCutLogisticsNode> logisticsNodes) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(logisticsNodes, "logisticsNodes");
        this.orderNo = orderNo;
        this.items = items;
        this.totalFen = i;
        this.logisticsNodes = logisticsNodes;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final List<LiveCutCartItem> getItems() {
        return this.items;
    }

    public final int getTotalFen() {
        return this.totalFen;
    }

    public final List<LiveCutLogisticsNode> getLogisticsNodes() {
        return this.logisticsNodes;
    }
}
