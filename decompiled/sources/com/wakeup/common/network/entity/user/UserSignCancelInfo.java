package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserSignCancelInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/user/UserSignCancelInfo;", "", "eligible", "", "warnMsg", "", "<init>", "(ZLjava/lang/String;)V", "getEligible", "()Z", "getWarnMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserSignCancelInfo {
    private final boolean eligible;
    private final String warnMsg;

    public static /* synthetic */ UserSignCancelInfo copy$default(UserSignCancelInfo userSignCancelInfo, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userSignCancelInfo.eligible;
        }
        if ((i & 2) != 0) {
            str = userSignCancelInfo.warnMsg;
        }
        return userSignCancelInfo.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEligible() {
        return this.eligible;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWarnMsg() {
        return this.warnMsg;
    }

    public final UserSignCancelInfo copy(boolean eligible, String warnMsg) {
        Intrinsics.checkNotNullParameter(warnMsg, "warnMsg");
        return new UserSignCancelInfo(eligible, warnMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSignCancelInfo)) {
            return false;
        }
        UserSignCancelInfo userSignCancelInfo = (UserSignCancelInfo) other;
        return this.eligible == userSignCancelInfo.eligible && Intrinsics.areEqual(this.warnMsg, userSignCancelInfo.warnMsg);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.eligible) * 31) + this.warnMsg.hashCode();
    }

    public String toString() {
        return "UserSignCancelInfo(eligible=" + this.eligible + ", warnMsg=" + this.warnMsg + Separators.RPAREN;
    }

    public UserSignCancelInfo(boolean z, String warnMsg) {
        Intrinsics.checkNotNullParameter(warnMsg, "warnMsg");
        this.eligible = z;
        this.warnMsg = warnMsg;
    }

    public final boolean getEligible() {
        return this.eligible;
    }

    public final String getWarnMsg() {
        return this.warnMsg;
    }
}
