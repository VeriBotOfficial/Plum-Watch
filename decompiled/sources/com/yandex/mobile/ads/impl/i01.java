package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i01 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f15764a = CollectionsKt.emptyList();

    public static boolean a(Context context, String adapterName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        return !f15764a.contains(adapterName) || x80.a(context, w80.d);
    }
}
