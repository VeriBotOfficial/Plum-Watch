package com.xiaomi.push;

import java.util.Map;

/* loaded from: classes4.dex */
public class fc implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static String f14585a = "wcc-ml-test10.bj";
    public static String b;

    /* renamed from: a, reason: collision with other field name */
    private int f526a;

    /* renamed from: a, reason: collision with other field name */
    private ff f527a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f528a = fb.f511a;

    /* renamed from: b, reason: collision with other field name */
    private boolean f529b = true;
    private String c;
    private String d;
    private String e;

    /* renamed from: a, reason: collision with other method in class */
    public byte[] mo12155a() {
        return null;
    }

    public static final String a() {
        String str = b;
        if (str != null) {
            return str;
        }
        if (y.m12500a()) {
            return "sandbox.xmpush.xiaomi.com";
        }
        if (y.b()) {
            return "10.38.162.35";
        }
        return "app.chat.xiaomi.net";
    }

    public static final void a(String str) {
        if (y.b()) {
            return;
        }
        b = str;
    }

    public fc(Map<String, Integer> map, int i, String str, ff ffVar) {
        a(map, i, str, ffVar);
    }

    private void a(Map<String, Integer> map, int i, String str, ff ffVar) {
        this.f526a = i;
        this.c = str;
        this.f527a = ffVar;
    }

    public void b(String str) {
        this.e = str;
    }

    public String b() {
        return this.e;
    }

    /* renamed from: a, reason: collision with other method in class */
    public int m12153a() {
        return this.f526a;
    }

    public String c() {
        if (this.d == null) {
            this.d = a();
        }
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12154a() {
        return this.f528a;
    }

    public void a(boolean z) {
        this.f528a = z;
    }
}
