package com.monetization.ads.mediation.banner;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.monetization.ads.mediation.banner.d;
import com.yandex.mobile.ads.impl.sp0;
import com.yandex.mobile.ads.impl.zg2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f12695a;
    final /* synthetic */ d.a b;
    final /* synthetic */ d c;

    e(d dVar, View view, d.a aVar) {
        this.f12695a = view;
        this.b = aVar;
        this.c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zg2.a(d.a(this$0), false);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Handler handler;
        String str = "onPreDraw(), clazz = " + this;
        sp0.d(new Object[0]);
        if (!this.f12695a.isShown()) {
            return true;
        }
        this.f12695a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.a();
        handler = this.c.b;
        final d dVar = this.c;
        handler.postDelayed(new Runnable() { // from class: com.monetization.ads.mediation.banner.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                e.a(d.this);
            }
        }, 50L);
        return true;
    }
}
