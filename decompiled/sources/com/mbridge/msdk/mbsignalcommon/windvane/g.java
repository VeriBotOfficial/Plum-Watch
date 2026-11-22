package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* compiled from: WindVanePlugin.java */
/* loaded from: classes17.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    protected Context f11879a;
    protected Object b;
    protected WindVaneWebView c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f11879a = context;
        this.c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.b = obj;
        this.c = windVaneWebView;
    }
}
