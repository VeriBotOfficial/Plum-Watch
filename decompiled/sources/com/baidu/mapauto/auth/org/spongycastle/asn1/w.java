package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes13.dex */
public abstract class w extends r implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public int f8298a;
    public boolean b;
    public d c;

    public w(boolean z, int i, d dVar) {
        this.c = null;
        this.b = z;
        this.f8298a = i;
        if (z) {
            this.c = dVar;
        } else {
            boolean z2 = dVar.c() instanceof u;
            this.c = dVar;
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return this;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (!(rVar instanceof w)) {
            return false;
        }
        w wVar = (w) rVar;
        if (this.f8298a != wVar.f8298a || this.b != wVar.b) {
            return false;
        }
        d dVar = this.c;
        return dVar == null ? wVar.c == null : dVar.c().equals(wVar.c.c());
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r g() {
        return new e1(this.b, this.f8298a, this.c);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r h() {
        return new n1(this.b, this.f8298a, this.c);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        int i = this.f8298a;
        d dVar = this.c;
        return dVar != null ? i ^ dVar.hashCode() : i;
    }

    public final r i() {
        d dVar = this.c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public final int j() {
        return this.f8298a;
    }

    public final String toString() {
        return com.baidu.mapauto.auth.b.a("[").append(this.f8298a).append("]").append(this.c).toString();
    }
}
