package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class gz implements hr<gz, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<go> f708a;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f707a = new ig("XmPushActionCollectData");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14645a = new hy("", (byte) 15, 1);

    public int hashCode() {
        return 0;
    }

    public gz a(List<go> list) {
        this.f708a = list;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12249a() {
        return this.f708a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gz)) {
            return m12250a((gz) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12250a(gz gzVar) {
        if (gzVar == null) {
            return false;
        }
        boolean m12249a = m12249a();
        boolean m12249a2 = gzVar.m12249a();
        if (m12249a || m12249a2) {
            return m12249a && m12249a2 && this.f708a.equals(gzVar.f708a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gz gzVar) {
        int a2;
        if (!getClass().equals(gzVar.getClass())) {
            return getClass().getName().compareTo(gzVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12249a()).compareTo(Boolean.valueOf(gzVar.m12249a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m12249a() || (a2 = hs.a(this.f708a, gzVar.f708a)) == 0) {
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
                        this.f708a = new ArrayList(mo12336a.f916a);
                        for (int i = 0; i < mo12336a.f916a; i++) {
                            go goVar = new go();
                            goVar.a(ibVar);
                            this.f708a.add(goVar);
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
                a();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        a();
        ibVar.a(f707a);
        if (this.f708a != null) {
            ibVar.a(f14645a);
            ibVar.a(new hz((byte) 12, this.f708a.size()));
            Iterator<go> it = this.f708a.iterator();
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
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(dataCollectionItems:");
        List<go> list = this.f708a;
        if (list == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(list);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public void a() {
        if (this.f708a == null) {
            throw new ic("Required field 'dataCollectionItems' was not present! Struct: " + toString());
        }
    }
}
