package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class pm {
    protected static final Comparator<byte[]> e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f16582a = new ArrayList();
    private final ArrayList b = new ArrayList(64);
    private int c = 0;
    private final int d = 4096;

    final class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public final synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = (byte[]) this.b.get(i2);
            if (bArr.length >= i) {
                this.c -= bArr.length;
                this.b.remove(i2);
                this.f16582a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.f16582a.add(bArr);
                int binarySearch = Collections.binarySearch(this.b, bArr, e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.b.add(binarySearch, bArr);
                this.c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.c > this.d) {
            byte[] bArr = (byte[]) this.f16582a.remove(0);
            this.b.remove(bArr);
            this.c -= bArr.length;
        }
    }
}
