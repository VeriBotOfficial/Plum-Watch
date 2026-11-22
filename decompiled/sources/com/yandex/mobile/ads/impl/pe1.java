package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gq1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.xq1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pe1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16556a;
    private final re1 b;
    private final gq1 c;
    private final pw1 d;

    public pe1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16556a = context.getApplicationContext();
        this.b = se1.a(context);
        int i = gq1.c;
        this.c = gq1.a.a();
        int i2 = pw1.l;
        this.d = pw1.a.a();
    }

    public final void a() {
        gq1 gq1Var = this.c;
        Context appContext = this.f16556a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        gq1Var.getClass();
        gq1.a(appContext, "om_sdk_js_request_tag");
    }

    public final void a(cb2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        pw1 pw1Var = this.d;
        Context appContext = this.f16556a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        ju1 a2 = pw1Var.a(appContext);
        String F = a2 != null ? a2.F() : null;
        String b = this.b.b();
        if (F != null && F.length() > 0 && !Intrinsics.areEqual(F, b)) {
            a aVar = new a(this, F, listener);
            e32 request = new e32(F, aVar, aVar);
            request.b((Object) "om_sdk_js_request_tag");
            gq1 gq1Var = this.c;
            Context context = this.f16556a;
            Intrinsics.checkNotNullExpressionValue(context, "appContext");
            synchronized (gq1Var) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(request, "request");
                hd1.a(context).a(request);
            }
            return;
        }
        qe1.a(qe1.this);
    }

    private final class a implements xq1.b<String>, xq1.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f16557a;
        private final cb2 b;
        final /* synthetic */ pe1 c;

        public a(pe1 pe1Var, String omSdkControllerUrl, cb2 listener) {
            Intrinsics.checkNotNullParameter(omSdkControllerUrl, "omSdkControllerUrl");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.c = pe1Var;
            this.f16557a = omSdkControllerUrl;
            this.b = listener;
        }

        @Override // com.yandex.mobile.ads.impl.xq1.a
        public final void a(si2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.b.a();
        }

        @Override // com.yandex.mobile.ads.impl.xq1.b
        public final void a(Object obj) {
            String response = (String) obj;
            Intrinsics.checkNotNullParameter(response, "response");
            this.c.b.a(response);
            this.c.b.b(this.f16557a);
            this.b.a();
        }
    }
}
