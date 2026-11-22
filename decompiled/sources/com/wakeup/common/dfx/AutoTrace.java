package com.wakeup.common.dfx;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.anythink.expressad.foundation.g.g.a.b;
import com.phancy.mini.core.api.ApiError;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.entity.PayModel;
import com.wakeup.commonui.utils.PermissionsTipHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoTrace.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007J\"\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007J\"\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007J\"\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007J,\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007J8\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007J2\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/dfx/AutoTrace;", "", "<init>", "()V", "BLE", "", "LOGIN", "USER", "AD", PayModel.PAYTYPE_DIAL, PermissionsTipHelper.PERMISSIONS_FLAG_HEALTH, "PAY", "CRASH", "i", "", "tag", b.aX, "msg", "w", "e", "start", ApiError.ERROR_MSG_OK, "costMs", "", ApiError.ERROR_MSG_FAIL, "code", "format", "result", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutoTrace {
    public static final String AD = "auto_trace_ad";
    public static final String BLE = "auto_trace_ble";
    public static final String CRASH = "auto_trace_crash";
    public static final String DIAL = "auto_trace_dial";
    public static final String HEALTH = "auto_trace_health";
    public static final AutoTrace INSTANCE = new AutoTrace();
    public static final String LOGIN = "auto_trace_login";
    public static final String PAY = "auto_trace_pay";
    public static final String USER = "auto_trace_user";

    @JvmStatic
    public static final void fail(String tag, String stage) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        fail$default(tag, stage, null, 0L, null, 28, null);
    }

    @JvmStatic
    public static final void fail(String tag, String stage, String str) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        fail$default(tag, stage, str, 0L, null, 24, null);
    }

    @JvmStatic
    public static final void fail(String tag, String stage, String str, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        fail$default(tag, stage, str, j, null, 16, null);
    }

    @JvmStatic
    public static final void ok(String tag, String stage) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        ok$default(tag, stage, 0L, null, 12, null);
    }

    @JvmStatic
    public static final void ok(String tag, String stage, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        ok$default(tag, stage, j, null, 8, null);
    }

    @JvmStatic
    public static final void start(String tag, String stage) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        start$default(tag, stage, null, 4, null);
    }

    private AutoTrace() {
    }

    public static /* synthetic */ void i$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        i(str, str2, str3);
    }

    @JvmStatic
    public static final void i(String tag, String stage, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(msg, "msg");
        LogUtils.i(tag, INSTANCE.format(stage, ParameterNames.INFO, null, -1L, msg));
    }

    public static /* synthetic */ void w$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        w(str, str2, str3);
    }

    @JvmStatic
    public static final void w(String tag, String stage, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(msg, "msg");
        LogUtils.w(tag, INSTANCE.format(stage, "warn", null, -1L, msg));
    }

    public static /* synthetic */ void e$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        e(str, str2, str3);
    }

    @JvmStatic
    public static final void e(String tag, String stage, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(msg, "msg");
        LogUtils.e(tag, INSTANCE.format(stage, "error", null, -1L, msg));
    }

    public static /* synthetic */ void start$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        start(str, str2, str3);
    }

    @JvmStatic
    public static final void start(String tag, String stage, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(msg, "msg");
        LogUtils.i(tag, INSTANCE.format(stage, "start", null, -1L, msg));
    }

    public static /* synthetic */ void ok$default(String str, String str2, long j, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            j = -1;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        ok(str, str2, j, str3);
    }

    @JvmStatic
    public static final void ok(String tag, String stage, long costMs, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(msg, "msg");
        LogUtils.i(tag, INSTANCE.format(stage, ApiError.ERROR_MSG_OK, null, costMs, msg));
    }

    public static /* synthetic */ void fail$default(String str, String str2, String str3, long j, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = -1;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str4 = "";
        }
        fail(str, str2, str5, j2, str4);
    }

    @JvmStatic
    public static final void fail(String tag, String stage, String code, long costMs, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(msg, "msg");
        LogUtils.w(tag, INSTANCE.format(stage, ApiError.ERROR_MSG_FAIL, code, costMs, msg));
    }

    private final String format(String stage, String result, String code, long costMs, String msg) {
        StringBuilder sb = new StringBuilder("stage=");
        sb.append(stage);
        sb.append(" result=").append(result);
        String str = code;
        if (str != null && str.length() != 0) {
            sb.append(" code=").append(code);
        }
        if (costMs >= 0) {
            sb.append(" costMs=").append(costMs);
        }
        if (msg.length() > 0) {
            sb.append(' ').append(msg);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
