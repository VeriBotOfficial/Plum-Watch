package com.otaliastudios.cameraview;

import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraLogger {
    public static final int LEVEL_ERROR = 3;
    public static final int LEVEL_INFO = 1;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 2;
    static String lastMessage;
    static String lastTag;
    private static int sLevel;
    private String mTag;
    private static Set<Logger> sLoggers = new CopyOnWriteArraySet();
    static Logger sAndroidLogger = new Logger() { // from class: com.otaliastudios.cameraview.CameraLogger.1
        @Override // com.otaliastudios.cameraview.CameraLogger.Logger
        public void log(int r2, String str, String str2, Throwable th) {
            if (r2 == 0) {
                Log.v(str, str2, th);
                return;
            }
            if (r2 == 1) {
                Log.i(str, str2, th);
            } else if (r2 == 2) {
                Log.w(str, str2, th);
            } else {
                if (r2 != 3) {
                    return;
                }
                Log.e(str, str2, th);
            }
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {
        void log(int r1, String str, String str2, Throwable th);
    }

    static {
        setLogLevel(3);
        sLoggers.add(sAndroidLogger);
    }

    public static CameraLogger create(String str) {
        return new CameraLogger(str);
    }

    public static void setLogLevel(int r0) {
        sLevel = r0;
    }

    public static void registerLogger(Logger logger) {
        sLoggers.add(logger);
    }

    public static void unregisterLogger(Logger logger) {
        sLoggers.remove(logger);
    }

    private CameraLogger(String str) {
        this.mTag = str;
    }

    private boolean should(int r2) {
        return sLevel <= r2 && sLoggers.size() > 0;
    }

    public String v(Object... objArr) {
        return log(0, objArr);
    }

    public String i(Object... objArr) {
        return log(1, objArr);
    }

    public String w(Object... objArr) {
        return log(2, objArr);
    }

    public String e(Object... objArr) {
        return log(3, objArr);
    }

    private String log(int r7, Object... objArr) {
        Throwable th = null;
        if (!should(r7)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
            sb.append(String.valueOf(obj));
            sb.append(" ");
        }
        String strTrim = sb.toString().trim();
        Iterator<Logger> it = sLoggers.iterator();
        while (it.hasNext()) {
            it.next().log(r7, this.mTag, strTrim, th);
        }
        lastMessage = strTrim;
        lastTag = this.mTag;
        return strTrim;
    }
}
