package com.amap.location.support.log;

import com.amap.location.support.AmapContext;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* loaded from: classes11.dex */
public class ALLog {
    private static volatile ILog sLogImpl;

    public static void d(String str, String str2) {
        if (sLogImpl != null) {
            sLogImpl.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (sLogImpl != null) {
            sLogImpl.e(str, str2);
        }
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static void i(String str, String str2) {
        if (sLogImpl != null) {
            sLogImpl.i(str, str2);
        }
    }

    public static void init(ILog iLog) {
        if (iLog != null) {
            sLogImpl = iLog;
        }
    }

    public static void w(String str, String str2) {
        if (sLogImpl != null) {
            sLogImpl.w(str, str2);
        }
    }

    public static void d(Throwable th) {
        if (!AmapContext.DEBUG || th == null) {
            return;
        }
        d("ERROR", getStackTraceString(th));
    }

    public static void e(String str, String str2, Throwable th) {
        e(str, str2 + " " + getStackTraceString(th));
    }

    public static void w(String str, String str2, Throwable th) {
        w(str, str2 + " " + getStackTraceString(th));
    }

    public static void e(String str, Throwable th) {
        e(str, getStackTraceString(th));
    }
}
