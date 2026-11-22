package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yandex.mobile.ads.impl.yh2;
import com.yandex.mobile.ads.impl.yh2.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class s70<T extends View & yh2.a> {

    /* renamed from: a, reason: collision with root package name */
    private final T f16837a;
    private final q70 b;
    private final af1 c;
    private final Handler d;
    private a e;

    public static final class a<T extends View & yh2.a> implements Runnable {
        static final /* synthetic */ KProperty<Object>[] f = {ta.a(a.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), ta.a(a.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
        private final Handler b;
        private final q70 c;
        private final go1 d;
        private final go1 e;

        public a(Handler handler, View view, q70 exposureProvider, af1 exposureUpdateListener) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(exposureUpdateListener, "exposureUpdateListener");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(exposureProvider, "exposureProvider");
            this.b = handler;
            this.c = exposureProvider;
            this.d = ho1.a(exposureUpdateListener);
            this.e = ho1.a(view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            go1 go1Var = this.e;
            KProperty<?>[] kPropertyArr = f;
            View view = (View) go1Var.getValue(this, kPropertyArr[1]);
            af1 af1Var = (af1) this.d.getValue(this, kPropertyArr[0]);
            if (view == null || af1Var == null) {
                return;
            }
            af1Var.a(this.c.a(view));
            this.b.postDelayed(this, 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s70(Handler handler, View view, q70 exposureProvider, af1 listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(exposureProvider, "exposureProvider");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f16837a = view;
        this.b = exposureProvider;
        this.c = listener;
        this.d = handler;
    }

    public /* synthetic */ s70(View view, q70 q70Var, af1 af1Var) {
        this(new Handler(Looper.getMainLooper()), view, q70Var, af1Var);
    }

    public final void a() {
        if (this.e == null) {
            a aVar = new a(this.d, this.f16837a, this.b, this.c);
            this.e = aVar;
            this.d.post(aVar);
        }
    }

    public final void b() {
        this.d.removeCallbacksAndMessages(null);
        this.e = null;
    }
}
