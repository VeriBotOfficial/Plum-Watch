package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/DcsData;", "", "dcs", "", "Lcom/wakeup/common/network/entity/baidu/DcsInfo;", "tts", "Lcom/wakeup/common/network/entity/baidu/DcsDataTts;", "<init>", "(Ljava/util/List;Lcom/wakeup/common/network/entity/baidu/DcsDataTts;)V", "getDcs", "()Ljava/util/List;", "getTts", "()Lcom/wakeup/common/network/entity/baidu/DcsDataTts;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DcsData {
    private final List<DcsInfo> dcs;
    private final DcsDataTts tts;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DcsData copy$default(DcsData dcsData, List list, DcsDataTts dcsDataTts, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dcsData.dcs;
        }
        if ((i & 2) != 0) {
            dcsDataTts = dcsData.tts;
        }
        return dcsData.copy(list, dcsDataTts);
    }

    public final List<DcsInfo> component1() {
        return this.dcs;
    }

    /* renamed from: component2, reason: from getter */
    public final DcsDataTts getTts() {
        return this.tts;
    }

    public final DcsData copy(List<DcsInfo> dcs, DcsDataTts tts) {
        Intrinsics.checkNotNullParameter(dcs, "dcs");
        return new DcsData(dcs, tts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DcsData)) {
            return false;
        }
        DcsData dcsData = (DcsData) other;
        return Intrinsics.areEqual(this.dcs, dcsData.dcs) && Intrinsics.areEqual(this.tts, dcsData.tts);
    }

    public int hashCode() {
        int hashCode = this.dcs.hashCode() * 31;
        DcsDataTts dcsDataTts = this.tts;
        return hashCode + (dcsDataTts == null ? 0 : dcsDataTts.hashCode());
    }

    public String toString() {
        return "DcsData(dcs=" + this.dcs + ", tts=" + this.tts + Separators.RPAREN;
    }

    public DcsData(List<DcsInfo> dcs, DcsDataTts dcsDataTts) {
        Intrinsics.checkNotNullParameter(dcs, "dcs");
        this.dcs = dcs;
        this.tts = dcsDataTts;
    }

    public final List<DcsInfo> getDcs() {
        return this.dcs;
    }

    public final DcsDataTts getTts() {
        return this.tts;
    }
}
