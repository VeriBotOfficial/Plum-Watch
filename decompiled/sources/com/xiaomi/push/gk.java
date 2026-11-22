package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class gk implements hr<gk, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f585a;

    /* renamed from: a, reason: collision with other field name */
    public String f586a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f587a = new BitSet(3);

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f588a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f589a;

    /* renamed from: b, reason: collision with other field name */
    public long f590b;

    /* renamed from: b, reason: collision with other field name */
    public String f591b;

    /* renamed from: c, reason: collision with other field name */
    public String f592c;

    /* renamed from: d, reason: collision with other field name */
    public String f593d;

    /* renamed from: e, reason: collision with other field name */
    public String f594e;

    /* renamed from: f, reason: collision with other field name */
    public String f595f;

    /* renamed from: g, reason: collision with other field name */
    public String f596g;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f584a = new ig("ClientUploadDataItem");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14624a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 11, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 10, 4);
    private static final hy e = new hy("", (byte) 10, 5);
    private static final hy f = new hy("", (byte) 2, 6);
    private static final hy g = new hy("", (byte) 11, 7);
    private static final hy h = new hy("", (byte) 11, 8);
    private static final hy i = new hy("", (byte) 11, 9);
    private static final hy j = new hy("", (byte) 13, 10);
    private static final hy k = new hy("", (byte) 11, 11);

    /* renamed from: a, reason: collision with other method in class */
    public void m12197a() {
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m12195a() {
        return this.f586a;
    }

    public gk a(String str) {
        this.f586a = str;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12199a() {
        return this.f586a != null;
    }

    public gk b(String str) {
        this.f591b = str;
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12201b() {
        return this.f591b != null;
    }

    public String b() {
        return this.f592c;
    }

    public gk c(String str) {
        this.f592c = str;
        return this;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m12202c() {
        return this.f592c != null;
    }

    public gk a(long j2) {
        this.f585a = j2;
        m12198a(true);
        return this;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m12203d() {
        return this.f587a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12198a(boolean z) {
        this.f587a.set(0, z);
    }

    public long a() {
        return this.f590b;
    }

    public gk b(long j2) {
        this.f590b = j2;
        b(true);
        return this;
    }

    /* renamed from: e, reason: collision with other method in class */
    public boolean m12204e() {
        return this.f587a.get(1);
    }

    public void b(boolean z) {
        this.f587a.set(1, z);
    }

    public gk a(boolean z) {
        this.f589a = z;
        c(true);
        return this;
    }

    public boolean f() {
        return this.f587a.get(2);
    }

    public void c(boolean z) {
        this.f587a.set(2, z);
    }

    public gk d(String str) {
        this.f593d = str;
        return this;
    }

    public boolean g() {
        return this.f593d != null;
    }

    public String c() {
        return this.f594e;
    }

    public gk e(String str) {
        this.f594e = str;
        return this;
    }

    public boolean h() {
        return this.f594e != null;
    }

    public String d() {
        return this.f595f;
    }

    public gk f(String str) {
        this.f595f = str;
        return this;
    }

    public boolean i() {
        return this.f595f != null;
    }

    public void a(String str, String str2) {
        if (this.f588a == null) {
            this.f588a = new HashMap();
        }
        this.f588a.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m12196a() {
        return this.f588a;
    }

    public gk a(Map<String, String> map) {
        this.f588a = map;
        return this;
    }

    public boolean j() {
        return this.f588a != null;
    }

    public String e() {
        return this.f596g;
    }

    public gk g(String str) {
        this.f596g = str;
        return this;
    }

    public boolean k() {
        return this.f596g != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gk)) {
            return m12200a((gk) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12200a(gk gkVar) {
        if (gkVar == null) {
            return false;
        }
        boolean m12199a = m12199a();
        boolean m12199a2 = gkVar.m12199a();
        if ((m12199a || m12199a2) && !(m12199a && m12199a2 && this.f586a.equals(gkVar.f586a))) {
            return false;
        }
        boolean m12201b = m12201b();
        boolean m12201b2 = gkVar.m12201b();
        if ((m12201b || m12201b2) && !(m12201b && m12201b2 && this.f591b.equals(gkVar.f591b))) {
            return false;
        }
        boolean m12202c = m12202c();
        boolean m12202c2 = gkVar.m12202c();
        if ((m12202c || m12202c2) && !(m12202c && m12202c2 && this.f592c.equals(gkVar.f592c))) {
            return false;
        }
        boolean m12203d = m12203d();
        boolean m12203d2 = gkVar.m12203d();
        if ((m12203d || m12203d2) && !(m12203d && m12203d2 && this.f585a == gkVar.f585a)) {
            return false;
        }
        boolean m12204e = m12204e();
        boolean m12204e2 = gkVar.m12204e();
        if ((m12204e || m12204e2) && !(m12204e && m12204e2 && this.f590b == gkVar.f590b)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = gkVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f589a == gkVar.f589a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = gkVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f593d.equals(gkVar.f593d))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = gkVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f594e.equals(gkVar.f594e))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = gkVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f595f.equals(gkVar.f595f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = gkVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f588a.equals(gkVar.f588a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = gkVar.k();
        if (k2 || k3) {
            return k2 && k3 && this.f596g.equals(gkVar.f596g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gk gkVar) {
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
        if (!getClass().equals(gkVar.getClass())) {
            return getClass().getName().compareTo(gkVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12199a()).compareTo(Boolean.valueOf(gkVar.m12199a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12199a() && (a12 = hs.a(this.f586a, gkVar.f586a)) != 0) {
            return a12;
        }
        int compareTo2 = Boolean.valueOf(m12201b()).compareTo(Boolean.valueOf(gkVar.m12201b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m12201b() && (a11 = hs.a(this.f591b, gkVar.f591b)) != 0) {
            return a11;
        }
        int compareTo3 = Boolean.valueOf(m12202c()).compareTo(Boolean.valueOf(gkVar.m12202c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m12202c() && (a10 = hs.a(this.f592c, gkVar.f592c)) != 0) {
            return a10;
        }
        int compareTo4 = Boolean.valueOf(m12203d()).compareTo(Boolean.valueOf(gkVar.m12203d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m12203d() && (a9 = hs.a(this.f585a, gkVar.f585a)) != 0) {
            return a9;
        }
        int compareTo5 = Boolean.valueOf(m12204e()).compareTo(Boolean.valueOf(gkVar.m12204e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m12204e() && (a8 = hs.a(this.f590b, gkVar.f590b)) != 0) {
            return a8;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(gkVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a7 = hs.a(this.f589a, gkVar.f589a)) != 0) {
            return a7;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(gkVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a6 = hs.a(this.f593d, gkVar.f593d)) != 0) {
            return a6;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(gkVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a5 = hs.a(this.f594e, gkVar.f594e)) != 0) {
            return a5;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(gkVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a4 = hs.a(this.f595f, gkVar.f595f)) != 0) {
            return a4;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(gkVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a3 = hs.a(this.f588a, gkVar.f588a)) != 0) {
            return a3;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(gkVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (!k() || (a2 = hs.a(this.f596g, gkVar.f596g)) == 0) {
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
                            this.f586a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 11) {
                            this.f591b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f592c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 10) {
                            this.f585a = ibVar.mo12334a();
                            m12198a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 10) {
                            this.f590b = ibVar.mo12334a();
                            b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 2) {
                            this.f589a = ibVar.mo12345a();
                            c(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f593d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 11) {
                            this.f594e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 11) {
                            this.f595f = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 13) {
                            ia mo12337a = ibVar.mo12337a();
                            this.f588a = new HashMap(mo12337a.f919a * 2);
                            for (int i2 = 0; i2 < mo12337a.f919a; i2++) {
                                this.f588a.put(ibVar.mo12340a(), ibVar.mo12340a());
                            }
                            ibVar.h();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 11:
                        if (mo12335a.f14670a == 11) {
                            this.f596g = ibVar.mo12340a();
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
                m12197a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12197a();
        ibVar.a(f584a);
        if (this.f586a != null && m12199a()) {
            ibVar.a(f14624a);
            ibVar.a(this.f586a);
            ibVar.b();
        }
        if (this.f591b != null && m12201b()) {
            ibVar.a(b);
            ibVar.a(this.f591b);
            ibVar.b();
        }
        if (this.f592c != null && m12202c()) {
            ibVar.a(c);
            ibVar.a(this.f592c);
            ibVar.b();
        }
        if (m12203d()) {
            ibVar.a(d);
            ibVar.a(this.f585a);
            ibVar.b();
        }
        if (m12204e()) {
            ibVar.a(e);
            ibVar.a(this.f590b);
            ibVar.b();
        }
        if (f()) {
            ibVar.a(f);
            ibVar.a(this.f589a);
            ibVar.b();
        }
        if (this.f593d != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f593d);
            ibVar.b();
        }
        if (this.f594e != null && h()) {
            ibVar.a(h);
            ibVar.a(this.f594e);
            ibVar.b();
        }
        if (this.f595f != null && i()) {
            ibVar.a(i);
            ibVar.a(this.f595f);
            ibVar.b();
        }
        if (this.f588a != null && j()) {
            ibVar.a(j);
            ibVar.a(new ia((byte) 11, (byte) 11, this.f588a.size()));
            for (Map.Entry<String, String> entry : this.f588a.entrySet()) {
                ibVar.a(entry.getKey());
                ibVar.a(entry.getValue());
            }
            ibVar.d();
            ibVar.b();
        }
        if (this.f596g != null && k()) {
            ibVar.a(k);
            ibVar.a(this.f596g);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (m12199a()) {
            sb.append("channel:");
            String str = this.f586a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m12201b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f591b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (m12202c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f592c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (m12203d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f585a);
            z = false;
        }
        if (m12204e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f590b);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f589a);
            z = false;
        }
        if (g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f593d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f594e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f595f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f588a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        } else {
            z2 = z;
        }
        if (k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f596g;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
