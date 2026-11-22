package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.hx0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ox0 {

    /* renamed from: a, reason: collision with root package name */
    private final o3 f16498a;
    private final px0 b;
    private boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ox0(android.content.Context r4, com.yandex.mobile.ads.impl.o3 r5) {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.px0 r0 = new com.yandex.mobile.ads.impl.px0
            android.content.Context r1 = r4.getApplicationContext()
            java.lang.String r2 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1, r5)
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ox0.<init>(android.content.Context, com.yandex.mobile.ads.impl.o3):void");
    }

    public ox0(Context context, o3 adConfiguration, px0 mediaViewSizeInfoController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mediaViewSizeInfoController, "mediaViewSizeInfoController");
        this.f16498a = adConfiguration;
        this.b = mediaViewSizeInfoController;
        this.c = true;
    }

    public final void a(CustomizableMediaView mediaView, hx0.a type) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.c) {
            if (this.f16498a.b() == ts.g) {
                wh2.a(mediaView, new a(mediaView, type));
            }
            this.c = false;
        }
    }

    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ CustomizableMediaView b;
        final /* synthetic */ hx0.a c;

        a(CustomizableMediaView customizableMediaView, hx0.a aVar) {
            this.b = customizableMediaView;
            this.c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ox0.this.b.a(this.b, this.c.a());
            return false;
        }
    }
}
