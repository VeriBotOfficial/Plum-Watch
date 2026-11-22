package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006&"}, d2 = {"Lcom/wakeup/common/network/entity/gift/UserRewardInfo;", "", "id", "", "user_id", "city_id", "reward_amount", "", "reward_type", "", "complete_time", "city_name", "<init>", "(JJJDLjava/lang/String;JLjava/lang/String;)V", "getId", "()J", "getUser_id", "getCity_id", "getReward_amount", "()D", "getReward_type", "()Ljava/lang/String;", "getComplete_time", "getCity_name", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserRewardInfo {
    private final long city_id;
    private final String city_name;
    private final long complete_time;
    private final long id;
    private final double reward_amount;
    private final String reward_type;
    private final long user_id;

    public UserRewardInfo() {
        this(0L, 0L, 0L, 0.0d, null, 0L, null, 127, null);
    }

    public static /* synthetic */ UserRewardInfo copy$default(UserRewardInfo userRewardInfo, long j, long j2, long j3, double d, String str, long j4, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userRewardInfo.id;
        }
        return userRewardInfo.copy(j, (i & 2) != 0 ? userRewardInfo.user_id : j2, (i & 4) != 0 ? userRewardInfo.city_id : j3, (i & 8) != 0 ? userRewardInfo.reward_amount : d, (i & 16) != 0 ? userRewardInfo.reward_type : str, (i & 32) != 0 ? userRewardInfo.complete_time : j4, (i & 64) != 0 ? userRewardInfo.city_name : str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUser_id() {
        return this.user_id;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCity_id() {
        return this.city_id;
    }

    /* renamed from: component4, reason: from getter */
    public final double getReward_amount() {
        return this.reward_amount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReward_type() {
        return this.reward_type;
    }

    /* renamed from: component6, reason: from getter */
    public final long getComplete_time() {
        return this.complete_time;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCity_name() {
        return this.city_name;
    }

    public final UserRewardInfo copy(long id2, long user_id, long city_id, double reward_amount, String reward_type, long complete_time, String city_name) {
        Intrinsics.checkNotNullParameter(reward_type, "reward_type");
        Intrinsics.checkNotNullParameter(city_name, "city_name");
        return new UserRewardInfo(id2, user_id, city_id, reward_amount, reward_type, complete_time, city_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRewardInfo)) {
            return false;
        }
        UserRewardInfo userRewardInfo = (UserRewardInfo) other;
        return this.id == userRewardInfo.id && this.user_id == userRewardInfo.user_id && this.city_id == userRewardInfo.city_id && Double.compare(this.reward_amount, userRewardInfo.reward_amount) == 0 && Intrinsics.areEqual(this.reward_type, userRewardInfo.reward_type) && this.complete_time == userRewardInfo.complete_time && Intrinsics.areEqual(this.city_name, userRewardInfo.city_name);
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.user_id)) * 31) + Long.hashCode(this.city_id)) * 31) + Double.hashCode(this.reward_amount)) * 31) + this.reward_type.hashCode()) * 31) + Long.hashCode(this.complete_time)) * 31) + this.city_name.hashCode();
    }

    public String toString() {
        return "UserRewardInfo(id=" + this.id + ", user_id=" + this.user_id + ", city_id=" + this.city_id + ", reward_amount=" + this.reward_amount + ", reward_type=" + this.reward_type + ", complete_time=" + this.complete_time + ", city_name=" + this.city_name + Separators.RPAREN;
    }

    public UserRewardInfo(long j, long j2, long j3, double d, String reward_type, long j4, String city_name) {
        Intrinsics.checkNotNullParameter(reward_type, "reward_type");
        Intrinsics.checkNotNullParameter(city_name, "city_name");
        this.id = j;
        this.user_id = j2;
        this.city_id = j3;
        this.reward_amount = d;
        this.reward_type = reward_type;
        this.complete_time = j4;
        this.city_name = city_name;
    }

    public /* synthetic */ UserRewardInfo(long j, long j2, long j3, double d, String str, long j4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? "" : str, (i & 32) == 0 ? j4 : 0L, (i & 64) != 0 ? "" : str2);
    }

    public final long getId() {
        return this.id;
    }

    public final long getUser_id() {
        return this.user_id;
    }

    public final long getCity_id() {
        return this.city_id;
    }

    public final double getReward_amount() {
        return this.reward_amount;
    }

    public final String getReward_type() {
        return this.reward_type;
    }

    public final long getComplete_time() {
        return this.complete_time;
    }

    public final String getCity_name() {
        return this.city_name;
    }
}
