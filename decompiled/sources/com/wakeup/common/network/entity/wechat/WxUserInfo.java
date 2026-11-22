package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/WxUserInfo;", "", "alias", "", "wxid", Constants.BundleKey.NICKNAME, "mobile", "smallHeadImgUrl", "regCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlias", "()Ljava/lang/String;", "getWxid", "getNickName", "getMobile", "getSmallHeadImgUrl", "getRegCountry", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WxUserInfo {
    private final String alias;
    private final String mobile;
    private final String nickName;
    private final String regCountry;
    private final String smallHeadImgUrl;
    private final String wxid;

    public static /* synthetic */ WxUserInfo copy$default(WxUserInfo wxUserInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wxUserInfo.alias;
        }
        if ((i & 2) != 0) {
            str2 = wxUserInfo.wxid;
        }
        if ((i & 4) != 0) {
            str3 = wxUserInfo.nickName;
        }
        if ((i & 8) != 0) {
            str4 = wxUserInfo.mobile;
        }
        if ((i & 16) != 0) {
            str5 = wxUserInfo.smallHeadImgUrl;
        }
        if ((i & 32) != 0) {
            str6 = wxUserInfo.regCountry;
        }
        String str7 = str5;
        String str8 = str6;
        return wxUserInfo.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWxid() {
        return this.wxid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSmallHeadImgUrl() {
        return this.smallHeadImgUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRegCountry() {
        return this.regCountry;
    }

    public final WxUserInfo copy(String alias, String wxid, String nickName, String mobile, String smallHeadImgUrl, String regCountry) {
        Intrinsics.checkNotNullParameter(wxid, "wxid");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(smallHeadImgUrl, "smallHeadImgUrl");
        Intrinsics.checkNotNullParameter(regCountry, "regCountry");
        return new WxUserInfo(alias, wxid, nickName, mobile, smallHeadImgUrl, regCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WxUserInfo)) {
            return false;
        }
        WxUserInfo wxUserInfo = (WxUserInfo) other;
        return Intrinsics.areEqual(this.alias, wxUserInfo.alias) && Intrinsics.areEqual(this.wxid, wxUserInfo.wxid) && Intrinsics.areEqual(this.nickName, wxUserInfo.nickName) && Intrinsics.areEqual(this.mobile, wxUserInfo.mobile) && Intrinsics.areEqual(this.smallHeadImgUrl, wxUserInfo.smallHeadImgUrl) && Intrinsics.areEqual(this.regCountry, wxUserInfo.regCountry);
    }

    public int hashCode() {
        String str = this.alias;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.wxid.hashCode()) * 31) + this.nickName.hashCode()) * 31) + this.mobile.hashCode()) * 31) + this.smallHeadImgUrl.hashCode()) * 31) + this.regCountry.hashCode();
    }

    public String toString() {
        return "WxUserInfo(alias=" + this.alias + ", wxid=" + this.wxid + ", nickName=" + this.nickName + ", mobile=" + this.mobile + ", smallHeadImgUrl=" + this.smallHeadImgUrl + ", regCountry=" + this.regCountry + Separators.RPAREN;
    }

    public WxUserInfo(String str, String wxid, String nickName, String mobile, String smallHeadImgUrl, String regCountry) {
        Intrinsics.checkNotNullParameter(wxid, "wxid");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(smallHeadImgUrl, "smallHeadImgUrl");
        Intrinsics.checkNotNullParameter(regCountry, "regCountry");
        this.alias = str;
        this.wxid = wxid;
        this.nickName = nickName;
        this.mobile = mobile;
        this.smallHeadImgUrl = smallHeadImgUrl;
        this.regCountry = regCountry;
    }

    public final String getAlias() {
        return this.alias;
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

    public final String getSmallHeadImgUrl() {
        return this.smallHeadImgUrl;
    }

    public final String getRegCountry() {
        return this.regCountry;
    }
}
