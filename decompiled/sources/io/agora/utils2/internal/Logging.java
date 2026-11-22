package io.agora.utils2.internal;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes6.dex */
public class Logging {
    private static final int AGORA_LOG_DEBUG = 2048;
    private static final int AGORA_LOG_ERROR = 4;
    private static final int AGORA_LOG_INFO = 1;
    private static final int AGORA_LOG_WARN = 2;
    private static int nativeLogLevel = 2055;

    public static void d(String message) {
        if ((nativeLogLevel & 2048) != 0) {
            nativeLog(2048, message);
        }
    }

    public static void d(String tag, String message) {
        log(2048, tag, message);
    }

    public static void d(String tag, String message, Throwable e) {
        log(2048, tag, message);
        log(2048, tag, e.toString());
        log(2048, tag, getStackTraceString(e));
    }

    public static void e(String message) {
        if ((nativeLogLevel & 4) != 0) {
            nativeLog(4, message);
        }
    }

    public static void e(String tag, String message) {
        log(4, tag, message);
    }

    public static void e(String tag, String message, Throwable e) {
        log(4, tag, message);
        log(4, tag, e.toString());
        log(4, tag, getStackTraceString(e));
    }

    static String getStackTraceString(Throwable e) {
        if (e == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        try {
            e.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        } catch (Throwable unused) {
            String message = e.getMessage();
            return message == null ? "" : message;
        }
    }

    public static void i(String message) {
        if ((nativeLogLevel & 1) != 0) {
            nativeLog(1, message);
        }
    }

    public static void i(String tag, String message) {
        log(1, tag, message);
    }

    public static void log(int level, String tag, String message) {
        if ((nativeLogLevel & level) != 0) {
            nativeLog(level, "[" + tag + "] " + message);
        }
    }

    static native int nativeLog(int level, String msg);

    public static void setNativeLogLevel(int level) {
        nativeLogLevel = level;
        io.agora.base.internal.Logging.setNativeLogLevel(level);
    }

    public static void w(String message) {
        if ((nativeLogLevel & 2) != 0) {
            nativeLog(2, message);
        }
    }

    public static void w(String tag, String message) {
        log(2, tag, message);
    }

    public static void w(String tag, String message, Throwable e) {
        log(2, tag, message);
        log(2, tag, e.toString());
        log(2, tag, getStackTraceString(e));
    }
}
