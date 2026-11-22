package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PusherInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/video/ABPost;", "", "trafficConfigId", "", "removeConfigsAtomicKey", "", "user", "Lcom/wakeup/common/network/entity/video/UserInfo;", "<init>", "(Ljava/lang/String;ZLcom/wakeup/common/network/entity/video/UserInfo;)V", "getTrafficConfigId", "()Ljava/lang/String;", "getRemoveConfigsAtomicKey", "()Z", "getUser", "()Lcom/wakeup/common/network/entity/video/UserInfo;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ABPost {
    private final boolean removeConfigsAtomicKey;
    private final String trafficConfigId;
    private final UserInfo user;

    public static /* synthetic */ ABPost copy$default(ABPost aBPost, String str, boolean z, UserInfo userInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aBPost.trafficConfigId;
        }
        if ((i & 2) != 0) {
            z = aBPost.removeConfigsAtomicKey;
        }
        if ((i & 4) != 0) {
            userInfo = aBPost.user;
        }
        return aBPost.copy(str, z, userInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTrafficConfigId() {
        return this.trafficConfigId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRemoveConfigsAtomicKey() {
        return this.removeConfigsAtomicKey;
    }

    /* renamed from: component3, reason: from getter */
    public final UserInfo getUser() {
        return this.user;
    }

    public final ABPost copy(String trafficConfigId, boolean removeConfigsAtomicKey, UserInfo user) {
        Intrinsics.checkNotNullParameter(trafficConfigId, "trafficConfigId");
        Intrinsics.checkNotNullParameter(user, "user");
        return new ABPost(trafficConfigId, removeConfigsAtomicKey, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ABPost)) {
            return false;
        }
        ABPost aBPost = (ABPost) other;
        return Intrinsics.areEqual(this.trafficConfigId, aBPost.trafficConfigId) && this.removeConfigsAtomicKey == aBPost.removeConfigsAtomicKey && Intrinsics.areEqual(this.user, aBPost.user);
    }

    public int hashCode() {
        return (((this.trafficConfigId.hashCode() * 31) + Boolean.hashCode(this.removeConfigsAtomicKey)) * 31) + this.user.hashCode();
    }

    public String toString() {
        return "ABPost(trafficConfigId=" + this.trafficConfigId + ", removeConfigsAtomicKey=" + this.removeConfigsAtomicKey + ", user=" + this.user + Separators.RPAREN;
    }

    public ABPost(String trafficConfigId, boolean z, UserInfo user) {
        Intrinsics.checkNotNullParameter(trafficConfigId, "trafficConfigId");
        Intrinsics.checkNotNullParameter(user, "user");
        this.trafficConfigId = trafficConfigId;
        this.removeConfigsAtomicKey = z;
        this.user = user;
    }

    public final String getTrafficConfigId() {
        return this.trafficConfigId;
    }

    public final boolean getRemoveConfigsAtomicKey() {
        return this.removeConfigsAtomicKey;
    }

    public final UserInfo getUser() {
        return this.user;
    }
}
