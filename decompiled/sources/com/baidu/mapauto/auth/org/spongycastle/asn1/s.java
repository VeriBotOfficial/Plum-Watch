package com.baidu.mapauto.auth.org.spongycastle.asn1;

import com.baidu.mapauto.auth.org.spongycastle.util.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes13.dex */
public abstract class s extends r implements Iterable<d> {

    /* renamed from: a, reason: collision with root package name */
    public Vector f8290a = new Vector();

    public s() {
    }

    public s(e eVar) {
        for (int i = 0; i != eVar.a(); i++) {
            this.f8290a.addElement(eVar.a(i));
        }
    }

    public d a(int i) {
        return (d) this.f8290a.elementAt(i);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (!(rVar instanceof s)) {
            return false;
        }
        s sVar = (s) rVar;
        if (size() != sVar.size()) {
            return false;
        }
        Enumeration i = i();
        Enumeration i2 = sVar.i();
        while (i.hasMoreElements()) {
            d dVar = (d) i.nextElement();
            d dVar2 = (d) i2.nextElement();
            r c = dVar.c();
            r c2 = dVar2.c();
            if (c != c2 && !c.equals(c2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return true;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public r g() {
        z0 z0Var = new z0();
        z0Var.f8290a = this.f8290a;
        return z0Var;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public r h() {
        l1 l1Var = new l1();
        l1Var.f8290a = this.f8290a;
        return l1Var;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        Enumeration i = i();
        int size = size();
        while (i.hasMoreElements()) {
            size = (size * 17) ^ ((d) i.nextElement()).hashCode();
        }
        return size;
    }

    public Enumeration i() {
        return this.f8290a.elements();
    }

    @Override // java.lang.Iterable
    public final Iterator<d> iterator() {
        d[] dVarArr = new d[size()];
        for (int i = 0; i != size(); i++) {
            dVarArr[i] = a(i);
        }
        return new a.C0369a(dVarArr);
    }

    public int size() {
        return this.f8290a.size();
    }

    public final String toString() {
        return this.f8290a.toString();
    }

    public static s a(Object obj) {
        if (obj == null || (obj instanceof s)) {
            return (s) obj;
        }
        if (obj instanceof t) {
            return a((Object) ((t) obj).c());
        }
        if (obj instanceof byte[]) {
            try {
                return a((Object) r.a((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(com.baidu.mapauto.auth.b.a("failed to construct sequence from byte[]: ").append(e.getMessage()).toString());
            }
        }
        if (obj instanceof d) {
            r c = ((d) obj).c();
            if (c instanceof s) {
                return (s) c;
            }
        }
        throw new IllegalArgumentException(com.baidu.mapauto.auth.b.a("unknown object in getInstance: ").append(obj.getClass().getName()).toString());
    }
}
