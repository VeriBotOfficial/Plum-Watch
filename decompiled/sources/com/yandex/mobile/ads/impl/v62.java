package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v62 {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f17129a;
    private final o71 b;
    private final x62 c;
    private w62 d;
    private n71 e;

    public interface a {
        void a();

        void b();
    }

    public final void a(View nativeAdView, a91 trackingListener) {
        i0 i0Var;
        Object obj;
        i0 i0Var2;
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        Context context = nativeAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        w62 w62Var = this.d;
        if (w62Var != null) {
            w62Var.a(context);
        }
        Activity activityContext = null;
        this.d = null;
        n71 n71Var = this.e;
        if (n71Var != null) {
            n71Var.b();
        }
        this.e = null;
        j0 j0Var = this.f17129a;
        Context context2 = nativeAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        int i = 0;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            }
            int i2 = i + 1;
            if (i >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                activityContext = (Activity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i = i2;
            }
        }
        if (activityContext != null) {
            this.c.getClass();
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
            i0Var = i0.g;
            if (i0Var == null) {
                obj = i0.f;
                synchronized (obj) {
                    i0Var2 = i0.g;
                    if (i0Var2 == null) {
                        i0Var2 = new i0();
                        i0.g = i0Var2;
                    }
                }
                i0Var = i0Var2;
            }
            w62 w62Var2 = new w62(activityContext, trackingListener, i0Var);
            this.d = w62Var2;
            w62Var2.c(activityContext);
        }
        this.b.getClass();
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        n71 n71Var2 = new n71(nativeAdView, trackingListener, new j71());
        this.e = n71Var2;
        n71Var2.a();
    }

    public /* synthetic */ v62() {
        this(new j0(), new o71(), new x62());
    }

    public v62(j0 activityContextProvider, o71 windowAttachListenerFactory, x62 activityLifecycleListenerFactory) {
        Intrinsics.checkNotNullParameter(activityContextProvider, "activityContextProvider");
        Intrinsics.checkNotNullParameter(windowAttachListenerFactory, "windowAttachListenerFactory");
        Intrinsics.checkNotNullParameter(activityLifecycleListenerFactory, "activityLifecycleListenerFactory");
        this.f17129a = activityContextProvider;
        this.b = windowAttachListenerFactory;
        this.c = activityLifecycleListenerFactory;
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        w62 w62Var = this.d;
        if (w62Var != null) {
            w62Var.a(context);
        }
        this.d = null;
        n71 n71Var = this.e;
        if (n71Var != null) {
            n71Var.b();
        }
        this.e = null;
    }
}
