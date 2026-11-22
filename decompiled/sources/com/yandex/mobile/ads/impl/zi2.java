package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qk;
import com.yandex.mobile.ads.impl.sb2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class zi2<T> implements qk.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final dq1<T> f17528a;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static sb2 b(si2 si2Var) {
            if (si2Var instanceof g50) {
                return sb2.a.a((g50) si2Var);
            }
            if (si2Var instanceof cg1) {
                return sb2.a.a();
            }
            xc1 xc1Var = si2Var.b;
            if (xc1Var == null) {
                return sb2.a.a(si2Var.getMessage());
            }
            int i = xc1Var.f17325a;
            if (i >= 500) {
                return sb2.a.b();
            }
            byte[] data = xc1Var.b;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            String str = ("Network Error.  Code: " + i + ".") + " Data: \n" + new String(data, Charsets.UTF_8);
            sp0.c(new Object[0]);
            return sb2.a.b(str);
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    @Override // com.yandex.mobile.ads.impl.xq1.a
    public final void a(si2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f17528a != null) {
            this.f17528a.a(a.b(error));
        }
    }

    public zi2(dq1<T> dq1Var) {
        this.f17528a = dq1Var;
    }

    @Override // com.yandex.mobile.ads.impl.xq1.b
    public final void a(T response) {
        Intrinsics.checkNotNullParameter(response, "response");
        dq1<T> dq1Var = this.f17528a;
        if (dq1Var != null) {
            dq1Var.a((dq1<T>) response);
        }
    }
}
