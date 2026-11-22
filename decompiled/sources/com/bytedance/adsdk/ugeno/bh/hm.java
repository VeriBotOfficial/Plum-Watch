package com.bytedance.adsdk.ugeno.bh;

import java.util.Collection;

/* loaded from: classes13.dex */
public class hm {
    public static int fxn(boolean z, int i, int i2) {
        if (i2 == 0 || !z) {
            return i;
        }
        int i3 = i - 512;
        int abs = Math.abs(i3) % i2;
        return (i3 >= 0 || abs == 0) ? abs : i2 - abs;
    }

    public static boolean fxn(int i, Collection<?> collection) {
        return i >= 0 && i < collection.size();
    }
}
