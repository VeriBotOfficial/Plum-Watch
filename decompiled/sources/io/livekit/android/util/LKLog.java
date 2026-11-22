package io.livekit.android.util;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LKLog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lio/livekit/android/util/LKLog;", "", "()V", "Companion", "Logger", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LKLog {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Logger defaultLogger;
    private static Logger logger;
    private static LoggingLevel loggingLevel;

    /* compiled from: LKLog.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lio/livekit/android/util/LKLog$Logger;", "", "log", "", "priority", "Lio/livekit/android/util/LoggingLevel;", ak.aH, "", "message", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Logger {
        void log(LoggingLevel priority, Throwable t, String message);
    }

    @JvmStatic
    public static final void d(Throwable th) {
        INSTANCE.d(th);
    }

    @JvmStatic
    public static final void d(Throwable th, Function0<String> function0) {
        INSTANCE.d(th, function0);
    }

    @JvmStatic
    public static final void e(Throwable th) {
        INSTANCE.e(th);
    }

    @JvmStatic
    public static final void e(Throwable th, Function0<String> function0) {
        INSTANCE.e(th, function0);
    }

    @JvmStatic
    public static final void i(Throwable th) {
        INSTANCE.i(th);
    }

    @JvmStatic
    public static final void i(Throwable th, Function0<String> function0) {
        INSTANCE.i(th, function0);
    }

    @JvmStatic
    public static final void v(Throwable th) {
        INSTANCE.v(th);
    }

    @JvmStatic
    public static final void v(Throwable th, Function0<String> function0) {
        INSTANCE.v(th, function0);
    }

    @JvmStatic
    public static final void w(Throwable th) {
        INSTANCE.w(th);
    }

    @JvmStatic
    public static final void w(Throwable th, Function0<String> function0) {
        INSTANCE.w(th, function0);
    }

    @JvmStatic
    public static final void wtf(Throwable th) {
        INSTANCE.wtf(th);
    }

    @JvmStatic
    public static final void wtf(Throwable th, Function0<String> function0) {
        INSTANCE.wtf(th, function0);
    }

    /* compiled from: LKLog.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0087\bJ(\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0087\bø\u0001\u0000J\u0013\u0010\u0018\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0087\bJ(\u0010\u0018\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0087\bø\u0001\u0000J\u0013\u0010\u0019\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0087\bJ(\u0010\u0019\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0087\bø\u0001\u0000J0\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0086\bø\u0001\u0000J\u0013\u0010\u001b\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0087\bJ(\u0010\u001b\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0087\bø\u0001\u0000J\u0013\u0010\u001c\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0087\bJ(\u0010\u001c\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0087\bø\u0001\u0000J\u0013\u0010\u001d\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0087\bJ(\u0010\u001d\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0087\bø\u0001\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Lio/livekit/android/util/LKLog$Companion;", "", "()V", "defaultLogger", "Lio/livekit/android/util/LKLog$Logger;", "getDefaultLogger", "()Lio/livekit/android/util/LKLog$Logger;", "logger", "getLogger", "setLogger", "(Lio/livekit/android/util/LKLog$Logger;)V", "loggingLevel", "Lio/livekit/android/util/LoggingLevel;", "getLoggingLevel", "()Lio/livekit/android/util/LoggingLevel;", "setLoggingLevel", "(Lio/livekit/android/util/LoggingLevel;)V", "d", "", ak.aH, "", "message", "Lkotlin/Function0;", "", "e", "i", "log", "v", "w", "wtf", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Logger getDefaultLogger() {
            return LKLog.defaultLogger;
        }

        public final Logger getLogger() {
            return LKLog.logger;
        }

        public final void setLogger(Logger logger) {
            LKLog.logger = logger;
        }

        public final LoggingLevel getLoggingLevel() {
            return LKLog.loggingLevel;
        }

        public final void setLoggingLevel(LoggingLevel loggingLevel) {
            Intrinsics.checkNotNullParameter(loggingLevel, "<set-?>");
            LKLog.loggingLevel = loggingLevel;
        }

        public static /* synthetic */ void v$default(Companion companion, Throwable th, Function0 message, int i, Object obj) {
            Logger logger;
            if ((i & 1) != 0) {
                th = null;
            }
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.VERBOSE;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, th, (String) message.invoke());
        }

        @JvmStatic
        public final void v(Throwable t, Function0<String> message) {
            Logger logger;
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.VERBOSE;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, message.invoke());
        }

        @JvmStatic
        public final void v(Throwable t) {
            Logger logger;
            LoggingLevel loggingLevel = LoggingLevel.VERBOSE;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, "");
        }

        public static /* synthetic */ void d$default(Companion companion, Throwable th, Function0 message, int i, Object obj) {
            Logger logger;
            if ((i & 1) != 0) {
                th = null;
            }
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.DEBUG;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, th, (String) message.invoke());
        }

        @JvmStatic
        public final void d(Throwable t, Function0<String> message) {
            Logger logger;
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.DEBUG;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, message.invoke());
        }

        @JvmStatic
        public final void d(Throwable t) {
            Logger logger;
            LoggingLevel loggingLevel = LoggingLevel.DEBUG;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, "");
        }

        public static /* synthetic */ void i$default(Companion companion, Throwable th, Function0 message, int i, Object obj) {
            Logger logger;
            if ((i & 1) != 0) {
                th = null;
            }
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.INFO;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, th, (String) message.invoke());
        }

        @JvmStatic
        public final void i(Throwable t, Function0<String> message) {
            Logger logger;
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.INFO;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, message.invoke());
        }

        @JvmStatic
        public final void i(Throwable t) {
            Logger logger;
            LoggingLevel loggingLevel = LoggingLevel.INFO;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, "");
        }

        public static /* synthetic */ void w$default(Companion companion, Throwable th, Function0 message, int i, Object obj) {
            Logger logger;
            if ((i & 1) != 0) {
                th = null;
            }
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.WARN;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, th, (String) message.invoke());
        }

        @JvmStatic
        public final void w(Throwable t, Function0<String> message) {
            Logger logger;
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.WARN;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, message.invoke());
        }

        @JvmStatic
        public final void w(Throwable t) {
            Logger logger;
            LoggingLevel loggingLevel = LoggingLevel.WARN;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, "");
        }

        public static /* synthetic */ void e$default(Companion companion, Throwable th, Function0 message, int i, Object obj) {
            Logger logger;
            if ((i & 1) != 0) {
                th = null;
            }
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.ERROR;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, th, (String) message.invoke());
        }

        @JvmStatic
        public final void e(Throwable t, Function0<String> message) {
            Logger logger;
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.ERROR;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, message.invoke());
        }

        @JvmStatic
        public final void e(Throwable t) {
            Logger logger;
            LoggingLevel loggingLevel = LoggingLevel.ERROR;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, "");
        }

        public static /* synthetic */ void wtf$default(Companion companion, Throwable th, Function0 message, int i, Object obj) {
            Logger logger;
            if ((i & 1) != 0) {
                th = null;
            }
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.WTF;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, th, (String) message.invoke());
        }

        @JvmStatic
        public final void wtf(Throwable t, Function0<String> message) {
            Logger logger;
            Intrinsics.checkNotNullParameter(message, "message");
            LoggingLevel loggingLevel = LoggingLevel.WTF;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, message.invoke());
        }

        @JvmStatic
        public final void wtf(Throwable t) {
            Logger logger;
            LoggingLevel loggingLevel = LoggingLevel.WTF;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, "");
        }

        public static /* synthetic */ void log$default(Companion companion, LoggingLevel loggingLevel, Throwable th, Function0 message, int i, Object obj) {
            Logger logger;
            if ((i & 2) != 0) {
                th = null;
            }
            Intrinsics.checkNotNullParameter(loggingLevel, "loggingLevel");
            Intrinsics.checkNotNullParameter(message, "message");
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = companion.getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, th, (String) message.invoke());
        }

        public final void log(LoggingLevel loggingLevel, Throwable t, Function0<String> message) {
            Logger logger;
            Intrinsics.checkNotNullParameter(loggingLevel, "loggingLevel");
            Intrinsics.checkNotNullParameter(message, "message");
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || (logger = getLogger()) == null) {
                return;
            }
            logger.log(loggingLevel, t, message.invoke());
        }
    }

    static {
        Logger logger2 = new Logger() { // from class: io.livekit.android.util.LKLog$Companion$defaultLogger$1
            @Override // io.livekit.android.util.LKLog.Logger
            public void log(LoggingLevel priority, Throwable t, String message) {
                LKDebugTree lKDebugTree;
                Intrinsics.checkNotNullParameter(priority, "priority");
                Intrinsics.checkNotNullParameter(message, "message");
                lKDebugTree = LKLogKt.DEBUG_TREE;
                lKDebugTree.prepareLog(priority.toAndroidLogPriority(), t, message);
            }
        };
        defaultLogger = logger2;
        logger = logger2;
        loggingLevel = LoggingLevel.OFF;
    }
}
