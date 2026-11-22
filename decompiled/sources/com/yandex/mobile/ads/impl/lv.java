package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.op1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lv implements f42 {

    /* renamed from: a, reason: collision with root package name */
    private final du f16174a;
    private final t8 b;
    private final Handler c;

    public lv(du customClickHandler, t8 resultReceiver, Handler handler) {
        Intrinsics.checkNotNullParameter(customClickHandler, "customClickHandler");
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f16174a = customClickHandler;
        this.b = resultReceiver;
        this.c = handler;
    }

    @Override // com.yandex.mobile.ads.impl.f42
    public final void a(tp1 reporter, final String targetUrl) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(targetUrl, "targetUrl");
        HashMap hashMap = new HashMap();
        hashMap.put("click_type", "custom");
        v82.f17139a.getClass();
        hashMap.put("click_url", v82.a(targetUrl));
        op1.b bVar = op1.b.c;
        reporter.a(hashMap);
        this.c.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.lv$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                lv.a(lv.this, targetUrl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(lv this$0, String targetUrl) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(targetUrl, "$targetUrl");
        this$0.f16174a.a(targetUrl, this$0.new a());
    }

    private final class a implements eu {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.eu
        public final void onLeftApplication() {
            lv.this.b.a(19, null);
        }

        @Override // com.yandex.mobile.ads.impl.eu
        public final void onReturnedToApplication() {
            lv.this.b.a(20, null);
        }
    }
}
