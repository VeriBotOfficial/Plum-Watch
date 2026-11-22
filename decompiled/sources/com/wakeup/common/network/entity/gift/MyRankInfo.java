package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/gift/MyRankInfo;", "", "rank", "", "completed_count", "", "username", "", "avatar", "total_points", "<init>", "(IJLjava/lang/String;Ljava/lang/String;I)V", "getRank", "()I", "getCompleted_count", "()J", "getUsername", "()Ljava/lang/String;", "getAvatar", "getTotal_points", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MyRankInfo {
    private final String avatar;
    private final long completed_count;
    private final int rank;
    private final int total_points;
    private final String username;

    public MyRankInfo() {
        this(0, 0L, null, null, 0, 31, null);
    }

    public static /* synthetic */ MyRankInfo copy$default(MyRankInfo myRankInfo, int i, long j, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = myRankInfo.rank;
        }
        if ((i3 & 2) != 0) {
            j = myRankInfo.completed_count;
        }
        if ((i3 & 4) != 0) {
            str = myRankInfo.username;
        }
        if ((i3 & 8) != 0) {
            str2 = myRankInfo.avatar;
        }
        if ((i3 & 16) != 0) {
            i2 = myRankInfo.total_points;
        }
        int i4 = i2;
        String str3 = str;
        return myRankInfo.copy(i, j, str3, str2, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCompleted_count() {
        return this.completed_count;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotal_points() {
        return this.total_points;
    }

    public final MyRankInfo copy(int rank, long completed_count, String username, String avatar, int total_points) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new MyRankInfo(rank, completed_count, username, avatar, total_points);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyRankInfo)) {
            return false;
        }
        MyRankInfo myRankInfo = (MyRankInfo) other;
        return this.rank == myRankInfo.rank && this.completed_count == myRankInfo.completed_count && Intrinsics.areEqual(this.username, myRankInfo.username) && Intrinsics.areEqual(this.avatar, myRankInfo.avatar) && this.total_points == myRankInfo.total_points;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.rank) * 31) + Long.hashCode(this.completed_count)) * 31) + this.username.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Integer.hashCode(this.total_points);
    }

    public String toString() {
        return "MyRankInfo(rank=" + this.rank + ", completed_count=" + this.completed_count + ", username=" + this.username + ", avatar=" + this.avatar + ", total_points=" + this.total_points + Separators.RPAREN;
    }

    public MyRankInfo(int i, long j, String username, String avatar, int i2) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.rank = i;
        this.completed_count = j;
        this.username = username;
        this.avatar = avatar;
        this.total_points = i2;
    }

    public /* synthetic */ MyRankInfo(int i, long j, String str, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 0 : i2);
    }

    public final int getRank() {
        return this.rank;
    }

    public final long getCompleted_count() {
        return this.completed_count;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final int getTotal_points() {
        return this.total_points;
    }
}
