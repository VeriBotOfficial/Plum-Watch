package com.umeng.analytics.pro;

import java.io.Serializable;

/* compiled from: FieldValueMetaData.java */
/* loaded from: classes2.dex */
public class bg implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13805a;
    public final byte b;
    private final String c;
    private final boolean d;

    public bg(byte b, boolean z) {
        this.b = b;
        this.f13805a = false;
        this.c = null;
        this.d = z;
    }

    public bg(byte b) {
        this(b, false);
    }

    public bg(byte b, String str) {
        this.b = b;
        this.f13805a = true;
        this.c = str;
        this.d = false;
    }

    public boolean a() {
        return this.f13805a;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.b == 12;
    }

    public boolean d() {
        byte b = this.b;
        return b == 15 || b == 13 || b == 14;
    }

    public boolean e() {
        return this.d;
    }
}
