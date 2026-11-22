package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class am2 implements InstreamAd {

    /* renamed from: a, reason: collision with root package name */
    private final et f15019a;

    public am2(et coreInstreamAd) {
        Intrinsics.checkNotNullParameter(coreInstreamAd, "coreInstreamAd");
        this.f15019a = coreInstreamAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am2) && Intrinsics.areEqual(this.f15019a, ((am2) obj).f15019a);
    }

    public final int hashCode() {
        return this.f15019a.hashCode();
    }

    public final String toString() {
        return "YandexInstreamAd(coreInstreamAd=" + this.f15019a + Separators.RPAREN;
    }

    public final et a() {
        return this.f15019a;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAd
    public final List<InstreamAdBreak> getAdBreaks() {
        List<gt> a2 = this.f15019a.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(new bm2((gt) it.next()));
        }
        return arrayList;
    }
}
