package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/FindUserInfo;", "", "userName", "", "nickname", "remark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserName", "()Ljava/lang/String;", "getNickname", "getRemark", "getWxId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FindUserInfo {
    private final String nickname;
    private final String remark;
    private final String userName;

    public static /* synthetic */ FindUserInfo copy$default(FindUserInfo findUserInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = findUserInfo.userName;
        }
        if ((i & 2) != 0) {
            str2 = findUserInfo.nickname;
        }
        if ((i & 4) != 0) {
            str3 = findUserInfo.remark;
        }
        return findUserInfo.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    public final FindUserInfo copy(String userName, String nickname, String remark) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        return new FindUserInfo(userName, nickname, remark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FindUserInfo)) {
            return false;
        }
        FindUserInfo findUserInfo = (FindUserInfo) other;
        return Intrinsics.areEqual(this.userName, findUserInfo.userName) && Intrinsics.areEqual(this.nickname, findUserInfo.nickname) && Intrinsics.areEqual(this.remark, findUserInfo.remark);
    }

    public int hashCode() {
        int hashCode = this.userName.hashCode() * 31;
        String str = this.nickname;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remark;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FindUserInfo(userName=" + this.userName + ", nickname=" + this.nickname + ", remark=" + this.remark + Separators.RPAREN;
    }

    public FindUserInfo(String userName, String str, String str2) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.userName = userName;
        this.nickname = str;
        this.remark = str2;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getWxId() {
        return this.userName;
    }
}
