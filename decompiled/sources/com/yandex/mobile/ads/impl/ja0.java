package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ja0 extends DiffUtil.ItemCallback<ia0> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(ia0 ia0Var, ia0 ia0Var2) {
        ia0 oldItem = ia0Var;
        ia0 newItem = ia0Var2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(ia0 ia0Var, ia0 ia0Var2) {
        ia0 oldItem = ia0Var;
        ia0 newItem = ia0Var2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof n90) && (newItem instanceof n90)) {
            return Intrinsics.areEqual(((n90) oldItem).a(), ((n90) newItem).a());
        }
        ha0 ha0Var = ha0.f15672a;
        return Intrinsics.areEqual(oldItem, ha0Var) && Intrinsics.areEqual(newItem, ha0Var);
    }
}
