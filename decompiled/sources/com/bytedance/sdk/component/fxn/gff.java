package com.bytedance.sdk.component.fxn;

/* loaded from: classes13.dex */
public abstract class gff<P, R> extends com.bytedance.sdk.component.fxn.kg<P, R> {
    private boolean fxn = true;
    private rb gff;
    private fxn kg;

    interface fxn {
        void fxn(Object obj);

        void fxn(Throwable th);
    }

    public interface kg {
        gff fxn();
    }

    protected abstract void fxn(P p, rb rbVar) throws Exception;

    @Override // com.bytedance.sdk.component.fxn.kg
    public /* bridge */ /* synthetic */ String fxn() {
        return super.fxn();
    }

    protected final void fxn(R r) {
        if (bh()) {
            this.kg.fxn(r);
            hm();
        }
    }

    protected final void fxn(Throwable th) {
        if (bh()) {
            this.kg.fxn(th);
            hm();
        }
    }

    protected final void gff() {
        fxn((Throwable) null);
    }

    protected void hm() {
        this.fxn = false;
        this.gff = null;
    }

    void fxn(P p, rb rbVar, fxn fxnVar) throws Exception {
        this.gff = rbVar;
        this.kg = fxnVar;
        fxn(p, rbVar);
    }

    void rb() {
        hm();
    }

    private boolean bh() {
        if (this.fxn) {
            return true;
        }
        tw.fxn(new IllegalStateException("Jsb async call already finished: " + fxn() + ", hashcode: " + hashCode()));
        return false;
    }
}
