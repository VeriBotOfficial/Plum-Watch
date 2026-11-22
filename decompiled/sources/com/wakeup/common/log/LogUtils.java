package com.wakeup.common.log;

import android.util.Log;
import com.blankj.utilcode.util.LanguageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ThrowableUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogUtils.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0007J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0010J)\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0010J)\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0010J)\u0010\u0013\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0010J \u0010\u0013\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J!\u0010\u0015\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/log/LogUtils;", "", "<init>", "()V", "isOriOut", "", "isAgreePrivacy", "MAX_LOG_LENGTH", "", "init", "", "d", "tag", "", "msg", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "i", "w", "e", "", "convert", "([Ljava/lang/Object;)Ljava/lang/String;", "printArgs", "logLongString", "message", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogUtils {
    public static final LogUtils INSTANCE = new LogUtils();
    private static final int MAX_LOG_LENGTH = 4000;
    private static boolean isAgreePrivacy;
    private static final boolean isOriOut = false;

    private LogUtils() {
    }

    @JvmStatic
    public static final void init() {
        LogUtils.Config config = com.blankj.utilcode.util.LogUtils.getConfig();
        config.setGlobalTag("WK");
        config.setFilePrefix("log");
        config.setLog2FileSwitch(true);
        config.setLogHeadSwitch(false);
        config.setStackOffset(1);
        String language = LanguageUtils.getAppContextLanguage().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = language.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        config.addFileExtraHead(MapsKt.mapOf(TuplesKt.to("App Language", lowerCase), TuplesKt.to("App Debug", "false")));
        config.setConsoleSwitch(false);
    }

    @JvmStatic
    public static final void d(String tag, Object... msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.length == 0) {
            return;
        }
        LogUtils logUtils = INSTANCE;
        com.blankj.utilcode.util.LogUtils.dTag(tag, tag + ": " + logUtils.printArgs(Arrays.copyOf(msg, msg.length)));
        if (isOriOut) {
            Log.d(tag, logUtils.convert(Arrays.copyOf(msg, msg.length)));
        }
    }

    @JvmStatic
    public static final void i(String tag, Object... msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.length == 0) {
            return;
        }
        LogUtils logUtils = INSTANCE;
        com.blankj.utilcode.util.LogUtils.iTag(tag, tag + ": " + logUtils.printArgs(Arrays.copyOf(msg, msg.length)));
        if (isOriOut) {
            Log.i(tag, logUtils.convert(Arrays.copyOf(msg, msg.length)));
        }
    }

    @JvmStatic
    public static final void w(String tag, Object... msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.length == 0) {
            return;
        }
        LogUtils logUtils = INSTANCE;
        com.blankj.utilcode.util.LogUtils.wTag(tag, tag + ": " + logUtils.printArgs(Arrays.copyOf(msg, msg.length)));
        if (isOriOut) {
            Log.w(tag, logUtils.convert(Arrays.copyOf(msg, msg.length)));
        }
    }

    @JvmStatic
    public static final void e(String tag, Object... msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.length == 0) {
            return;
        }
        LogUtils logUtils = INSTANCE;
        com.blankj.utilcode.util.LogUtils.eTag(tag, tag + ": " + logUtils.printArgs(Arrays.copyOf(msg, msg.length)));
        if (isOriOut) {
            Log.e(tag, logUtils.convert(Arrays.copyOf(msg, msg.length)));
        }
    }

    @JvmStatic
    public static final void e(String tag, String msg, Throwable e) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(e, "e");
        if (msg.length() == 0) {
            return;
        }
        String fullStackTrace = ThrowableUtils.getFullStackTrace(e);
        com.blankj.utilcode.util.LogUtils.eTag(tag, tag + ": " + msg, fullStackTrace);
        if (isOriOut) {
            Log.e(tag, msg + fullStackTrace);
        }
    }

    private final String convert(Object... msg) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Object obj : msg) {
            stringBuffer.append(obj);
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    private final String printArgs(Object... msg) {
        if (msg.length == 0) {
            return "";
        }
        if (msg.length == 1) {
            return String.valueOf(msg[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : msg) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(obj);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNull(sb2);
        return sb2;
    }

    @JvmStatic
    public static final void logLongString(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.length() <= 4000) {
            i(tag, message);
            return;
        }
        int length = (message.length() / 4000) + (message.length() % 4000 != 0 ? 1 : 0);
        i(tag, "========== 开始打印长字符串 (共" + length + "段, 总长度: " + message.length() + ") ==========");
        for (int i = 0; i < length; i++) {
            int i2 = i * 4000;
            String substring = message.substring(i2, Math.min(i2 + 4000, message.length()));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            i(tag, "[" + i + "/" + length + "] " + substring);
        }
        i(tag, "========== 结束打印长字符串 ==========");
    }
}
