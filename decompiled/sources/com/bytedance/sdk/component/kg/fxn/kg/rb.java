package com.bytedance.sdk.component.kg.fxn.kg;

/* loaded from: classes13.dex */
final class rb {
    rb bh;
    final byte[] fxn;
    int gff;
    boolean hm;
    int kg;
    boolean rb;

    /* renamed from: sg, reason: collision with root package name */
    rb f9374sg;

    rb() {
        this.fxn = new byte[8192];
        this.rb = true;
        this.hm = false;
    }

    rb(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.fxn = bArr;
        this.kg = i;
        this.gff = i2;
        this.hm = z;
        this.rb = z2;
    }

    final rb fxn() {
        this.hm = true;
        return new rb(this.fxn, this.kg, this.gff, true, false);
    }

    public final rb kg() {
        rb rbVar = this.bh;
        rb rbVar2 = rbVar != this ? rbVar : null;
        rb rbVar3 = this.f9374sg;
        if (rbVar3 != null) {
            rbVar3.bh = rbVar;
        }
        rb rbVar4 = this.bh;
        if (rbVar4 != null) {
            rbVar4.f9374sg = rbVar3;
        }
        this.bh = null;
        this.f9374sg = null;
        return rbVar2;
    }

    public final rb fxn(rb rbVar) {
        rbVar.f9374sg = this;
        rbVar.bh = this.bh;
        this.bh.f9374sg = rbVar;
        this.bh = rbVar;
        return rbVar;
    }
}
