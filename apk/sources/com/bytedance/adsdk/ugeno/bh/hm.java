package com.bytedance.adsdk.ugeno.bh;

import java.util.Collection;

/* JADX INFO: loaded from: classes15.dex */
public class hm {
    public static int fxn(boolean z, int r1, int r2) {
        if (r2 == 0 || !z) {
            return r1;
        }
        int r3 = r1 - 512;
        int r0 = Math.abs(r3) % r2;
        return (r3 >= 0 || r0 == 0) ? r0 : r2 - r0;
    }

    public static boolean fxn(int r0, Collection<?> collection) {
        return r0 >= 0 && r0 < collection.size();
    }
}
