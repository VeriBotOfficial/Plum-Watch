package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/gift/LeaderboardEntry;", "", "user_id", "", "username", "", "avatar", "completed_count", "total_reward", "", "rank", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;JDI)V", "getUser_id", "()J", "getUsername", "()Ljava/lang/String;", "getAvatar", "getCompleted_count", "getTotal_reward", "()D", "getRank", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LeaderboardEntry {
    private final String avatar;
    private final long completed_count;
    private final int rank;
    private final double total_reward;
    private final long user_id;
    private final String username;

    public LeaderboardEntry() {
        this(0L, null, null, 0L, 0.0d, 0, 63, null);
    }

    public static /* synthetic */ LeaderboardEntry copy$default(LeaderboardEntry leaderboardEntry, long j, String str, String str2, long j2, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = leaderboardEntry.user_id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            str = leaderboardEntry.username;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = leaderboardEntry.avatar;
        }
        return leaderboardEntry.copy(j3, str3, str2, (i2 & 8) != 0 ? leaderboardEntry.completed_count : j2, (i2 & 16) != 0 ? leaderboardEntry.total_reward : d, (i2 & 32) != 0 ? leaderboardEntry.rank : i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUser_id() {
        return this.user_id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCompleted_count() {
        return this.completed_count;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTotal_reward() {
        return this.total_reward;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    public final LeaderboardEntry copy(long user_id, String username, String avatar, long completed_count, double total_reward, int rank) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new LeaderboardEntry(user_id, username, avatar, completed_count, total_reward, rank);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaderboardEntry)) {
            return false;
        }
        LeaderboardEntry leaderboardEntry = (LeaderboardEntry) other;
        return this.user_id == leaderboardEntry.user_id && Intrinsics.areEqual(this.username, leaderboardEntry.username) && Intrinsics.areEqual(this.avatar, leaderboardEntry.avatar) && this.completed_count == leaderboardEntry.completed_count && Double.compare(this.total_reward, leaderboardEntry.total_reward) == 0 && this.rank == leaderboardEntry.rank;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.user_id) * 31) + this.username.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Long.hashCode(this.completed_count)) * 31) + Double.hashCode(this.total_reward)) * 31) + Integer.hashCode(this.rank);
    }

    public String toString() {
        return "LeaderboardEntry(user_id=" + this.user_id + ", username=" + this.username + ", avatar=" + this.avatar + ", completed_count=" + this.completed_count + ", total_reward=" + this.total_reward + ", rank=" + this.rank + Separators.RPAREN;
    }

    public LeaderboardEntry(long j, String username, String avatar, long j2, double d, int i) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.user_id = j;
        this.username = username;
        this.avatar = avatar;
        this.completed_count = j2;
        this.total_reward = d;
        this.rank = i;
    }

    public /* synthetic */ LeaderboardEntry(long j, String str, String str2, long j2, double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? 0 : i);
    }

    public final long getUser_id() {
        return this.user_id;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final long getCompleted_count() {
        return this.completed_count;
    }

    public final double getTotal_reward() {
        return this.total_reward;
    }

    public final int getRank() {
        return this.rank;
    }
}
