package com.huawei.hms.common.util;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f10317a = false;
    private static final String b = "Logger";
    private static final String c = "|";
    private static final int d = 8;
    private static final int e = 20;
    private static final String f = "dynamic-api_";

    static class a extends Throwable {
        private static final long b = 7129050843360571879L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f10318a;
        private Throwable c;
        private Throwable d;

        private a(Throwable th) {
            this.d = th;
        }

        /* synthetic */ a(Throwable th, byte b2) {
            this(th);
        }

        private void a(String str) {
            this.f10318a = str;
        }

        private void a(Throwable th) {
            this.c = th;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            Throwable th = this.c;
            if (th == this) {
                return null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f10318a;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            Throwable th = this.d;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f10318a == null) {
                return name;
            }
            String str = name + ": ";
            return this.f10318a.startsWith(str) ? this.f10318a : str + this.f10318a;
        }
    }

    private static int a(int r1, String str, String str2) {
        return Log.println(r1, a(str), a(str2, 7));
    }

    private static String a(int r4) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= r4) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[r4];
        StringBuilder sb = new StringBuilder();
        sb.append(Process.myPid()).append(Constants.ACCEPT_TIME_SEPARATOR_SERVER).append(Process.myTid()).append("|").append(stackTraceElement.getFileName()).append("|").append(stackTraceElement.getClassName()).append("|").append(stackTraceElement.getMethodName()).append("|").append(stackTraceElement.getLineNumber());
        return sb.toString();
    }

    private static String a(String str) {
        return f.concat(String.valueOf(str));
    }

    private static String a(String str, int r2) {
        return !TextUtils.isEmpty(str) ? a(r2) + "|" + str : a(r2);
    }

    private static Throwable a(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        int r0 = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
        byte b2 = 0;
        a aVar = new a(th, b2);
        StackTraceElement[] stackTrace = aVar.getStackTrace();
        if (stackTrace.length > r0) {
            aVar.setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, r0));
        } else {
            aVar.setStackTrace(stackTrace);
        }
        aVar.f10318a = anonymizeMessage(th.getMessage());
        Throwable cause = th.getCause();
        a aVar2 = aVar;
        while (cause != null) {
            a aVar3 = new a(cause, b2);
            aVar3.f10318a = anonymizeMessage(cause.getMessage());
            aVar2.c = aVar3;
            cause = cause.getCause();
            aVar2 = aVar3;
        }
        return aVar;
    }

    public static String anonymizeMessage(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int r0 = 0; r0 < charArray.length; r0++) {
            if (r0 % 2 == 1) {
                charArray[r0] = '*';
            }
        }
        return new String(charArray);
    }

    public static void d(String str, Object obj) {
        println(3, str, obj);
    }

    public static void d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    public static void e(String str, Object obj) {
        println(6, str, obj);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(a(str), a(str2, 5), a(th));
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    public static String format(String str, Object... objArr) {
        return str == null ? "" : String.format(Locale.ROOT, str, objArr);
    }

    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static boolean isLoggable(int r1) {
        return Log.isLoggable(f, r1);
    }

    public static void println(int r1, String str, Object obj) {
        if (r1 >= 3 && isLoggable(r1)) {
            a(r1, str, obj == null ? AbstractJsonLexerKt.NULL : obj.toString());
        }
    }

    public static void println(int r2, String str, String str2, Object... objArr) {
        if (r2 < 3) {
            return;
        }
        if (str2 == null) {
            Log.w(b, "format is null, not log");
            return;
        }
        try {
            if (isLoggable(r2)) {
                a(r2, str, format(str2, objArr));
            }
        } catch (IllegalFormatException e2) {
            w(b, "log format error".concat(String.valueOf(str2)), e2);
        }
    }

    public static void v(String str, Object obj) {
        println(2, str, obj);
    }

    public static void v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    public static void w(String str, Object obj) {
        println(5, str, obj);
    }

    public static void w(String str, String str2, Throwable th) {
        Log.w(a(str), a(str2, 5), a(th));
    }

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }
}
