package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class gp implements hr<gp, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f609a;

    /* renamed from: a, reason: collision with other field name */
    public gm f610a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f611a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    public List<gr> f612a;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f608a = new ig("NormalConfig");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14631a = new hy("", (byte) 8, 1);
    private static final hy b = new hy("", (byte) 15, 2);
    private static final hy c = new hy("", (byte) 8, 3);

    public int hashCode() {
        return 0;
    }

    public int a() {
        return this.f609a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12210a() {
        return this.f611a.get(0);
    }

    public void a(boolean z) {
        this.f611a.set(0, z);
    }

    public boolean b() {
        return this.f612a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public gm m12208a() {
        return this.f610a;
    }

    public boolean c() {
        return this.f610a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gp)) {
            return m12211a((gp) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12211a(gp gpVar) {
        if (gpVar == null || this.f609a != gpVar.f609a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = gpVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f612a.equals(gpVar.f612a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = gpVar.c();
        if (c2 || c3) {
            return c2 && c3 && this.f610a.equals(gpVar.f610a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gp gpVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(gpVar.getClass())) {
            return getClass().getName().compareTo(gpVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12210a()).compareTo(Boolean.valueOf(gpVar.m12210a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12210a() && (a4 = hs.a(this.f609a, gpVar.f609a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(gpVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = hs.a(this.f612a, gpVar.f612a)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(gpVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a2 = hs.a(this.f610a, gpVar.f610a)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.hr
    public void a(ib ibVar) {
        ibVar.mo12339a();
        while (true) {
            hy mo12335a = ibVar.mo12335a();
            if (mo12335a.f14670a == 0) {
                break;
            }
            short s = mo12335a.f915a;
            if (s != 1) {
                if (s != 2) {
                    if (s == 3) {
                        if (mo12335a.f14670a == 8) {
                            this.f610a = gm.a(ibVar.mo12333a());
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                        }
                    } else {
                        ie.a(ibVar, mo12335a.f14670a);
                    }
                } else if (mo12335a.f14670a == 15) {
                    hz mo12336a = ibVar.mo12336a();
                    this.f612a = new ArrayList(mo12336a.f916a);
                    for (int i = 0; i < mo12336a.f916a; i++) {
                        gr grVar = new gr();
                        grVar.a(ibVar);
                        this.f612a.add(grVar);
                    }
                    ibVar.i();
                } else {
                    ie.a(ibVar, mo12335a.f14670a);
                }
            } else if (mo12335a.f14670a == 8) {
                this.f609a = ibVar.mo12333a();
                a(true);
            } else {
                ie.a(ibVar, mo12335a.f14670a);
            }
            ibVar.g();
        }
        ibVar.f();
        if (!m12210a()) {
            throw new ic("Required field 'version' was not found in serialized data! Struct: " + toString());
        }
        m12209a();
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12209a();
        ibVar.a(f608a);
        ibVar.a(f14631a);
        ibVar.mo12344a(this.f609a);
        ibVar.b();
        if (this.f612a != null) {
            ibVar.a(b);
            ibVar.a(new hz((byte) 12, this.f612a.size()));
            Iterator<gr> it = this.f612a.iterator();
            while (it.hasNext()) {
                it.next().b(ibVar);
            }
            ibVar.e();
            ibVar.b();
        }
        if (this.f610a != null && c()) {
            ibVar.a(c);
            ibVar.mo12344a(this.f610a.a());
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(version:");
        sb.append(this.f609a);
        sb.append(", ");
        sb.append("configItems:");
        List<gr> list = this.f612a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        if (c()) {
            sb.append(", ");
            sb.append("type:");
            gm gmVar = this.f610a;
            if (gmVar == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(gmVar);
            }
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12209a() {
        if (this.f612a == null) {
            throw new ic("Required field 'configItems' was not present! Struct: " + toString());
        }
    }
}
