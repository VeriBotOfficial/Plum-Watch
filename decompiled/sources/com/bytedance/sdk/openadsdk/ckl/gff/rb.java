package com.bytedance.sdk.openadsdk.ckl.gff;

/* loaded from: classes14.dex */
class rb implements gff {
    private static volatile rb fxn;

    @Override // com.bytedance.sdk.openadsdk.ckl.gff.gff
    public void fxn(com.bytedance.sdk.openadsdk.ckl.kg kgVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.ckl.gff.gff
    public void fxn(com.bytedance.sdk.openadsdk.ckl.kg kgVar, boolean z) {
    }

    public static rb fxn() {
        if (fxn == null) {
            synchronized (rb.class) {
                if (fxn == null) {
                    fxn = new rb();
                }
            }
        }
        return fxn;
    }

    private rb() {
    }
}
