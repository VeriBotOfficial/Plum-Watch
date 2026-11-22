package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class gv implements hr<gv, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public String f663a;

    /* renamed from: d, reason: collision with other field name */
    public String f668d;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f661a = new ig("Target");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14640a = new hy("", (byte) 10, 1);
    private static final hy b = new hy("", (byte) 11, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 2, 5);
    private static final hy f = new hy("", (byte) 11, 7);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f664a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public long f662a = 5;

    /* renamed from: b, reason: collision with other field name */
    public String f666b = "xiaomi.com";

    /* renamed from: c, reason: collision with other field name */
    public String f667c = "";

    /* renamed from: a, reason: collision with other field name */
    public boolean f665a = false;

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12238a() {
        return this.f664a.get(0);
    }

    public void a(boolean z) {
        this.f664a.set(0, z);
    }

    public boolean b() {
        return this.f663a != null;
    }

    public boolean c() {
        return this.f666b != null;
    }

    public boolean d() {
        return this.f667c != null;
    }

    public boolean e() {
        return this.f664a.get(1);
    }

    public void b(boolean z) {
        this.f664a.set(1, z);
    }

    public boolean f() {
        return this.f668d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gv)) {
            return m12239a((gv) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12239a(gv gvVar) {
        if (gvVar == null || this.f662a != gvVar.f662a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = gvVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f663a.equals(gvVar.f663a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = gvVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f666b.equals(gvVar.f666b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = gvVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f667c.equals(gvVar.f667c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = gvVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f665a == gvVar.f665a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = gvVar.f();
        if (f2 || f3) {
            return f2 && f3 && this.f668d.equals(gvVar.f668d);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gv gvVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!getClass().equals(gvVar.getClass())) {
            return getClass().getName().compareTo(gvVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12238a()).compareTo(Boolean.valueOf(gvVar.m12238a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12238a() && (a7 = hs.a(this.f662a, gvVar.f662a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(gvVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a6 = hs.a(this.f663a, gvVar.f663a)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(gvVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a5 = hs.a(this.f666b, gvVar.f666b)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(gvVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a4 = hs.a(this.f667c, gvVar.f667c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(gvVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a3 = hs.a(this.f665a, gvVar.f665a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(gvVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!f() || (a2 = hs.a(this.f668d, gvVar.f668d)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.hr
    public void a(ib ibVar) {
        ibVar.mo12339a();
        while (true) {
            hy mo12335a = ibVar.mo12335a();
            if (mo12335a.f14670a == 0) {
                break;
            }
            short s = mo12335a.f915a;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                if (s == 7) {
                                    if (mo12335a.f14670a == 11) {
                                        this.f668d = ibVar.mo12340a();
                                    } else {
                                        ie.a(ibVar, mo12335a.f14670a);
                                    }
                                } else {
                                    ie.a(ibVar, mo12335a.f14670a);
                                }
                            } else if (mo12335a.f14670a == 2) {
                                this.f665a = ibVar.mo12345a();
                                b(true);
                            } else {
                                ie.a(ibVar, mo12335a.f14670a);
                            }
                        } else if (mo12335a.f14670a == 11) {
                            this.f667c = ibVar.mo12340a();
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                        }
                    } else if (mo12335a.f14670a == 11) {
                        this.f666b = ibVar.mo12340a();
                    } else {
                        ie.a(ibVar, mo12335a.f14670a);
                    }
                } else if (mo12335a.f14670a == 11) {
                    this.f663a = ibVar.mo12340a();
                } else {
                    ie.a(ibVar, mo12335a.f14670a);
                }
            } else if (mo12335a.f14670a == 10) {
                this.f662a = ibVar.mo12334a();
                a(true);
            } else {
                ie.a(ibVar, mo12335a.f14670a);
            }
            ibVar.g();
        }
        ibVar.f();
        if (!m12238a()) {
            throw new ic("Required field 'channelId' was not found in serialized data! Struct: " + toString());
        }
        a();
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        a();
        ibVar.a(f661a);
        ibVar.a(f14640a);
        ibVar.a(this.f662a);
        ibVar.b();
        if (this.f663a != null) {
            ibVar.a(b);
            ibVar.a(this.f663a);
            ibVar.b();
        }
        if (this.f666b != null && c()) {
            ibVar.a(c);
            ibVar.a(this.f666b);
            ibVar.b();
        }
        if (this.f667c != null && d()) {
            ibVar.a(d);
            ibVar.a(this.f667c);
            ibVar.b();
        }
        if (e()) {
            ibVar.a(e);
            ibVar.a(this.f665a);
            ibVar.b();
        }
        if (this.f668d != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f668d);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(channelId:");
        sb.append(this.f662a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f663a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f666b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        if (d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f667c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f665a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f668d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public void a() {
        if (this.f663a == null) {
            throw new ic("Required field 'userId' was not present! Struct: " + toString());
        }
    }
}
