package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.sl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sl {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f16869a;

    public interface b {
        void a(Bitmap bitmap);
    }

    public final void a(Bitmap bitmap, fp1 listener) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16869a.execute(new a(bitmap, listener, new Handler(Looper.getMainLooper()), new yl()));
    }

    public sl() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f16869a = newSingleThreadExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements Runnable {
        private final Bitmap b;
        private final b c;
        private final Handler d;
        private final yl e;

        public a(Bitmap originalBitmap, fp1 listener, Handler handler, yl blurredBitmapProvider) {
            Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(blurredBitmapProvider, "blurredBitmapProvider");
            this.b = originalBitmap;
            this.c = listener;
            this.d = handler;
            this.e = blurredBitmapProvider;
        }

        @Override // java.lang.Runnable
        public final void run() {
            yl ylVar = this.e;
            Bitmap bitmap = this.b;
            ylVar.getClass();
            a(yl.a(bitmap, 0.1d));
        }

        private final void a(final Bitmap bitmap) {
            this.d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.sl$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    sl.a.a(sl.a.this, bitmap);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a this$0, Bitmap blurredBitmap) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(blurredBitmap, "$blurredBitmap");
            this$0.c.a(blurredBitmap);
        }
    }
}
