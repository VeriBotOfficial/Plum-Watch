package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class ho implements hr<ho, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public gv f886a;

    /* renamed from: a, reason: collision with other field name */
    public String f887a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f888a;

    /* renamed from: b, reason: collision with other field name */
    public String f889b;

    /* renamed from: c, reason: collision with other field name */
    public String f890c;

    /* renamed from: d, reason: collision with other field name */
    public String f891d;

    /* renamed from: e, reason: collision with other field name */
    public String f892e;

    /* renamed from: f, reason: collision with other field name */
    public String f893f;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f885a = new ig("XmPushActionUnSubscription");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14663a = new hy("", (byte) 11, 1);
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
    public boolean m12321a() {
        return this.f887a != null;
    }

    public boolean b() {
        return this.f886a != null;
    }

    public ho a(String str) {
        this.f889b = str;
        return this;
    }

    public boolean c() {
        return this.f889b != null;
    }

    public ho b(String str) {
        this.f890c = str;
        return this;
    }

    public boolean d() {
        return this.f890c != null;
    }

    public ho c(String str) {
        this.f891d = str;
        return this;
    }

    public boolean e() {
        return this.f891d != null;
    }

    public ho d(String str) {
        this.f892e = str;
        return this;
    }

    public boolean f() {
        return this.f892e != null;
    }

    public ho e(String str) {
        this.f893f = str;
        return this;
    }

    public boolean g() {
        return this.f893f != null;
    }

    public boolean h() {
        return this.f888a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ho)) {
            return m12322a((ho) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12322a(ho hoVar) {
        if (hoVar == null) {
            return false;
        }
        boolean m12321a = m12321a();
        boolean m12321a2 = hoVar.m12321a();
        if ((m12321a || m12321a2) && !(m12321a && m12321a2 && this.f887a.equals(hoVar.f887a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = hoVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f886a.m12239a(hoVar.f886a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = hoVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f889b.equals(hoVar.f889b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = hoVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f890c.equals(hoVar.f890c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = hoVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f891d.equals(hoVar.f891d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hoVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f892e.equals(hoVar.f892e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hoVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f893f.equals(hoVar.f893f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hoVar.h();
        if (h2 || h3) {
            return h2 && h3 && this.f888a.equals(hoVar.f888a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ho hoVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(hoVar.getClass())) {
            return getClass().getName().compareTo(hoVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12321a()).compareTo(Boolean.valueOf(hoVar.m12321a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12321a() && (a9 = hs.a(this.f887a, hoVar.f887a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hoVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a8 = hs.a(this.f886a, hoVar.f886a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hoVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a7 = hs.a(this.f889b, hoVar.f889b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hoVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a6 = hs.a(this.f890c, hoVar.f890c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hoVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a5 = hs.a(this.f891d, hoVar.f891d)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hoVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a4 = hs.a(this.f892e, hoVar.f892e)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hoVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a3 = hs.a(this.f893f, hoVar.f893f)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hoVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!h() || (a2 = hs.a(this.f888a, hoVar.f888a)) == 0) {
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
                            this.f887a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f886a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f889b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f890c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                        if (mo12335a.f14670a == 11) {
                            this.f891d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 6:
                        if (mo12335a.f14670a == 11) {
                            this.f892e = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f893f = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 15) {
                            hz mo12336a = ibVar.mo12336a();
                            this.f888a = new ArrayList(mo12336a.f916a);
                            for (int i = 0; i < mo12336a.f916a; i++) {
                                this.f888a.add(ibVar.mo12340a());
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
        ibVar.a(f885a);
        if (this.f887a != null && m12321a()) {
            ibVar.a(f14663a);
            ibVar.a(this.f887a);
            ibVar.b();
        }
        if (this.f886a != null && b()) {
            ibVar.a(b);
            this.f886a.b(ibVar);
            ibVar.b();
        }
        if (this.f889b != null) {
            ibVar.a(c);
            ibVar.a(this.f889b);
            ibVar.b();
        }
        if (this.f890c != null) {
            ibVar.a(d);
            ibVar.a(this.f890c);
            ibVar.b();
        }
        if (this.f891d != null) {
            ibVar.a(e);
            ibVar.a(this.f891d);
            ibVar.b();
        }
        if (this.f892e != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f892e);
            ibVar.b();
        }
        if (this.f893f != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f893f);
            ibVar.b();
        }
        if (this.f888a != null && h()) {
            ibVar.a(h);
            ibVar.a(new hz((byte) 11, this.f888a.size()));
            Iterator<String> it = this.f888a.iterator();
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
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (m12321a()) {
            sb.append("debug:");
            String str = this.f887a;
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
            gv gvVar = this.f886a;
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
        String str2 = this.f889b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f890c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f891d;
        if (str4 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str4);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f892e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f893f;
            if (str6 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f888a;
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
        if (this.f889b == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f890c == null) {
            throw new ic("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f891d == null) {
            throw new ic("Required field 'topic' was not present! Struct: " + toString());
        }
    }
}
