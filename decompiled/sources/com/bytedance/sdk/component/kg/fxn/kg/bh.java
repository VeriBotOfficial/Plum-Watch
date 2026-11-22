package com.bytedance.sdk.component.kg.fxn.kg;

/* loaded from: classes13.dex */
final class bh {
    static rb fxn;
    static long kg;

    private bh() {
    }

    static rb fxn() {
        synchronized (bh.class) {
            rb rbVar = fxn;
            if (rbVar != null) {
                fxn = rbVar.bh;
                rbVar.bh = null;
                kg -= 8192;
                return rbVar;
            }
            return new rb();
        }
    }

    static void fxn(rb rbVar) {
        if (rbVar.bh != null || rbVar.f9374sg != null) {
            throw new IllegalArgumentException();
        }
        if (rbVar.hm) {
            return;
        }
        synchronized (bh.class) {
            long j = kg;
            if (j + 8192 > 65536) {
                return;
            }
            kg = j + 8192;
            rbVar.bh = fxn;
            rbVar.gff = 0;
            rbVar.kg = 0;
            fxn = rbVar;
        }
    }
}
