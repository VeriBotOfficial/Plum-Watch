package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class hd implements hr<hd, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<gr> f744a;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f743a = new ig("XmPushActionCustomConfig");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14650a = new hy("", (byte) 15, 1);

    public int hashCode() {
        return 0;
    }

    public List<gr> a() {
        return this.f744a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12271a() {
        return this.f744a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hd)) {
            return m12272a((hd) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12272a(hd hdVar) {
        if (hdVar == null) {
            return false;
        }
        boolean m12271a = m12271a();
        boolean m12271a2 = hdVar.m12271a();
        if (m12271a || m12271a2) {
            return m12271a && m12271a2 && this.f744a.equals(hdVar.f744a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hd hdVar) {
        int a2;
        if (!getClass().equals(hdVar.getClass())) {
            return getClass().getName().compareTo(hdVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12271a()).compareTo(Boolean.valueOf(hdVar.m12271a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m12271a() || (a2 = hs.a(this.f744a, hdVar.f744a)) == 0) {
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
                        this.f744a = new ArrayList(mo12336a.f916a);
                        for (int i = 0; i < mo12336a.f916a; i++) {
                            gr grVar = new gr();
                            grVar.a(ibVar);
                            this.f744a.add(grVar);
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
                m12270a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12270a();
        ibVar.a(f743a);
        if (this.f744a != null) {
            ibVar.a(f14650a);
            ibVar.a(new hz((byte) 12, this.f744a.size()));
            Iterator<gr> it = this.f744a.iterator();
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
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(customConfigs:");
        List<gr> list = this.f744a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12270a() {
        if (this.f744a == null) {
            throw new ic("Required field 'customConfigs' was not present! Struct: " + toString());
        }
    }
}
