package com.wakeup.common.network.entity.goal;

import kotlin.Metadata;

/* compiled from: GoalStatisticsBean.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/entity/goal/GoalStatisticsBean;", "", "<init>", "()V", "currentData", "", "getCurrentData", "()D", "setCurrentData", "(D)V", "lastData", "getLastData", "setLastData", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GoalStatisticsBean {
    private double currentData;
    private double lastData;

    public final double getCurrentData() {
        return this.currentData;
    }

    public final void setCurrentData(double d) {
        this.currentData = d;
    }

    public final double getLastData() {
        return this.lastData;
    }

    public final void setLastData(double d) {
        this.lastData = d;
    }
}
