package com.wakeup.feature.health.bean;

import com.wakeup.common.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthTotalTitleBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/health/bean/HealthTotalTitleBean;", "Ljava/io/Serializable;", "<init>", "()V", Constants.BundleKey.TIMESTAMP, "", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "isExpanded", "", "()Z", "setExpanded", "(Z)V", "detailList", "", "Lcom/wakeup/feature/health/bean/HealthTotalContentBean;", "getDetailList", "()Ljava/util/List;", "setDetailList", "(Ljava/util/List;)V", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthTotalTitleBean implements Serializable {
    public static final int $stable = 8;
    private List<HealthTotalContentBean> detailList = new ArrayList();
    private boolean isExpanded;
    private long timeStamp;

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final List<HealthTotalContentBean> getDetailList() {
        return this.detailList;
    }

    public final void setDetailList(List<HealthTotalContentBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.detailList = list;
    }
}
