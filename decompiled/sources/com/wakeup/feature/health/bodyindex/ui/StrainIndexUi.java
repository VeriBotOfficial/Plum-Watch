package com.wakeup.feature.health.bodyindex.ui;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexUiMapper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003Jb\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006)"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/ui/StrainIndexUi;", "", FirebaseAnalytics.Param.SCORE, "", "syncTime", "", "statusEmoji", "statusText", "statusDesc", "metrics", "", "Lcom/wakeup/feature/health/bodyindex/ui/BodyIndexMetric;", "charts", "Lcom/wakeup/feature/health/bodyindex/ui/TrendChartSpec;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSyncTime", "()Ljava/lang/String;", "getStatusEmoji", "getStatusText", "getStatusDesc", "getMetrics", "()Ljava/util/List;", "getCharts", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/wakeup/feature/health/bodyindex/ui/StrainIndexUi;", "equals", "", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StrainIndexUi {
    public static final int $stable = 8;
    private final List<TrendChartSpec> charts;
    private final List<BodyIndexMetric> metrics;
    private final Integer score;
    private final String statusDesc;
    private final String statusEmoji;
    private final String statusText;
    private final String syncTime;

    public static /* synthetic */ StrainIndexUi copy$default(StrainIndexUi strainIndexUi, Integer num, String str, String str2, String str3, String str4, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = strainIndexUi.score;
        }
        if ((i & 2) != 0) {
            str = strainIndexUi.syncTime;
        }
        if ((i & 4) != 0) {
            str2 = strainIndexUi.statusEmoji;
        }
        if ((i & 8) != 0) {
            str3 = strainIndexUi.statusText;
        }
        if ((i & 16) != 0) {
            str4 = strainIndexUi.statusDesc;
        }
        if ((i & 32) != 0) {
            list = strainIndexUi.metrics;
        }
        if ((i & 64) != 0) {
            list2 = strainIndexUi.charts;
        }
        List list3 = list;
        List list4 = list2;
        String str5 = str4;
        String str6 = str2;
        return strainIndexUi.copy(num, str, str6, str3, str5, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSyncTime() {
        return this.syncTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatusEmoji() {
        return this.statusEmoji;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<BodyIndexMetric> component6() {
        return this.metrics;
    }

    public final List<TrendChartSpec> component7() {
        return this.charts;
    }

    public final StrainIndexUi copy(Integer score, String syncTime, String statusEmoji, String statusText, String statusDesc, List<BodyIndexMetric> metrics, List<TrendChartSpec> charts) {
        Intrinsics.checkNotNullParameter(syncTime, "syncTime");
        Intrinsics.checkNotNullParameter(statusEmoji, "statusEmoji");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(charts, "charts");
        return new StrainIndexUi(score, syncTime, statusEmoji, statusText, statusDesc, metrics, charts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrainIndexUi)) {
            return false;
        }
        StrainIndexUi strainIndexUi = (StrainIndexUi) other;
        return Intrinsics.areEqual(this.score, strainIndexUi.score) && Intrinsics.areEqual(this.syncTime, strainIndexUi.syncTime) && Intrinsics.areEqual(this.statusEmoji, strainIndexUi.statusEmoji) && Intrinsics.areEqual(this.statusText, strainIndexUi.statusText) && Intrinsics.areEqual(this.statusDesc, strainIndexUi.statusDesc) && Intrinsics.areEqual(this.metrics, strainIndexUi.metrics) && Intrinsics.areEqual(this.charts, strainIndexUi.charts);
    }

    public int hashCode() {
        Integer num = this.score;
        return ((((((((((((num == null ? 0 : num.hashCode()) * 31) + this.syncTime.hashCode()) * 31) + this.statusEmoji.hashCode()) * 31) + this.statusText.hashCode()) * 31) + this.statusDesc.hashCode()) * 31) + this.metrics.hashCode()) * 31) + this.charts.hashCode();
    }

    public String toString() {
        return "StrainIndexUi(score=" + this.score + ", syncTime=" + this.syncTime + ", statusEmoji=" + this.statusEmoji + ", statusText=" + this.statusText + ", statusDesc=" + this.statusDesc + ", metrics=" + this.metrics + ", charts=" + this.charts + Separators.RPAREN;
    }

    public StrainIndexUi(Integer num, String syncTime, String statusEmoji, String statusText, String statusDesc, List<BodyIndexMetric> metrics, List<TrendChartSpec> charts) {
        Intrinsics.checkNotNullParameter(syncTime, "syncTime");
        Intrinsics.checkNotNullParameter(statusEmoji, "statusEmoji");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(charts, "charts");
        this.score = num;
        this.syncTime = syncTime;
        this.statusEmoji = statusEmoji;
        this.statusText = statusText;
        this.statusDesc = statusDesc;
        this.metrics = metrics;
        this.charts = charts;
    }

    public final Integer getScore() {
        return this.score;
    }

    public final String getSyncTime() {
        return this.syncTime;
    }

    public final String getStatusEmoji() {
        return this.statusEmoji;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<BodyIndexMetric> getMetrics() {
        return this.metrics;
    }

    public final List<TrendChartSpec> getCharts() {
        return this.charts;
    }
}
