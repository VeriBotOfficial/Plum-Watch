package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.op1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.qk;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lh1 implements u82 {

    /* renamed from: a, reason: collision with root package name */
    private final z62 f16123a;
    private final u62 b;
    private final gq1 c;
    private final s82 d;
    private final Context e;

    @Override // com.yandex.mobile.ads.impl.u82
    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String a2 = this.d.a(url);
        int i = pw1.l;
        kh1 request = new kh1(this.e, a2, new a(url, pw1.a.a().a(this.e), this.b, this.f16123a));
        gq1 gq1Var = this.c;
        Context context = this.e;
        synchronized (gq1Var) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(request, "request");
            hd1.a(context).a(request);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ lh1(android.content.Context r8, com.yandex.mobile.ads.impl.o3 r9, com.yandex.mobile.ads.impl.z62 r10) {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.u62 r4 = new com.yandex.mobile.ads.impl.u62
            r4.<init>(r8, r9)
            int r0 = com.yandex.mobile.ads.impl.gq1.c
            com.yandex.mobile.ads.impl.gq1 r5 = com.yandex.mobile.ads.impl.gq1.a.a()
            com.yandex.mobile.ads.impl.s82 r6 = new com.yandex.mobile.ads.impl.s82
            r6.<init>(r8)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lh1.<init>(android.content.Context, com.yandex.mobile.ads.impl.o3, com.yandex.mobile.ads.impl.z62):void");
    }

    public lh1(Context context, o3 adConfiguration, z62 trackingUrlType, u62 trackingReporter, gq1 requestManager, s82 urlModifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(trackingUrlType, "trackingUrlType");
        Intrinsics.checkNotNullParameter(trackingReporter, "trackingReporter");
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        Intrinsics.checkNotNullParameter(urlModifier, "urlModifier");
        this.f16123a = trackingUrlType;
        this.b = trackingReporter;
        this.c = requestManager;
        this.d = urlModifier;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.e = applicationContext;
    }

    private static final class a implements qk.a<xc1> {

        /* renamed from: a, reason: collision with root package name */
        private final String f16124a;
        private final ju1 b;
        private final u62 c;
        private final z62 d;

        public a(String trackingUrl, ju1 ju1Var, u62 trackingReporter, z62 trackingUrlType) {
            Intrinsics.checkNotNullParameter(trackingUrl, "trackingUrl");
            Intrinsics.checkNotNullParameter(trackingReporter, "trackingReporter");
            Intrinsics.checkNotNullParameter(trackingUrlType, "trackingUrlType");
            this.f16124a = trackingUrl;
            this.b = ju1Var;
            this.c = trackingReporter;
            this.d = trackingUrlType;
        }

        @Override // com.yandex.mobile.ads.impl.xq1.a
        public final void a(si2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Object[] args = {this.f16124a, error.toString()};
            int i = sp0.b;
            Intrinsics.checkNotNullParameter(args, "args");
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to("tracking_result", "failure");
            String lowerCase = this.d.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            pairArr[1] = TuplesKt.to("tracking_url_type", lowerCase);
            String message = error.getMessage();
            if (message == null) {
                message = "Unknown Volley error";
            }
            pairArr[2] = TuplesKt.to("error_message", message);
            Map mutableMapOf = MapsKt.mutableMapOf(pairArr);
            u62 u62Var = this.c;
            op1.b bVar = op1.b.c;
            u62Var.a(mutableMapOf, this.b);
        }

        @Override // com.yandex.mobile.ads.impl.xq1.b
        public final void a(Object obj) {
            xc1 response = (xc1) obj;
            Intrinsics.checkNotNullParameter(response, "response");
            int i = response.f17325a;
            Object[] args = {this.f16124a, Integer.valueOf(i)};
            int i2 = sp0.b;
            Intrinsics.checkNotNullParameter(args, "args");
            Pair pair = TuplesKt.to("tracking_result", "success");
            String lowerCase = this.d.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Map mutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("tracking_url_type", lowerCase), TuplesKt.to("code", Integer.valueOf(i)));
            u62 u62Var = this.c;
            op1.b bVar = op1.b.c;
            u62Var.a(mutableMapOf, this.b);
        }
    }
}
