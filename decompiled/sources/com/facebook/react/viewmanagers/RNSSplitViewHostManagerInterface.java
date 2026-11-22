package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes14.dex */
public interface RNSSplitViewHostManagerInterface<T extends View> {
    void setColumnMetrics(T t, ReadableMap readableMap);

    void setDisplayModeButtonVisibility(T t, String str);

    void setOrientation(T t, String str);

    void setPreferredDisplayMode(T t, String str);

    void setPreferredSplitBehavior(T t, String str);

    void setPresentsWithGesture(T t, boolean z);

    void setPrimaryEdge(T t, String str);

    void setShowInspector(T t, boolean z);

    void setShowSecondaryToggleButton(T t, boolean z);
}
