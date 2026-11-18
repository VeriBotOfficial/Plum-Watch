package com.huawei.secure.android.common.util;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10848a;
    private Character b;
    private Character c;
    private int d = 0;
    private int e = 0;

    public a(String str) {
        this.f10848a = str;
    }

    public static boolean c(Character ch) {
        char cCharValue;
        return ch != null && (cCharValue = ch.charValue()) >= '0' && cCharValue <= '7';
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
        int r1 = this.d;
        this.d = r1 + 1;
        return Character.valueOf(str2.charAt(r1));
    }

    public Character e() {
        Character chD = d();
        if (chD != null && b(chD)) {
            return chD;
        }
        return null;
    }

    public Character f() {
        Character chD = d();
        if (chD != null && c(chD)) {
            return chD;
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
        String strSubstring = this.f10848a.substring(this.d);
        return this.b != null ? this.b + strSubstring : strSubstring;
    }

    public void i() {
        this.b = this.c;
        this.d = this.e;
    }

    public static boolean b(Character ch) {
        if (ch == null) {
            return false;
        }
        char cCharValue = ch.charValue();
        return (cCharValue >= '0' && cCharValue <= '9') || (cCharValue >= 'a' && cCharValue <= 'f') || (cCharValue >= 'A' && cCharValue <= 'F');
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
