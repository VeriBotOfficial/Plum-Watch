package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class ha implements hr<ha, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f710a;

    /* renamed from: a, reason: collision with other field name */
    public gv f711a;

    /* renamed from: a, reason: collision with other field name */
    public String f712a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f714a;

    /* renamed from: b, reason: collision with other field name */
    public String f716b;

    /* renamed from: c, reason: collision with other field name */
    public String f718c;

    /* renamed from: d, reason: collision with other field name */
    public String f719d;

    /* renamed from: e, reason: collision with other field name */
    public String f720e;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f709a = new ig("XmPushActionCommand");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14647a = new hy("", (byte) 12, 2);
    private static final hy b = new hy("", (byte) 11, 3);
    private static final hy c = new hy("", (byte) 11, 4);
    private static final hy d = new hy("", (byte) 11, 5);
    private static final hy e = new hy("", (byte) 15, 6);
    private static final hy f = new hy("", (byte) 11, 7);
    private static final hy g = new hy("", (byte) 11, 9);
    private static final hy h = new hy("", (byte) 2, 10);
    private static final hy i = new hy("", (byte) 2, 11);
    private static final hy j = new hy("", (byte) 10, 12);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f713a = new BitSet(3);

    /* renamed from: a, reason: collision with other field name */
    public boolean f715a = false;

    /* renamed from: b, reason: collision with other field name */
    public boolean f717b = true;

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12253a() {
        return this.f711a != null;
    }

    public ha a(String str) {
        this.f712a = str;
        return this;
    }

    public boolean b() {
        return this.f712a != null;
    }

    public ha b(String str) {
        this.f716b = str;
        return this;
    }

    public boolean c() {
        return this.f716b != null;
    }

    public String a() {
        return this.f718c;
    }

    public ha c(String str) {
        this.f718c = str;
        return this;
    }

    public boolean d() {
        return this.f718c != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12252a(String str) {
        if (this.f714a == null) {
            this.f714a = new ArrayList();
        }
        this.f714a.add(str);
    }

    public boolean e() {
        return this.f714a != null;
    }

    public ha d(String str) {
        this.f719d = str;
        return this;
    }

    public boolean f() {
        return this.f719d != null;
    }

    public ha e(String str) {
        this.f720e = str;
        return this;
    }

    public boolean g() {
        return this.f720e != null;
    }

    public boolean h() {
        return this.f713a.get(0);
    }

    public void a(boolean z) {
        this.f713a.set(0, z);
    }

    public boolean i() {
        return this.f713a.get(1);
    }

    public void b(boolean z) {
        this.f713a.set(1, z);
    }

    public boolean j() {
        return this.f713a.get(2);
    }

    public void c(boolean z) {
        this.f713a.set(2, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ha)) {
            return m12254a((ha) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12254a(ha haVar) {
        if (haVar == null) {
            return false;
        }
        boolean m12253a = m12253a();
        boolean m12253a2 = haVar.m12253a();
        if ((m12253a || m12253a2) && !(m12253a && m12253a2 && this.f711a.m12239a(haVar.f711a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = haVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f712a.equals(haVar.f712a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = haVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f716b.equals(haVar.f716b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = haVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f718c.equals(haVar.f718c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = haVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f714a.equals(haVar.f714a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = haVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f719d.equals(haVar.f719d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = haVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f720e.equals(haVar.f720e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = haVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f715a == haVar.f715a)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = haVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f717b == haVar.f717b)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = haVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f710a == haVar.f710a;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ha haVar) {
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
        if (!getClass().equals(haVar.getClass())) {
            return getClass().getName().compareTo(haVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12253a()).compareTo(Boolean.valueOf(haVar.m12253a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12253a() && (a11 = hs.a(this.f711a, haVar.f711a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(haVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a10 = hs.a(this.f712a, haVar.f712a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(haVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = hs.a(this.f716b, haVar.f716b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(haVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = hs.a(this.f718c, haVar.f718c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(haVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = hs.a(this.f714a, haVar.f714a)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(haVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = hs.a(this.f719d, haVar.f719d)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(haVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = hs.a(this.f720e, haVar.f720e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(haVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = hs.a(this.f715a, haVar.f715a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(haVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = hs.a(this.f717b, haVar.f717b)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(haVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = hs.a(this.f710a, haVar.f710a)) == 0) {
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
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f711a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f712a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f716b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f718c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 15) {
                            hz mo12336a = ibVar.mo12336a();
                            this.f714a = new ArrayList(mo12336a.f916a);
                            for (int i2 = 0; i2 < mo12336a.f916a; i2++) {
                                this.f714a.add(ibVar.mo12340a());
                            }
                            ibVar.i();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f719d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                    default:
                        ie.a(ibVar, mo12335a.f14670a);
                        break;
                    case 9:
                        if (mo12335a.f14670a == 11) {
                            this.f720e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 2) {
                            this.f715a = ibVar.mo12345a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 11:
                        if (mo12335a.f14670a == 2) {
                            this.f717b = ibVar.mo12345a();
                            b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 12:
                        if (mo12335a.f14670a == 10) {
                            this.f710a = ibVar.mo12334a();
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
                m12251a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12251a();
        ibVar.a(f709a);
        if (this.f711a != null && m12253a()) {
            ibVar.a(f14647a);
            this.f711a.b(ibVar);
            ibVar.b();
        }
        if (this.f712a != null) {
            ibVar.a(b);
            ibVar.a(this.f712a);
            ibVar.b();
        }
        if (this.f716b != null) {
            ibVar.a(c);
            ibVar.a(this.f716b);
            ibVar.b();
        }
        if (this.f718c != null) {
            ibVar.a(d);
            ibVar.a(this.f718c);
            ibVar.b();
        }
        if (this.f714a != null && e()) {
            ibVar.a(e);
            ibVar.a(new hz((byte) 11, this.f714a.size()));
            Iterator<String> it = this.f714a.iterator();
            while (it.hasNext()) {
                ibVar.a(it.next());
            }
            ibVar.e();
            ibVar.b();
        }
        if (this.f719d != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f719d);
            ibVar.b();
        }
        if (this.f720e != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f720e);
            ibVar.b();
        }
        if (h()) {
            ibVar.a(h);
            ibVar.a(this.f715a);
            ibVar.b();
        }
        if (i()) {
            ibVar.a(i);
            ibVar.a(this.f717b);
            ibVar.b();
        }
        if (j()) {
            ibVar.a(j);
            ibVar.a(this.f710a);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m12253a()) {
            sb.append("target:");
            gv gvVar = this.f711a;
            if (gvVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(gvVar);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f712a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f716b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f718c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f714a;
            if (list == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(list);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f719d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f720e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f715a);
        }
        if (i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f717b);
        }
        if (j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f710a);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12251a() {
        if (this.f712a == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f716b == null) {
            throw new ic("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f718c == null) {
            throw new ic("Required field 'cmdName' was not present! Struct: " + toString());
        }
    }
}
