package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes5.dex */
public final class jx<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return ComparisonsKt.compareValues(((rw) t).e(), ((rw) t2).e());
    }
}
