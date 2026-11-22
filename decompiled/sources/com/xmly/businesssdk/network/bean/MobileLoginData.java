package com.xmly.businesssdk.network.bean;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.gson.annotations.SerializedName;
import com.tencent.connect.common.Constants;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J}\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lcom/xmly/businesssdk/network/bean/MobileLoginData;", "", "accessToken", "", "refreshToken", "osAccessToken", "osRefreshToken", "osExpiresIn", "uid", "", "deviceId", "expiresIn", ParameterNames.COOKIE, "xmUserInfo", "Lcom/xmly/businesssdk/network/bean/Profile;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Lcom/xmly/businesssdk/network/bean/Profile;)V", "getAccessToken", "()Ljava/lang/String;", "getCookie", "getDeviceId", "getExpiresIn", "()J", "getOsAccessToken", "getOsExpiresIn", "getOsRefreshToken", "getRefreshToken", "getUid", "getXmUserInfo", "()Lcom/xmly/businesssdk/network/bean/Profile;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MobileLoginData {

    @SerializedName("access_token")
    private final String accessToken;
    private final String cookie;

    @SerializedName("device_id")
    private final String deviceId;

    @SerializedName(Constants.PARAM_EXPIRES_IN)
    private final long expiresIn;

    @SerializedName("os_access_token")
    private final String osAccessToken;

    @SerializedName("os_expires_in")
    private final String osExpiresIn;

    @SerializedName("os_refresh_token")
    private final String osRefreshToken;

    @SerializedName("refresh_token")
    private final String refreshToken;
    private final long uid;

    @SerializedName("xm_user_info")
    private final Profile xmUserInfo;

    public MobileLoginData() {
        this(null, null, null, null, null, 0L, null, 0L, null, null, 1023, null);
    }

    public MobileLoginData(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, Profile profile) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.osAccessToken = str3;
        this.osRefreshToken = str4;
        this.osExpiresIn = str5;
        this.uid = j;
        this.deviceId = str6;
        this.expiresIn = j2;
        this.cookie = str7;
        this.xmUserInfo = profile;
    }

    public static /* synthetic */ MobileLoginData copy$default(MobileLoginData mobileLoginData, String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, Profile profile, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileLoginData.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = mobileLoginData.refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = mobileLoginData.osAccessToken;
        }
        if ((i & 8) != 0) {
            str4 = mobileLoginData.osRefreshToken;
        }
        if ((i & 16) != 0) {
            str5 = mobileLoginData.osExpiresIn;
        }
        if ((i & 32) != 0) {
            j = mobileLoginData.uid;
        }
        if ((i & 64) != 0) {
            str6 = mobileLoginData.deviceId;
        }
        if ((i & 128) != 0) {
            j2 = mobileLoginData.expiresIn;
        }
        if ((i & 256) != 0) {
            str7 = mobileLoginData.cookie;
        }
        if ((i & 512) != 0) {
            profile = mobileLoginData.xmUserInfo;
        }
        String str8 = str6;
        long j3 = j;
        String str9 = str4;
        String str10 = str5;
        String str11 = str3;
        return mobileLoginData.copy(str, str2, str11, str9, str10, j3, str8, j2, str7, profile);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component10, reason: from getter */
    public final Profile getXmUserInfo() {
        return this.xmUserInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOsAccessToken() {
        return this.osAccessToken;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOsRefreshToken() {
        return this.osRefreshToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOsExpiresIn() {
        return this.osExpiresIn;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component8, reason: from getter */
    public final long getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCookie() {
        return this.cookie;
    }

    public final MobileLoginData copy(String accessToken, String refreshToken, String osAccessToken, String osRefreshToken, String osExpiresIn, long uid, String deviceId, long expiresIn, String cookie, Profile xmUserInfo) {
        return new MobileLoginData(accessToken, refreshToken, osAccessToken, osRefreshToken, osExpiresIn, uid, deviceId, expiresIn, cookie, xmUserInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileLoginData)) {
            return false;
        }
        MobileLoginData mobileLoginData = (MobileLoginData) other;
        return Intrinsics.areEqual(this.accessToken, mobileLoginData.accessToken) && Intrinsics.areEqual(this.refreshToken, mobileLoginData.refreshToken) && Intrinsics.areEqual(this.osAccessToken, mobileLoginData.osAccessToken) && Intrinsics.areEqual(this.osRefreshToken, mobileLoginData.osRefreshToken) && Intrinsics.areEqual(this.osExpiresIn, mobileLoginData.osExpiresIn) && this.uid == mobileLoginData.uid && Intrinsics.areEqual(this.deviceId, mobileLoginData.deviceId) && this.expiresIn == mobileLoginData.expiresIn && Intrinsics.areEqual(this.cookie, mobileLoginData.cookie) && Intrinsics.areEqual(this.xmUserInfo, mobileLoginData.xmUserInfo);
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

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final String getOsAccessToken() {
        return this.osAccessToken;
    }

    public final String getOsExpiresIn() {
        return this.osExpiresIn;
    }

    public final String getOsRefreshToken() {
        return this.osRefreshToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final long getUid() {
        return this.uid;
    }

    public final Profile getXmUserInfo() {
        return this.xmUserInfo;
    }

    public int hashCode() {
        String str = this.accessToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refreshToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.osAccessToken;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.osRefreshToken;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.osExpiresIn;
        int a2 = a.a(this.uid, (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.deviceId;
        int a3 = a.a(this.expiresIn, (a2 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.cookie;
        int hashCode5 = (a3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Profile profile = this.xmUserInfo;
        return hashCode5 + (profile != null ? profile.hashCode() : 0);
    }

    public String toString() {
        return c.a("MobileLoginData(accessToken=").append(this.accessToken).append(", refreshToken=").append(this.refreshToken).append(", osAccessToken=").append(this.osAccessToken).append(", osRefreshToken=").append(this.osRefreshToken).append(", osExpiresIn=").append(this.osExpiresIn).append(", uid=").append(this.uid).append(", deviceId=").append(this.deviceId).append(", expiresIn=").append(this.expiresIn).append(", cookie=").append(this.cookie).append(", xmUserInfo=").append(this.xmUserInfo).append(')').toString();
    }

    public /* synthetic */ MobileLoginData(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, Profile profile, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? j2 : 0L, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : profile);
    }
}
