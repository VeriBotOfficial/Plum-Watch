package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uf1 {
    public static ArrayList a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = new ArrayList();
        int i = wh2.b;
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        ViewGroup view2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        View view3 = view;
        while (view2 != null) {
            int childCount = view2.getChildCount();
            for (int indexOfChild = view2.indexOfChild(view3) + 1; indexOfChild < childCount; indexOfChild++) {
                View childAt = view2.getChildAt(indexOfChild);
                Intrinsics.checkNotNull(childAt);
                arrayList.addAll(b(childAt));
            }
            Intrinsics.checkNotNullParameter(view2, "view");
            ViewParent parent2 = view2.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            view3 = view2;
            view2 = viewGroup;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (view.getZ() <= ((View) next).getZ()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    private static List b(View view) {
        List createListBuilder = CollectionsKt.createListBuilder();
        if (!wh2.d(view)) {
            if (!(view instanceof ViewGroup)) {
                createListBuilder.add(view);
            } else if (wh2.e(view)) {
                createListBuilder.add(view);
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                List createListBuilder2 = CollectionsKt.createListBuilder();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    Intrinsics.checkNotNull(childAt);
                    createListBuilder2.addAll(b(childAt));
                }
                createListBuilder.addAll(CollectionsKt.build(createListBuilder2));
            }
        }
        return CollectionsKt.build(createListBuilder);
    }
}
