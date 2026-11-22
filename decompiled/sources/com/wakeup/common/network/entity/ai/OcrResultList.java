package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OcrBeans.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/entity/ai/OcrResultList;", "", "results", "", "Lcom/wakeup/common/network/entity/ai/OcrResults;", "<init>", "(Ljava/util/List;)V", "getResults", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OcrResultList {
    private final List<OcrResults> results;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OcrResultList copy$default(OcrResultList ocrResultList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ocrResultList.results;
        }
        return ocrResultList.copy(list);
    }

    public final List<OcrResults> component1() {
        return this.results;
    }

    public final OcrResultList copy(List<OcrResults> results) {
        return new OcrResultList(results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OcrResultList) && Intrinsics.areEqual(this.results, ((OcrResultList) other).results);
    }

    public int hashCode() {
        List<OcrResults> list = this.results;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "OcrResultList(results=" + this.results + Separators.RPAREN;
    }

    public OcrResultList(List<OcrResults> list) {
        this.results = list;
    }

    public final List<OcrResults> getResults() {
        return this.results;
    }
}
