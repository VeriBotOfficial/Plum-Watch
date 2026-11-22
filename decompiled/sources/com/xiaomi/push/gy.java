package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class gy implements hr<gy, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f704a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f705a = new BitSet(2);

    /* renamed from: b, reason: collision with other field name */
    public int f706b;

    /* renamed from: a, reason: collision with other field name */
    private static final ig f703a = new ig("XmPushActionCheckClientInfo");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14644a = new hy("", (byte) 8, 1);
    private static final hy b = new hy("", (byte) 8, 2);

    public void a() {
    }

    public int hashCode() {
        return 0;
    }

    public gy a(int i) {
        this.f704a = i;
        a(true);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12247a() {
        return this.f705a.get(0);
    }

    public void a(boolean z) {
        this.f705a.set(0, z);
    }

    public gy b(int i) {
        this.f706b = i;
        b(true);
        return this;
    }

    public boolean b() {
        return this.f705a.get(1);
    }

    public void b(boolean z) {
        this.f705a.set(1, z);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gy)) {
            return m12248a((gy) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12248a(gy gyVar) {
        return gyVar != null && this.f704a == gyVar.f704a && this.f706b == gyVar.f706b;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(gy gyVar) {
        int a2;
        int a3;
        if (!getClass().equals(gyVar.getClass())) {
            return getClass().getName().compareTo(gyVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12247a()).compareTo(Boolean.valueOf(gyVar.m12247a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12247a() && (a3 = hs.a(this.f704a, gyVar.f704a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(gyVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!b() || (a2 = hs.a(this.f706b, gyVar.f706b)) == 0) {
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
                if (s == 2) {
                    if (mo12335a.f14670a == 8) {
                        this.f706b = ibVar.mo12333a();
                        b(true);
                    } else {
                        ie.a(ibVar, mo12335a.f14670a);
                    }
                } else {
                    ie.a(ibVar, mo12335a.f14670a);
                }
            } else if (mo12335a.f14670a == 8) {
                this.f704a = ibVar.mo12333a();
                a(true);
            } else {
                ie.a(ibVar, mo12335a.f14670a);
            }
            ibVar.g();
        }
        ibVar.f();
        if (!m12247a()) {
            throw new ic("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        }
        if (!b()) {
            throw new ic("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
        a();
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        a();
        ibVar.a(f703a);
        ibVar.a(f14644a);
        ibVar.mo12344a(this.f704a);
        ibVar.b();
        ibVar.a(b);
        ibVar.mo12344a(this.f706b);
        ibVar.b();
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f704a + ", pluginConfigVersion:" + this.f706b + Separators.RPAREN;
    }
}
