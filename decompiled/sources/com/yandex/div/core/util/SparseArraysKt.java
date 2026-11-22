package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SparseArrays.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"toIterable", "", "T", "Landroidx/collection/SparseArrayCompat;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SparseArraysKt {
    public static final <T> Iterable<T> toIterable(SparseArrayCompat<T> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return new SparseArrayIterable(sparseArrayCompat);
    }
}
