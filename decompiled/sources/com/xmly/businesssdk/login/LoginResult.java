package com.xmly.businesssdk.login;

import com.xmly.businesssdk.config.a;
import com.xmly.businesssdk.config.c;
import com.xmly.businesssdk.network.bean.TokenInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginManager.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/xmly/businesssdk/login/LoginResult;", "", "isSuccess", "", "loginType", "Lcom/xmly/businesssdk/login/LoginType;", "tokenInfo", "Lcom/xmly/businesssdk/network/bean/TokenInfo;", "message", "", "error", "(ZLcom/xmly/businesssdk/login/LoginType;Lcom/xmly/businesssdk/network/bean/TokenInfo;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "()Z", "getLoginType", "()Lcom/xmly/businesssdk/login/LoginType;", "getMessage", "getTokenInfo", "()Lcom/xmly/businesssdk/network/bean/TokenInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String error;
    private final boolean isSuccess;
    private final LoginType loginType;
    private final String message;
    private final TokenInfo tokenInfo;

    /* compiled from: LoginManager.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ$\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\b¨\u0006\r"}, d2 = {"Lcom/xmly/businesssdk/login/LoginResult$Companion;", "", "()V", "failure", "Lcom/xmly/businesssdk/login/LoginResult;", "loginType", "Lcom/xmly/businesssdk/login/LoginType;", "error", "", "success", "tokenInfo", "Lcom/xmly/businesssdk/network/bean/TokenInfo;", "message", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LoginResult success$default(Companion companion, LoginType loginType, TokenInfo tokenInfo, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                tokenInfo = null;
            }
            if ((i & 4) != 0) {
                str = "登录成功";
            }
            return companion.success(loginType, tokenInfo, str);
        }

        public final LoginResult failure(LoginType loginType, String error) {
            Intrinsics.checkNotNullParameter(loginType, "loginType");
            Intrinsics.checkNotNullParameter(error, "error");
            return new LoginResult(false, loginType, null, "", error);
        }

        public final LoginResult success(LoginType loginType, TokenInfo tokenInfo, String message) {
            Intrinsics.checkNotNullParameter(loginType, "loginType");
            Intrinsics.checkNotNullParameter(message, "message");
            return new LoginResult(true, loginType, tokenInfo, message, null, 16, null);
        }
    }

    public LoginResult(boolean z, LoginType loginType, TokenInfo tokenInfo, String message, String error) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        this.isSuccess = z;
        this.loginType = loginType;
        this.tokenInfo = tokenInfo;
        this.message = message;
        this.error = error;
    }

    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, boolean z, LoginType loginType, TokenInfo tokenInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loginResult.isSuccess;
        }
        if ((i & 2) != 0) {
            loginType = loginResult.loginType;
        }
        if ((i & 4) != 0) {
            tokenInfo = loginResult.tokenInfo;
        }
        if ((i & 8) != 0) {
            str = loginResult.message;
        }
        if ((i & 16) != 0) {
            str2 = loginResult.error;
        }
        String str3 = str2;
        TokenInfo tokenInfo2 = tokenInfo;
        return loginResult.copy(z, loginType, tokenInfo2, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final LoginType getLoginType() {
        return this.loginType;
    }

    /* renamed from: component3, reason: from getter */
    public final TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final LoginResult copy(boolean isSuccess, LoginType loginType, TokenInfo tokenInfo, String message, String error) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        return new LoginResult(isSuccess, loginType, tokenInfo, message, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) other;
        return this.isSuccess == loginResult.isSuccess && this.loginType == loginResult.loginType && Intrinsics.areEqual(this.tokenInfo, loginResult.tokenInfo) && Intrinsics.areEqual(this.message, loginResult.message) && Intrinsics.areEqual(this.error, loginResult.error);
    }

    public final String getError() {
        return this.error;
    }

    public final LoginType getLoginType() {
        return this.loginType;
    }

    public final String getMessage() {
        return this.message;
    }

    public final TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.isSuccess;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.loginType.hashCode() + (r0 * 31)) * 31;
        TokenInfo tokenInfo = this.tokenInfo;
        return this.error.hashCode() + a.a(this.message, (hashCode + (tokenInfo == null ? 0 : tokenInfo.hashCode())) * 31, 31);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("LoginResult(isSuccess=").append(this.isSuccess).append(", loginType=").append(this.loginType).append(", tokenInfo=").append(this.tokenInfo).append(", message=").append(this.message).append(", error="), this.error, ')');
    }

    public /* synthetic */ LoginResult(boolean z, LoginType loginType, TokenInfo tokenInfo, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, loginType, (i & 4) != 0 ? null : tokenInfo, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2);
    }
}
