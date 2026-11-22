package com.baidu.mapauto.auth.org.spongycastle.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: com.baidu.mapauto.auth.org.spongycastle.util.a$a, reason: collision with other inner class name */
    public static class C0369a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f8305a;
        public int b = 0;

        public C0369a(T[] tArr) {
            this.f8305a = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.f8305a.length;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.b;
            T[] tArr = this.f8305a;
            if (i == tArr.length) {
                throw new NoSuchElementException(com.baidu.mapauto.auth.b.a("Out of elements: ").append(this.b).toString());
            }
            this.b = i + 1;
            return tArr[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }
}
