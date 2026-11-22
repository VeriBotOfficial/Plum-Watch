package com.amap.api.col.p0003sl;

import android.os.Build;

/* compiled from: Rom.java */
/* loaded from: classes11.dex */
public enum ca {
    MIUI(m9.b("IeGlhb21p")),
    Flyme(m9.b("IbWVpenU")),
    RH(m9.b("IaHVhd2Vp")),
    ColorOS(m9.b("Ib3Bwbw")),
    FuntouchOS(m9.b("Idml2bw")),
    SmartisanOS(m9.b("Mc21hcnRpc2Fu")),
    AmigoOS(m9.b("IYW1pZ28")),
    EUI(m9.b("IbGV0dg")),
    Sense(m9.b("EaHRj")),
    LG(m9.b("EbGdl")),
    Google(m9.b("IZ29vZ2xl")),
    NubiaUI(m9.b("IbnViaWE")),
    Other("");


    /* renamed from: a, reason: collision with root package name */
    private String f1595a;
    private int b;
    private String c;
    private String d;
    private String e = Build.MANUFACTURER;

    ca(String str) {
        this.f1595a = str;
    }

    public final String a() {
        return this.f1595a;
    }

    public final String b() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "ROM{name='" + name() + "',versionCode=" + this.b + ", versionName='" + this.d + "',ma=" + this.f1595a + "',manufacturer=" + this.e + "'}";
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void a(String str) {
        this.c = str;
    }
}
