package com.wakeup.common.network.entity.meeting;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeetingBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/meeting/SummarizationData;", "", "paragraphSummary", "", "", "fixed_title", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getParagraphSummary", "()Ljava/util/List;", "getFixed_title", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SummarizationData {
    private final String fixed_title;
    private final List<String> paragraphSummary;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SummarizationData copy$default(SummarizationData summarizationData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = summarizationData.paragraphSummary;
        }
        if ((i & 2) != 0) {
            str = summarizationData.fixed_title;
        }
        return summarizationData.copy(list, str);
    }

    public final List<String> component1() {
        return this.paragraphSummary;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFixed_title() {
        return this.fixed_title;
    }

    public final SummarizationData copy(List<String> paragraphSummary, String fixed_title) {
        Intrinsics.checkNotNullParameter(paragraphSummary, "paragraphSummary");
        Intrinsics.checkNotNullParameter(fixed_title, "fixed_title");
        return new SummarizationData(paragraphSummary, fixed_title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummarizationData)) {
            return false;
        }
        SummarizationData summarizationData = (SummarizationData) other;
        return Intrinsics.areEqual(this.paragraphSummary, summarizationData.paragraphSummary) && Intrinsics.areEqual(this.fixed_title, summarizationData.fixed_title);
    }

    public int hashCode() {
        return (this.paragraphSummary.hashCode() * 31) + this.fixed_title.hashCode();
    }

    public String toString() {
        return "SummarizationData(paragraphSummary=" + this.paragraphSummary + ", fixed_title=" + this.fixed_title + Separators.RPAREN;
    }

    public SummarizationData(List<String> paragraphSummary, String fixed_title) {
        Intrinsics.checkNotNullParameter(paragraphSummary, "paragraphSummary");
        Intrinsics.checkNotNullParameter(fixed_title, "fixed_title");
        this.paragraphSummary = paragraphSummary;
        this.fixed_title = fixed_title;
    }

    public final List<String> getParagraphSummary() {
        return this.paragraphSummary;
    }

    public final String getFixed_title() {
        return this.fixed_title;
    }
}
