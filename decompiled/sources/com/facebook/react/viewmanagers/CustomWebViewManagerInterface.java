package com.facebook.react.viewmanagers;

import android.view.View;

/* loaded from: classes14.dex */
public interface CustomWebViewManagerInterface<T extends View> {
    void evaluateJavascriptTest(T t, String str);

    void loadUrlTest(T t, String str);

    void setSourceURL(T t, String str);
}
