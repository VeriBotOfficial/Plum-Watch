package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hl implements hr<hl, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f850a;

    /* renamed from: a, reason: collision with other field name */
    public gv f851a;

    /* renamed from: a, reason: collision with other field name */
    public String f852a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f853a = new BitSet(1);

    /* renamed from: b, reason: collision with other field name */
    public String f854b;

    /* renamed from: c, reason: collision with other field name */
    public String f855c;

    /* renamed from: d, reason: collision with other field name */
    public String f856d;

    /* renamed from: e, reason: collision with other field name */
    public String f857e;

    /* renamed from: f, reason: collision with other field name */
    public String f858f;

    /* renamed from: g, reason: collision with other field name */
    public String f859g;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f849a = new ig("XmPushActionSubscriptionResult");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14660a = new hy("", (byte) 11, 1);
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
    public boolean m12312a() {
        return this.f852a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12314b() {
        return this.f851a != null;
    }

    public String a() {
        return this.f854b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m12315c() {
        return this.f854b != null;
    }

    public boolean d() {
        return this.f855c != null;
    }

    public boolean e() {
        return this.f853a.get(0);
    }

    public void a(boolean z) {
        this.f853a.set(0, z);
    }

    public boolean f() {
        return this.f856d != null;
    }

    public String b() {
        return this.f857e;
    }

    public boolean g() {
        return this.f857e != null;
    }

    public boolean h() {
        return this.f858f != null;
    }

    public String c() {
        return this.f859g;
    }

    public boolean i() {
        return this.f859g != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hl)) {
            return m12313a((hl) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12313a(hl hlVar) {
        if (hlVar == null) {
            return false;
        }
        boolean m12312a = m12312a();
        boolean m12312a2 = hlVar.m12312a();
        if ((m12312a || m12312a2) && !(m12312a && m12312a2 && this.f852a.equals(hlVar.f852a))) {
            return false;
        }
        boolean m12314b = m12314b();
        boolean m12314b2 = hlVar.m12314b();
        if ((m12314b || m12314b2) && !(m12314b && m12314b2 && this.f851a.m12239a(hlVar.f851a))) {
            return false;
        }
        boolean m12315c = m12315c();
        boolean m12315c2 = hlVar.m12315c();
        if ((m12315c || m12315c2) && !(m12315c && m12315c2 && this.f854b.equals(hlVar.f854b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = hlVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f855c.equals(hlVar.f855c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = hlVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f850a == hlVar.f850a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hlVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f856d.equals(hlVar.f856d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hlVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f857e.equals(hlVar.f857e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hlVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f858f.equals(hlVar.f858f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = hlVar.i();
        if (i2 || i3) {
            return i2 && i3 && this.f859g.equals(hlVar.f859g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hl hlVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(hlVar.getClass())) {
            return getClass().getName().compareTo(hlVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12312a()).compareTo(Boolean.valueOf(hlVar.m12312a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12312a() && (a10 = hs.a(this.f852a, hlVar.f852a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(m12314b()).compareTo(Boolean.valueOf(hlVar.m12314b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m12314b() && (a9 = hs.a(this.f851a, hlVar.f851a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(m12315c()).compareTo(Boolean.valueOf(hlVar.m12315c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m12315c() && (a8 = hs.a(this.f854b, hlVar.f854b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hlVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = hs.a(this.f855c, hlVar.f855c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hlVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = hs.a(this.f850a, hlVar.f850a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hlVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = hs.a(this.f856d, hlVar.f856d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hlVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = hs.a(this.f857e, hlVar.f857e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hlVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = hs.a(this.f858f, hlVar.f858f)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hlVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a2 = hs.a(this.f859g, hlVar.f859g)) == 0) {
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
                            this.f852a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f851a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f854b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f855c = ibVar.mo12340a();
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
                            this.f850a = ibVar.mo12334a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f856d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 11) {
                            this.f857e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 11) {
                            this.f858f = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 11) {
                            this.f859g = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                }
                ibVar.g();
            } else {
                ibVar.f();
                m12311a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12311a();
        ibVar.a(f849a);
        if (this.f852a != null && m12312a()) {
            ibVar.a(f14660a);
            ibVar.a(this.f852a);
            ibVar.b();
        }
        if (this.f851a != null && m12314b()) {
            ibVar.a(b);
            this.f851a.b(ibVar);
            ibVar.b();
        }
        if (this.f854b != null) {
            ibVar.a(c);
            ibVar.a(this.f854b);
            ibVar.b();
        }
        if (this.f855c != null && d()) {
            ibVar.a(d);
            ibVar.a(this.f855c);
            ibVar.b();
        }
        if (e()) {
            ibVar.a(e);
            ibVar.a(this.f850a);
            ibVar.b();
        }
        if (this.f856d != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f856d);
            ibVar.b();
        }
        if (this.f857e != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f857e);
            ibVar.b();
        }
        if (this.f858f != null && h()) {
            ibVar.a(h);
            ibVar.a(this.f858f);
            ibVar.b();
        }
        if (this.f859g != null && i()) {
            ibVar.a(i);
            ibVar.a(this.f859g);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = false;
        if (m12312a()) {
            sb.append("debug:");
            String str = this.f852a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m12314b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            gv gvVar = this.f851a;
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
        String str2 = this.f854b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f855c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f850a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f856d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f857e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f858f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f859g;
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
    public void m12311a() {
        if (this.f854b == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
    }
}
