package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.w21;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c31 {

    /* renamed from: a, reason: collision with root package name */
    private final ht1 f15155a;
    private final ht0 b;

    public interface a {
        void a();
    }

    public final void a(final Context context, final wu0 media, final a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.c31$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c31.a(context, media, listener, this);
            }
        });
    }

    public /* synthetic */ c31() {
        this(new ht1());
    }

    public c31(ht1 safeMraidWebViewFactory) {
        Intrinsics.checkNotNullParameter(safeMraidWebViewFactory, "safeMraidWebViewFactory");
        this.f15155a = safeMraidWebViewFactory;
        this.b = new ht0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Context context, wu0 media, a listener, c31 this$0) {
        w21 w21Var;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(media, "$media");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d31 a2 = d31.c.a(context);
        String b2 = media.b();
        if (!a2.b() && !a2.a(media) && b2 != null) {
            this$0.f15155a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                w21Var = new w21(context);
            } catch (Throwable unused) {
                w21Var = null;
            }
            if (w21Var != null) {
                w21Var.setPreloadListener(new b(a2, listener, media));
                a2.a(w21Var, media);
                w21Var.c(b2);
                return;
            }
            listener.a();
            return;
        }
        listener.a();
    }

    public static final class b implements w21.a {

        /* renamed from: a, reason: collision with root package name */
        private final d31 f15156a;
        private final a b;
        private final wu0 c;

        public b(d31 mraidWebViewPool, a listener, wu0 media) {
            Intrinsics.checkNotNullParameter(mraidWebViewPool, "mraidWebViewPool");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(media, "media");
            this.f15156a = mraidWebViewPool;
            this.b = listener;
            this.c = media;
        }

        @Override // com.yandex.mobile.ads.impl.w21.a
        public final void b() {
            this.b.a();
        }

        @Override // com.yandex.mobile.ads.impl.w21.a
        public final void a() {
            this.f15156a.b(this.c);
            this.b.a();
        }
    }
}
