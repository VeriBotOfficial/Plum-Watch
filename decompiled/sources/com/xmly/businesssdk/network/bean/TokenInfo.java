package com.xmly.businesssdk.network.bean;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.gson.annotations.SerializedName;
import com.tencent.connect.common.Constants;
import com.xmly.businesssdk.config.c;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010¨\u0006-"}, d2 = {"Lcom/xmly/businesssdk/network/bean/TokenInfo;", "", "accessToken", "", "refreshToken", "token", "deviceId", "uid", Constants.PARAM_SCOPE, Constants.PARAM_EXPIRES_IN, "", ParameterNames.COOKIE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getCookie", "setCookie", "getDeviceId", "getExpires_in", "()J", "setExpires_in", "(J)V", "getRefreshToken", "setRefreshToken", "getScope", "getToken", "getUid", "setUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TokenInfo {

    @SerializedName("access_token")
    private String accessToken;
    private String cookie;

    @SerializedName("device_id")
    private final String deviceId;
    private long expires_in;

    @SerializedName("refresh_token")
    private String refreshToken;
    private final String scope;
    private final String token;
    private String uid;

    public TokenInfo() {
        this(null, null, null, null, null, null, 0L, null, 255, null);
    }

    public TokenInfo(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.token = str3;
        this.deviceId = str4;
        this.uid = str5;
        this.scope = str6;
        this.expires_in = j;
        this.cookie = str7;
    }

    public static /* synthetic */ TokenInfo copy$default(TokenInfo tokenInfo, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenInfo.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = tokenInfo.refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = tokenInfo.token;
        }
        if ((i & 8) != 0) {
            str4 = tokenInfo.deviceId;
        }
        if ((i & 16) != 0) {
            str5 = tokenInfo.uid;
        }
        if ((i & 32) != 0) {
            str6 = tokenInfo.scope;
        }
        if ((i & 64) != 0) {
            j = tokenInfo.expires_in;
        }
        if ((i & 128) != 0) {
            str7 = tokenInfo.cookie;
        }
        String str8 = str7;
        long j2 = j;
        String str9 = str5;
        String str10 = str6;
        return tokenInfo.copy(str, str2, str3, str4, str9, str10, j2, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component6, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* renamed from: component7, reason: from getter */
    public final long getExpires_in() {
        return this.expires_in;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCookie() {
        return this.cookie;
    }

    public final TokenInfo copy(String accessToken, String refreshToken, String token, String deviceId, String uid, String scope, long expires_in, String cookie) {
        return new TokenInfo(accessToken, refreshToken, token, deviceId, uid, scope, expires_in, cookie);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) other;
        return Intrinsics.areEqual(this.accessToken, tokenInfo.accessToken) && Intrinsics.areEqual(this.refreshToken, tokenInfo.refreshToken) && Intrinsics.areEqual(this.token, tokenInfo.token) && Intrinsics.areEqual(this.deviceId, tokenInfo.deviceId) && Intrinsics.areEqual(this.uid, tokenInfo.uid) && Intrinsics.areEqual(this.scope, tokenInfo.scope) && this.expires_in == tokenInfo.expires_in && Intrinsics.areEqual(this.cookie, tokenInfo.cookie);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getCookie() {
        return this.cookie;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final long getExpires_in() {
        return this.expires_in;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.accessToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refreshToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.uid;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.scope;
        int a2 = a.a(this.expires_in, (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.cookie;
        return a2 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setCookie(String str) {
        this.cookie = str;
    }

    public final void setExpires_in(long j) {
        this.expires_in = j;
    }

    public final void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("TokenInfo(accessToken=").append(this.accessToken).append(", refreshToken=").append(this.refreshToken).append(", token=").append(this.token).append(", deviceId=").append(this.deviceId).append(", uid=").append(this.uid).append(", scope=").append(this.scope).append(", expires_in=").append(this.expires_in).append(", cookie="), this.cookie, ')');
    }

    public /* synthetic */ TokenInfo(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? 0L : j, (i & 128) != 0 ? null : str7);
    }
}
