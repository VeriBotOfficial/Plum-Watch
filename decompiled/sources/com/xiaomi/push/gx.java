package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class gx implements hr<gx, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public gv f693a;

    /* renamed from: a, reason: collision with other field name */
    public String f694a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f696a;

    /* renamed from: b, reason: collision with other field name */
    public String f697b;

    /* renamed from: c, reason: collision with other field name */
    public String f698c;

    /* renamed from: d, reason: collision with other field name */
    public String f699d;

    /* renamed from: e, reason: collision with other field name */
    public String f700e;

    /* renamed from: f, reason: collision with other field name */
    public String f701f;

    /* renamed from: g, reason: collision with other field name */
    public String f702g;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f691a = new ig("XmPushActionAckNotification");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14643a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 12, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 11, 5);
    private static final hy f = new hy("", (byte) 10, 7);
    private static final hy g = new hy("", (byte) 11, 8);
    private static final hy h = new hy("", (byte) 13, 9);
    private static final hy i = new hy("", (byte) 11, 10);
    private static final hy j = new hy("", (byte) 11, 11);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f695a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    public long f692a = 0;

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12244a() {
        return this.f694a != null;
    }

    public gx a(gv gvVar) {
        this.f693a = gvVar;
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12246b() {
        return this.f693a != null;
    }

    public String a() {
        return this.f697b;
    }

    public gx a(String str) {
        this.f697b = str;
        return this;
    }

    public boolean c() {
        return this.f697b != null;
    }

    public gx b(String str) {
        this.f698c = str;
        return this;
    }

    public boolean d() {
        return this.f698c != null;
    }

    public String b() {
        return this.f699d;
    }

    public gx c(String str) {
        this.f699d = str;
        return this;
    }

    public boolean e() {
        return this.f699d != null;
    }

    public gx a(long j2) {
        this.f692a = j2;
        a(true);
        return this;
    }

    public boolean f() {
        return this.f695a.get(0);
    }

    public void a(boolean z) {
        this.f695a.set(0, z);
    }

    public gx d(String str) {
        this.f700e = str;
        return this;
    }

    public boolean g() {
        return this.f700e != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m12242a() {
        return this.f696a;
    }

    public boolean h() {
        return this.f696a != null;
    }

    public gx e(String str) {
        this.f701f = str;
        return this;
    }

    public boolean i() {
        return this.f701f != null;
    }

    public boolean j() {
        return this.f702g != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gx)) {
            return m12245a((gx) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12245a(gx gxVar) {
        if (gxVar == null) {
            return false;
        }
        boolean m12244a = m12244a();
        boolean m12244a2 = gxVar.m12244a();
        if ((m12244a || m12244a2) && !(m12244a && m12244a2 && this.f694a.equals(gxVar.f694a))) {
            return false;
        }
        boolean m12246b = m12246b();
        boolean m12246b2 = gxVar.m12246b();
        if ((m12246b || m12246b2) && !(m12246b && m12246b2 && this.f693a.m12239a(gxVar.f693a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = gxVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f697b.equals(gxVar.f697b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = gxVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f698c.equals(gxVar.f698c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = gxVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f699d.equals(gxVar.f699d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = gxVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f692a == gxVar.f692a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = gxVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f700e.equals(gxVar.f700e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = gxVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f696a.equals(gxVar.f696a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = gxVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f701f.equals(gxVar.f701f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = gxVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f702g.equals(gxVar.f702g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gx gxVar) {
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
        if (!getClass().equals(gxVar.getClass())) {
            return getClass().getName().compareTo(gxVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12244a()).compareTo(Boolean.valueOf(gxVar.m12244a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12244a() && (a11 = hs.a(this.f694a, gxVar.f694a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(m12246b()).compareTo(Boolean.valueOf(gxVar.m12246b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m12246b() && (a10 = hs.a(this.f693a, gxVar.f693a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(gxVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = hs.a(this.f697b, gxVar.f697b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(gxVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = hs.a(this.f698c, gxVar.f698c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(gxVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = hs.a(this.f699d, gxVar.f699d)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(gxVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = hs.a(this.f692a, gxVar.f692a)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(gxVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = hs.a(this.f700e, gxVar.f700e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(gxVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = hs.a(this.f696a, gxVar.f696a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(gxVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = hs.a(this.f701f, gxVar.f701f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(gxVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = hs.a(this.f702g, gxVar.f702g)) == 0) {
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
                            this.f694a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f693a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f697b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f698c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f699d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                    default:
                        ie.a(ibVar, mo12335a.f14670a);
                        break;
                    case 7:
                        if (mo12335a.f14670a == 10) {
                            this.f692a = ibVar.mo12334a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 11) {
                            this.f700e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 13) {
                            ia mo12337a = ibVar.mo12337a();
                            this.f696a = new HashMap(mo12337a.f919a * 2);
                            for (int i2 = 0; i2 < mo12337a.f919a; i2++) {
                                this.f696a.put(ibVar.mo12340a(), ibVar.mo12340a());
                            }
                            ibVar.h();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 11) {
                            this.f701f = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 11:
                        if (mo12335a.f14670a == 11) {
                            this.f702g = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                }
                ibVar.g();
            } else {
                ibVar.f();
                m12243a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12243a();
        ibVar.a(f691a);
        if (this.f694a != null && m12244a()) {
            ibVar.a(f14643a);
            ibVar.a(this.f694a);
            ibVar.b();
        }
        if (this.f693a != null && m12246b()) {
            ibVar.a(b);
            this.f693a.b(ibVar);
            ibVar.b();
        }
        if (this.f697b != null) {
            ibVar.a(c);
            ibVar.a(this.f697b);
            ibVar.b();
        }
        if (this.f698c != null && d()) {
            ibVar.a(d);
            ibVar.a(this.f698c);
            ibVar.b();
        }
        if (this.f699d != null && e()) {
            ibVar.a(e);
            ibVar.a(this.f699d);
            ibVar.b();
        }
        if (f()) {
            ibVar.a(f);
            ibVar.a(this.f692a);
            ibVar.b();
        }
        if (this.f700e != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f700e);
            ibVar.b();
        }
        if (this.f696a != null && h()) {
            ibVar.a(h);
            ibVar.a(new ia((byte) 11, (byte) 11, this.f696a.size()));
            for (Map.Entry<String, String> entry : this.f696a.entrySet()) {
                ibVar.a(entry.getKey());
                ibVar.a(entry.getValue());
            }
            ibVar.d();
            ibVar.b();
        }
        if (this.f701f != null && i()) {
            ibVar.a(i);
            ibVar.a(this.f701f);
            ibVar.b();
        }
        if (this.f702g != null && j()) {
            ibVar.a(j);
            ibVar.a(this.f702g);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (m12244a()) {
            sb.append("debug:");
            String str = this.f694a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m12246b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            gv gvVar = this.f693a;
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
        String str2 = this.f697b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f698c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f699d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f692a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f700e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f696a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f701f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f702g;
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
    public void m12243a() {
        if (this.f697b == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
    }
}
