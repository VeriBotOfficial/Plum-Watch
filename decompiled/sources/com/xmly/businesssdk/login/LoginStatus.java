package com.xmly.businesssdk.login;

import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xmly/businesssdk/login/LoginStatus;", "", "isLogin", "", "loginType", "Lcom/xmly/businesssdk/login/LoginType;", "hasValidToken", "hasUserProfile", "accessToken", "", "(ZLcom/xmly/businesssdk/login/LoginType;ZZLjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getHasUserProfile", "()Z", "getHasValidToken", "getLoginType", "()Lcom/xmly/businesssdk/login/LoginType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginStatus {
    private final String accessToken;
    private final boolean hasUserProfile;
    private final boolean hasValidToken;
    private final boolean isLogin;
    private final LoginType loginType;

    public LoginStatus(boolean z, LoginType loginType, boolean z2, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        this.isLogin = z;
        this.loginType = loginType;
        this.hasValidToken = z2;
        this.hasUserProfile = z3;
        this.accessToken = str;
    }

    public static /* synthetic */ LoginStatus copy$default(LoginStatus loginStatus, boolean z, LoginType loginType, boolean z2, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loginStatus.isLogin;
        }
        if ((i & 2) != 0) {
            loginType = loginStatus.loginType;
        }
        if ((i & 4) != 0) {
            z2 = loginStatus.hasValidToken;
        }
        if ((i & 8) != 0) {
            z3 = loginStatus.hasUserProfile;
        }
        if ((i & 16) != 0) {
            str = loginStatus.accessToken;
        }
        String str2 = str;
        boolean z4 = z2;
        return loginStatus.copy(z, loginType, z4, z3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLogin() {
        return this.isLogin;
    }

    /* renamed from: component2, reason: from getter */
    public final LoginType getLoginType() {
        return this.loginType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasValidToken() {
        return this.hasValidToken;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasUserProfile() {
        return this.hasUserProfile;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final LoginStatus copy(boolean isLogin, LoginType loginType, boolean hasValidToken, boolean hasUserProfile, String accessToken) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        return new LoginStatus(isLogin, loginType, hasValidToken, hasUserProfile, accessToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginStatus)) {
            return false;
        }
        LoginStatus loginStatus = (LoginStatus) other;
        return this.isLogin == loginStatus.isLogin && this.loginType == loginStatus.loginType && this.hasValidToken == loginStatus.hasValidToken && this.hasUserProfile == loginStatus.hasUserProfile && Intrinsics.areEqual(this.accessToken, loginStatus.accessToken);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final boolean getHasUserProfile() {
        return this.hasUserProfile;
    }

    public final boolean getHasValidToken() {
        return this.hasValidToken;
    }

    public final LoginType getLoginType() {
        return this.loginType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public int hashCode() {
        boolean z = this.isLogin;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.loginType.hashCode() + (r0 * 31)) * 31;
        ?? r02 = this.hasValidToken;
        int i = r02;
        if (r02 != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.hasUserProfile;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str = this.accessToken;
        return i3 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isLogin() {
        return this.isLogin;
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("LoginStatus(isLogin=").append(this.isLogin).append(", loginType=").append(this.loginType).append(", hasValidToken=").append(this.hasValidToken).append(", hasUserProfile=").append(this.hasUserProfile).append(", accessToken="), this.accessToken, ')');
    }
}
