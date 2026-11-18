package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: ByteArrayPool.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    protected static final Comparator<byte[]> e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f12302a = new ArrayList();
    private final List<byte[]> b = new ArrayList(64);
    private int c = 0;
    private final int d;

    /* JADX INFO: compiled from: ByteArrayPool.java */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int r3) {
        this.d = r3;
    }

    public synchronized byte[] a(int r4) {
        for (int r0 = 0; r0 < this.b.size(); r0++) {
            byte[] bArr = this.b.get(r0);
            if (bArr.length >= r4) {
                this.c -= bArr.length;
                this.b.remove(r0);
                this.f12302a.remove(bArr);
                return bArr;
            }
        }
        return new byte[r4];
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.f12302a.add(bArr);
                int r0 = Collections.binarySearch(this.b, bArr, e);
                if (r0 < 0) {
                    r0 = (-r0) - 1;
                }
                this.b.add(r0, bArr);
                this.c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.c > this.d) {
            byte[] bArrRemove = this.f12302a.remove(0);
            this.b.remove(bArrRemove);
            this.c -= bArrRemove.length;
        }
    }
}
