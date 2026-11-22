package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class gr implements hr<gr, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f616a;

    /* renamed from: a, reason: collision with other field name */
    public long f617a;

    /* renamed from: a, reason: collision with other field name */
    public String f618a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f619a = new BitSet(6);

    /* renamed from: a, reason: collision with other field name */
    public boolean f620a;

    /* renamed from: b, reason: collision with other field name */
    public int f621b;

    /* renamed from: b, reason: collision with other field name */
    public boolean f622b;

    /* renamed from: c, reason: collision with other field name */
    public int f623c;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f615a = new ig("OnlineConfigItem");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14635a = new hy("", (byte) 8, 1);
    private static final hy b = new hy("", (byte) 8, 2);
    private static final hy c = new hy("", (byte) 2, 3);
    private static final hy d = new hy("", (byte) 8, 4);
    private static final hy e = new hy("", (byte) 10, 5);
    private static final hy f = new hy("", (byte) 11, 6);
    private static final hy g = new hy("", (byte) 2, 7);

    /* renamed from: a, reason: collision with other method in class */
    public void m12214a() {
    }

    public int hashCode() {
        return 0;
    }

    public int a() {
        return this.f616a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12215a() {
        return this.f619a.get(0);
    }

    public void a(boolean z) {
        this.f619a.set(0, z);
    }

    public int b() {
        return this.f621b;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12217b() {
        return this.f619a.get(1);
    }

    public void b(boolean z) {
        this.f619a.set(1, z);
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m12218c() {
        return this.f619a.get(2);
    }

    public void c(boolean z) {
        this.f619a.set(2, z);
    }

    public int c() {
        return this.f623c;
    }

    public boolean d() {
        return this.f619a.get(3);
    }

    public void d(boolean z) {
        this.f619a.set(3, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m12212a() {
        return this.f617a;
    }

    public boolean e() {
        return this.f619a.get(4);
    }

    public void e(boolean z) {
        this.f619a.set(4, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m12213a() {
        return this.f618a;
    }

    public boolean f() {
        return this.f618a != null;
    }

    public boolean g() {
        return this.f622b;
    }

    public boolean h() {
        return this.f619a.get(5);
    }

    public void f(boolean z) {
        this.f619a.set(5, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gr)) {
            return m12216a((gr) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12216a(gr grVar) {
        if (grVar == null) {
            return false;
        }
        boolean m12215a = m12215a();
        boolean m12215a2 = grVar.m12215a();
        if ((m12215a || m12215a2) && !(m12215a && m12215a2 && this.f616a == grVar.f616a)) {
            return false;
        }
        boolean m12217b = m12217b();
        boolean m12217b2 = grVar.m12217b();
        if ((m12217b || m12217b2) && !(m12217b && m12217b2 && this.f621b == grVar.f621b)) {
            return false;
        }
        boolean m12218c = m12218c();
        boolean m12218c2 = grVar.m12218c();
        if ((m12218c || m12218c2) && !(m12218c && m12218c2 && this.f620a == grVar.f620a)) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = grVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f623c == grVar.f623c)) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = grVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f617a == grVar.f617a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = grVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f618a.equals(grVar.f618a))) {
            return false;
        }
        boolean h = h();
        boolean h2 = grVar.h();
        if (h || h2) {
            return h && h2 && this.f622b == grVar.f622b;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gr grVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(grVar.getClass())) {
            return getClass().getName().compareTo(grVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12215a()).compareTo(Boolean.valueOf(grVar.m12215a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12215a() && (a8 = hs.a(this.f616a, grVar.f616a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(m12217b()).compareTo(Boolean.valueOf(grVar.m12217b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m12217b() && (a7 = hs.a(this.f621b, grVar.f621b)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(m12218c()).compareTo(Boolean.valueOf(grVar.m12218c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m12218c() && (a6 = hs.a(this.f620a, grVar.f620a)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(grVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a5 = hs.a(this.f623c, grVar.f623c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(grVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a4 = hs.a(this.f617a, grVar.f617a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(grVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a3 = hs.a(this.f618a, grVar.f618a)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(grVar.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!h() || (a2 = hs.a(this.f622b, grVar.f622b)) == 0) {
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
                        if (mo12335a.f14670a == 8) {
                            this.f616a = ibVar.mo12333a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 8) {
                            this.f621b = ibVar.mo12333a();
                            b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 2) {
                            this.f620a = ibVar.mo12345a();
                            c(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 8) {
                            this.f623c = ibVar.mo12333a();
                            d(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 10) {
                            this.f617a = ibVar.mo12334a();
                            e(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 11) {
                            this.f618a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 2) {
                            this.f622b = ibVar.mo12345a();
                            f(true);
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
                m12214a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12214a();
        ibVar.a(f615a);
        if (m12215a()) {
            ibVar.a(f14635a);
            ibVar.mo12344a(this.f616a);
            ibVar.b();
        }
        if (m12217b()) {
            ibVar.a(b);
            ibVar.mo12344a(this.f621b);
            ibVar.b();
        }
        if (m12218c()) {
            ibVar.a(c);
            ibVar.a(this.f620a);
            ibVar.b();
        }
        if (d()) {
            ibVar.a(d);
            ibVar.mo12344a(this.f623c);
            ibVar.b();
        }
        if (e()) {
            ibVar.a(e);
            ibVar.a(this.f617a);
            ibVar.b();
        }
        if (this.f618a != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f618a);
            ibVar.b();
        }
        if (h()) {
            ibVar.a(g);
            ibVar.a(this.f622b);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (m12215a()) {
            sb.append("key:");
            sb.append(this.f616a);
            z = false;
        } else {
            z = true;
        }
        if (m12217b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f621b);
            z = false;
        }
        if (m12218c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f620a);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f623c);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f617a);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f618a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
        } else {
            z2 = z;
        }
        if (h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f622b);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
