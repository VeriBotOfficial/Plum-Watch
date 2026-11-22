package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hn implements hr<hn, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f875a;

    /* renamed from: a, reason: collision with other field name */
    public gv f876a;

    /* renamed from: a, reason: collision with other field name */
    public String f877a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f878a = new BitSet(3);

    /* renamed from: b, reason: collision with other field name */
    public long f879b;

    /* renamed from: b, reason: collision with other field name */
    public String f880b;

    /* renamed from: c, reason: collision with other field name */
    public long f881c;

    /* renamed from: c, reason: collision with other field name */
    public String f882c;

    /* renamed from: d, reason: collision with other field name */
    public String f883d;

    /* renamed from: e, reason: collision with other field name */
    public String f884e;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f874a = new ig("XmPushActionUnRegistrationResult");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14662a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 12, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 10, 6);
    private static final hy f = new hy("", (byte) 11, 7);
    private static final hy g = new hy("", (byte) 11, 8);
    private static final hy h = new hy("", (byte) 10, 9);
    private static final hy i = new hy("", (byte) 10, 10);

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12319a() {
        return this.f877a != null;
    }

    public boolean b() {
        return this.f876a != null;
    }

    public boolean c() {
        return this.f880b != null;
    }

    public boolean d() {
        return this.f882c != null;
    }

    public boolean e() {
        return this.f878a.get(0);
    }

    public void a(boolean z) {
        this.f878a.set(0, z);
    }

    public boolean f() {
        return this.f883d != null;
    }

    public String a() {
        return this.f884e;
    }

    public boolean g() {
        return this.f884e != null;
    }

    public boolean h() {
        return this.f878a.get(1);
    }

    public void b(boolean z) {
        this.f878a.set(1, z);
    }

    public boolean i() {
        return this.f878a.get(2);
    }

    public void c(boolean z) {
        this.f878a.set(2, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hn)) {
            return m12320a((hn) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12320a(hn hnVar) {
        if (hnVar == null) {
            return false;
        }
        boolean m12319a = m12319a();
        boolean m12319a2 = hnVar.m12319a();
        if ((m12319a || m12319a2) && !(m12319a && m12319a2 && this.f877a.equals(hnVar.f877a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = hnVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f876a.m12239a(hnVar.f876a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = hnVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f880b.equals(hnVar.f880b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = hnVar.d();
        if (((d2 || d3) && !(d2 && d3 && this.f882c.equals(hnVar.f882c))) || this.f875a != hnVar.f875a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hnVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f883d.equals(hnVar.f883d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hnVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f884e.equals(hnVar.f884e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hnVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f879b == hnVar.f879b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = hnVar.i();
        if (i2 || i3) {
            return i2 && i3 && this.f881c == hnVar.f881c;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hn hnVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(hnVar.getClass())) {
            return getClass().getName().compareTo(hnVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12319a()).compareTo(Boolean.valueOf(hnVar.m12319a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12319a() && (a10 = hs.a(this.f877a, hnVar.f877a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hnVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a9 = hs.a(this.f876a, hnVar.f876a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hnVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a8 = hs.a(this.f880b, hnVar.f880b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hnVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = hs.a(this.f882c, hnVar.f882c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hnVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = hs.a(this.f875a, hnVar.f875a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hnVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = hs.a(this.f883d, hnVar.f883d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hnVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = hs.a(this.f884e, hnVar.f884e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hnVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = hs.a(this.f879b, hnVar.f879b)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hnVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a2 = hs.a(this.f881c, hnVar.f881c)) == 0) {
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
                            this.f877a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f876a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f880b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f882c = ibVar.mo12340a();
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
                            this.f875a = ibVar.mo12334a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f883d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 11) {
                            this.f884e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 10) {
                            this.f879b = ibVar.mo12334a();
                            b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 10) {
                            this.f881c = ibVar.mo12334a();
                            c(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                }
                ibVar.g();
            } else {
                ibVar.f();
                if (!e()) {
                    throw new ic("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
                }
                m12318a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12318a();
        ibVar.a(f874a);
        if (this.f877a != null && m12319a()) {
            ibVar.a(f14662a);
            ibVar.a(this.f877a);
            ibVar.b();
        }
        if (this.f876a != null && b()) {
            ibVar.a(b);
            this.f876a.b(ibVar);
            ibVar.b();
        }
        if (this.f880b != null) {
            ibVar.a(c);
            ibVar.a(this.f880b);
            ibVar.b();
        }
        if (this.f882c != null) {
            ibVar.a(d);
            ibVar.a(this.f882c);
            ibVar.b();
        }
        ibVar.a(e);
        ibVar.a(this.f875a);
        ibVar.b();
        if (this.f883d != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f883d);
            ibVar.b();
        }
        if (this.f884e != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f884e);
            ibVar.b();
        }
        if (h()) {
            ibVar.a(h);
            ibVar.a(this.f879b);
            ibVar.b();
        }
        if (i()) {
            ibVar.a(i);
            ibVar.a(this.f881c);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = false;
        if (m12319a()) {
            sb.append("debug:");
            String str = this.f877a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            gv gvVar = this.f876a;
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
        String str2 = this.f880b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f882c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f875a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f883d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f884e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f879b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f881c);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12318a() {
        if (this.f880b == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f882c == null) {
            throw new ic("Required field 'appId' was not present! Struct: " + toString());
        }
    }
}
