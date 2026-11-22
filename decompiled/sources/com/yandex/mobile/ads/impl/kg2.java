package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kg2 {
    private static final List<String> c = CollectionsKt.listOf((Object[]) new String[]{"clickTracking", "impression"});

    /* renamed from: a, reason: collision with root package name */
    private final re2 f16019a;
    private final s82 b;

    public kg2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16019a = new re2(context);
        this.b = new s82(context);
    }

    public final void a(jg2 trackable, String eventName) {
        Intrinsics.checkNotNullParameter(trackable, "trackable");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        List<String> list = trackable.a().get(eventName);
        if (c.contains(eventName)) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.b.a((String) it.next()));
                }
                list = arrayList;
            } else {
                list = null;
            }
        }
        if (list != null) {
            this.f16019a.a(list, null);
        }
    }

    public final void a(jg2 trackable, String eventName, Map<String, String> macros) {
        Intrinsics.checkNotNullParameter(trackable, "trackable");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        List<String> list = trackable.a().get(eventName);
        if (list != null) {
            this.f16019a.a(list, macros);
        }
    }
}
