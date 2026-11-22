package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import com.wakeup.common.network.entity.friend.FriendHomeBean;
import com.wakeup.common.network.entity.health.HealthUserCalculateDataBean;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FriendUserAllDataBean.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\t\u0010-\u001a\u00020\u000bHÆ\u0003JT\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00067"}, d2 = {"Lcom/wakeup/common/network/entity/friend/FriendUserAllDataBean;", "Ljava/io/Serializable;", "friendUserBasicData", "Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendUserInfo;", "dataFunctionIds", "", "locationVo", "Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendLocationBean;", "userRecentlyInfoVo", "Lcom/wakeup/common/network/entity/health/HealthUserCalculateDataBean;", "userId", "", "time", "<init>", "(Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendUserInfo;Ljava/lang/String;Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendLocationBean;Lcom/wakeup/common/network/entity/health/HealthUserCalculateDataBean;Ljava/lang/Long;J)V", "getFriendUserBasicData", "()Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendUserInfo;", "setFriendUserBasicData", "(Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendUserInfo;)V", "getDataFunctionIds", "()Ljava/lang/String;", "setDataFunctionIds", "(Ljava/lang/String;)V", "getLocationVo", "()Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendLocationBean;", "setLocationVo", "(Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendLocationBean;)V", "getUserRecentlyInfoVo", "()Lcom/wakeup/common/network/entity/health/HealthUserCalculateDataBean;", "setUserRecentlyInfoVo", "(Lcom/wakeup/common/network/entity/health/HealthUserCalculateDataBean;)V", "getUserId", "()Ljava/lang/Long;", "setUserId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendUserInfo;Ljava/lang/String;Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendLocationBean;Lcom/wakeup/common/network/entity/health/HealthUserCalculateDataBean;Ljava/lang/Long;J)Lcom/wakeup/common/network/entity/friend/FriendUserAllDataBean;", "equals", "", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FriendUserAllDataBean implements Serializable {
    private String dataFunctionIds;
    private FriendHomeBean.FriendUserInfo friendUserBasicData;
    private FriendHomeBean.FriendLocationBean locationVo;
    private long time;
    private Long userId;
    private HealthUserCalculateDataBean userRecentlyInfoVo;

    public FriendUserAllDataBean() {
        this(null, null, null, null, null, 0L, 63, null);
    }

    public static /* synthetic */ FriendUserAllDataBean copy$default(FriendUserAllDataBean friendUserAllDataBean, FriendHomeBean.FriendUserInfo friendUserInfo, String str, FriendHomeBean.FriendLocationBean friendLocationBean, HealthUserCalculateDataBean healthUserCalculateDataBean, Long l, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            friendUserInfo = friendUserAllDataBean.friendUserBasicData;
        }
        if ((i & 2) != 0) {
            str = friendUserAllDataBean.dataFunctionIds;
        }
        if ((i & 4) != 0) {
            friendLocationBean = friendUserAllDataBean.locationVo;
        }
        if ((i & 8) != 0) {
            healthUserCalculateDataBean = friendUserAllDataBean.userRecentlyInfoVo;
        }
        if ((i & 16) != 0) {
            l = friendUserAllDataBean.userId;
        }
        if ((i & 32) != 0) {
            j = friendUserAllDataBean.time;
        }
        long j2 = j;
        Long l2 = l;
        FriendHomeBean.FriendLocationBean friendLocationBean2 = friendLocationBean;
        return friendUserAllDataBean.copy(friendUserInfo, str, friendLocationBean2, healthUserCalculateDataBean, l2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final FriendHomeBean.FriendUserInfo getFriendUserBasicData() {
        return this.friendUserBasicData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDataFunctionIds() {
        return this.dataFunctionIds;
    }

    /* renamed from: component3, reason: from getter */
    public final FriendHomeBean.FriendLocationBean getLocationVo() {
        return this.locationVo;
    }

    /* renamed from: component4, reason: from getter */
    public final HealthUserCalculateDataBean getUserRecentlyInfoVo() {
        return this.userRecentlyInfoVo;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final FriendUserAllDataBean copy(FriendHomeBean.FriendUserInfo friendUserBasicData, String dataFunctionIds, FriendHomeBean.FriendLocationBean locationVo, HealthUserCalculateDataBean userRecentlyInfoVo, Long userId, long time) {
        return new FriendUserAllDataBean(friendUserBasicData, dataFunctionIds, locationVo, userRecentlyInfoVo, userId, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendUserAllDataBean)) {
            return false;
        }
        FriendUserAllDataBean friendUserAllDataBean = (FriendUserAllDataBean) other;
        return Intrinsics.areEqual(this.friendUserBasicData, friendUserAllDataBean.friendUserBasicData) && Intrinsics.areEqual(this.dataFunctionIds, friendUserAllDataBean.dataFunctionIds) && Intrinsics.areEqual(this.locationVo, friendUserAllDataBean.locationVo) && Intrinsics.areEqual(this.userRecentlyInfoVo, friendUserAllDataBean.userRecentlyInfoVo) && Intrinsics.areEqual(this.userId, friendUserAllDataBean.userId) && this.time == friendUserAllDataBean.time;
    }

    public int hashCode() {
        FriendHomeBean.FriendUserInfo friendUserInfo = this.friendUserBasicData;
        int hashCode = (friendUserInfo == null ? 0 : friendUserInfo.hashCode()) * 31;
        String str = this.dataFunctionIds;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FriendHomeBean.FriendLocationBean friendLocationBean = this.locationVo;
        int hashCode3 = (hashCode2 + (friendLocationBean == null ? 0 : friendLocationBean.hashCode())) * 31;
        HealthUserCalculateDataBean healthUserCalculateDataBean = this.userRecentlyInfoVo;
        int hashCode4 = (hashCode3 + (healthUserCalculateDataBean == null ? 0 : healthUserCalculateDataBean.hashCode())) * 31;
        Long l = this.userId;
        return ((hashCode4 + (l != null ? l.hashCode() : 0)) * 31) + Long.hashCode(this.time);
    }

    public String toString() {
        return "FriendUserAllDataBean(friendUserBasicData=" + this.friendUserBasicData + ", dataFunctionIds=" + this.dataFunctionIds + ", locationVo=" + this.locationVo + ", userRecentlyInfoVo=" + this.userRecentlyInfoVo + ", userId=" + this.userId + ", time=" + this.time + Separators.RPAREN;
    }

    public FriendUserAllDataBean(FriendHomeBean.FriendUserInfo friendUserInfo, String str, FriendHomeBean.FriendLocationBean friendLocationBean, HealthUserCalculateDataBean healthUserCalculateDataBean, Long l, long j) {
        this.friendUserBasicData = friendUserInfo;
        this.dataFunctionIds = str;
        this.locationVo = friendLocationBean;
        this.userRecentlyInfoVo = healthUserCalculateDataBean;
        this.userId = l;
        this.time = j;
    }

    public final FriendHomeBean.FriendUserInfo getFriendUserBasicData() {
        return this.friendUserBasicData;
    }

    public final void setFriendUserBasicData(FriendHomeBean.FriendUserInfo friendUserInfo) {
        this.friendUserBasicData = friendUserInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FriendUserAllDataBean(com.wakeup.common.network.entity.friend.FriendHomeBean.FriendUserInfo r3, java.lang.String r4, com.wakeup.common.network.entity.friend.FriendHomeBean.FriendLocationBean r5, com.wakeup.common.network.entity.health.HealthUserCalculateDataBean r6, java.lang.Long r7, long r8, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r2 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L6
            r3 = r0
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto Lc
            java.lang.String r4 = "3,4,5"
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L11
            r5 = r0
        L11:
            r11 = r10 & 8
            if (r11 == 0) goto L16
            r6 = r0
        L16:
            r11 = r10 & 16
            if (r11 == 0) goto L26
            if (r3 == 0) goto L25
            long r0 = r3.getUserId()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            goto L26
        L25:
            r7 = r0
        L26:
            r10 = r10 & 32
            if (r10 == 0) goto L2e
            long r8 = java.lang.System.currentTimeMillis()
        L2e:
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.friend.FriendUserAllDataBean.<init>(com.wakeup.common.network.entity.friend.FriendHomeBean$FriendUserInfo, java.lang.String, com.wakeup.common.network.entity.friend.FriendHomeBean$FriendLocationBean, com.wakeup.common.network.entity.health.HealthUserCalculateDataBean, java.lang.Long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getDataFunctionIds() {
        return this.dataFunctionIds;
    }

    public final void setDataFunctionIds(String str) {
        this.dataFunctionIds = str;
    }

    public final FriendHomeBean.FriendLocationBean getLocationVo() {
        return this.locationVo;
    }

    public final void setLocationVo(FriendHomeBean.FriendLocationBean friendLocationBean) {
        this.locationVo = friendLocationBean;
    }

    public final HealthUserCalculateDataBean getUserRecentlyInfoVo() {
        return this.userRecentlyInfoVo;
    }

    public final void setUserRecentlyInfoVo(HealthUserCalculateDataBean healthUserCalculateDataBean) {
        this.userRecentlyInfoVo = healthUserCalculateDataBean;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final void setUserId(Long l) {
        this.userId = l;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setTime(long j) {
        this.time = j;
    }
}
