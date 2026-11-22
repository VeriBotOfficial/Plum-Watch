package com.chad.library.adapter.base.diff;

import java.util.List;

/* loaded from: classes14.dex */
public interface ListChangeListener<T> {
    void onCurrentListChanged(List<T> previousList, List<T> currentList);
}
