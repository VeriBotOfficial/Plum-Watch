package com.wakeup.feature.wkvideo.livecut.api;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveCutCommerceApiModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/api/LiveCutCreateOrderResponseDto;", "", "orderNo", "", "totalFen", "", "logisticsNodes", "", "Lcom/wakeup/feature/wkvideo/livecut/api/LiveCutLogisticsNodeResponseDto;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getOrderNo", "()Ljava/lang/String;", "getTotalFen", "()I", "getLogisticsNodes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LiveCutCreateOrderResponseDto {

    @SerializedName("logisticsNodes")
    private final List<LiveCutLogisticsNodeResponseDto> logisticsNodes;

    @SerializedName("orderNo")
    private final String orderNo;

    @SerializedName("totalFen")
    private final int totalFen;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveCutCreateOrderResponseDto copy$default(LiveCutCreateOrderResponseDto liveCutCreateOrderResponseDto, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveCutCreateOrderResponseDto.orderNo;
        }
        if ((i2 & 2) != 0) {
            i = liveCutCreateOrderResponseDto.totalFen;
        }
        if ((i2 & 4) != 0) {
            list = liveCutCreateOrderResponseDto.logisticsNodes;
        }
        return liveCutCreateOrderResponseDto.copy(str, i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalFen() {
        return this.totalFen;
    }

    public final List<LiveCutLogisticsNodeResponseDto> component3() {
        return this.logisticsNodes;
    }

    public final LiveCutCreateOrderResponseDto copy(String orderNo, int totalFen, List<LiveCutLogisticsNodeResponseDto> logisticsNodes) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(logisticsNodes, "logisticsNodes");
        return new LiveCutCreateOrderResponseDto(orderNo, totalFen, logisticsNodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCutCreateOrderResponseDto)) {
            return false;
        }
        LiveCutCreateOrderResponseDto liveCutCreateOrderResponseDto = (LiveCutCreateOrderResponseDto) other;
        return Intrinsics.areEqual(this.orderNo, liveCutCreateOrderResponseDto.orderNo) && this.totalFen == liveCutCreateOrderResponseDto.totalFen && Intrinsics.areEqual(this.logisticsNodes, liveCutCreateOrderResponseDto.logisticsNodes);
    }

    public int hashCode() {
        return (((this.orderNo.hashCode() * 31) + Integer.hashCode(this.totalFen)) * 31) + this.logisticsNodes.hashCode();
    }

    public String toString() {
        return "LiveCutCreateOrderResponseDto(orderNo=" + this.orderNo + ", totalFen=" + this.totalFen + ", logisticsNodes=" + this.logisticsNodes + Separators.RPAREN;
    }

    public LiveCutCreateOrderResponseDto(String orderNo, int i, List<LiveCutLogisticsNodeResponseDto> logisticsNodes) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(logisticsNodes, "logisticsNodes");
        this.orderNo = orderNo;
        this.totalFen = i;
        this.logisticsNodes = logisticsNodes;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final int getTotalFen() {
        return this.totalFen;
    }

    public final List<LiveCutLogisticsNodeResponseDto> getLogisticsNodes() {
        return this.logisticsNodes;
    }
}
