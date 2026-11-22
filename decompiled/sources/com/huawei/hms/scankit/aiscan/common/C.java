package com.huawei.hms.scankit.aiscan.common;

import java.util.HashMap;

/* compiled from: ToneMapping.java */
/* loaded from: classes14.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    private static float f10509a = 2.51f;
    private static float b = 0.03f;
    private static float c = 2.43f;
    private static float d = 0.59f;
    private static float e = 0.14f;
    private static HashMap<Integer, Integer> f = new HashMap<>(255);

    private static int a(int i, float f2) {
        if (f.containsKey(Integer.valueOf(i))) {
            return f.get(Integer.valueOf(i)).intValue();
        }
        float f3 = i / f2;
        int i2 = (int) ((f2 * (((f10509a * f3) + b) * f3)) / ((f3 * ((c * f3) + d)) + e));
        f.put(Integer.valueOf(i), Integer.valueOf(i2));
        return i2;
    }

    private static int b(m mVar) {
        if (mVar.b() == null) {
            return 1;
        }
        int c2 = mVar.c();
        int a2 = mVar.a();
        long j = 0;
        for (int i = a2 / 4; i < (a2 * 3) / 4; i++) {
            for (int i2 = c2 / 4; i2 < (c2 * 3) / 4; i2++) {
                j += r0[(i * c2) + i2] & 255;
            }
        }
        return (int) ((j / r0.length) * 4);
    }

    public static m a(m mVar) {
        int b2 = b(mVar);
        int c2 = mVar.c();
        int a2 = mVar.a();
        byte[] b3 = mVar.b();
        byte[] bArr = new byte[a2 * c2];
        for (int i = 0; i < a2; i++) {
            for (int i2 = 0; i2 < c2; i2++) {
                int i3 = (i * c2) + i2;
                bArr[i3] = (byte) (a(b3[i3] & 255, b2) & 255);
            }
        }
        f = new HashMap<>(255);
        return new r(bArr, c2, a2, 0, 0, c2, a2, false);
    }
}
