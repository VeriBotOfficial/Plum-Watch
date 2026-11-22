package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gx extends DiffUtil.ItemCallback<iy> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(iy iyVar, iy iyVar2) {
        iy prevItem = iyVar;
        iy newItem = iyVar2;
        Intrinsics.checkNotNullParameter(prevItem, "prevItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return prevItem.a(newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(iy iyVar, iy iyVar2) {
        iy prevItem = iyVar;
        iy newItem = iyVar2;
        Intrinsics.checkNotNullParameter(prevItem, "prevItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return prevItem.a(newItem);
    }
}
