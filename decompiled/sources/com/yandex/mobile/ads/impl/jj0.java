package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.oj0;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jj0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f15915a;
    private final sj0 b;
    private final oj0 c;

    public interface a {
        boolean a();
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public /* synthetic */ jj0(Context context, a aVar, sj0 sj0Var) {
        this(context, aVar, sj0Var, id1.c.a(context).b());
    }

    public jj0(Context context, a configuration, sj0 imageProvider, oj0 imageLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.f15915a = configuration;
        this.b = imageProvider;
        this.c = imageLoader;
    }

    public final void a(xj0 imageValue, b listener) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Bitmap b2 = this.b.b(imageValue);
        if (b2 != null) {
            listener.a(b2);
            return;
        }
        listener.a(this.b.a(imageValue));
        if (this.f15915a.a()) {
            String f = imageValue.f();
            int a2 = imageValue.a();
            this.c.a(f, new c(f, listener), imageValue.g(), a2);
        }
    }

    public static final class c implements oj0.d {
        final /* synthetic */ String b;
        final /* synthetic */ b c;

        c(String str, b bVar) {
            this.b = str;
            this.c = bVar;
        }

        @Override // com.yandex.mobile.ads.impl.xq1.a
        public final void a(si2 si2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.oj0.d
        public final void a(oj0.c cVar, boolean z) {
            Bitmap b = cVar.b();
            if (b != null) {
                jj0 jj0Var = jj0.this;
                String str = this.b;
                b bVar = this.c;
                jj0Var.b.a(MapsKt.mapOf(TuplesKt.to(str, b)));
                bVar.a(b);
            }
        }
    }
}
