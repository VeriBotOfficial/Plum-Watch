package com.bykv.vk.openvk.fxn.fxn.kg.gff;

import com.bykv.vk.openvk.fxn.fxn.kg.gff.gff;

/* loaded from: classes13.dex */
public abstract class fxn implements gff {
    private gff.sg bh;
    protected boolean fxn = false;
    private gff.kg gff;
    private gff.fxn hm;
    private gff.rb kg;
    private gff.bh rb;

    /* renamed from: sg, reason: collision with root package name */
    private gff.InterfaceC0448gff f9084sg;
    private gff.hm tw;

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public final void fxn(gff.rb rbVar) {
        this.kg = rbVar;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public final void fxn(gff.kg kgVar) {
        this.gff = kgVar;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public final void fxn(gff.fxn fxnVar) {
        this.hm = fxnVar;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public final void fxn(gff.bh bhVar) {
        this.rb = bhVar;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public final void fxn(gff.InterfaceC0448gff interfaceC0448gff) {
        this.f9084sg = interfaceC0448gff;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public final void fxn(gff.hm hmVar) {
        this.tw = hmVar;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public final void fxn(gff.sg sgVar) {
        this.bh = sgVar;
    }

    public void fxn() {
        this.kg = null;
        this.hm = null;
        this.gff = null;
        this.rb = null;
        this.bh = null;
        this.f9084sg = null;
        this.tw = null;
    }

    protected final void kg() {
        try {
            gff.rb rbVar = this.kg;
            if (rbVar != null) {
                rbVar.kg(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void gff() {
        try {
            gff.kg kgVar = this.gff;
            if (kgVar != null) {
                kgVar.fxn(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void fxn(int i) {
        try {
            gff.fxn fxnVar = this.hm;
            if (fxnVar != null) {
                fxnVar.fxn(this, i);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void hm() {
        try {
            gff.bh bhVar = this.rb;
            if (bhVar != null) {
                bhVar.gff(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void fxn(int i, int i2, int i3, int i4) {
        try {
            gff.sg sgVar = this.bh;
            if (sgVar != null) {
                sgVar.fxn(this, i, i2, i3, i4);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean fxn(int i, int i2) {
        try {
            gff.InterfaceC0448gff interfaceC0448gff = this.f9084sg;
            if (interfaceC0448gff != null) {
                if (interfaceC0448gff.fxn(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    protected final boolean kg(int i, int i2) {
        try {
            gff.hm hmVar = this.tw;
            if (hmVar != null) {
                if (hmVar.kg(this, i, i2)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void fxn(boolean z) {
        this.fxn = z;
    }
}
