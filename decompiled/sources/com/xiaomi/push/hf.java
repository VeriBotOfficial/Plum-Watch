package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hf implements hr<hf, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f748a;

    /* renamed from: a, reason: collision with other field name */
    public gv f749a;

    /* renamed from: a, reason: collision with other field name */
    public String f750a;

    /* renamed from: a, reason: collision with other field name */
    public ByteBuffer f751a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f752a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f753a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f754a;

    /* renamed from: b, reason: collision with other field name */
    public String f755b;

    /* renamed from: b, reason: collision with other field name */
    public boolean f756b;

    /* renamed from: c, reason: collision with other field name */
    public String f757c;

    /* renamed from: d, reason: collision with other field name */
    public String f758d;

    /* renamed from: e, reason: collision with other field name */
    public String f759e;

    /* renamed from: f, reason: collision with other field name */
    public String f760f;

    /* renamed from: g, reason: collision with other field name */
    public String f761g;

    /* renamed from: h, reason: collision with other field name */
    public String f762h;

    /* renamed from: i, reason: collision with other field name */
    public String f763i;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f747a = new ig("XmPushActionNotification");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14652a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 12, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 11, 5);
    private static final hy f = new hy("", (byte) 2, 6);
    private static final hy g = new hy("", (byte) 11, 7);
    private static final hy h = new hy("", (byte) 13, 8);
    private static final hy i = new hy("", (byte) 11, 9);
    private static final hy j = new hy("", (byte) 11, 10);
    private static final hy k = new hy("", (byte) 11, 12);
    private static final hy l = new hy("", (byte) 11, 13);
    private static final hy m = new hy("", (byte) 11, 14);
    private static final hy n = new hy("", (byte) 10, 15);
    private static final hy o = new hy("", (byte) 2, 20);

    public int hashCode() {
        return 0;
    }

    public hf() {
        this.f752a = new BitSet(3);
        this.f754a = true;
        this.f756b = false;
    }

    public hf(String str, boolean z) {
        this();
        this.f755b = str;
        this.f754a = z;
        m12279a(true);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12280a() {
        return this.f750a != null;
    }

    public gv a() {
        return this.f749a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12283b() {
        return this.f749a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m12276a() {
        return this.f755b;
    }

    public hf a(String str) {
        this.f755b = str;
        return this;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m12284c() {
        return this.f755b != null;
    }

    public String b() {
        return this.f757c;
    }

    public hf b(String str) {
        this.f757c = str;
        return this;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m12285d() {
        return this.f757c != null;
    }

    public String c() {
        return this.f758d;
    }

    public hf c(String str) {
        this.f758d = str;
        return this;
    }

    public boolean e() {
        return this.f758d != null;
    }

    public hf a(boolean z) {
        this.f754a = z;
        m12279a(true);
        return this;
    }

    public boolean f() {
        return this.f752a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12279a(boolean z) {
        this.f752a.set(0, z);
    }

    public boolean g() {
        return this.f759e != null;
    }

    public void a(String str, String str2) {
        if (this.f753a == null) {
            this.f753a = new HashMap();
        }
        this.f753a.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m12277a() {
        return this.f753a;
    }

    public hf a(Map<String, String> map) {
        this.f753a = map;
        return this;
    }

    public boolean h() {
        return this.f753a != null;
    }

    public String d() {
        return this.f760f;
    }

    public hf d(String str) {
        this.f760f = str;
        return this;
    }

    public boolean i() {
        return this.f760f != null;
    }

    public boolean j() {
        return this.f761g != null;
    }

    public boolean k() {
        return this.f762h != null;
    }

    public boolean l() {
        return this.f763i != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m12282a() {
        a(hs.a(this.f751a));
        return this.f751a.array();
    }

    public hf a(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
        return this;
    }

    public hf a(ByteBuffer byteBuffer) {
        this.f751a = byteBuffer;
        return this;
    }

    public boolean m() {
        return this.f751a != null;
    }

    public boolean n() {
        return this.f752a.get(1);
    }

    public void b(boolean z) {
        this.f752a.set(1, z);
    }

    public boolean o() {
        return this.f752a.get(2);
    }

    public void c(boolean z) {
        this.f752a.set(2, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hf)) {
            return m12281a((hf) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12281a(hf hfVar) {
        if (hfVar == null) {
            return false;
        }
        boolean m12280a = m12280a();
        boolean m12280a2 = hfVar.m12280a();
        if ((m12280a || m12280a2) && !(m12280a && m12280a2 && this.f750a.equals(hfVar.f750a))) {
            return false;
        }
        boolean m12283b = m12283b();
        boolean m12283b2 = hfVar.m12283b();
        if ((m12283b || m12283b2) && !(m12283b && m12283b2 && this.f749a.m12239a(hfVar.f749a))) {
            return false;
        }
        boolean m12284c = m12284c();
        boolean m12284c2 = hfVar.m12284c();
        if ((m12284c || m12284c2) && !(m12284c && m12284c2 && this.f755b.equals(hfVar.f755b))) {
            return false;
        }
        boolean m12285d = m12285d();
        boolean m12285d2 = hfVar.m12285d();
        if ((m12285d || m12285d2) && !(m12285d && m12285d2 && this.f757c.equals(hfVar.f757c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = hfVar.e();
        if (((e2 || e3) && !(e2 && e3 && this.f758d.equals(hfVar.f758d))) || this.f754a != hfVar.f754a) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hfVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f759e.equals(hfVar.f759e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hfVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f753a.equals(hfVar.f753a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = hfVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f760f.equals(hfVar.f760f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = hfVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f761g.equals(hfVar.f761g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = hfVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f762h.equals(hfVar.f762h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = hfVar.l();
        if ((l2 || l3) && !(l2 && l3 && this.f763i.equals(hfVar.f763i))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = hfVar.m();
        if ((m2 || m3) && !(m2 && m3 && this.f751a.equals(hfVar.f751a))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = hfVar.n();
        if ((n2 || n3) && !(n2 && n3 && this.f748a == hfVar.f748a)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = hfVar.o();
        if (o2 || o3) {
            return o2 && o3 && this.f756b == hfVar.f756b;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hf hfVar) {
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
        int a14;
        int a15;
        int a16;
        if (!getClass().equals(hfVar.getClass())) {
            return getClass().getName().compareTo(hfVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12280a()).compareTo(Boolean.valueOf(hfVar.m12280a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12280a() && (a16 = hs.a(this.f750a, hfVar.f750a)) != 0) {
            return a16;
        }
        int compareTo2 = Boolean.valueOf(m12283b()).compareTo(Boolean.valueOf(hfVar.m12283b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m12283b() && (a15 = hs.a(this.f749a, hfVar.f749a)) != 0) {
            return a15;
        }
        int compareTo3 = Boolean.valueOf(m12284c()).compareTo(Boolean.valueOf(hfVar.m12284c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m12284c() && (a14 = hs.a(this.f755b, hfVar.f755b)) != 0) {
            return a14;
        }
        int compareTo4 = Boolean.valueOf(m12285d()).compareTo(Boolean.valueOf(hfVar.m12285d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m12285d() && (a13 = hs.a(this.f757c, hfVar.f757c)) != 0) {
            return a13;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hfVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a12 = hs.a(this.f758d, hfVar.f758d)) != 0) {
            return a12;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hfVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a11 = hs.a(this.f754a, hfVar.f754a)) != 0) {
            return a11;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hfVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a10 = hs.a(this.f759e, hfVar.f759e)) != 0) {
            return a10;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hfVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a9 = hs.a(this.f753a, hfVar.f753a)) != 0) {
            return a9;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hfVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a8 = hs.a(this.f760f, hfVar.f760f)) != 0) {
            return a8;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hfVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a7 = hs.a(this.f761g, hfVar.f761g)) != 0) {
            return a7;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(hfVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a6 = hs.a(this.f762h, hfVar.f762h)) != 0) {
            return a6;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(hfVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a5 = hs.a(this.f763i, hfVar.f763i)) != 0) {
            return a5;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(hfVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a4 = hs.a(this.f751a, hfVar.f751a)) != 0) {
            return a4;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(hfVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a3 = hs.a(this.f748a, hfVar.f748a)) != 0) {
            return a3;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(hfVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (!o() || (a2 = hs.a(this.f756b, hfVar.f756b)) == 0) {
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
                            this.f750a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f749a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f755b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f757c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f758d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 2) {
                            this.f754a = ibVar.mo12345a();
                            m12279a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f759e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 13) {
                            ia mo12337a = ibVar.mo12337a();
                            this.f753a = new HashMap(mo12337a.f919a * 2);
                            for (int i2 = 0; i2 < mo12337a.f919a; i2++) {
                                this.f753a.put(ibVar.mo12340a(), ibVar.mo12340a());
                            }
                            ibVar.h();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 11) {
                            this.f760f = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 11) {
                            this.f761g = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 11:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    default:
                        ie.a(ibVar, mo12335a.f14670a);
                        break;
                    case 12:
                        if (mo12335a.f14670a == 11) {
                            this.f762h = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 13:
                        if (mo12335a.f14670a == 11) {
                            this.f763i = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 14:
                        if (mo12335a.f14670a == 11) {
                            this.f751a = ibVar.mo12341a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 15:
                        if (mo12335a.f14670a == 10) {
                            this.f748a = ibVar.mo12334a();
                            b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 20:
                        if (mo12335a.f14670a == 2) {
                            this.f756b = ibVar.mo12345a();
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
                if (!f()) {
                    throw new ic("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
                }
                m12278a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12278a();
        ibVar.a(f747a);
        if (this.f750a != null && m12280a()) {
            ibVar.a(f14652a);
            ibVar.a(this.f750a);
            ibVar.b();
        }
        if (this.f749a != null && m12283b()) {
            ibVar.a(b);
            this.f749a.b(ibVar);
            ibVar.b();
        }
        if (this.f755b != null) {
            ibVar.a(c);
            ibVar.a(this.f755b);
            ibVar.b();
        }
        if (this.f757c != null && m12285d()) {
            ibVar.a(d);
            ibVar.a(this.f757c);
            ibVar.b();
        }
        if (this.f758d != null && e()) {
            ibVar.a(e);
            ibVar.a(this.f758d);
            ibVar.b();
        }
        ibVar.a(f);
        ibVar.a(this.f754a);
        ibVar.b();
        if (this.f759e != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f759e);
            ibVar.b();
        }
        if (this.f753a != null && h()) {
            ibVar.a(h);
            ibVar.a(new ia((byte) 11, (byte) 11, this.f753a.size()));
            for (Map.Entry<String, String> entry : this.f753a.entrySet()) {
                ibVar.a(entry.getKey());
                ibVar.a(entry.getValue());
            }
            ibVar.d();
            ibVar.b();
        }
        if (this.f760f != null && i()) {
            ibVar.a(i);
            ibVar.a(this.f760f);
            ibVar.b();
        }
        if (this.f761g != null && j()) {
            ibVar.a(j);
            ibVar.a(this.f761g);
            ibVar.b();
        }
        if (this.f762h != null && k()) {
            ibVar.a(k);
            ibVar.a(this.f762h);
            ibVar.b();
        }
        if (this.f763i != null && l()) {
            ibVar.a(l);
            ibVar.a(this.f763i);
            ibVar.b();
        }
        if (this.f751a != null && m()) {
            ibVar.a(m);
            ibVar.a(this.f751a);
            ibVar.b();
        }
        if (n()) {
            ibVar.a(n);
            ibVar.a(this.f748a);
            ibVar.b();
        }
        if (o()) {
            ibVar.a(o);
            ibVar.a(this.f756b);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = false;
        if (m12280a()) {
            sb.append("debug:");
            String str = this.f750a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m12283b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            gv gvVar = this.f749a;
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
        String str2 = this.f755b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        if (m12285d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f757c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f758d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f754a);
        if (g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f759e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f753a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f760f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f761g;
            if (str7 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f762h;
            if (str8 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f763i;
            if (str9 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str9);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f751a;
            if (byteBuffer == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                hs.a(byteBuffer, sb);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f748a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f756b);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12278a() {
        if (this.f755b == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
    }
}
