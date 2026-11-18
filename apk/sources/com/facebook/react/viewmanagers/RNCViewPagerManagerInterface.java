package com.facebook.react.viewmanagers;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public interface RNCViewPagerManagerInterface<T extends View> {
    void setInitialPage(T t, int r2);

    void setKeyboardDismissMode(T t, String str);

    void setLayoutDirection(T t, String str);

    void setOffscreenPageLimit(T t, int r2);

    void setOrientation(T t, String str);

    void setOverScrollMode(T t, String str);

    void setOverdrag(T t, boolean z);

    void setPage(T t, int r2);

    void setPageMargin(T t, int r2);

    void setPageWithoutAnimation(T t, int r2);

    void setScrollEnabled(T t, boolean z);

    void setScrollEnabledImperatively(T t, boolean z);
}
