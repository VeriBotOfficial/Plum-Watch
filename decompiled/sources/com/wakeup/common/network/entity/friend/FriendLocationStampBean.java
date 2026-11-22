package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FriendLocationStampBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/friend/FriendLocationStampBean;", "", "userLocationDates", "", "Lcom/wakeup/common/network/entity/friend/FriendLocationStampBean$LocationDates;", "<init>", "(Ljava/util/List;)V", "getUserLocationDates", "()Ljava/util/List;", "setUserLocationDates", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LocationDates", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FriendLocationStampBean {
    private List<LocationDates> userLocationDates;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendLocationStampBean copy$default(FriendLocationStampBean friendLocationStampBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = friendLocationStampBean.userLocationDates;
        }
        return friendLocationStampBean.copy(list);
    }

    public final List<LocationDates> component1() {
        return this.userLocationDates;
    }

    public final FriendLocationStampBean copy(List<LocationDates> userLocationDates) {
        return new FriendLocationStampBean(userLocationDates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FriendLocationStampBean) && Intrinsics.areEqual(this.userLocationDates, ((FriendLocationStampBean) other).userLocationDates);
    }

    public int hashCode() {
        List<LocationDates> list = this.userLocationDates;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "FriendLocationStampBean(userLocationDates=" + this.userLocationDates + Separators.RPAREN;
    }

    /* compiled from: FriendLocationStampBean.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/friend/FriendLocationStampBean$LocationDates;", "", "userId", "", "timestamp", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getUserId", "()Ljava/lang/Long;", "setUserId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTimestamp", "setTimestamp", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/wakeup/common/network/entity/friend/FriendLocationStampBean$LocationDates;", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationDates {
        private Long timestamp;
        private Long userId;

        public static /* synthetic */ LocationDates copy$default(LocationDates locationDates, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = locationDates.userId;
            }
            if ((i & 2) != 0) {
                l2 = locationDates.timestamp;
            }
            return locationDates.copy(l, l2);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getUserId() {
            return this.userId;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        public final LocationDates copy(Long userId, Long timestamp) {
            return new LocationDates(userId, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationDates)) {
                return false;
            }
            LocationDates locationDates = (LocationDates) other;
            return Intrinsics.areEqual(this.userId, locationDates.userId) && Intrinsics.areEqual(this.timestamp, locationDates.timestamp);
        }

        public int hashCode() {
            Long l = this.userId;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.timestamp;
            return hashCode + (l2 != null ? l2.hashCode() : 0);
        }

        public String toString() {
            return "LocationDates(userId=" + this.userId + ", timestamp=" + this.timestamp + Separators.RPAREN;
        }

        public LocationDates(Long l, Long l2) {
            this.userId = l;
            this.timestamp = l2;
        }

        public final Long getTimestamp() {
            return this.timestamp;
        }

        public final Long getUserId() {
            return this.userId;
        }

        public final void setTimestamp(Long l) {
            this.timestamp = l;
        }

        public final void setUserId(Long l) {
            this.userId = l;
        }
    }

    public FriendLocationStampBean(List<LocationDates> list) {
        this.userLocationDates = list;
    }

    public final List<LocationDates> getUserLocationDates() {
        return this.userLocationDates;
    }

    public final void setUserLocationDates(List<LocationDates> list) {
        this.userLocationDates = list;
    }
}
