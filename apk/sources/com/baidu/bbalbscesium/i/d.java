package com.baidu.bbalbscesium.i;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f7388a = false;

    d() {
    }

    public static void a(byte[] bArr, byte[] bArr2, int r4) {
        if (r4 < 0) {
            throw new IllegalArgumentException("start should be more than zero!");
        }
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("dst array should not be null or empty");
        }
        if (bArr2 == null || bArr2.length == 0) {
            throw new IllegalArgumentException("src array should not be null or empty");
        }
        if (bArr.length < bArr2.length) {
            throw new IllegalArgumentException("dst array length should be longer than:" + bArr2.length);
        }
        if (bArr.length < bArr2.length + r4) {
            throw new IllegalArgumentException("start should be less than:" + (bArr.length - bArr2.length));
        }
        System.arraycopy(bArr2, 0, bArr, r4, bArr2.length);
    }

    public static byte[] a(byte[] bArr, int r2) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("original array should not be null or empty");
        }
        if (r2 >= 0) {
            return Arrays.copyOf(bArr, r2);
        }
        throw new IllegalArgumentException("length should be more than zero!");
    }
}
