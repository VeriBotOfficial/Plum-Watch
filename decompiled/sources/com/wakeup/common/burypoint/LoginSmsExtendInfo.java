package com.wakeup.common.burypoint;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/burypoint/LoginSmsExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "launchId", "", JsonStorageKeyNames.SESSION_ID_KEY, "to_mode", "result", ApiConstants.ERR_CODE, "fail_type", "cooldown_sec", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getTo_mode", "()Ljava/lang/String;", "setTo_mode", "(Ljava/lang/String;)V", "getResult", "setResult", "getErr_code", "setErr_code", "getFail_type", "setFail_type", "getCooldown_sec", "()I", "setCooldown_sec", "(I)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginSmsExtendInfo extends BaseExtendInfo {
    private int cooldown_sec;
    private String err_code;
    private String fail_type;
    private String result;
    private String to_mode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginSmsExtendInfo(String launchId, String sessionId) {
        this(launchId, sessionId, null, null, null, null, 0, 124, null);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginSmsExtendInfo(String launchId, String sessionId, String to_mode) {
        this(launchId, sessionId, to_mode, null, null, null, 0, 120, null);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(to_mode, "to_mode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginSmsExtendInfo(String launchId, String sessionId, String to_mode, String result) {
        this(launchId, sessionId, to_mode, result, null, null, 0, 112, null);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(to_mode, "to_mode");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginSmsExtendInfo(String launchId, String sessionId, String to_mode, String result, String err_code) {
        this(launchId, sessionId, to_mode, result, err_code, null, 0, 96, null);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(to_mode, "to_mode");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(err_code, "err_code");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginSmsExtendInfo(String launchId, String sessionId, String to_mode, String result, String err_code, String fail_type) {
        this(launchId, sessionId, to_mode, result, err_code, fail_type, 0, 64, null);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(to_mode, "to_mode");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(err_code, "err_code");
        Intrinsics.checkNotNullParameter(fail_type, "fail_type");
    }

    public /* synthetic */ LoginSmsExtendInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? 0 : i);
    }

    public final String getTo_mode() {
        return this.to_mode;
    }

    public final void setTo_mode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.to_mode = str;
    }

    public final String getResult() {
        return this.result;
    }

    public final void setResult(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.result = str;
    }

    public final String getErr_code() {
        return this.err_code;
    }

    public final void setErr_code(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.err_code = str;
    }

    public final String getFail_type() {
        return this.fail_type;
    }

    public final void setFail_type(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fail_type = str;
    }

    public final int getCooldown_sec() {
        return this.cooldown_sec;
    }

    public final void setCooldown_sec(int i) {
        this.cooldown_sec = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginSmsExtendInfo(String launchId, String sessionId, String to_mode, String result, String err_code, String fail_type, int i) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(to_mode, "to_mode");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(err_code, "err_code");
        Intrinsics.checkNotNullParameter(fail_type, "fail_type");
        this.to_mode = to_mode;
        this.result = result;
        this.err_code = err_code;
        this.fail_type = fail_type;
        this.cooldown_sec = i;
    }
}
