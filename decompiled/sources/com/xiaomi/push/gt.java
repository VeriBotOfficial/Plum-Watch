package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class gt implements hr<gt, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f645a;

    /* renamed from: a, reason: collision with other field name */
    public long f646a;

    /* renamed from: a, reason: collision with other field name */
    public String f647a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f648a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f649a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f650a;

    /* renamed from: b, reason: collision with other field name */
    public int f651b;

    /* renamed from: b, reason: collision with other field name */
    public String f652b;

    /* renamed from: b, reason: collision with other field name */
    public Map<String, String> f653b;

    /* renamed from: c, reason: collision with other field name */
    public int f654c;

    /* renamed from: c, reason: collision with other field name */
    public String f655c;

    /* renamed from: c, reason: collision with other field name */
    public Map<String, String> f656c;

    /* renamed from: d, reason: collision with other field name */
    public String f657d;

    /* renamed from: e, reason: collision with other field name */
    public String f658e;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f644a = new ig("PushMetaInfo");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14638a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 10, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 11, 5);
    private static final hy f = new hy("", (byte) 8, 6);
    private static final hy g = new hy("", (byte) 11, 7);
    private static final hy h = new hy("", (byte) 8, 8);
    private static final hy i = new hy("", (byte) 8, 9);
    private static final hy j = new hy("", (byte) 13, 10);
    private static final hy k = new hy("", (byte) 13, 11);
    private static final hy l = new hy("", (byte) 2, 12);
    private static final hy m = new hy("", (byte) 13, 13);

    public int hashCode() {
        return 0;
    }

    public gt() {
        this.f648a = new BitSet(5);
        this.f650a = false;
    }

    public gt(gt gtVar) {
        BitSet bitSet = new BitSet(5);
        this.f648a = bitSet;
        bitSet.clear();
        this.f648a.or(gtVar.f648a);
        if (gtVar.m12230a()) {
            this.f647a = gtVar.f647a;
        }
        this.f646a = gtVar.f646a;
        if (gtVar.m12236c()) {
            this.f652b = gtVar.f652b;
        }
        if (gtVar.m12237d()) {
            this.f655c = gtVar.f655c;
        }
        if (gtVar.e()) {
            this.f657d = gtVar.f657d;
        }
        this.f645a = gtVar.f645a;
        if (gtVar.g()) {
            this.f658e = gtVar.f658e;
        }
        this.f651b = gtVar.f651b;
        this.f654c = gtVar.f654c;
        if (gtVar.j()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : gtVar.f649a.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            this.f649a = hashMap;
        }
        if (gtVar.k()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, String> entry2 : gtVar.f653b.entrySet()) {
                hashMap2.put(entry2.getKey(), entry2.getValue());
            }
            this.f653b = hashMap2;
        }
        this.f650a = gtVar.f650a;
        if (gtVar.n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry<String, String> entry3 : gtVar.f656c.entrySet()) {
                hashMap3.put(entry3.getKey(), entry3.getValue());
            }
            this.f656c = hashMap3;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public gt m12226a() {
        return new gt(this);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m12227a() {
        return this.f647a;
    }

    public gt a(String str) {
        this.f647a = str;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12230a() {
        return this.f647a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m12225a() {
        return this.f646a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12234b() {
        return this.f648a.get(0);
    }

    public void a(boolean z) {
        this.f648a.set(0, z);
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m12232b() {
        return this.f652b;
    }

    public gt b(String str) {
        this.f652b = str;
        return this;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m12236c() {
        return this.f652b != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public String m12235c() {
        return this.f655c;
    }

    public gt c(String str) {
        this.f655c = str;
        return this;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m12237d() {
        return this.f655c != null;
    }

    public String d() {
        return this.f657d;
    }

    public gt d(String str) {
        this.f657d = str;
        return this;
    }

    public boolean e() {
        return this.f657d != null;
    }

    public int a() {
        return this.f645a;
    }

    public gt a(int i2) {
        this.f645a = i2;
        b(true);
        return this;
    }

    public boolean f() {
        return this.f648a.get(1);
    }

    public void b(boolean z) {
        this.f648a.set(1, z);
    }

    public boolean g() {
        return this.f658e != null;
    }

    public int b() {
        return this.f651b;
    }

    public gt b(int i2) {
        this.f651b = i2;
        c(true);
        return this;
    }

    public boolean h() {
        return this.f648a.get(2);
    }

    public void c(boolean z) {
        this.f648a.set(2, z);
    }

    public int c() {
        return this.f654c;
    }

    public gt c(int i2) {
        this.f654c = i2;
        d(true);
        return this;
    }

    public boolean i() {
        return this.f648a.get(3);
    }

    public void d(boolean z) {
        this.f648a.set(3, z);
    }

    public void a(String str, String str2) {
        if (this.f649a == null) {
            this.f649a = new HashMap();
        }
        this.f649a.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m12228a() {
        return this.f649a;
    }

    public gt a(Map<String, String> map) {
        this.f649a = map;
        return this;
    }

    public boolean j() {
        return this.f649a != null;
    }

    public void b(String str, String str2) {
        if (this.f653b == null) {
            this.f653b = new HashMap();
        }
        this.f653b.put(str, str2);
    }

    /* renamed from: b, reason: collision with other method in class */
    public Map<String, String> m12233b() {
        return this.f653b;
    }

    public boolean k() {
        return this.f653b != null;
    }

    public boolean l() {
        return this.f650a;
    }

    public boolean m() {
        return this.f648a.get(4);
    }

    public void e(boolean z) {
        this.f648a.set(4, z);
    }

    public boolean n() {
        return this.f656c != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gt)) {
            return m12231a((gt) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12231a(gt gtVar) {
        if (gtVar == null) {
            return false;
        }
        boolean m12230a = m12230a();
        boolean m12230a2 = gtVar.m12230a();
        if (((m12230a || m12230a2) && !(m12230a && m12230a2 && this.f647a.equals(gtVar.f647a))) || this.f646a != gtVar.f646a) {
            return false;
        }
        boolean m12236c = m12236c();
        boolean m12236c2 = gtVar.m12236c();
        if ((m12236c || m12236c2) && !(m12236c && m12236c2 && this.f652b.equals(gtVar.f652b))) {
            return false;
        }
        boolean m12237d = m12237d();
        boolean m12237d2 = gtVar.m12237d();
        if ((m12237d || m12237d2) && !(m12237d && m12237d2 && this.f655c.equals(gtVar.f655c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = gtVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f657d.equals(gtVar.f657d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = gtVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f645a == gtVar.f645a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = gtVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f658e.equals(gtVar.f658e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = gtVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f651b == gtVar.f651b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = gtVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f654c == gtVar.f654c)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = gtVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f649a.equals(gtVar.f649a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = gtVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f653b.equals(gtVar.f653b))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = gtVar.m();
        if ((m2 || m3) && !(m2 && m3 && this.f650a == gtVar.f650a)) {
            return false;
        }
        boolean n = n();
        boolean n2 = gtVar.n();
        if (n || n2) {
            return n && n2 && this.f656c.equals(gtVar.f656c);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gt gtVar) {
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
        if (!getClass().equals(gtVar.getClass())) {
            return getClass().getName().compareTo(gtVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12230a()).compareTo(Boolean.valueOf(gtVar.m12230a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12230a() && (a14 = hs.a(this.f647a, gtVar.f647a)) != 0) {
            return a14;
        }
        int compareTo2 = Boolean.valueOf(m12234b()).compareTo(Boolean.valueOf(gtVar.m12234b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m12234b() && (a13 = hs.a(this.f646a, gtVar.f646a)) != 0) {
            return a13;
        }
        int compareTo3 = Boolean.valueOf(m12236c()).compareTo(Boolean.valueOf(gtVar.m12236c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m12236c() && (a12 = hs.a(this.f652b, gtVar.f652b)) != 0) {
            return a12;
        }
        int compareTo4 = Boolean.valueOf(m12237d()).compareTo(Boolean.valueOf(gtVar.m12237d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m12237d() && (a11 = hs.a(this.f655c, gtVar.f655c)) != 0) {
            return a11;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(gtVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a10 = hs.a(this.f657d, gtVar.f657d)) != 0) {
            return a10;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(gtVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a9 = hs.a(this.f645a, gtVar.f645a)) != 0) {
            return a9;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(gtVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a8 = hs.a(this.f658e, gtVar.f658e)) != 0) {
            return a8;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(gtVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a7 = hs.a(this.f651b, gtVar.f651b)) != 0) {
            return a7;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(gtVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a6 = hs.a(this.f654c, gtVar.f654c)) != 0) {
            return a6;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(gtVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a5 = hs.a(this.f649a, gtVar.f649a)) != 0) {
            return a5;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(gtVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a4 = hs.a(this.f653b, gtVar.f653b)) != 0) {
            return a4;
        }
        int compareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(gtVar.m()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (m() && (a3 = hs.a(this.f650a, gtVar.f650a)) != 0) {
            return a3;
        }
        int compareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(gtVar.n()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (!n() || (a2 = hs.a(this.f656c, gtVar.f656c)) == 0) {
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
                int i2 = 0;
                switch (mo12335a.f915a) {
                    case 1:
                        if (mo12335a.f14670a == 11) {
                            this.f647a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 10) {
                            this.f646a = ibVar.mo12334a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f652b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f655c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f657d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 8) {
                            this.f645a = ibVar.mo12333a();
                            b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f658e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 8) {
                            this.f651b = ibVar.mo12333a();
                            c(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 8) {
                            this.f654c = ibVar.mo12333a();
                            d(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 13) {
                            ia mo12337a = ibVar.mo12337a();
                            this.f649a = new HashMap(mo12337a.f919a * 2);
                            while (i2 < mo12337a.f919a) {
                                this.f649a.put(ibVar.mo12340a(), ibVar.mo12340a());
                                i2++;
                            }
                            ibVar.h();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 11:
                        if (mo12335a.f14670a == 13) {
                            ia mo12337a2 = ibVar.mo12337a();
                            this.f653b = new HashMap(mo12337a2.f919a * 2);
                            while (i2 < mo12337a2.f919a) {
                                this.f653b.put(ibVar.mo12340a(), ibVar.mo12340a());
                                i2++;
                            }
                            ibVar.h();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 12:
                        if (mo12335a.f14670a == 2) {
                            this.f650a = ibVar.mo12345a();
                            e(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 13:
                        if (mo12335a.f14670a == 13) {
                            ia mo12337a3 = ibVar.mo12337a();
                            this.f656c = new HashMap(mo12337a3.f919a * 2);
                            while (i2 < mo12337a3.f919a) {
                                this.f656c.put(ibVar.mo12340a(), ibVar.mo12340a());
                                i2++;
                            }
                            ibVar.h();
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
                if (!m12234b()) {
                    throw new ic("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
                }
                m12229a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12229a();
        ibVar.a(f644a);
        if (this.f647a != null) {
            ibVar.a(f14638a);
            ibVar.a(this.f647a);
            ibVar.b();
        }
        ibVar.a(b);
        ibVar.a(this.f646a);
        ibVar.b();
        if (this.f652b != null && m12236c()) {
            ibVar.a(c);
            ibVar.a(this.f652b);
            ibVar.b();
        }
        if (this.f655c != null && m12237d()) {
            ibVar.a(d);
            ibVar.a(this.f655c);
            ibVar.b();
        }
        if (this.f657d != null && e()) {
            ibVar.a(e);
            ibVar.a(this.f657d);
            ibVar.b();
        }
        if (f()) {
            ibVar.a(f);
            ibVar.mo12344a(this.f645a);
            ibVar.b();
        }
        if (this.f658e != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f658e);
            ibVar.b();
        }
        if (h()) {
            ibVar.a(h);
            ibVar.mo12344a(this.f651b);
            ibVar.b();
        }
        if (i()) {
            ibVar.a(i);
            ibVar.mo12344a(this.f654c);
            ibVar.b();
        }
        if (this.f649a != null && j()) {
            ibVar.a(j);
            ibVar.a(new ia((byte) 11, (byte) 11, this.f649a.size()));
            for (Map.Entry<String, String> entry : this.f649a.entrySet()) {
                ibVar.a(entry.getKey());
                ibVar.a(entry.getValue());
            }
            ibVar.d();
            ibVar.b();
        }
        if (this.f653b != null && k()) {
            ibVar.a(k);
            ibVar.a(new ia((byte) 11, (byte) 11, this.f653b.size()));
            for (Map.Entry<String, String> entry2 : this.f653b.entrySet()) {
                ibVar.a(entry2.getKey());
                ibVar.a(entry2.getValue());
            }
            ibVar.d();
            ibVar.b();
        }
        if (m()) {
            ibVar.a(l);
            ibVar.a(this.f650a);
            ibVar.b();
        }
        if (this.f656c != null && n()) {
            ibVar.a(m);
            ibVar.a(new ia((byte) 11, (byte) 11, this.f656c.size()));
            for (Map.Entry<String, String> entry3 : this.f656c.entrySet()) {
                ibVar.a(entry3.getKey());
                ibVar.a(entry3.getValue());
            }
            ibVar.d();
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(id:");
        String str = this.f647a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(com.xiaomi.push.service.aj.a(str));
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f646a);
        if (m12236c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f652b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        if (m12237d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f655c;
            if (str3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f657d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f645a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f658e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f651b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f654c);
        }
        if (j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f649a;
            if (map == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f653b;
            if (map2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map2);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f650a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f656c;
            if (map3 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(map3);
            }
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12229a() {
        if (this.f647a == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
    }
}
