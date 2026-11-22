package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jr0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final List<fr0<V>> f15940a;

    public jr0(List<fr0<V>> layoutDesigns) {
        Intrinsics.checkNotNullParameter(layoutDesigns, "layoutDesigns");
        this.f15940a = layoutDesigns;
    }

    public final fr0<V> a(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<T> it = this.f15940a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((fr0) obj).b().a(context)) {
                break;
            }
        }
        return (fr0) obj;
    }
}
