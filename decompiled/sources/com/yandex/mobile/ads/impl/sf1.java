package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.yandex.mobile.ads.impl.pw1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class sf1 {

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f16858a;
    private final tf1 b;
    private final rf1 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    public final int a(View view, Rect viewRect) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        int i = pw1.l;
        pw1 a2 = pw1.a.a();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ju1 a3 = a2.a(context);
        if (a3 == null || !a3.t0()) {
            return 0;
        }
        this.f16858a.getClass();
        ArrayList overlappingViews = uf1.a(view);
        this.b.getClass();
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        Intrinsics.checkNotNullParameter(overlappingViews, "overlappingViews");
        ArrayList arrayList = new ArrayList();
        Iterator it = overlappingViews.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            Rect rect = new Rect();
            if (view2.getGlobalVisibleRect(rect)) {
                arrayList.add(rect);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Rect rect2 = (Rect) it2.next();
            int i2 = rect2.left;
            int i3 = viewRect.left;
            rect2.left = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(i2, i3), viewRect.right);
            int i4 = rect2.top;
            int i5 = viewRect.top;
            rect2.top = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(i4, i5), viewRect.bottom);
            int i6 = rect2.right;
            int i7 = viewRect.left;
            rect2.right = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(i6, i7), viewRect.right);
            int i8 = rect2.bottom;
            int i9 = viewRect.top;
            rect2.bottom = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(i8, i9), viewRect.bottom);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            Rect rect3 = (Rect) next;
            if (rect3.width() > 0 && rect3.height() > 0) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = arrayList2;
        if (size > 100) {
            arrayList3 = arrayList2.subList(0, 100);
        }
        this.c.getClass();
        return rf1.a(viewRect, arrayList3);
    }

    public /* synthetic */ sf1() {
        this(new uf1(), new tf1(), new rf1());
    }

    public sf1(uf1 overlappingViewsProvider, tf1 overlappingRectsProvider, rf1 overlappingAreaEvaluator) {
        Intrinsics.checkNotNullParameter(overlappingViewsProvider, "overlappingViewsProvider");
        Intrinsics.checkNotNullParameter(overlappingRectsProvider, "overlappingRectsProvider");
        Intrinsics.checkNotNullParameter(overlappingAreaEvaluator, "overlappingAreaEvaluator");
        this.f16858a = overlappingViewsProvider;
        this.b = overlappingRectsProvider;
        this.c = overlappingAreaEvaluator;
    }
}
