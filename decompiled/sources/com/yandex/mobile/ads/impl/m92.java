package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m92 {
    private static final String c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";

    /* renamed from: a, reason: collision with root package name */
    private final Handler f16220a;
    private final Context b;

    public /* synthetic */ m92(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public m92(Context context, Handler handler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f16220a = handler;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = applicationContext;
    }

    public final void a() {
        this.f16220a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.m92$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                m92.a(m92.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(m92 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0.b, c, 1).show();
    }
}
