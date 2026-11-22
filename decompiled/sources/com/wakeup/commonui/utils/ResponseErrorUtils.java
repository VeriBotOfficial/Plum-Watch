package com.wakeup.commonui.utils;

import android.content.Context;
import com.wakeup.commonui.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResponseErrorUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/wakeup/commonui/utils/ResponseErrorUtils;", "", "<init>", "()V", "getErrorMsg", "", "code", "", "msg", "getExchangeMsg", "context", "Landroid/content/Context;", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResponseErrorUtils {
    public static final ResponseErrorUtils INSTANCE = new ResponseErrorUtils();

    private ResponseErrorUtils() {
    }

    @JvmStatic
    public static final String getErrorMsg(int code, String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (code == 30000) {
            String string = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_30000);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (code == 30100) {
            String string2 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_30100);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (code != 30101) {
            switch (code) {
                case 10000:
                    String string3 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_10000);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    return string3;
                case 10001:
                    String string4 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_10001);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    return string4;
                case 10002:
                    String string5 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_10002);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    return string5;
                case 10003:
                    String string6 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_10003);
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    return string6;
                case 10004:
                    String string7 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_10004);
                    Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                    return string7;
                case 10005:
                    String string8 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_10005);
                    Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                    return string8;
                case 10006:
                    String string9 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_10006);
                    Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                    return string9;
                case 10007:
                    String string10 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_10007);
                    Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                    return string10;
                case 10008:
                    String string11 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_10008);
                    Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                    return string11;
                default:
                    switch (code) {
                        case 30200:
                            String string12 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_30200);
                            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                            return string12;
                        case 30201:
                            String string13 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_30201);
                            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                            return string13;
                        case 30202:
                            String string14 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_30202);
                            Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                            return string14;
                        case 30203:
                            String string15 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_30203);
                            Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                            return string15;
                        case 30204:
                            String string16 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_30204);
                            Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                            return string16;
                        default:
                            return msg;
                    }
            }
        }
        String string17 = com.wakeup.common.utils.StringUtils.getString(R.string.http_error_30101);
        Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
        return string17;
    }

    public final String getExchangeMsg(Context context, int code, String msg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (code != 30010) {
            switch (code) {
                case 30000:
                    String string = context.getString(R.string.redemption_code_error_30000);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    return string;
                case 30001:
                    String string2 = context.getString(R.string.redemption_code_error_30001);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    return string2;
                case 30002:
                    String string3 = context.getString(R.string.redemption_code_error_30002);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    return string3;
                case 30003:
                    String string4 = context.getString(R.string.redemption_code_error_30003);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    return string4;
                case 30004:
                    String string5 = context.getString(R.string.redemption_code_error_30004);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    return string5;
                case 30005:
                    String string6 = context.getString(R.string.redemption_code_error_30005);
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    return string6;
                case 30006:
                    String string7 = context.getString(R.string.redemption_code_error_30006);
                    Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                    return string7;
                default:
                    return msg;
            }
        }
        String string8 = context.getString(R.string.redemption_code_error_30010);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        return string8;
    }
}
