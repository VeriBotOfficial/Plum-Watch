package com.huawei.hms.scankit.aiscan.common;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ReedSolomonEncoder.java */
/* loaded from: classes14.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final h f10526a;
    private final List<i> b;

    public v(h hVar) {
        this.f10526a = hVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new i(hVar, new int[]{1}));
    }

    private i a(int i) {
        if (i >= this.b.size()) {
            List<i> list = this.b;
            i iVar = list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                h hVar = this.f10526a;
                iVar = iVar.c(new i(hVar, new int[]{1, hVar.a((size - 1) + hVar.a())}));
                this.b.add(iVar);
            }
        }
        return this.b.get(i);
    }

    public void a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                i a2 = a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] a3 = new i(this.f10526a, iArr2).a(i, 1).b(a2)[1].a();
                int length2 = i - a3.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(a3, 0, iArr, length + length2, a3.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
