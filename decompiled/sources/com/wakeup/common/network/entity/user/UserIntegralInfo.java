package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: UserIntegralInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/user/UserIntegralInfo;", "", "userId", "", "integralScore", "", "signCount", "appTime", "lotteryNumber", "<init>", "(JIIIJ)V", "getUserId", "()J", "getIntegralScore", "()I", "getSignCount", "getAppTime", "getLotteryNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserIntegralInfo {
    private final int appTime;
    private final int integralScore;
    private final long lotteryNumber;
    private final int signCount;
    private final long userId;

    public UserIntegralInfo() {
        this(0L, 0, 0, 0, 0L, 31, null);
    }

    public static /* synthetic */ UserIntegralInfo copy$default(UserIntegralInfo userIntegralInfo, long j, int i, int i2, int i3, long j2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = userIntegralInfo.userId;
        }
        long j3 = j;
        if ((i4 & 2) != 0) {
            i = userIntegralInfo.integralScore;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = userIntegralInfo.signCount;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = userIntegralInfo.appTime;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            j2 = userIntegralInfo.lotteryNumber;
        }
        return userIntegralInfo.copy(j3, i5, i6, i7, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIntegralScore() {
        return this.integralScore;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSignCount() {
        return this.signCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAppTime() {
        return this.appTime;
    }

    /* renamed from: component5, reason: from getter */
    public final long getLotteryNumber() {
        return this.lotteryNumber;
    }

    public final UserIntegralInfo copy(long userId, int integralScore, int signCount, int appTime, long lotteryNumber) {
        return new UserIntegralInfo(userId, integralScore, signCount, appTime, lotteryNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserIntegralInfo)) {
            return false;
        }
        UserIntegralInfo userIntegralInfo = (UserIntegralInfo) other;
        return this.userId == userIntegralInfo.userId && this.integralScore == userIntegralInfo.integralScore && this.signCount == userIntegralInfo.signCount && this.appTime == userIntegralInfo.appTime && this.lotteryNumber == userIntegralInfo.lotteryNumber;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.userId) * 31) + Integer.hashCode(this.integralScore)) * 31) + Integer.hashCode(this.signCount)) * 31) + Integer.hashCode(this.appTime)) * 31) + Long.hashCode(this.lotteryNumber);
    }

    public String toString() {
        return "UserIntegralInfo(userId=" + this.userId + ", integralScore=" + this.integralScore + ", signCount=" + this.signCount + ", appTime=" + this.appTime + ", lotteryNumber=" + this.lotteryNumber + Separators.RPAREN;
    }

    public UserIntegralInfo(long j, int i, int i2, int i3, long j2) {
        this.userId = j;
        this.integralScore = i;
        this.signCount = i2;
        this.appTime = i3;
        this.lotteryNumber = j2;
    }

    public /* synthetic */ UserIntegralInfo(long j, int i, int i2, int i3, long j2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? 0L : j2);
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int getIntegralScore() {
        return this.integralScore;
    }

    public final int getSignCount() {
        return this.signCount;
    }

    public final int getAppTime() {
        return this.appTime;
    }

    public final long getLotteryNumber() {
        return this.lotteryNumber;
    }
}
