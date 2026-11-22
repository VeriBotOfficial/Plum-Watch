package com.facebook.react.viewmanagers;

import android.view.View;

/* loaded from: classes14.dex */
public interface PhNativeAdManagerInterface<T extends View> {
    void setIndex(T t, String str);

    void setItemWidth(T t, String str);

    void setPlacementId(T t, String str);

    void update(T t);
}
