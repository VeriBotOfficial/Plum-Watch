package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0014¨\u0006-"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/LoginCheckBean;", "", "status", "", "url", "", "headImgUrl", Constants.BundleKey.NICKNAME, "loginInfo", "Lcom/wakeup/common/network/entity/wechat/LoginInfo;", "code", "msg", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/wechat/LoginInfo;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()I", "getUrl", "()Ljava/lang/String;", "getHeadImgUrl", "setHeadImgUrl", "(Ljava/lang/String;)V", "getNickName", "setNickName", "getLoginInfo", "()Lcom/wakeup/common/network/entity/wechat/LoginInfo;", "getCode", "getMsg", "avatarCachePath", "getAvatarCachePath", "setAvatarCachePath", "isVerificationCode", "", "isCancelLogin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginCheckBean {
    private String avatarCachePath;
    private final String code;
    private String headImgUrl;
    private final LoginInfo loginInfo;
    private final String msg;
    private String nickName;
    private final int status;
    private final String url;

    public static /* synthetic */ LoginCheckBean copy$default(LoginCheckBean loginCheckBean, int i, String str, String str2, String str3, LoginInfo loginInfo, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = loginCheckBean.status;
        }
        if ((i2 & 2) != 0) {
            str = loginCheckBean.url;
        }
        if ((i2 & 4) != 0) {
            str2 = loginCheckBean.headImgUrl;
        }
        if ((i2 & 8) != 0) {
            str3 = loginCheckBean.nickName;
        }
        if ((i2 & 16) != 0) {
            loginInfo = loginCheckBean.loginInfo;
        }
        if ((i2 & 32) != 0) {
            str4 = loginCheckBean.code;
        }
        if ((i2 & 64) != 0) {
            str5 = loginCheckBean.msg;
        }
        String str6 = str4;
        String str7 = str5;
        LoginInfo loginInfo2 = loginInfo;
        String str8 = str2;
        return loginCheckBean.copy(i, str, str8, str3, loginInfo2, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeadImgUrl() {
        return this.headImgUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* renamed from: component5, reason: from getter */
    public final LoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final LoginCheckBean copy(int status, String url, String headImgUrl, String nickName, LoginInfo loginInfo, String code, String msg) {
        return new LoginCheckBean(status, url, headImgUrl, nickName, loginInfo, code, msg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginCheckBean)) {
            return false;
        }
        LoginCheckBean loginCheckBean = (LoginCheckBean) other;
        return this.status == loginCheckBean.status && Intrinsics.areEqual(this.url, loginCheckBean.url) && Intrinsics.areEqual(this.headImgUrl, loginCheckBean.headImgUrl) && Intrinsics.areEqual(this.nickName, loginCheckBean.nickName) && Intrinsics.areEqual(this.loginInfo, loginCheckBean.loginInfo) && Intrinsics.areEqual(this.code, loginCheckBean.code) && Intrinsics.areEqual(this.msg, loginCheckBean.msg);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.status) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.headImgUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LoginInfo loginInfo = this.loginInfo;
        int hashCode5 = (hashCode4 + (loginInfo == null ? 0 : loginInfo.hashCode())) * 31;
        String str4 = this.code;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.msg;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "LoginCheckBean(status=" + this.status + ", url=" + this.url + ", headImgUrl=" + this.headImgUrl + ", nickName=" + this.nickName + ", loginInfo=" + this.loginInfo + ", code=" + this.code + ", msg=" + this.msg + Separators.RPAREN;
    }

    public LoginCheckBean(int i, String str, String str2, String str3, LoginInfo loginInfo, String str4, String str5) {
        this.status = i;
        this.url = str;
        this.headImgUrl = str2;
        this.nickName = str3;
        this.loginInfo = loginInfo;
        this.code = str4;
        this.msg = str5;
        this.avatarCachePath = "";
    }

    public /* synthetic */ LoginCheckBean(int i, String str, String str2, String str3, LoginInfo loginInfo, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, loginInfo, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5);
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getHeadImgUrl() {
        return this.headImgUrl;
    }

    public final void setHeadImgUrl(String str) {
        this.headImgUrl = str;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final LoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getAvatarCachePath() {
        return this.avatarCachePath;
    }

    public final void setAvatarCachePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatarCachePath = str;
    }

    public final boolean isVerificationCode() {
        return Intrinsics.areEqual(this.code, "-1") && Intrinsics.areEqual(this.msg, "本次登录需要验证操作");
    }

    public final boolean isCancelLogin() {
        return Intrinsics.areEqual(this.code, "-1") && Intrinsics.areEqual(this.msg, "请重新获取登录二维码,进行扫码登录");
    }
}
