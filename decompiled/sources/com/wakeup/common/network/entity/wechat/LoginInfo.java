package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/LoginInfo;", "", "wxid", "", Constants.BundleKey.NICKNAME, "mobile", "alias", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getWxid", "()Ljava/lang/String;", "getNickName", "getMobile", "getAlias", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginInfo {
    private final String alias;
    private final String mobile;
    private final String nickName;
    private final String wxid;

    public static /* synthetic */ LoginInfo copy$default(LoginInfo loginInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginInfo.wxid;
        }
        if ((i & 2) != 0) {
            str2 = loginInfo.nickName;
        }
        if ((i & 4) != 0) {
            str3 = loginInfo.mobile;
        }
        if ((i & 8) != 0) {
            str4 = loginInfo.alias;
        }
        return loginInfo.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWxid() {
        return this.wxid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    public final LoginInfo copy(String wxid, String nickName, String mobile, String alias) {
        Intrinsics.checkNotNullParameter(wxid, "wxid");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        return new LoginInfo(wxid, nickName, mobile, alias);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) other;
        return Intrinsics.areEqual(this.wxid, loginInfo.wxid) && Intrinsics.areEqual(this.nickName, loginInfo.nickName) && Intrinsics.areEqual(this.mobile, loginInfo.mobile) && Intrinsics.areEqual(this.alias, loginInfo.alias);
    }

    public int hashCode() {
        int hashCode = ((((this.wxid.hashCode() * 31) + this.nickName.hashCode()) * 31) + this.mobile.hashCode()) * 31;
        String str = this.alias;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LoginInfo(wxid=" + this.wxid + ", nickName=" + this.nickName + ", mobile=" + this.mobile + ", alias=" + this.alias + Separators.RPAREN;
    }

    public LoginInfo(String wxid, String nickName, String mobile, String str) {
        Intrinsics.checkNotNullParameter(wxid, "wxid");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        this.wxid = wxid;
        this.nickName = nickName;
        this.mobile = mobile;
        this.alias = str;
    }

    public final String getWxid() {
        return this.wxid;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getAlias() {
        return this.alias;
    }
}
