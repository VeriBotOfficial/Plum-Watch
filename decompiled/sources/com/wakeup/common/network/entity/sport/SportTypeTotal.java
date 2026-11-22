package com.wakeup.common.network.entity.sport;

import kotlin.Metadata;

/* compiled from: SportTypeTotal.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportTypeTotal;", "", "<init>", "()V", "totalDistance", "", "getTotalDistance", "()I", "setTotalDistance", "(I)V", "totalTime", "getTotalTime", "setTotalTime", "totalNumber", "getTotalNumber", "setTotalNumber", "totalKcal", "", "getTotalKcal", "()F", "setTotalKcal", "(F)V", "sportCategory", "getSportCategory", "setSportCategory", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportTypeTotal {
    private int sportCategory;
    private int totalDistance;
    private float totalKcal;
    private int totalNumber;
    private int totalTime;

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    public final void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    public final void setTotalTime(int i) {
        this.totalTime = i;
    }

    public final int getTotalNumber() {
        return this.totalNumber;
    }

    public final void setTotalNumber(int i) {
        this.totalNumber = i;
    }

    public final float getTotalKcal() {
        return this.totalKcal;
    }

    public final void setTotalKcal(float f) {
        this.totalKcal = f;
    }

    public final int getSportCategory() {
        return this.sportCategory;
    }

    public final void setSportCategory(int i) {
        this.sportCategory = i;
    }
}
