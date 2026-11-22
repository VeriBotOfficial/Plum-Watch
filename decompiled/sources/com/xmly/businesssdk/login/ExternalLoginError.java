package com.xmly.businesssdk.login;

import kotlin.Metadata;

/* compiled from: ExternalLoginManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/xmly/businesssdk/login/ExternalLoginError;", "", "code", "", "message", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "INVALID_TICKET", "INVALID_MOBILE", "LOGIN_FAILED", "NETWORK_ERROR", "TOKEN_REFRESH_FAILED", "TOKEN_EXPIRED", "THIRD_PARTY_AUTH_FAILED", "THIRD_PARTY_NOT_BOUND", "THIRD_PARTY_SERVICE_ERROR", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum ExternalLoginError {
    INVALID_TICKET(1001, "无效的登录票据"),
    INVALID_MOBILE(1002, "无效的手机号"),
    LOGIN_FAILED(1003, "登录失败"),
    NETWORK_ERROR(1004, "网络错误"),
    TOKEN_REFRESH_FAILED(1005, "Token刷新失败"),
    TOKEN_EXPIRED(1006, "Token已过期"),
    THIRD_PARTY_AUTH_FAILED(50001001, "三方鉴权信息失败"),
    THIRD_PARTY_NOT_BOUND(50001002, "未绑定喜马账号"),
    THIRD_PARTY_SERVICE_ERROR(500, "服务异常");

    private final int code;
    private final String message;

    ExternalLoginError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
