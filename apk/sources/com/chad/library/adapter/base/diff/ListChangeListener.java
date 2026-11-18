package com.chad.library.adapter.base.diff;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface ListChangeListener<T> {
    void onCurrentListChanged(List<T> previousList, List<T> currentList);
}
