package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006)"}, d2 = {"Lcom/wakeup/common/network/entity/gift/UserCheckinInfo;", "", "id", "", "user_id", "point_id", "city_id", "checkin_time", "reward_amount", "", "point_name", "", "city_name", "<init>", "(JJJJJDLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getUser_id", "getPoint_id", "getCity_id", "getCheckin_time", "getReward_amount", "()D", "getPoint_name", "()Ljava/lang/String;", "getCity_name", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserCheckinInfo {
    private final long checkin_time;
    private final long city_id;
    private final String city_name;
    private final long id;
    private final long point_id;
    private final String point_name;
    private final double reward_amount;
    private final long user_id;

    public UserCheckinInfo() {
        this(0L, 0L, 0L, 0L, 0L, 0.0d, null, null, 255, null);
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
    public final long getPoint_id() {
        return this.point_id;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCity_id() {
        return this.city_id;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCheckin_time() {
        return this.checkin_time;
    }

    /* renamed from: component6, reason: from getter */
    public final double getReward_amount() {
        return this.reward_amount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPoint_name() {
        return this.point_name;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCity_name() {
        return this.city_name;
    }

    public final UserCheckinInfo copy(long id2, long user_id, long point_id, long city_id, long checkin_time, double reward_amount, String point_name, String city_name) {
        Intrinsics.checkNotNullParameter(point_name, "point_name");
        Intrinsics.checkNotNullParameter(city_name, "city_name");
        return new UserCheckinInfo(id2, user_id, point_id, city_id, checkin_time, reward_amount, point_name, city_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCheckinInfo)) {
            return false;
        }
        UserCheckinInfo userCheckinInfo = (UserCheckinInfo) other;
        return this.id == userCheckinInfo.id && this.user_id == userCheckinInfo.user_id && this.point_id == userCheckinInfo.point_id && this.city_id == userCheckinInfo.city_id && this.checkin_time == userCheckinInfo.checkin_time && Double.compare(this.reward_amount, userCheckinInfo.reward_amount) == 0 && Intrinsics.areEqual(this.point_name, userCheckinInfo.point_name) && Intrinsics.areEqual(this.city_name, userCheckinInfo.city_name);
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.user_id)) * 31) + Long.hashCode(this.point_id)) * 31) + Long.hashCode(this.city_id)) * 31) + Long.hashCode(this.checkin_time)) * 31) + Double.hashCode(this.reward_amount)) * 31) + this.point_name.hashCode()) * 31) + this.city_name.hashCode();
    }

    public String toString() {
        return "UserCheckinInfo(id=" + this.id + ", user_id=" + this.user_id + ", point_id=" + this.point_id + ", city_id=" + this.city_id + ", checkin_time=" + this.checkin_time + ", reward_amount=" + this.reward_amount + ", point_name=" + this.point_name + ", city_name=" + this.city_name + Separators.RPAREN;
    }

    public UserCheckinInfo(long j, long j2, long j3, long j4, long j5, double d, String point_name, String city_name) {
        Intrinsics.checkNotNullParameter(point_name, "point_name");
        Intrinsics.checkNotNullParameter(city_name, "city_name");
        this.id = j;
        this.user_id = j2;
        this.point_id = j3;
        this.city_id = j4;
        this.checkin_time = j5;
        this.reward_amount = d;
        this.point_name = point_name;
        this.city_name = city_name;
    }

    public /* synthetic */ UserCheckinInfo(long j, long j2, long j3, long j4, long j5, double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) == 0 ? j5 : 0L, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? "" : str2);
    }

    public final long getId() {
        return this.id;
    }

    public final long getUser_id() {
        return this.user_id;
    }

    public final long getPoint_id() {
        return this.point_id;
    }

    public final long getCity_id() {
        return this.city_id;
    }

    public final long getCheckin_time() {
        return this.checkin_time;
    }

    public final double getReward_amount() {
        return this.reward_amount;
    }

    public final String getPoint_name() {
        return this.point_name;
    }

    public final String getCity_name() {
        return this.city_name;
    }
}
