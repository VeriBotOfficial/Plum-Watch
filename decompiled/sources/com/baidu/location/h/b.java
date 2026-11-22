package com.baidu.location.h;

import android.content.Context;
import android.os.Build;

/* loaded from: classes13.dex */
public class b {
    public static String e = null;
    public static String f = null;
    public static String g = null;
    public static String h = null;
    public static String i = null;
    public static int j = 0;
    public static int k = -2;
    public static long l = -1;

    /* renamed from: a, reason: collision with root package name */
    public String f7700a;
    public String b;
    public String c;
    public String d;
    private boolean m;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7701a = new b();
    }

    private b() {
        this.f7700a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = false;
        if (com.baidu.location.f.getServiceContext() != null) {
            a(com.baidu.location.f.getServiceContext());
        }
    }

    public static b a() {
        return a.f7701a;
    }

    private boolean f() {
        return false;
    }

    public String a(boolean z) {
        return a(z, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(boolean r4, java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.h.b.a(boolean, java.lang.String):java.lang.String");
    }

    public void a(Context context) {
        if (context == null || this.m) {
            return;
        }
        try {
            e = context.getPackageName();
        } catch (Exception unused) {
            e = null;
        }
        try {
            i = i.g(context);
        } catch (Exception unused2) {
            i = null;
        }
        i.o = "" + this.c;
        this.m = true;
    }

    public void a(String str) {
        this.c = str;
        i.o = "" + this.c;
    }

    public void a(String str, String str2) {
        f = str;
        e = str2;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        StringBuilder sb;
        String str;
        if (this.c != null) {
            sb = new StringBuilder("v9.671|");
            str = this.c;
        } else {
            sb = new StringBuilder("v9.671|");
            str = this.f7700a;
        }
        return sb.append(str).append("|").append(Build.MODEL).toString();
    }

    public String d() {
        String str;
        StringBuffer stringBuffer = new StringBuffer(200);
        if (this.c != null) {
            stringBuffer.append("&cu=");
            str = this.c;
        } else {
            stringBuffer.append("&im=");
            str = this.f7700a;
        }
        stringBuffer.append(str);
        try {
            stringBuffer.append("&mb=");
            stringBuffer.append(Build.MODEL);
        } catch (Exception unused) {
        }
        stringBuffer.append("&pack=");
        try {
            stringBuffer.append(e);
        } catch (Exception unused2) {
        }
        stringBuffer.append("&sdk=9.671");
        return stringBuffer.toString();
    }

    public String e() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.c == null) {
            stringBuffer.append("&im=");
            str = this.f7700a;
        } else {
            stringBuffer.append("&cu=");
            str = this.c;
        }
        stringBuffer.append(str);
        stringBuffer.append("&sdk=9.671&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&stp=1&os=A");
        stringBuffer.append(Build.VERSION.SDK);
        stringBuffer.append("&prod=");
        stringBuffer.append(f + ":" + e);
        stringBuffer.append(i.f(com.baidu.location.f.getServiceContext()));
        stringBuffer.append("&resid=12");
        return stringBuffer.toString();
    }
}
