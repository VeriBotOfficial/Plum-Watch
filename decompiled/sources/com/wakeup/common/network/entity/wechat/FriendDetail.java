package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010 \u001a\u00020\u0003H\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/FriendDetail;", "", "wxid", "", "userName", Constants.BundleKey.NICKNAME, "remark", "smallHeadImgUrl", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getWxid", "()Ljava/lang/String;", "getUserName", "getNickName", "setNickName", "(Ljava/lang/String;)V", "getRemark", "setRemark", "getSmallHeadImgUrl", "setSmallHeadImgUrl", "getDisplayName", "setDisplayName", "notifyName", "getNotifyName", "setNotifyName", "cacheTime", "", "getCacheTime", "()J", "setCacheTime", "(J)V", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FriendDetail {
    private long cacheTime;
    private String displayName;
    private String nickName;
    private String notifyName;
    private String remark;
    private String smallHeadImgUrl;
    private final String userName;
    private final String wxid;

    public static /* synthetic */ FriendDetail copy$default(FriendDetail friendDetail, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = friendDetail.wxid;
        }
        if ((i & 2) != 0) {
            str2 = friendDetail.userName;
        }
        if ((i & 4) != 0) {
            str3 = friendDetail.nickName;
        }
        if ((i & 8) != 0) {
            str4 = friendDetail.remark;
        }
        if ((i & 16) != 0) {
            str5 = friendDetail.smallHeadImgUrl;
        }
        if ((i & 32) != 0) {
            str6 = friendDetail.displayName;
        }
        String str7 = str5;
        String str8 = str6;
        return friendDetail.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWxid() {
        return this.wxid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSmallHeadImgUrl() {
        return this.smallHeadImgUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final FriendDetail copy(String wxid, String userName, String nickName, String remark, String smallHeadImgUrl, String displayName) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(smallHeadImgUrl, "smallHeadImgUrl");
        return new FriendDetail(wxid, userName, nickName, remark, smallHeadImgUrl, displayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendDetail)) {
            return false;
        }
        FriendDetail friendDetail = (FriendDetail) other;
        return Intrinsics.areEqual(this.wxid, friendDetail.wxid) && Intrinsics.areEqual(this.userName, friendDetail.userName) && Intrinsics.areEqual(this.nickName, friendDetail.nickName) && Intrinsics.areEqual(this.remark, friendDetail.remark) && Intrinsics.areEqual(this.smallHeadImgUrl, friendDetail.smallHeadImgUrl) && Intrinsics.areEqual(this.displayName, friendDetail.displayName);
    }

    public int hashCode() {
        String str = this.wxid;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.userName.hashCode()) * 31;
        String str2 = this.nickName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remark;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.smallHeadImgUrl.hashCode()) * 31;
        String str4 = this.displayName;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public FriendDetail(String str, String userName, String str2, String str3, String smallHeadImgUrl, String str4) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(smallHeadImgUrl, "smallHeadImgUrl");
        this.wxid = str;
        this.userName = userName;
        this.nickName = str2;
        this.remark = str3;
        this.smallHeadImgUrl = smallHeadImgUrl;
        this.displayName = str4;
        this.notifyName = "";
    }

    public final String getWxid() {
        return this.wxid;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        this.remark = str;
    }

    public final String getSmallHeadImgUrl() {
        return this.smallHeadImgUrl;
    }

    public final void setSmallHeadImgUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.smallHeadImgUrl = str;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final String getNotifyName() {
        return this.notifyName;
    }

    public final void setNotifyName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notifyName = str;
    }

    public final long getCacheTime() {
        return this.cacheTime;
    }

    public final void setCacheTime(long j) {
        this.cacheTime = j;
    }

    public final String wxid() {
        String str = this.wxid;
        return str == null ? this.userName : str;
    }

    public String toString() {
        return "FriendDetail(wxid=" + this.wxid + ", userName=" + this.userName + ", nickName=" + this.nickName + ", remark=" + this.remark + ", smallHeadImgUrl=" + this.smallHeadImgUrl + ", notifyName=" + this.notifyName + ", displayName=" + this.displayName + ", cacheTime=" + this.cacheTime + Separators.RPAREN;
    }
}
