package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hi implements hr<hi, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f818a;

    /* renamed from: a, reason: collision with other field name */
    public gv f819a;

    /* renamed from: a, reason: collision with other field name */
    public String f820a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f821a = new BitSet(1);

    /* renamed from: b, reason: collision with other field name */
    public String f822b;

    /* renamed from: c, reason: collision with other field name */
    public String f823c;

    /* renamed from: d, reason: collision with other field name */
    public String f824d;

    /* renamed from: e, reason: collision with other field name */
    public String f825e;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f817a = new ig("XmPushActionSendFeedbackResult");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14657a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 12, 2);
    private static final hy c = new hy("", (byte) 11, 3);
    private static final hy d = new hy("", (byte) 11, 4);
    private static final hy e = new hy("", (byte) 10, 6);
    private static final hy f = new hy("", (byte) 11, 7);
    private static final hy g = new hy("", (byte) 11, 8);

    public int hashCode() {
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12298a() {
        return this.f820a != null;
    }

    public boolean b() {
        return this.f819a != null;
    }

    public boolean c() {
        return this.f822b != null;
    }

    public boolean d() {
        return this.f823c != null;
    }

    public boolean e() {
        return this.f821a.get(0);
    }

    public void a(boolean z) {
        this.f821a.set(0, z);
    }

    public boolean f() {
        return this.f824d != null;
    }

    public boolean g() {
        return this.f825e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hi)) {
            return m12299a((hi) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12299a(hi hiVar) {
        if (hiVar == null) {
            return false;
        }
        boolean m12298a = m12298a();
        boolean m12298a2 = hiVar.m12298a();
        if ((m12298a || m12298a2) && !(m12298a && m12298a2 && this.f820a.equals(hiVar.f820a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = hiVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f819a.m12239a(hiVar.f819a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = hiVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f822b.equals(hiVar.f822b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = hiVar.d();
        if (((d2 || d3) && !(d2 && d3 && this.f823c.equals(hiVar.f823c))) || this.f818a != hiVar.f818a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hiVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f824d.equals(hiVar.f824d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hiVar.g();
        if (g2 || g3) {
            return g2 && g3 && this.f825e.equals(hiVar.f825e);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hi hiVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(hiVar.getClass())) {
            return getClass().getName().compareTo(hiVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12298a()).compareTo(Boolean.valueOf(hiVar.m12298a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12298a() && (a8 = hs.a(this.f820a, hiVar.f820a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hiVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a7 = hs.a(this.f819a, hiVar.f819a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hiVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a6 = hs.a(this.f822b, hiVar.f822b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hiVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a5 = hs.a(this.f823c, hiVar.f823c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hiVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a4 = hs.a(this.f818a, hiVar.f818a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hiVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a3 = hs.a(this.f824d, hiVar.f824d)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hiVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!g() || (a2 = hs.a(this.f825e, hiVar.f825e)) == 0) {
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
                            this.f820a = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 2:
                        if (mo12335a.f14670a == 12) {
                            gv gvVar = new gv();
                            this.f819a = gvVar;
                            gvVar.a(ibVar);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 3:
                        if (mo12335a.f14670a == 11) {
                            this.f822b = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 4:
                        if (mo12335a.f14670a == 11) {
                            this.f823c = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 5:
                    default:
                        ie.a(ibVar, mo12335a.f14670a);
                        break;
                    case 6:
                        if (mo12335a.f14670a == 10) {
                            this.f818a = ibVar.mo12334a();
                            a(true);
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 7:
                        if (mo12335a.f14670a == 11) {
                            this.f824d = ibVar.mo12340a();
                            break;
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                            break;
                        }
                    case 8:
                        if (mo12335a.f14670a == 11) {
                            this.f825e = ibVar.mo12340a();
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
                a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        a();
        ibVar.a(f817a);
        if (this.f820a != null && m12298a()) {
            ibVar.a(f14657a);
            ibVar.a(this.f820a);
            ibVar.b();
        }
        if (this.f819a != null && b()) {
            ibVar.a(b);
            this.f819a.b(ibVar);
            ibVar.b();
        }
        if (this.f822b != null) {
            ibVar.a(c);
            ibVar.a(this.f822b);
            ibVar.b();
        }
        if (this.f823c != null) {
            ibVar.a(d);
            ibVar.a(this.f823c);
            ibVar.b();
        }
        ibVar.a(e);
        ibVar.a(this.f818a);
        ibVar.b();
        if (this.f824d != null && f()) {
            ibVar.a(f);
            ibVar.a(this.f824d);
            ibVar.b();
        }
        if (this.f825e != null && g()) {
            ibVar.a(g);
            ibVar.a(this.f825e);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (m12298a()) {
            sb.append("debug:");
            String str = this.f820a;
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
            gv gvVar = this.f819a;
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
        String str2 = this.f822b;
        if (str2 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f823c;
        if (str3 == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f818a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f824d;
            if (str4 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f825e;
            if (str5 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str5);
            }
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public void a() {
        if (this.f822b == null) {
            throw new ic("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f823c == null) {
            throw new ic("Required field 'appId' was not present! Struct: " + toString());
        }
    }
}
