package livekit.org.webrtc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public class Logging {
    private static final Logger fallbackLogger = createFallbackLogger();
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int nativeSeverity);

    private static native void nativeLog(int severity, String tag, String message);

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("livekit.org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    static void injectLoggable(Loggable injectedLoggable, Severity severity) {
        if (injectedLoggable != null) {
            loggable = injectedLoggable;
            loggableSeverity = severity;
        }
    }

    static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (Logging.class) {
            if (loggable != null) {
                throw new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
            nativeEnableLogToDebugOutput(severity.ordinal());
            loggingEnabled = true;
        }
    }

    public static void log(Severity severity, String tag, String message) {
        Level level;
        if (tag == null || message == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        }
        if (loggable != null) {
            if (severity.ordinal() < loggableSeverity.ordinal()) {
                return;
            }
            loggable.onLogMessage(message, severity, tag);
        } else {
            if (loggingEnabled) {
                nativeLog(severity.ordinal(), tag, message);
                return;
            }
            int ordinal = severity.ordinal();
            if (ordinal == 1) {
                level = Level.INFO;
            } else if (ordinal == 2) {
                level = Level.WARNING;
            } else if (ordinal == 3) {
                level = Level.SEVERE;
            } else {
                level = Level.FINE;
            }
            fallbackLogger.log(level, tag + ": " + message);
        }
    }

    public static void d(String tag, String message) {
        log(Severity.LS_INFO, tag, message);
    }

    public static void e(String tag, String message) {
        log(Severity.LS_ERROR, tag, message);
    }

    public static void w(String tag, String message) {
        log(Severity.LS_WARNING, tag, message);
    }

    public static void e(String tag, String message, Throwable e) {
        log(Severity.LS_ERROR, tag, message);
        log(Severity.LS_ERROR, tag, e.toString());
        log(Severity.LS_ERROR, tag, getStackTraceString(e));
    }

    public static void w(String tag, String message, Throwable e) {
        log(Severity.LS_WARNING, tag, message);
        log(Severity.LS_WARNING, tag, e.toString());
        log(Severity.LS_WARNING, tag, getStackTraceString(e));
    }

    public static void v(String tag, String message) {
        log(Severity.LS_VERBOSE, tag, message);
    }

    private static String getStackTraceString(Throwable e) {
        if (e == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
