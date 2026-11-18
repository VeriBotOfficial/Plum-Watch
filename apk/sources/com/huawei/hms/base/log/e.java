package com.huawei.hms.base.log;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Process;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: LogRecord.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {
    private String b;
    private String c;
    private int d;
    private String g;
    private int h;
    private int i;
    private int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f10273a = new StringBuilder();
    private long e = 0;
    private long f = 0;

    e(int r3, String str, int r5, String str2) {
        this.c = "HMS";
        this.j = r3;
        this.b = str;
        this.d = r5;
        if (str2 != null) {
            this.c = str2;
        }
        b();
    }

    public static String a(int r1) {
        if (r1 == 3) {
            return "D";
        }
        if (r1 == 4) {
            return TokenNames.I;
        }
        if (r1 != 5) {
            return r1 != 6 ? String.valueOf(r1) : "E";
        }
        return ExifInterface.LONGITUDE_WEST;
    }

    private e b() {
        this.e = System.currentTimeMillis();
        Thread threadCurrentThread = Thread.currentThread();
        this.f = threadCurrentThread.getId();
        this.h = Process.myPid();
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        int length = stackTrace.length;
        int r2 = this.j;
        if (length > r2) {
            StackTraceElement stackTraceElement = stackTrace[r2];
            this.g = stackTraceElement.getFileName();
            this.i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        a(sb);
        return sb.toString();
    }

    public <T> e a(T t) {
        this.f10273a.append(t);
        return this;
    }

    public e a(Throwable th) {
        a('\n').a(Log.getStackTraceString(th));
        return this;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    private StringBuilder a(StringBuilder sb) {
        sb.append(' ').append(this.f10273a.toString());
        return sb;
    }

    private StringBuilder b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(simpleDateFormat.format(Long.valueOf(this.e)));
        sb.append(' ').append(a(this.d)).append('/').append(this.c).append('/').append(this.b);
        sb.append(' ').append(this.h).append(AbstractJsonLexerKt.COLON).append(this.f);
        sb.append(' ').append(this.g).append(AbstractJsonLexerKt.COLON).append(this.i);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb;
    }
}
