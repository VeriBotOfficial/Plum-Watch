package com.scwang.smart.refresh.layout.listener;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public interface ScrollBoundaryDecider {
    boolean canLoadMore(View view);

    boolean canRefresh(View view);
}
