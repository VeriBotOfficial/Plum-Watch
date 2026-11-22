package com.xmly.businesssdk.network.bean;

import com.tencent.connect.common.Constants;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/xmly/businesssdk/network/bean/OAuth2RefreshToken;", "", "access_token", "", "refresh_token", "uid", "", "device_id", Constants.PARAM_EXPIRES_IN, "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V", "getAccess_token", "()Ljava/lang/String;", "getDevice_id", "getExpires_in", "()J", "getRefresh_token", "getUid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OAuth2RefreshToken {
    private final String access_token;
    private final String device_id;
    private final long expires_in;
    private final String refresh_token;
    private final long uid;

    public OAuth2RefreshToken() {
        this(null, null, 0L, null, 0L, 31, null);
    }

    public OAuth2RefreshToken(String str, String str2, long j, String str3, long j2) {
        this.access_token = str;
        this.refresh_token = str2;
        this.uid = j;
        this.device_id = str3;
        this.expires_in = j2;
    }

    public static /* synthetic */ OAuth2RefreshToken copy$default(OAuth2RefreshToken oAuth2RefreshToken, String str, String str2, long j, String str3, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oAuth2RefreshToken.access_token;
        }
        if ((i & 2) != 0) {
            str2 = oAuth2RefreshToken.refresh_token;
        }
        if ((i & 4) != 0) {
            j = oAuth2RefreshToken.uid;
        }
        if ((i & 8) != 0) {
            str3 = oAuth2RefreshToken.device_id;
        }
        if ((i & 16) != 0) {
            j2 = oAuth2RefreshToken.expires_in;
        }
        String str4 = str3;
        long j3 = j;
        return oAuth2RefreshToken.copy(str, str2, j3, str4, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccess_token() {
        return this.access_token;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    /* renamed from: component3, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDevice_id() {
        return this.device_id;
    }

    /* renamed from: component5, reason: from getter */
    public final long getExpires_in() {
        return this.expires_in;
    }

    public final OAuth2RefreshToken copy(String access_token, String refresh_token, long uid, String device_id, long expires_in) {
        return new OAuth2RefreshToken(access_token, refresh_token, uid, device_id, expires_in);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OAuth2RefreshToken)) {
            return false;
        }
        OAuth2RefreshToken oAuth2RefreshToken = (OAuth2RefreshToken) other;
        return Intrinsics.areEqual(this.access_token, oAuth2RefreshToken.access_token) && Intrinsics.areEqual(this.refresh_token, oAuth2RefreshToken.refresh_token) && this.uid == oAuth2RefreshToken.uid && Intrinsics.areEqual(this.device_id, oAuth2RefreshToken.device_id) && this.expires_in == oAuth2RefreshToken.expires_in;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final long getExpires_in() {
        return this.expires_in;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.access_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refresh_token;
        int a2 = a.a(this.uid, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.device_id;
        return Long.hashCode(this.expires_in) + ((a2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        return c.a("OAuth2RefreshToken(access_token=").append(this.access_token).append(", refresh_token=").append(this.refresh_token).append(", uid=").append(this.uid).append(", device_id=").append(this.device_id).append(", expires_in=").append(this.expires_in).append(')').toString();
    }

    public /* synthetic */ OAuth2RefreshToken(String str, String str2, long j, String str3, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? 0L : j2);
    }
}
