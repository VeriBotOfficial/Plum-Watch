package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.su0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w21 extends yf1 {
    private final n21 k;
    private a l;
    private final a31 m;
    private su0 n;
    private boolean o;

    public interface a {
        void a();

        void b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        n21 n21Var = new n21();
        this.k = n21Var;
        this.m = new a31(this, n21Var);
        this.n = new ry1();
    }

    public final void c(String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        if (this.o) {
            return;
        }
        this.m.b(htmlResponse);
    }

    public final void setClickListener(zo clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.m.a(clickListener);
    }

    public final n21 k() {
        return this.k;
    }

    public final void setPreloadListener(a aVar) {
        this.l = aVar;
    }

    public final void setAspectRatio(float f) {
        this.n = new lm1(f);
    }

    @Override // com.yandex.mobile.ads.impl.yf1, com.yandex.mobile.ads.impl.bh0
    public final void a() {
        super.a();
        a aVar = this.l;
        if (aVar != null) {
            this.o = true;
            aVar.b();
            this.l = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.yf1
    public final void h() {
        this.m.b();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        su0.a a2 = this.n.a(i, i2);
        super.onMeasure(a2.f16895a, a2.b);
    }

    @Override // com.yandex.mobile.ads.impl.yf1, com.yandex.mobile.ads.impl.bh0
    public final void a(int i) {
        super.a(i);
        if (this.l != null) {
            stopLoading();
            a aVar = this.l;
            if (aVar != null) {
                aVar.a();
            }
            this.l = null;
        }
    }
}
