package com.bytedance.sdk.component.kg.fxn;

/* JADX INFO: loaded from: classes15.dex */
public final class fxn {
    public final boolean fxn;

    fxn(C0567fxn c0567fxn) {
        this.fxn = c0567fxn.fxn;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.kg.fxn.fxn$fxn, reason: collision with other inner class name */
    public static final class C0567fxn {
        boolean fxn;

        public C0567fxn fxn() {
            this.fxn = true;
            return this;
        }

        public fxn kg() {
            return new fxn(this);
        }
    }
}
