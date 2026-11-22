package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WechatBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/WechatBean;", "", "userId", "", "openId", "", "unionId", "deviceSn", "wxNickname", "wxAvatar", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()J", "getOpenId", "()Ljava/lang/String;", "getUnionId", "getDeviceSn", "getWxNickname", "getWxAvatar", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WechatBean {
    private final String deviceSn;
    private final String openId;
    private final String unionId;
    private final long userId;
    private final String wxAvatar;
    private final String wxNickname;

    public static /* synthetic */ WechatBean copy$default(WechatBean wechatBean, long j, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = wechatBean.userId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = wechatBean.openId;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = wechatBean.unionId;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = wechatBean.deviceSn;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = wechatBean.wxNickname;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = wechatBean.wxAvatar;
        }
        return wechatBean.copy(j2, str6, str7, str8, str9, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOpenId() {
        return this.openId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUnionId() {
        return this.unionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWxNickname() {
        return this.wxNickname;
    }

    /* renamed from: component6, reason: from getter */
    public final String getWxAvatar() {
        return this.wxAvatar;
    }

    public final WechatBean copy(long userId, String openId, String unionId, String deviceSn, String wxNickname, String wxAvatar) {
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(unionId, "unionId");
        Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
        Intrinsics.checkNotNullParameter(wxNickname, "wxNickname");
        Intrinsics.checkNotNullParameter(wxAvatar, "wxAvatar");
        return new WechatBean(userId, openId, unionId, deviceSn, wxNickname, wxAvatar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WechatBean)) {
            return false;
        }
        WechatBean wechatBean = (WechatBean) other;
        return this.userId == wechatBean.userId && Intrinsics.areEqual(this.openId, wechatBean.openId) && Intrinsics.areEqual(this.unionId, wechatBean.unionId) && Intrinsics.areEqual(this.deviceSn, wechatBean.deviceSn) && Intrinsics.areEqual(this.wxNickname, wechatBean.wxNickname) && Intrinsics.areEqual(this.wxAvatar, wechatBean.wxAvatar);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.userId) * 31) + this.openId.hashCode()) * 31) + this.unionId.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.wxNickname.hashCode()) * 31) + this.wxAvatar.hashCode();
    }

    public String toString() {
        return "WechatBean(userId=" + this.userId + ", openId=" + this.openId + ", unionId=" + this.unionId + ", deviceSn=" + this.deviceSn + ", wxNickname=" + this.wxNickname + ", wxAvatar=" + this.wxAvatar + Separators.RPAREN;
    }

    public WechatBean(long j, String openId, String unionId, String deviceSn, String wxNickname, String wxAvatar) {
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(unionId, "unionId");
        Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
        Intrinsics.checkNotNullParameter(wxNickname, "wxNickname");
        Intrinsics.checkNotNullParameter(wxAvatar, "wxAvatar");
        this.userId = j;
        this.openId = openId;
        this.unionId = unionId;
        this.deviceSn = deviceSn;
        this.wxNickname = wxNickname;
        this.wxAvatar = wxAvatar;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getOpenId() {
        return this.openId;
    }

    public final String getUnionId() {
        return this.unionId;
    }

    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final String getWxNickname() {
        return this.wxNickname;
    }

    public final String getWxAvatar() {
        return this.wxAvatar;
    }
}
