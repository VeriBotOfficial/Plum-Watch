package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class el implements hr<el, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public String f458a;

    /* renamed from: a, reason: collision with other field name */
    public List<ek> f459a;

    /* renamed from: b, reason: collision with other field name */
    public String f460b;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f457a = new ig("StatsEvents");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14559a = new hy("", (byte) 11, 1);
    private static final hy b = new hy("", (byte) 11, 2);
    private static final hy c = new hy("", (byte) 15, 3);

    public int hashCode() {
        return 0;
    }

    public el() {
    }

    public el(String str, List<ek> list) {
        this();
        this.f458a = str;
        this.f459a = list;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12110a() {
        return this.f458a != null;
    }

    public el a(String str) {
        this.f460b = str;
        return this;
    }

    public boolean b() {
        return this.f460b != null;
    }

    public boolean c() {
        return this.f459a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof el)) {
            return m12111a((el) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12111a(el elVar) {
        if (elVar == null) {
            return false;
        }
        boolean m12110a = m12110a();
        boolean m12110a2 = elVar.m12110a();
        if ((m12110a || m12110a2) && !(m12110a && m12110a2 && this.f458a.equals(elVar.f458a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = elVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f460b.equals(elVar.f460b))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = elVar.c();
        if (c2 || c3) {
            return c2 && c3 && this.f459a.equals(elVar.f459a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(el elVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(elVar.getClass())) {
            return getClass().getName().compareTo(elVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12110a()).compareTo(Boolean.valueOf(elVar.m12110a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12110a() && (a4 = hs.a(this.f458a, elVar.f458a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(elVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = hs.a(this.f460b, elVar.f460b)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(elVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a2 = hs.a(this.f459a, elVar.f459a)) == 0) {
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
                short s = mo12335a.f915a;
                if (s != 1) {
                    if (s != 2) {
                        if (s == 3) {
                            if (mo12335a.f14670a == 15) {
                                hz mo12336a = ibVar.mo12336a();
                                this.f459a = new ArrayList(mo12336a.f916a);
                                for (int i = 0; i < mo12336a.f916a; i++) {
                                    ek ekVar = new ek();
                                    ekVar.a(ibVar);
                                    this.f459a.add(ekVar);
                                }
                                ibVar.i();
                            } else {
                                ie.a(ibVar, mo12335a.f14670a);
                            }
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                        }
                    } else if (mo12335a.f14670a == 11) {
                        this.f460b = ibVar.mo12340a();
                    } else {
                        ie.a(ibVar, mo12335a.f14670a);
                    }
                } else if (mo12335a.f14670a == 11) {
                    this.f458a = ibVar.mo12340a();
                } else {
                    ie.a(ibVar, mo12335a.f14670a);
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
        ibVar.a(f457a);
        if (this.f458a != null) {
            ibVar.a(f14559a);
            ibVar.a(this.f458a);
            ibVar.b();
        }
        if (this.f460b != null && b()) {
            ibVar.a(b);
            ibVar.a(this.f460b);
            ibVar.b();
        }
        if (this.f459a != null) {
            ibVar.a(c);
            ibVar.a(new hz((byte) 12, this.f459a.size()));
            Iterator<ek> it = this.f459a.iterator();
            while (it.hasNext()) {
                it.next().b(ibVar);
            }
            ibVar.e();
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(uuid:");
        String str = this.f458a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        if (b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f460b;
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<ek> list = this.f459a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public void a() {
        if (this.f458a == null) {
            throw new ic("Required field 'uuid' was not present! Struct: " + toString());
        }
        if (this.f459a == null) {
            throw new ic("Required field 'events' was not present! Struct: " + toString());
        }
    }
}
