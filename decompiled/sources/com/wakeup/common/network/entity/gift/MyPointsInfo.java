package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/network/entity/gift/MyPointsInfo;", "", "points", "", "<init>", "(I)V", "getPoints", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MyPointsInfo {
    private final int points;

    public MyPointsInfo() {
        this(0, 1, null);
    }

    public static /* synthetic */ MyPointsInfo copy$default(MyPointsInfo myPointsInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = myPointsInfo.points;
        }
        return myPointsInfo.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    public final MyPointsInfo copy(int points) {
        return new MyPointsInfo(points);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MyPointsInfo) && this.points == ((MyPointsInfo) other).points;
    }

    public int hashCode() {
        return Integer.hashCode(this.points);
    }

    public String toString() {
        return "MyPointsInfo(points=" + this.points + Separators.RPAREN;
    }

    public MyPointsInfo(int i) {
        this.points = i;
    }

    public /* synthetic */ MyPointsInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getPoints() {
        return this.points;
    }
}
