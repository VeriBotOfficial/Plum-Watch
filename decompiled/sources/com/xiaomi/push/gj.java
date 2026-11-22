package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class gj implements hr<gj, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<gk> f583a;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f582a = new ig("ClientUploadData");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14623a = new hy("", (byte) 15, 1);

    public int hashCode() {
        return 0;
    }

    public int a() {
        List<gk> list = this.f583a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void a(gk gkVar) {
        if (this.f583a == null) {
            this.f583a = new ArrayList();
        }
        this.f583a.add(gkVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12193a() {
        return this.f583a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gj)) {
            return m12194a((gj) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12194a(gj gjVar) {
        if (gjVar == null) {
            return false;
        }
        boolean m12193a = m12193a();
        boolean m12193a2 = gjVar.m12193a();
        if (m12193a || m12193a2) {
            return m12193a && m12193a2 && this.f583a.equals(gjVar.f583a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gj gjVar) {
        int a2;
        if (!getClass().equals(gjVar.getClass())) {
            return getClass().getName().compareTo(gjVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12193a()).compareTo(Boolean.valueOf(gjVar.m12193a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m12193a() || (a2 = hs.a(this.f583a, gjVar.f583a)) == 0) {
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
                if (mo12335a.f915a == 1) {
                    if (mo12335a.f14670a == 15) {
                        hz mo12336a = ibVar.mo12336a();
                        this.f583a = new ArrayList(mo12336a.f916a);
                        for (int i = 0; i < mo12336a.f916a; i++) {
                            gk gkVar = new gk();
                            gkVar.a(ibVar);
                            this.f583a.add(gkVar);
                        }
                        ibVar.i();
                    } else {
                        ie.a(ibVar, mo12335a.f14670a);
                    }
                } else {
                    ie.a(ibVar, mo12335a.f14670a);
                }
                ibVar.g();
            } else {
                ibVar.f();
                m12192a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12192a();
        ibVar.a(f582a);
        if (this.f583a != null) {
            ibVar.a(f14623a);
            ibVar.a(new hz((byte) 12, this.f583a.size()));
            Iterator<gk> it = this.f583a.iterator();
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
        StringBuilder sb = new StringBuilder("ClientUploadData(uploadDataItems:");
        List<gk> list = this.f583a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12192a() {
        if (this.f583a == null) {
            throw new ic("Required field 'uploadDataItems' was not present! Struct: " + toString());
        }
    }
}
