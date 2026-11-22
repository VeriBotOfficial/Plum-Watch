package com.baidu.bbalbscesium.i;

import java.util.Arrays;

/* loaded from: classes12.dex */
public class a {
    private static final boolean b = false;
    private static final boolean c = false;

    /* renamed from: a, reason: collision with root package name */
    k[] f7385a = {new l(8, 0), new m(0, 1), new m(1, 1), new l(7, 1)};

    public byte[] a(byte[] bArr) {
        j jVar = new j();
        byte[] a2 = d.a(bArr, bArr.length + ((this.f7385a.length + 1) * j.e));
        d.a(a2, jVar.b(), bArr.length);
        int i = 0;
        while (true) {
            k[] kVarArr = this.f7385a;
            if (i >= kVarArr.length) {
                return Arrays.copyOf(jVar.b(), j.e);
            }
            k kVar = kVarArr[i];
            i++;
            int length = bArr.length + (j.e * i);
            jVar.a(kVar.a(a2, 0, length), kVar.c(), kVar.a(), kVar.b());
            d.a(a2, jVar.b(), length);
        }
    }
}
