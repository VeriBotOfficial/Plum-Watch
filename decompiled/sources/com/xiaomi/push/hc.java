package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hc implements hr<hc, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public gg f734a;

    /* renamed from: a, reason: collision with other field name */
    public gt f735a;

    /* renamed from: a, reason: collision with other field name */
    public gv f736a;

    /* renamed from: a, reason: collision with other field name */
    public String f737a;

    /* renamed from: a, reason: collision with other field name */
    public ByteBuffer f738a;

    /* renamed from: b, reason: collision with other field name */
    public String f741b;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f733a = new ig("XmPushActionContainer");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14649a = new hy("", (byte) 8, 1);
    private static final hy b = new hy("", (byte) 2, 2);
    private static final hy c = new hy("", (byte) 2, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 11, 5);
    private static final hy f = new hy("", (byte) 11, 6);
    private static final hy g = new hy("", (byte) 12, 7);
    private static final hy h = new hy("", (byte) 12, 8);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f739a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public boolean f740a = true;

    /* renamed from: b, reason: collision with other field name */
    public boolean f742b = true;

    public int hashCode() {
        return 0;
    }

    public gg a() {
        return this.f734a;
    }

    public hc a(gg ggVar) {
        this.f734a = ggVar;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12265a() {
        return this.f734a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12269b() {
        return this.f740a;
    }

    public hc a(boolean z) {
        this.f740a = z;
        m12264a(true);
        return this;
    }

    public boolean c() {
        return this.f739a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12264a(boolean z) {
        this.f739a.set(0, z);
    }

    public hc b(boolean z) {
        this.f742b = z;
        m12268b(true);
        return this;
    }

    public boolean d() {
        return this.f739a.get(1);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m12268b(boolean z) {
        this.f739a.set(1, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m12267a() {
        a(hs.a(this.f738a));
        return this.f738a.array();
    }

    public hc a(ByteBuffer byteBuffer) {
        this.f738a = byteBuffer;
        return this;
    }

    public boolean e() {
        return this.f738a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m12262a() {
        return this.f737a;
    }

    public hc a(String str) {
        this.f737a = str;
        return this;
    }

    public boolean f() {
        return this.f737a != null;
    }

    public String b() {
        return this.f741b;
    }

    public hc b(String str) {
        this.f741b = str;
        return this;
    }

    public boolean g() {
        return this.f741b != null;
    }

    public hc a(gv gvVar) {
        this.f736a = gvVar;
        return this;
    }

    public boolean h() {
        return this.f736a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public gt m12261a() {
        return this.f735a;
    }

    public hc a(gt gtVar) {
        this.f735a = gtVar;
        return this;
    }

    public boolean i() {
        return this.f735a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hc)) {
            return m12266a((hc) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12266a(hc hcVar) {
        if (hcVar == null) {
            return false;
        }
        boolean m12265a = m12265a();
        boolean m12265a2 = hcVar.m12265a();
        if (((m12265a || m12265a2) && (!m12265a || !m12265a2 || !this.f734a.equals(hcVar.f734a))) || this.f740a != hcVar.f740a || this.f742b != hcVar.f742b) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = hcVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f738a.equals(hcVar.f738a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hcVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f737a.equals(hcVar.f737a))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hcVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f741b.equals(hcVar.f741b))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hcVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f736a.m12239a(hcVar.f736a))) {
            return false;
        }
        boolean i = i();
        boolean i2 = hcVar.i();
        if (i || i2) {
            return i && i2 && this.f735a.m12231a(hcVar.f735a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hc hcVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(hcVar.getClass())) {
            return getClass().getName().compareTo(hcVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12265a()).compareTo(Boolean.valueOf(hcVar.m12265a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12265a() && (a9 = hs.a(this.f734a, hcVar.f734a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hcVar.c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (c() && (a8 = hs.a(this.f740a, hcVar.f740a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hcVar.d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (d() && (a7 = hs.a(this.f742b, hcVar.f742b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hcVar.e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (e() && (a6 = hs.a(this.f738a, hcVar.f738a)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hcVar.f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (f() && (a5 = hs.a(this.f737a, hcVar.f737a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hcVar.g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (g() && (a4 = hs.a(this.f741b, hcVar.f741b)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hcVar.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (h() && (a3 = hs.a(this.f736a, hcVar.f736a)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hcVar.i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!i() || (a2 = hs.a(this.f735a, hcVar.f735a)) == 0) {
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
                            this.f734a = gg.a(ibVar.mo12333a());
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 2) {
                            this.f740a = ibVar.mo12345a();
                            m12264a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 2) {
                            this.f742b = ibVar.mo12345a();
                            m12268b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f738a = ibVar.mo12341a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f737a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 11) {
                            this.f741b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f736a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 12) {
                            gt gtVar = new gt();
                            this.f735a = gtVar;
                            gtVar.a(ibVar);
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
                if (!c()) {
                    throw new ic("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
                }
                if (!d()) {
                    throw new ic("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
                }
                m12263a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12263a();
        ibVar.a(f733a);
        if (this.f734a != null) {
            ibVar.a(f14649a);
            ibVar.mo12344a(this.f734a.a());
            ibVar.b();
        }
        ibVar.a(b);
        ibVar.a(this.f740a);
        ibVar.b();
        ibVar.a(c);
        ibVar.a(this.f742b);
        ibVar.b();
        if (this.f738a != null) {
            ibVar.a(d);
            ibVar.a(this.f738a);
            ibVar.b();
        }
        if (this.f737a != null && f()) {
            ibVar.a(e);
            ibVar.a(this.f737a);
            ibVar.b();
        }
        if (this.f741b != null && g()) {
            ibVar.a(f);
            ibVar.a(this.f741b);
            ibVar.b();
        }
        if (this.f736a != null) {
            ibVar.a(g);
            this.f736a.b(ibVar);
            ibVar.b();
        }
        if (this.f735a != null && i()) {
            ibVar.a(h);
            this.f735a.b(ibVar);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(action:");
        gg ggVar = this.f734a;
        if (ggVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(ggVar);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f740a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f742b);
        if (f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f737a;
            if (str == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f741b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        gv gvVar = this.f736a;
        if (gvVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(gvVar);
        }
        if (i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            gt gtVar = this.f735a;
            if (gtVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(gtVar);
            }
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12263a() {
        if (this.f734a == null) {
            throw new ic("Required field 'action' was not present! Struct: " + toString());
        }
        if (this.f738a == null) {
            throw new ic("Required field 'pushAction' was not present! Struct: " + toString());
        }
        if (this.f736a == null) {
            throw new ic("Required field 'target' was not present! Struct: " + toString());
        }
    }
}
