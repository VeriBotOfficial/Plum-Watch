package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hm implements hr<hm, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f861a;

    /* renamed from: a, reason: collision with other field name */
    public gv f862a;

    /* renamed from: a, reason: collision with other field name */
    public String f863a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f864a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public boolean f865a = true;

    /* renamed from: b, reason: collision with other field name */
    public String f866b;

    /* renamed from: c, reason: collision with other field name */
    public String f867c;

    /* renamed from: d, reason: collision with other field name */
    public String f868d;

    /* renamed from: e, reason: collision with other field name */
    public String f869e;

    /* renamed from: f, reason: collision with other field name */
    public String f870f;

    /* renamed from: g, reason: collision with other field name */
    public String f871g;

    /* renamed from: h, reason: collision with other field name */
    public String f872h;

    /* renamed from: i, reason: collision with other field name */
    public String f873i;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f860a = new ig("XmPushActionUnRegistration");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14661a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 12, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 11, 5);
    private static final hy f = new hy("", (byte) 11, 6);
    private static final hy g = new hy("", (byte) 11, 7);
    private static final hy h = new hy("", (byte) 11, 8);
    private static final hy i = new hy("", (byte) 11, 9);
    private static final hy j = new hy("", (byte) 11, 10);
    private static final hy k = new hy("", (byte) 2, 11);
    private static final hy l = new hy("", (byte) 10, 12);

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12316a() {
        return this.f863a != null;
    }

    public boolean b() {
        return this.f862a != null;
    }

    public hm a(String str) {
        this.f866b = str;
        return this;
    }

    public boolean c() {
        return this.f866b != null;
    }

    public hm b(String str) {
        this.f867c = str;
        return this;
    }

    public boolean d() {
        return this.f867c != null;
    }

    public hm c(String str) {
        this.f868d = str;
        return this;
    }

    public boolean e() {
        return this.f868d != null;
    }

    public boolean f() {
        return this.f869e != null;
    }

    public hm d(String str) {
        this.f870f = str;
        return this;
    }

    public boolean g() {
        return this.f870f != null;
    }

    public hm e(String str) {
        this.f871g = str;
        return this;
    }

    public boolean h() {
        return this.f871g != null;
    }

    public boolean i() {
        return this.f872h != null;
    }

    public boolean j() {
        return this.f873i != null;
    }

    public boolean k() {
        return this.f864a.get(0);
    }

    public void a(boolean z) {
        this.f864a.set(0, z);
    }

    public boolean l() {
        return this.f864a.get(1);
    }

    public void b(boolean z) {
        this.f864a.set(1, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hm)) {
            return m12317a((hm) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12317a(hm hmVar) {
        if (hmVar == null) {
            return false;
        }
        boolean m12316a = m12316a();
        boolean m12316a2 = hmVar.m12316a();
        if ((m12316a || m12316a2) && !(m12316a && m12316a2 && this.f863a.equals(hmVar.f863a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = hmVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f862a.m12239a(hmVar.f862a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = hmVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f866b.equals(hmVar.f866b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = hmVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f867c.equals(hmVar.f867c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = hmVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f868d.equals(hmVar.f868d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hmVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f869e.equals(hmVar.f869e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hmVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f870f.equals(hmVar.f870f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hmVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f871g.equals(hmVar.f871g))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = hmVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f872h.equals(hmVar.f872h))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = hmVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f873i.equals(hmVar.f873i))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = hmVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f865a == hmVar.f865a)) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = hmVar.l();
        if (l2 || l3) {
            return l2 && l3 && this.f861a == hmVar.f861a;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hm hmVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        int a12;
        int a13;
        if (!getClass().equals(hmVar.getClass())) {
            return getClass().getName().compareTo(hmVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12316a()).compareTo(Boolean.valueOf(hmVar.m12316a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12316a() && (a13 = hs.a(this.f863a, hmVar.f863a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hmVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a12 = hs.a(this.f862a, hmVar.f862a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hmVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a11 = hs.a(this.f866b, hmVar.f866b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hmVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a10 = hs.a(this.f867c, hmVar.f867c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hmVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a9 = hs.a(this.f868d, hmVar.f868d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hmVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a8 = hs.a(this.f869e, hmVar.f869e)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hmVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a7 = hs.a(this.f870f, hmVar.f870f)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hmVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a6 = hs.a(this.f871g, hmVar.f871g)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hmVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a5 = hs.a(this.f872h, hmVar.f872h)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hmVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a4 = hs.a(this.f873i, hmVar.f873i)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(hmVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a3 = hs.a(this.f865a, hmVar.f865a)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(hmVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!l() || (a2 = hs.a(this.f861a, hmVar.f861a)) == 0) {
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
                            this.f863a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f862a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f866b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f867c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f868d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 11) {
                            this.f869e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f870f = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 11) {
                            this.f871g = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 11) {
                            this.f872h = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 11) {
                            this.f873i = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 11:
                        if (mo12335a.f14670a == 2) {
                            this.f865a = ibVar.mo12345a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 12:
                        if (mo12335a.f14670a == 10) {
                            this.f861a = ibVar.mo12334a();
                            b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    default:
                        ie.a(ibVar, mo12335a.f14670a);
                        break;
                }
                ibVar.g();
            } else {
                ibVar.f();
                a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        a();
        ibVar.a(f860a);
        if (this.f863a != null && m12316a()) {
            ibVar.a(f14661a);
            ibVar.a(this.f863a);
            ibVar.b();
        }
        if (this.f862a != null && b()) {
            ibVar.a(b);
            this.f862a.b(ibVar);
            ibVar.b();
        }
        if (this.f866b != null) {
            ibVar.a(c);
            ibVar.a(this.f866b);
            ibVar.b();
        }
        if (this.f867c != null) {
            ibVar.a(d);
            ibVar.a(this.f867c);
            ibVar.b();
        }
        if (this.f868d != null && e()) {
            ibVar.a(e);
            ibVar.a(this.f868d);
            ibVar.b();
        }
        if (this.f869e != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f869e);
            ibVar.b();
        }
        if (this.f870f != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f870f);
            ibVar.b();
        }
        if (this.f871g != null && h()) {
            ibVar.a(h);
            ibVar.a(this.f871g);
            ibVar.b();
        }
        if (this.f872h != null && i()) {
            ibVar.a(i);
            ibVar.a(this.f872h);
            ibVar.b();
        }
        if (this.f873i != null && j()) {
            ibVar.a(j);
            ibVar.a(this.f873i);
            ibVar.b();
        }
        if (k()) {
            ibVar.a(k);
            ibVar.a(this.f865a);
            ibVar.b();
        }
        if (l()) {
            ibVar.a(l);
            ibVar.a(this.f861a);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        boolean z2 = false;
        if (m12316a()) {
            sb.append("debug:");
            String str = this.f863a;
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
            gv gvVar = this.f862a;
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
        String str2 = this.f866b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f867c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("regId:");
            String str4 = this.f868d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str5 = this.f869e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f870f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("token:");
            String str7 = this.f871g;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str8 = this.f872h;
            if (str8 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f873i;
            if (str9 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str9);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f865a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f861a);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public void a() {
        if (this.f866b == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f867c == null) {
            throw new ic("Required field 'appId' was not present! Struct: " + toString());
        }
    }
}
