package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final Tm f18057a;
    public final List b;
    public final String c;

    public S(Tm tm, ArrayList arrayList, String str) {
        this.f18057a = tm;
        this.b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.c = str;
    }
}
