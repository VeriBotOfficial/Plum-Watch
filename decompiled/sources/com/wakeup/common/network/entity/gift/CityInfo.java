package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0014HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000fHÆ\u0003J\u009b\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000fHÆ\u0001J\u0013\u0010:\u001a\u00020\u00142\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\fHÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&¨\u0006>"}, d2 = {"Lcom/wakeup/common/network/entity/gift/CityInfo;", "", "id", "", "name", "", "description", "image_url", "reward_amount", "", "reward_type", "status", "", "point_count", "points", "", "Lcom/wakeup/common/network/entity/gift/CheckinPointInfo;", "total_points", "checked_points", "completed", "", "group_rewards", "Lcom/wakeup/common/network/entity/gift/GroupRewardInfo;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;IJLjava/util/List;JJZLjava/util/List;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getDescription", "getImage_url", "getReward_amount", "()D", "getReward_type", "getStatus", "()I", "getPoint_count", "getPoints", "()Ljava/util/List;", "getTotal_points", "getChecked_points", "getCompleted", "()Z", "getGroup_rewards", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CityInfo {
    private final long checked_points;
    private final boolean completed;
    private final String description;
    private final List<GroupRewardInfo> group_rewards;
    private final long id;
    private final String image_url;
    private final String name;
    private final long point_count;
    private final List<CheckinPointInfo> points;
    private final double reward_amount;
    private final String reward_type;
    private final int status;
    private final long total_points;

    public CityInfo() {
        this(0L, null, null, null, 0.0d, null, 0, 0L, null, 0L, 0L, false, null, 8191, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getTotal_points() {
        return this.total_points;
    }

    /* renamed from: component11, reason: from getter */
    public final long getChecked_points() {
        return this.checked_points;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    public final List<GroupRewardInfo> component13() {
        return this.group_rewards;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImage_url() {
        return this.image_url;
    }

    /* renamed from: component5, reason: from getter */
    public final double getReward_amount() {
        return this.reward_amount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReward_type() {
        return this.reward_type;
    }

    /* renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component8, reason: from getter */
    public final long getPoint_count() {
        return this.point_count;
    }

    public final List<CheckinPointInfo> component9() {
        return this.points;
    }

    public final CityInfo copy(long id2, String name, String description, String image_url, double reward_amount, String reward_type, int status, long point_count, List<CheckinPointInfo> points, long total_points, long checked_points, boolean completed, List<GroupRewardInfo> group_rewards) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(reward_type, "reward_type");
        return new CityInfo(id2, name, description, image_url, reward_amount, reward_type, status, point_count, points, total_points, checked_points, completed, group_rewards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CityInfo)) {
            return false;
        }
        CityInfo cityInfo = (CityInfo) other;
        return this.id == cityInfo.id && Intrinsics.areEqual(this.name, cityInfo.name) && Intrinsics.areEqual(this.description, cityInfo.description) && Intrinsics.areEqual(this.image_url, cityInfo.image_url) && Double.compare(this.reward_amount, cityInfo.reward_amount) == 0 && Intrinsics.areEqual(this.reward_type, cityInfo.reward_type) && this.status == cityInfo.status && this.point_count == cityInfo.point_count && Intrinsics.areEqual(this.points, cityInfo.points) && this.total_points == cityInfo.total_points && this.checked_points == cityInfo.checked_points && this.completed == cityInfo.completed && Intrinsics.areEqual(this.group_rewards, cityInfo.group_rewards);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.image_url.hashCode()) * 31) + Double.hashCode(this.reward_amount)) * 31) + this.reward_type.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Long.hashCode(this.point_count)) * 31;
        List<CheckinPointInfo> list = this.points;
        int hashCode2 = (((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.total_points)) * 31) + Long.hashCode(this.checked_points)) * 31) + Boolean.hashCode(this.completed)) * 31;
        List<GroupRewardInfo> list2 = this.group_rewards;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "CityInfo(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", image_url=" + this.image_url + ", reward_amount=" + this.reward_amount + ", reward_type=" + this.reward_type + ", status=" + this.status + ", point_count=" + this.point_count + ", points=" + this.points + ", total_points=" + this.total_points + ", checked_points=" + this.checked_points + ", completed=" + this.completed + ", group_rewards=" + this.group_rewards + Separators.RPAREN;
    }

    public CityInfo(long j, String name, String description, String image_url, double d, String reward_type, int i, long j2, List<CheckinPointInfo> list, long j3, long j4, boolean z, List<GroupRewardInfo> list2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(reward_type, "reward_type");
        this.id = j;
        this.name = name;
        this.description = description;
        this.image_url = image_url;
        this.reward_amount = d;
        this.reward_type = reward_type;
        this.status = i;
        this.point_count = j2;
        this.points = list;
        this.total_points = j3;
        this.checked_points = j4;
        this.completed = z;
        this.group_rewards = list2;
    }

    public /* synthetic */ CityInfo(long j, String str, String str2, String str3, double d, String str4, int i, long j2, List list, long j3, long j4, boolean z, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? "points" : str4, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? 0L : j2, (i2 & 256) != 0 ? null : list, (i2 & 512) != 0 ? 0L : j3, (i2 & 1024) != 0 ? 0L : j4, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? null : list2);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final double getReward_amount() {
        return this.reward_amount;
    }

    public final String getReward_type() {
        return this.reward_type;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getPoint_count() {
        return this.point_count;
    }

    public final List<CheckinPointInfo> getPoints() {
        return this.points;
    }

    public final long getTotal_points() {
        return this.total_points;
    }

    public final long getChecked_points() {
        return this.checked_points;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final List<GroupRewardInfo> getGroup_rewards() {
        return this.group_rewards;
    }
}
