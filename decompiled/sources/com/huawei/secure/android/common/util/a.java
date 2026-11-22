package com.huawei.secure.android.common.util;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f10848a;
    private Character b;
    private Character c;
    private int d = 0;
    private int e = 0;

    public a(String str) {
        this.f10848a = str;
    }

    public static boolean c(Character ch) {
        char charValue;
        return ch != null && (charValue = ch.charValue()) >= '0' && charValue <= '7';
    }

    public void a(Character ch) {
        this.b = ch;
    }

    public int b() {
        return this.d;
    }

    public Character d() {
        Character ch = this.b;
        if (ch != null) {
            this.b = null;
            return ch;
        }
        String str = this.f10848a;
        if (str == null || str.length() == 0 || this.d >= this.f10848a.length()) {
            return null;
        }
        String str2 = this.f10848a;
        int i = this.d;
        this.d = i + 1;
        return Character.valueOf(str2.charAt(i));
    }

    public Character e() {
        Character d = d();
        if (d != null && b(d)) {
            return d;
        }
        return null;
    }

    public Character f() {
        Character d = d();
        if (d != null && c(d)) {
            return d;
        }
        return null;
    }

    public Character g() {
        Character ch = this.b;
        if (ch != null) {
            return ch;
        }
        String str = this.f10848a;
        if (str == null || str.length() == 0 || this.d >= this.f10848a.length()) {
            return null;
        }
        return Character.valueOf(this.f10848a.charAt(this.d));
    }

    protected String h() {
        String substring = this.f10848a.substring(this.d);
        return this.b != null ? this.b + substring : substring;
    }

    public void i() {
        this.b = this.c;
        this.d = this.e;
    }

    public static boolean b(Character ch) {
        if (ch == null) {
            return false;
        }
        char charValue = ch.charValue();
        if (charValue >= '0' && charValue <= '9') {
            return true;
        }
        if (charValue < 'a' || charValue > 'f') {
            return charValue >= 'A' && charValue <= 'F';
        }
        return true;
    }

    public boolean a() {
        if (this.b != null) {
            return true;
        }
        String str = this.f10848a;
        return (str == null || str.length() == 0 || this.d >= this.f10848a.length()) ? false : true;
    }

    public void c() {
        this.c = this.b;
        this.e = this.d;
    }

    public boolean a(char c) {
        Character ch = this.b;
        if (ch != null && ch.charValue() == c) {
            return true;
        }
        String str = this.f10848a;
        return str != null && str.length() != 0 && this.d < this.f10848a.length() && this.f10848a.charAt(this.d) == c;
    }
}
