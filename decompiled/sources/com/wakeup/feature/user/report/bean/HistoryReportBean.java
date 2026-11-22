package com.wakeup.feature.user.report.bean;

import android.gov.nist.core.Separators;
import com.umeng.analytics.AnalyticsConfig;
import kotlin.Metadata;

/* compiled from: HistoryReportBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/user/report/bean/HistoryReportBean;", "", AnalyticsConfig.RTD_START_TIME, "", "endTime", "<init>", "(JJ)V", "getStartTime", "()J", "getEndTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HistoryReportBean {
    private final long endTime;
    private final long startTime;

    public static /* synthetic */ HistoryReportBean copy$default(HistoryReportBean historyReportBean, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = historyReportBean.startTime;
        }
        if ((i & 2) != 0) {
            j2 = historyReportBean.endTime;
        }
        return historyReportBean.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    public final HistoryReportBean copy(long startTime, long endTime) {
        return new HistoryReportBean(startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryReportBean)) {
            return false;
        }
        HistoryReportBean historyReportBean = (HistoryReportBean) other;
        return this.startTime == historyReportBean.startTime && this.endTime == historyReportBean.endTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
    }

    public String toString() {
        return "HistoryReportBean(startTime=" + this.startTime + ", endTime=" + this.endTime + Separators.RPAREN;
    }

    public HistoryReportBean(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }
}
