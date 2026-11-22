package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hk implements hr<hk, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public gv f841a;

    /* renamed from: a, reason: collision with other field name */
    public String f842a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f843a;

    /* renamed from: b, reason: collision with other field name */
    public String f844b;

    /* renamed from: c, reason: collision with other field name */
    public String f845c;

    /* renamed from: d, reason: collision with other field name */
    public String f846d;

    /* renamed from: e, reason: collision with other field name */
    public String f847e;

    /* renamed from: f, reason: collision with other field name */
    public String f848f;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f840a = new ig("XmPushActionSubscription");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14659a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 12, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 11, 5);
    private static final hy f = new hy("", (byte) 11, 6);
    private static final hy g = new hy("", (byte) 11, 7);
    private static final hy h = new hy("", (byte) 15, 8);

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12309a() {
        return this.f842a != null;
    }

    public boolean b() {
        return this.f841a != null;
    }

    public hk a(String str) {
        this.f844b = str;
        return this;
    }

    public boolean c() {
        return this.f844b != null;
    }

    public hk b(String str) {
        this.f845c = str;
        return this;
    }

    public boolean d() {
        return this.f845c != null;
    }

    public hk c(String str) {
        this.f846d = str;
        return this;
    }

    public boolean e() {
        return this.f846d != null;
    }

    public hk d(String str) {
        this.f847e = str;
        return this;
    }

    public boolean f() {
        return this.f847e != null;
    }

    public hk e(String str) {
        this.f848f = str;
        return this;
    }

    public boolean g() {
        return this.f848f != null;
    }

    public boolean h() {
        return this.f843a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hk)) {
            return m12310a((hk) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12310a(hk hkVar) {
        if (hkVar == null) {
            return false;
        }
        boolean m12309a = m12309a();
        boolean m12309a2 = hkVar.m12309a();
        if ((m12309a || m12309a2) && !(m12309a && m12309a2 && this.f842a.equals(hkVar.f842a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = hkVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f841a.m12239a(hkVar.f841a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = hkVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f844b.equals(hkVar.f844b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = hkVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f845c.equals(hkVar.f845c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = hkVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f846d.equals(hkVar.f846d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hkVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f847e.equals(hkVar.f847e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hkVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f848f.equals(hkVar.f848f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hkVar.h();
        if (h2 || h3) {
            return h2 && h3 && this.f843a.equals(hkVar.f843a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hk hkVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(hkVar.getClass())) {
            return getClass().getName().compareTo(hkVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12309a()).compareTo(Boolean.valueOf(hkVar.m12309a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12309a() && (a9 = hs.a(this.f842a, hkVar.f842a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hkVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a8 = hs.a(this.f841a, hkVar.f841a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hkVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a7 = hs.a(this.f844b, hkVar.f844b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hkVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a6 = hs.a(this.f845c, hkVar.f845c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hkVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a5 = hs.a(this.f846d, hkVar.f846d)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hkVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a4 = hs.a(this.f847e, hkVar.f847e)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hkVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a3 = hs.a(this.f848f, hkVar.f848f)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hkVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!h() || (a2 = hs.a(this.f843a, hkVar.f843a)) == 0) {
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
                            this.f842a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f841a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f844b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f845c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f846d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 11) {
                            this.f847e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f848f = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 15) {
                            hz mo12336a = ibVar.mo12336a();
                            this.f843a = new ArrayList(mo12336a.f916a);
                            for (int i = 0; i < mo12336a.f916a; i++) {
                                this.f843a.add(ibVar.mo12340a());
                            }
                            ibVar.i();
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
        ibVar.a(f840a);
        if (this.f842a != null && m12309a()) {
            ibVar.a(f14659a);
            ibVar.a(this.f842a);
            ibVar.b();
        }
        if (this.f841a != null && b()) {
            ibVar.a(b);
            this.f841a.b(ibVar);
            ibVar.b();
        }
        if (this.f844b != null) {
            ibVar.a(c);
            ibVar.a(this.f844b);
            ibVar.b();
        }
        if (this.f845c != null) {
            ibVar.a(d);
            ibVar.a(this.f845c);
            ibVar.b();
        }
        if (this.f846d != null) {
            ibVar.a(e);
            ibVar.a(this.f846d);
            ibVar.b();
        }
        if (this.f847e != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f847e);
            ibVar.b();
        }
        if (this.f848f != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f848f);
            ibVar.b();
        }
        if (this.f843a != null && h()) {
            ibVar.a(h);
            ibVar.a(new hz((byte) 11, this.f843a.size()));
            Iterator<String> it = this.f843a.iterator();
            while (it.hasNext()) {
                ibVar.a(it.next());
            }
            ibVar.e();
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (m12309a()) {
            sb.append("debug:");
            String str = this.f842a;
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
            gv gvVar = this.f841a;
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
        String str2 = this.f844b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f845c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f846d;
        if (str4 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str4);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f847e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f848f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f843a;
            if (list == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(list);
            }
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public void a() {
        if (this.f844b == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f845c == null) {
            throw new ic("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f846d == null) {
            throw new ic("Required field 'topic' was not present! Struct: " + toString());
        }
    }
}
