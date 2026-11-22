package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.anythink.core.common.d.j;
import com.yandex.mobile.ads.impl.iq;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class hq {

    /* renamed from: a, reason: collision with root package name */
    private final bq1 f15717a;

    public hq(bq1 requestHelper) {
        Intrinsics.checkNotNullParameter(requestHelper, "requestHelper");
        this.f15717a = requestHelper;
    }

    public final void a(Context context, Uri.Builder builder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        a aVar = new a(builder);
        iq.f15843a.getClass();
        kq kqVar = (kq) iq.a.a(context);
        aVar.invoke("gdpr", kqVar.a());
        aVar.invoke(j.w.f, kqVar.b());
        aVar.invoke("parsed_purpose_consents", kqVar.c());
        aVar.invoke("parsed_vendor_consents", kqVar.f());
        aVar.invoke("cmp_present", Integer.valueOf(kqVar.e() ? 1 : 0).toString());
    }

    static final class a extends Lambda implements Function2<String, String, Unit> {
        final /* synthetic */ Uri.Builder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Uri.Builder builder) {
            super(2);
            this.c = builder;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, String str2) {
            String key = str;
            String str3 = str2;
            Intrinsics.checkNotNullParameter(key, "key");
            bq1 bq1Var = hq.this.f15717a;
            Uri.Builder builder = this.c;
            bq1Var.getClass();
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(builder, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            if (str3 != null && str3.length() != 0) {
                Intrinsics.checkNotNull(builder.appendQueryParameter(key, str3));
            }
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function2<String, String, Unit> {
        final /* synthetic */ in1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(in1 in1Var) {
            super(2);
            this.b = in1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, String str2) {
            String key = str;
            Intrinsics.checkNotNullParameter(key, "key");
            this.b.a(key, str2);
            return Unit.INSTANCE;
        }
    }

    public static void a(Context context, in1 queryParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        b bVar = new b(queryParams);
        iq.f15843a.getClass();
        kq kqVar = (kq) iq.a.a(context);
        bVar.invoke("gdpr", kqVar.a());
        bVar.invoke(j.w.f, kqVar.b());
        bVar.invoke("parsed_purpose_consents", kqVar.c());
        bVar.invoke("parsed_vendor_consents", kqVar.f());
        bVar.invoke("cmp_present", Integer.valueOf(kqVar.e() ? 1 : 0).toString());
    }
}
