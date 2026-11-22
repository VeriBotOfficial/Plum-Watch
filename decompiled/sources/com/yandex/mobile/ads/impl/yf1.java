package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.yandex.mobile.ads.impl.gh1;
import com.yandex.mobile.ads.impl.yh2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class yf1 extends vk implements bh0, gh1.b, yh2.a {
    private static boolean j;
    private final Context b;
    private final yh2 c;
    private final gh1 d;
    private final dz1 e;
    private dh0 f;
    private ch0 g;
    private boolean h;
    private boolean i;

    protected void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        if (pa.a(21)) {
            settings.setMixedContentMode(2);
        }
        WebSettings settings2 = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "getSettings(...)");
        settings2.setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new ah0(this, dt1.b()));
        setWebChromeClient(new vg0());
    }

    @Override // com.yandex.mobile.ads.impl.vk
    public String c() {
        return "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n" + rj2.a();
    }

    protected abstract void h();

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        this.c.getClass();
        a(yh2.a(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ yf1(android.content.Context r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.yandex.mobile.ads.impl.yh2 r1 = new com.yandex.mobile.ads.impl.yh2
            r1.<init>()
            com.yandex.mobile.ads.impl.gh1$a r2 = com.yandex.mobile.ads.impl.gh1.h
            com.yandex.mobile.ads.impl.gh1 r2 = r2.a(r0)
            r3.<init>(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yf1.<init>(android.content.Context):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf1(Context context, Context appContext, yh2 viewableChecker, gh1 phoneStateTracker) {
        super(appContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(viewableChecker, "viewableChecker");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        this.b = appContext;
        this.c = viewableChecker;
        this.d = phoneStateTracker;
        this.e = new dz1();
        a(context);
        if (j) {
            return;
        }
        j = true;
    }

    public final Context i() {
        return this.b;
    }

    public dh0 j() {
        return this.f;
    }

    public void setHtmlWebViewListener(dh0 dh0Var) {
        this.f = dh0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dh0 j2;
        if (motionEvent != null && motionEvent.getAction() == 0 && (j2 = j()) != null) {
            j2.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.c.getClass();
        a(yh2.a(this));
    }

    public final void setHtmlWebViewErrorListener(ch0 ch0Var) {
        this.g = ch0Var;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        this.d.a(this);
        this.c.getClass();
        a(yh2.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i = false;
        this.c.getClass();
        a(yh2.a(this));
        this.d.b(this);
        super.onDetachedFromWindow();
    }

    @Override // com.yandex.mobile.ads.impl.yh2.a
    public final boolean b() {
        return this.i;
    }

    @Override // com.yandex.mobile.ads.impl.vk
    public void d() {
        setHtmlWebViewListener(null);
        super.d();
    }

    private final void a(boolean z) {
        if (this.h != z) {
            this.h = z;
            dh0 j2 = j();
            if (j2 != null) {
                j2.a(this.h);
            }
        }
    }

    public void a(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        dh0 j2 = j();
        if (j2 != null) {
            j2.a(url);
        }
    }

    public void a() {
        this.e.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.yf1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                yf1.a(yf1.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(yf1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h();
    }

    @Override // com.yandex.mobile.ads.impl.gh1.b
    public final void a(dh1 phoneState) {
        boolean z;
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        if (phoneState != dh1.c) {
            this.c.getClass();
            if (yh2.a(this) && this.d.b()) {
                z = true;
                a(z);
            }
        }
        z = false;
        a(z);
    }

    public void a(int i) {
        ch0 ch0Var = this.g;
        if (ch0Var != null) {
            ch0Var.a(i);
        }
    }
}
