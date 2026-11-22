package com.bluetrum.fota.log;

/* loaded from: classes13.dex */
public class Logger {
    private static int logLevel = 4;
    private static ILogger logger;

    public static void setLogger(ILogger iLogger) {
        logger = iLogger;
    }

    public static void setLogLevel(int i) {
        logLevel = i;
    }

    public static void log(int i, String str, String str2, Throwable th) {
        ILogger iLogger = logger;
        if (iLogger == null || i < logLevel) {
            return;
        }
        iLogger.log(i, str, str2, th);
    }

    public static void v(String str, String str2) {
        log(2, str, str2, null);
    }

    public static void v(String str, String str2, Throwable th) {
        log(2, str, str2, th);
    }

    public static void d(String str, String str2) {
        log(3, str, str2, null);
    }

    public static void d(String str, String str2, Throwable th) {
        log(3, str, str2, th);
    }

    public static void i(String str, String str2) {
        log(4, str, str2, null);
    }

    public static void i(String str, String str2, Throwable th) {
        log(4, str, str2, th);
    }

    public static void w(String str, String str2) {
        log(5, str, str2, null);
    }

    public static void w(String str, String str2, Throwable th) {
        log(5, str, str2, th);
    }

    public static void w(String str, Throwable th) {
        log(5, str, "", th);
    }

    public static void e(String str, String str2) {
        log(6, str, str2, null);
    }

    public static void e(String str, Throwable th) {
        log(6, str, "", th);
    }

    public static void e(String str, String str2, Throwable th) {
        log(6, str, str2, th);
    }

    public static void wtf(String str, String str2) {
        log(7, str, str2, null);
    }

    public static void wtf(String str, Throwable th) {
        log(7, str, "", th);
    }

    public static void wtf(String str, String str2, Throwable th) {
        log(7, str, str2, th);
    }
}
