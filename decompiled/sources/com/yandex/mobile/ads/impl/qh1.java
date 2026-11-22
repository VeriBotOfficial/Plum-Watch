package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class qh1 {
    static <T> T[] a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }
}
