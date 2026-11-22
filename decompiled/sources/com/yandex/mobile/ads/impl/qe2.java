package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qe2 implements ve2 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f16663a = new Handler(Looper.getMainLooper());
    private lu b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qe2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        lu luVar = this$0.b;
        if (luVar != null) {
            luVar.onVideoComplete();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ve2
    public final void onVideoComplete() {
        this.f16663a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.qe2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                qe2.a(qe2.this);
            }
        });
    }

    public final void a(sn2 sn2Var) {
        this.b = sn2Var;
    }
}
