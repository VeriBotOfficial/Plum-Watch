package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hp implements hr<hp, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f895a;

    /* renamed from: a, reason: collision with other field name */
    public gv f896a;

    /* renamed from: a, reason: collision with other field name */
    public String f897a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f898a = new BitSet(1);

    /* renamed from: b, reason: collision with other field name */
    public String f899b;

    /* renamed from: c, reason: collision with other field name */
    public String f900c;

    /* renamed from: d, reason: collision with other field name */
    public String f901d;

    /* renamed from: e, reason: collision with other field name */
    public String f902e;

    /* renamed from: f, reason: collision with other field name */
    public String f903f;

    /* renamed from: g, reason: collision with other field name */
    public String f904g;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f894a = new ig("XmPushActionUnSubscriptionResult");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14664a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 12, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 10, 6);
    private static final hy f = new hy("", (byte) 11, 7);
    private static final hy g = new hy("", (byte) 11, 8);
    private static final hy h = new hy("", (byte) 11, 9);
    private static final hy i = new hy("", (byte) 11, 10);

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12324a() {
        return this.f897a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12326b() {
        return this.f896a != null;
    }

    public String a() {
        return this.f899b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m12327c() {
        return this.f899b != null;
    }

    public boolean d() {
        return this.f900c != null;
    }

    public boolean e() {
        return this.f898a.get(0);
    }

    public void a(boolean z) {
        this.f898a.set(0, z);
    }

    public boolean f() {
        return this.f901d != null;
    }

    public String b() {
        return this.f902e;
    }

    public boolean g() {
        return this.f902e != null;
    }

    public boolean h() {
        return this.f903f != null;
    }

    public String c() {
        return this.f904g;
    }

    public boolean i() {
        return this.f904g != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hp)) {
            return m12325a((hp) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12325a(hp hpVar) {
        if (hpVar == null) {
            return false;
        }
        boolean m12324a = m12324a();
        boolean m12324a2 = hpVar.m12324a();
        if ((m12324a || m12324a2) && !(m12324a && m12324a2 && this.f897a.equals(hpVar.f897a))) {
            return false;
        }
        boolean m12326b = m12326b();
        boolean m12326b2 = hpVar.m12326b();
        if ((m12326b || m12326b2) && !(m12326b && m12326b2 && this.f896a.m12239a(hpVar.f896a))) {
            return false;
        }
        boolean m12327c = m12327c();
        boolean m12327c2 = hpVar.m12327c();
        if ((m12327c || m12327c2) && !(m12327c && m12327c2 && this.f899b.equals(hpVar.f899b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = hpVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f900c.equals(hpVar.f900c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = hpVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f895a == hpVar.f895a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hpVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f901d.equals(hpVar.f901d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hpVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f902e.equals(hpVar.f902e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hpVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f903f.equals(hpVar.f903f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = hpVar.i();
        if (i2 || i3) {
            return i2 && i3 && this.f904g.equals(hpVar.f904g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hp hpVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(hpVar.getClass())) {
            return getClass().getName().compareTo(hpVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12324a()).compareTo(Boolean.valueOf(hpVar.m12324a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12324a() && (a10 = hs.a(this.f897a, hpVar.f897a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(m12326b()).compareTo(Boolean.valueOf(hpVar.m12326b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m12326b() && (a9 = hs.a(this.f896a, hpVar.f896a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(m12327c()).compareTo(Boolean.valueOf(hpVar.m12327c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m12327c() && (a8 = hs.a(this.f899b, hpVar.f899b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hpVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = hs.a(this.f900c, hpVar.f900c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hpVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = hs.a(this.f895a, hpVar.f895a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hpVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = hs.a(this.f901d, hpVar.f901d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hpVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = hs.a(this.f902e, hpVar.f902e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hpVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = hs.a(this.f903f, hpVar.f903f)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hpVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a2 = hs.a(this.f904g, hpVar.f904g)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.hr
    public void a(ib ibVar) {
        ibVar.mo12339a();
        while (true) {
            hy mo12335a = ibVar.mo12335a();
            if (mo12335a.f14670a != 0) {
                switch (mo12335a.f915a) {
                    case 1:
                        if (mo12335a.f14670a == 11) {
                            this.f897a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f896a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f899b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f900c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                    default:
                        ie.a(ibVar, mo12335a.f14670a);
                        break;
                    case 6:
                        if (mo12335a.f14670a == 10) {
                            this.f895a = ibVar.mo12334a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f901d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 11) {
                            this.f902e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 11) {
                            this.f903f = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 11) {
                            this.f904g = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                }
                ibVar.g();
            } else {
                ibVar.f();
                m12323a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12323a();
        ibVar.a(f894a);
        if (this.f897a != null && m12324a()) {
            ibVar.a(f14664a);
            ibVar.a(this.f897a);
            ibVar.b();
        }
        if (this.f896a != null && m12326b()) {
            ibVar.a(b);
            this.f896a.b(ibVar);
            ibVar.b();
        }
        if (this.f899b != null) {
            ibVar.a(c);
            ibVar.a(this.f899b);
            ibVar.b();
        }
        if (this.f900c != null && d()) {
            ibVar.a(d);
            ibVar.a(this.f900c);
            ibVar.b();
        }
        if (e()) {
            ibVar.a(e);
            ibVar.a(this.f895a);
            ibVar.b();
        }
        if (this.f901d != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f901d);
            ibVar.b();
        }
        if (this.f902e != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f902e);
            ibVar.b();
        }
        if (this.f903f != null && h()) {
            ibVar.a(h);
            ibVar.a(this.f903f);
            ibVar.b();
        }
        if (this.f904g != null && i()) {
            ibVar.a(i);
            ibVar.a(this.f904g);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (m12324a()) {
            sb.append("debug:");
            String str = this.f897a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m12326b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            gv gvVar = this.f896a;
            if (gvVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(gvVar);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f899b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f900c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f895a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f901d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f902e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f903f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f904g;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12323a() {
        if (this.f899b == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
    }
}
