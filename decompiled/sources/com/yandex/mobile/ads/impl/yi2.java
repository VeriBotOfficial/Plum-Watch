package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yi2 implements qk.a<xc1> {

    /* renamed from: a, reason: collision with root package name */
    private final dq1<xc1> f17426a = null;

    @Override // com.yandex.mobile.ads.impl.xq1.a
    public final void a(si2 error) {
        sb2 sb2Var;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.b == null) {
            String message = error.getMessage();
            if (message == null) {
                message = "Ad request failed with network error";
            }
            sb2Var = new sb2(2, message);
        } else {
            Intrinsics.checkNotNullParameter("Ping error", "description");
            sb2Var = new sb2(1, "Ping error");
        }
        dq1<xc1> dq1Var = this.f17426a;
        if (dq1Var != null) {
            dq1Var.a(sb2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xq1.b
    public final void a(Object obj) {
        xc1 response = (xc1) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        dq1<xc1> dq1Var = this.f17426a;
        if (dq1Var != null) {
            dq1Var.a((dq1<xc1>) response);
        }
    }
}
