package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes14.dex */
public interface RNSSafeAreaViewManagerInterface<T extends View> {
    void setEdges(T t, ReadableMap readableMap);

    void setInsetType(T t, String str);
}
