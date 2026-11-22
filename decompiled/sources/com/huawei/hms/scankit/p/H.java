package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.C2971e;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import java.util.Map;

/* compiled from: Decoder.java */
/* loaded from: classes14.dex */
public final class H {
    private K b = null;

    /* renamed from: a, reason: collision with root package name */
    private final com.huawei.hms.scankit.aiscan.common.u f10564a = new com.huawei.hms.scankit.aiscan.common.u(com.huawei.hms.scankit.aiscan.common.h.f);

    public C2971e a(C3074y c3074y, Map<EnumC2970d, ?> map) throws C2967a {
        C c = new C(c3074y);
        K a2 = c.a();
        this.b = a2;
        D[] a3 = D.a(c.b(), a2);
        int i = 0;
        for (D d : a3) {
            i += d.b();
        }
        byte[] bArr = new byte[i];
        int length = a3.length;
        for (int i2 = 0; i2 < length; i2++) {
            D d2 = a3[i2];
            byte[] a4 = d2.a();
            int b = d2.b();
            a(a4, b);
            for (int i3 = 0; i3 < b; i3++) {
                bArr[(i3 * length) + i2] = a4[i3];
            }
        }
        return G.a(bArr, map);
    }

    private void a(byte[] bArr, int i) throws C2967a {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f10564a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C2967a unused) {
            throw C2967a.a();
        }
    }

    public K a() {
        return this.b;
    }
}
