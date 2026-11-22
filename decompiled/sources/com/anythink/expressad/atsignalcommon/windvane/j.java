package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes12.dex */
public abstract class j {
    protected Context f;
    protected Object g;
    protected WindVaneWebView h;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f = context;
        this.h = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.g = obj;
        this.h = windVaneWebView;
    }
}
