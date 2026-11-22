package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.push.dd;
import com.xiaomi.push.de;
import java.io.File;

/* loaded from: classes4.dex */
public class Logger {
    private static boolean sDisablePushLog = false;
    private static LoggerInterface sUserLogger;

    @Deprecated
    public static File getLogFile(String str) {
        return null;
    }

    @Deprecated
    public static void uploadLogFile(Context context, boolean z) {
    }

    public static void setLogger(Context context, LoggerInterface loggerInterface) {
        sUserLogger = loggerInterface;
        setPushLog(context);
    }

    protected static LoggerInterface getUserLogger() {
        return sUserLogger;
    }

    public static void disablePushFileLog(Context context) {
        sDisablePushLog = true;
        setPushLog(context);
    }

    public static void enablePushFileLog(Context context) {
        sDisablePushLog = false;
        setPushLog(context);
    }

    public static void setPushLog(Context context) {
        boolean z = sUserLogger != null;
        boolean z2 = sDisablePushLog;
        com.xiaomi.channel.commonutils.logger.b.a(new dd(z2 ? false : z ? sUserLogger : null, z2 ? null : de.a(context)));
    }
}
