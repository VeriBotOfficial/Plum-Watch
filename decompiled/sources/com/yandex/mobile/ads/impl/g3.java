package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class g3 {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements Comparator<gt> {
        @Override // java.util.Comparator
        public final int compare(gt gtVar, gt gtVar2) {
            gt first = gtVar;
            gt second = gtVar2;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            return (int) RangesKt.coerceIn(first.b().b() - second.b().b(), -1L, 1L);
        }
    }
}
