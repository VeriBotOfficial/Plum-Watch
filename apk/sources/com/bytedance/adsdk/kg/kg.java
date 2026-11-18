package com.bytedance.adsdk.kg;

/* JADX INFO: loaded from: classes15.dex */
class kg {
    static final int[] fxn = new int[0];
    static final long[] kg = new long[0];
    static final Object[] gff = new Object[0];

    static int fxn(int[] r3, int r4, int r5) {
        int r6 = r4 - 1;
        int r0 = 0;
        while (r0 <= r6) {
            int r1 = (r0 + r6) >>> 1;
            int r2 = r3[r1];
            if (r2 < r5) {
                r0 = r1 + 1;
            } else {
                if (r2 <= r5) {
                    return r1;
                }
                r6 = r1 - 1;
            }
        }
        return ~r0;
    }
}
