package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hb implements hr<hb, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f722a;

    /* renamed from: a, reason: collision with other field name */
    public gv f723a;

    /* renamed from: a, reason: collision with other field name */
    public String f724a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f726a;

    /* renamed from: b, reason: collision with other field name */
    public String f728b;

    /* renamed from: c, reason: collision with other field name */
    public String f729c;

    /* renamed from: d, reason: collision with other field name */
    public String f730d;

    /* renamed from: e, reason: collision with other field name */
    public String f731e;

    /* renamed from: f, reason: collision with other field name */
    public String f732f;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f721a = new ig("XmPushActionCommandResult");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14648a = new hy("", (byte) 12, 2);
    private static final hy b = new hy("", (byte) 11, 3);
    private static final hy c = new hy("", (byte) 11, 4);
    private static final hy d = new hy("", (byte) 11, 5);
    private static final hy e = new hy("", (byte) 10, 7);
    private static final hy f = new hy("", (byte) 11, 8);
    private static final hy g = new hy("", (byte) 11, 9);
    private static final hy h = new hy("", (byte) 15, 10);
    private static final hy i = new hy("", (byte) 11, 12);
    private static final hy j = new hy("", (byte) 2, 13);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f725a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public boolean f727a = true;

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12257a() {
        return this.f723a != null;
    }

    public String a() {
        return this.f724a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12259b() {
        return this.f724a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m12260c() {
        return this.f728b != null;
    }

    public String b() {
        return this.f729c;
    }

    public boolean d() {
        return this.f729c != null;
    }

    public boolean e() {
        return this.f725a.get(0);
    }

    public void a(boolean z) {
        this.f725a.set(0, z);
    }

    public boolean f() {
        return this.f730d != null;
    }

    public boolean g() {
        return this.f731e != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public List<String> m12255a() {
        return this.f726a;
    }

    public boolean h() {
        return this.f726a != null;
    }

    public String c() {
        return this.f732f;
    }

    public boolean i() {
        return this.f732f != null;
    }

    public boolean j() {
        return this.f725a.get(1);
    }

    public void b(boolean z) {
        this.f725a.set(1, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hb)) {
            return m12258a((hb) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12258a(hb hbVar) {
        if (hbVar == null) {
            return false;
        }
        boolean m12257a = m12257a();
        boolean m12257a2 = hbVar.m12257a();
        if ((m12257a || m12257a2) && !(m12257a && m12257a2 && this.f723a.m12239a(hbVar.f723a))) {
            return false;
        }
        boolean m12259b = m12259b();
        boolean m12259b2 = hbVar.m12259b();
        if ((m12259b || m12259b2) && !(m12259b && m12259b2 && this.f724a.equals(hbVar.f724a))) {
            return false;
        }
        boolean m12260c = m12260c();
        boolean m12260c2 = hbVar.m12260c();
        if ((m12260c || m12260c2) && !(m12260c && m12260c2 && this.f728b.equals(hbVar.f728b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = hbVar.d();
        if (((d2 || d3) && !(d2 && d3 && this.f729c.equals(hbVar.f729c))) || this.f722a != hbVar.f722a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hbVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f730d.equals(hbVar.f730d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hbVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f731e.equals(hbVar.f731e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hbVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f726a.equals(hbVar.f726a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = hbVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f732f.equals(hbVar.f732f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = hbVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f727a == hbVar.f727a;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hb hbVar) {
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
        if (!getClass().equals(hbVar.getClass())) {
            return getClass().getName().compareTo(hbVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12257a()).compareTo(Boolean.valueOf(hbVar.m12257a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12257a() && (a11 = hs.a(this.f723a, hbVar.f723a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(m12259b()).compareTo(Boolean.valueOf(hbVar.m12259b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m12259b() && (a10 = hs.a(this.f724a, hbVar.f724a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(m12260c()).compareTo(Boolean.valueOf(hbVar.m12260c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m12260c() && (a9 = hs.a(this.f728b, hbVar.f728b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hbVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = hs.a(this.f729c, hbVar.f729c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hbVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = hs.a(this.f722a, hbVar.f722a)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hbVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = hs.a(this.f730d, hbVar.f730d)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hbVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = hs.a(this.f731e, hbVar.f731e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hbVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = hs.a(this.f726a, hbVar.f726a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hbVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = hs.a(this.f732f, hbVar.f732f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hbVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = hs.a(this.f727a, hbVar.f727a)) == 0) {
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
                            this.f723a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f724a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f728b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f729c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                    case 11:
                    default:
                        ie.a(ibVar, mo12335a.f14670a);
                        break;
                    case 7:
                        if (mo12335a.f14670a == 10) {
                            this.f722a = ibVar.mo12334a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 11) {
                            this.f730d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 9:
                        if (mo12335a.f14670a == 11) {
                            this.f731e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 10:
                        if (mo12335a.f14670a == 15) {
                            hz mo12336a = ibVar.mo12336a();
                            this.f726a = new ArrayList(mo12336a.f916a);
                            for (int i2 = 0; i2 < mo12336a.f916a; i2++) {
                                this.f726a.add(ibVar.mo12340a());
                            }
                            ibVar.i();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 12:
                        if (mo12335a.f14670a == 11) {
                            this.f732f = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 13:
                        if (mo12335a.f14670a == 2) {
                            this.f727a = ibVar.mo12345a();
                            b(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                }
                ibVar.g();
            } else {
                ibVar.f();
                if (!e()) {
                    throw new ic("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
                }
                m12256a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12256a();
        ibVar.a(f721a);
        if (this.f723a != null && m12257a()) {
            ibVar.a(f14648a);
            this.f723a.b(ibVar);
            ibVar.b();
        }
        if (this.f724a != null) {
            ibVar.a(b);
            ibVar.a(this.f724a);
            ibVar.b();
        }
        if (this.f728b != null) {
            ibVar.a(c);
            ibVar.a(this.f728b);
            ibVar.b();
        }
        if (this.f729c != null) {
            ibVar.a(d);
            ibVar.a(this.f729c);
            ibVar.b();
        }
        ibVar.a(e);
        ibVar.a(this.f722a);
        ibVar.b();
        if (this.f730d != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f730d);
            ibVar.b();
        }
        if (this.f731e != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f731e);
            ibVar.b();
        }
        if (this.f726a != null && h()) {
            ibVar.a(h);
            ibVar.a(new hz((byte) 11, this.f726a.size()));
            Iterator<String> it = this.f726a.iterator();
            while (it.hasNext()) {
                ibVar.a(it.next());
            }
            ibVar.e();
            ibVar.b();
        }
        if (this.f732f != null && i()) {
            ibVar.a(i);
            ibVar.a(this.f732f);
            ibVar.b();
        }
        if (j()) {
            ibVar.a(j);
            ibVar.a(this.f727a);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m12257a()) {
            sb.append("target:");
            gv gvVar = this.f723a;
            if (gvVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(gvVar);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f724a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f728b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f729c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f722a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f730d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f731e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f726a;
            if (list == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(list);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f732f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f727a);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12256a() {
        if (this.f724a == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f728b == null) {
            throw new ic("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f729c == null) {
            throw new ic("Required field 'cmdName' was not present! Struct: " + toString());
        }
    }
}
