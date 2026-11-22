package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class ek implements hr<ek, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public byte f446a;

    /* renamed from: a, reason: collision with other field name */
    public int f447a;

    /* renamed from: a, reason: collision with other field name */
    public String f448a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f449a = new BitSet(6);

    /* renamed from: b, reason: collision with other field name */
    public int f450b;

    /* renamed from: b, reason: collision with other field name */
    public String f451b;

    /* renamed from: c, reason: collision with other field name */
    public int f452c;

    /* renamed from: c, reason: collision with other field name */
    public String f453c;

    /* renamed from: d, reason: collision with other field name */
    public int f454d;

    /* renamed from: d, reason: collision with other field name */
    public String f455d;

    /* renamed from: e, reason: collision with other field name */
    public int f456e;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f445a = new ig("StatsEvent");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14558a = new hy("", (byte) 3, 1);
    private static final hy b = new hy("", (byte) 8, 2);
    private static final hy c = new hy("", (byte) 8, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 11, 5);
    private static final hy f = new hy("", (byte) 8, 6);
    private static final hy g = new hy("", (byte) 11, 7);
    private static final hy h = new hy("", (byte) 11, 8);
    private static final hy i = new hy("", (byte) 8, 9);
    private static final hy j = new hy("", (byte) 8, 10);

    public int hashCode() {
        return 0;
    }

    public ek a(byte b2) {
        this.f446a = b2;
        a(true);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12108a() {
        return this.f449a.get(0);
    }

    public void a(boolean z) {
        this.f449a.set(0, z);
    }

    public ek a(int i2) {
        this.f447a = i2;
        b(true);
        return this;
    }

    public boolean b() {
        return this.f449a.get(1);
    }

    public void b(boolean z) {
        this.f449a.set(1, z);
    }

    public ek b(int i2) {
        this.f450b = i2;
        c(true);
        return this;
    }

    public boolean c() {
        return this.f449a.get(2);
    }

    public void c(boolean z) {
        this.f449a.set(2, z);
    }

    public ek a(String str) {
        this.f448a = str;
        return this;
    }

    public boolean d() {
        return this.f448a != null;
    }

    public ek b(String str) {
        this.f451b = str;
        return this;
    }

    public boolean e() {
        return this.f451b != null;
    }

    public ek c(int i2) {
        this.f452c = i2;
        d(true);
        return this;
    }

    public boolean f() {
        return this.f449a.get(3);
    }

    public void d(boolean z) {
        this.f449a.set(3, z);
    }

    public ek c(String str) {
        this.f453c = str;
        return this;
    }

    public boolean g() {
        return this.f453c != null;
    }

    public ek d(String str) {
        this.f455d = str;
        return this;
    }

    public boolean h() {
        return this.f455d != null;
    }

    public ek d(int i2) {
        this.f454d = i2;
        e(true);
        return this;
    }

    public boolean i() {
        return this.f449a.get(4);
    }

    public void e(boolean z) {
        this.f449a.set(4, z);
    }

    public boolean j() {
        return this.f449a.get(5);
    }

    public void f(boolean z) {
        this.f449a.set(5, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ek)) {
            return m12109a((ek) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12109a(ek ekVar) {
        if (ekVar == null || this.f446a != ekVar.f446a || this.f447a != ekVar.f447a || this.f450b != ekVar.f450b) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ekVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f448a.equals(ekVar.f448a))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ekVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f451b.equals(ekVar.f451b))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ekVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f452c == ekVar.f452c)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ekVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f453c.equals(ekVar.f453c))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ekVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f455d.equals(ekVar.f455d))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ekVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f454d == ekVar.f454d)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ekVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f456e == ekVar.f456e;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ek ekVar) {
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
        if (!getClass().equals(ekVar.getClass())) {
            return getClass().getName().compareTo(ekVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12108a()).compareTo(Boolean.valueOf(ekVar.m12108a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12108a() && (a11 = hs.a(this.f446a, ekVar.f446a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ekVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a10 = hs.a(this.f447a, ekVar.f447a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ekVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = hs.a(this.f450b, ekVar.f450b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ekVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = hs.a(this.f448a, ekVar.f448a)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ekVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = hs.a(this.f451b, ekVar.f451b)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ekVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = hs.a(this.f452c, ekVar.f452c)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ekVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = hs.a(this.f453c, ekVar.f453c)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ekVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = hs.a(this.f455d, ekVar.f455d)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ekVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = hs.a(this.f454d, ekVar.f454d)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ekVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = hs.a(this.f456e, ekVar.f456e)) == 0) {
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
                        if (mo12335a.f14670a == 3) {
                            this.f446a = ibVar.a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 8) {
                            this.f447a = ibVar.mo12333a();
                            b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 8) {
                            this.f450b = ibVar.mo12333a();
                            c(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f448a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f451b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 8) {
                            this.f452c = ibVar.mo12333a();
                            d(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f453c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 11) {
                            this.f455d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 8) {
                            this.f454d = ibVar.mo12333a();
                            e(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 8) {
                            this.f456e = ibVar.mo12333a();
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
                if (!m12108a()) {
                    throw new ic("Required field 'chid' was not found in serialized data! Struct: " + toString());
                }
                if (!b()) {
                    throw new ic("Required field 'type' was not found in serialized data! Struct: " + toString());
                }
                if (!c()) {
                    throw new ic("Required field 'value' was not found in serialized data! Struct: " + toString());
                }
                a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        a();
        ibVar.a(f445a);
        ibVar.a(f14558a);
        ibVar.a(this.f446a);
        ibVar.b();
        ibVar.a(b);
        ibVar.mo12344a(this.f447a);
        ibVar.b();
        ibVar.a(c);
        ibVar.mo12344a(this.f450b);
        ibVar.b();
        if (this.f448a != null) {
            ibVar.a(d);
            ibVar.a(this.f448a);
            ibVar.b();
        }
        if (this.f451b != null && e()) {
            ibVar.a(e);
            ibVar.a(this.f451b);
            ibVar.b();
        }
        if (f()) {
            ibVar.a(f);
            ibVar.mo12344a(this.f452c);
            ibVar.b();
        }
        if (this.f453c != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f453c);
            ibVar.b();
        }
        if (this.f455d != null && h()) {
            ibVar.a(h);
            ibVar.a(this.f455d);
            ibVar.b();
        }
        if (i()) {
            ibVar.a(i);
            ibVar.mo12344a(this.f454d);
            ibVar.b();
        }
        if (j()) {
            ibVar.a(j);
            ibVar.mo12344a(this.f456e);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(chid:");
        sb.append((int) this.f446a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f447a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f450b);
        sb.append(", ");
        sb.append("connpt:");
        String str = this.f448a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (e()) {
            sb.append(", ");
            sb.append("host:");
            String str2 = this.f451b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f452c);
        }
        if (g()) {
            sb.append(", ");
            sb.append("annotation:");
            String str3 = this.f453c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("user:");
            String str4 = this.f455d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f454d);
        }
        if (j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f456e);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public void a() {
        if (this.f448a == null) {
            throw new ic("Required field 'connpt' was not present! Struct: " + toString());
        }
    }
}
