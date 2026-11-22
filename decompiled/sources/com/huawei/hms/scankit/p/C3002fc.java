package com.huawei.hms.scankit.p;

import java.nio.charset.StandardCharsets;

/* compiled from: EncoderContext.java */
/* renamed from: com.huawei.hms.scankit.p.fc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3002fc {

    /* renamed from: a, reason: collision with root package name */
    private final String f10640a;
    private EnumC3018jc b;
    private Mb c;
    private Mb d;
    private final StringBuilder e;
    int f;
    private int g;
    private C3014ic h;
    private int i;

    C3002fc(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.f10640a = sb.toString();
        this.b = EnumC3018jc.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    private int l() {
        return this.f10640a.length() - this.i;
    }

    public void a(EnumC3018jc enumC3018jc) {
        this.b = enumC3018jc;
    }

    public StringBuilder b() {
        return this.e;
    }

    public char c() {
        return this.f10640a.charAt(this.f);
    }

    public String d() {
        return this.f10640a;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return l() - this.f;
    }

    public C3014ic g() {
        return this.h;
    }

    public boolean h() {
        return this.f < l();
    }

    public void i() {
        this.g = -1;
    }

    public void j() {
        this.h = null;
    }

    public void k() {
        c(a());
    }

    public void a(Mb mb, Mb mb2) {
        this.c = mb;
        this.d = mb2;
    }

    public void b(int i) {
        this.g = i;
    }

    public void c(int i) {
        C3014ic c3014ic = this.h;
        if (c3014ic == null || i > c3014ic.a()) {
            this.h = C3014ic.a(i, this.b, this.c, this.d, true);
        }
    }

    public void a(int i) {
        this.i = i;
    }

    public void a(String str) {
        this.e.append(str);
    }

    public void a(char c) {
        this.e.append(c);
    }

    public int a() {
        return this.e.length();
    }
}
