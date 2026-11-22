package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/gift/GroupRewardInfo;", "", "point_group", "", "group_name", "", "reward_amount", "", "total_points", "checked_points", "completed", "", "<init>", "(ILjava/lang/String;DIIZ)V", "getPoint_group", "()I", "getGroup_name", "()Ljava/lang/String;", "getReward_amount", "()D", "getTotal_points", "getChecked_points", "getCompleted", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GroupRewardInfo {
    private final int checked_points;
    private final boolean completed;
    private final String group_name;
    private final int point_group;
    private final double reward_amount;
    private final int total_points;

    public GroupRewardInfo() {
        this(0, null, 0.0d, 0, 0, false, 63, null);
    }

    public static /* synthetic */ GroupRewardInfo copy$default(GroupRewardInfo groupRewardInfo, int i, String str, double d, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = groupRewardInfo.point_group;
        }
        if ((i4 & 2) != 0) {
            str = groupRewardInfo.group_name;
        }
        if ((i4 & 4) != 0) {
            d = groupRewardInfo.reward_amount;
        }
        if ((i4 & 8) != 0) {
            i2 = groupRewardInfo.total_points;
        }
        if ((i4 & 16) != 0) {
            i3 = groupRewardInfo.checked_points;
        }
        if ((i4 & 32) != 0) {
            z = groupRewardInfo.completed;
        }
        boolean z2 = z;
        int i5 = i2;
        double d2 = d;
        return groupRewardInfo.copy(i, str, d2, i5, i3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPoint_group() {
        return this.point_group;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroup_name() {
        return this.group_name;
    }

    /* renamed from: component3, reason: from getter */
    public final double getReward_amount() {
        return this.reward_amount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotal_points() {
        return this.total_points;
    }

    /* renamed from: component5, reason: from getter */
    public final int getChecked_points() {
        return this.checked_points;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    public final GroupRewardInfo copy(int point_group, String group_name, double reward_amount, int total_points, int checked_points, boolean completed) {
        Intrinsics.checkNotNullParameter(group_name, "group_name");
        return new GroupRewardInfo(point_group, group_name, reward_amount, total_points, checked_points, completed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupRewardInfo)) {
            return false;
        }
        GroupRewardInfo groupRewardInfo = (GroupRewardInfo) other;
        return this.point_group == groupRewardInfo.point_group && Intrinsics.areEqual(this.group_name, groupRewardInfo.group_name) && Double.compare(this.reward_amount, groupRewardInfo.reward_amount) == 0 && this.total_points == groupRewardInfo.total_points && this.checked_points == groupRewardInfo.checked_points && this.completed == groupRewardInfo.completed;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.point_group) * 31) + this.group_name.hashCode()) * 31) + Double.hashCode(this.reward_amount)) * 31) + Integer.hashCode(this.total_points)) * 31) + Integer.hashCode(this.checked_points)) * 31) + Boolean.hashCode(this.completed);
    }

    public String toString() {
        return "GroupRewardInfo(point_group=" + this.point_group + ", group_name=" + this.group_name + ", reward_amount=" + this.reward_amount + ", total_points=" + this.total_points + ", checked_points=" + this.checked_points + ", completed=" + this.completed + Separators.RPAREN;
    }

    public GroupRewardInfo(int i, String group_name, double d, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(group_name, "group_name");
        this.point_group = i;
        this.group_name = group_name;
        this.reward_amount = d;
        this.total_points = i2;
        this.checked_points = i3;
        this.completed = z;
    }

    public final int getPoint_group() {
        return this.point_group;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GroupRewardInfo(int r2, java.lang.String r3, double r4, int r6, int r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 1
        L5:
            r10 = r9 & 2
            if (r10 == 0) goto Lb
            java.lang.String r3 = ""
        Lb:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = 0
        L11:
            r10 = r9 & 8
            r0 = 0
            if (r10 == 0) goto L17
            r6 = r0
        L17:
            r10 = r9 & 16
            if (r10 == 0) goto L1c
            r7 = r0
        L1c:
            r9 = r9 & 32
            if (r9 == 0) goto L24
            r10 = r0
            r8 = r6
            r9 = r7
            goto L27
        L24:
            r10 = r8
            r9 = r7
            r8 = r6
        L27:
            r6 = r4
            r4 = r2
            r5 = r3
            r3 = r1
            r3.<init>(r4, r5, r6, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.gift.GroupRewardInfo.<init>(int, java.lang.String, double, int, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getGroup_name() {
        return this.group_name;
    }

    public final double getReward_amount() {
        return this.reward_amount;
    }

    public final int getTotal_points() {
        return this.total_points;
    }

    public final int getChecked_points() {
        return this.checked_points;
    }

    public final boolean getCompleted() {
        return this.completed;
    }
}
