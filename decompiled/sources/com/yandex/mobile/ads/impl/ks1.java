package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ks1 implements zr {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16048a;
    private final dq b;
    private final zr c;
    private boolean d;

    public ks1(Context context, z20 closeVerificationDialogController, zr contentCloseListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(closeVerificationDialogController, "closeVerificationDialogController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f16048a = context;
        this.b = closeVerificationDialogController;
        this.c = contentCloseListener;
    }

    @Override // com.yandex.mobile.ads.impl.zr
    public final void f() {
        if (this.d) {
            this.c.f();
        } else {
            this.b.a(this.f16048a);
        }
    }

    public final void a() {
        this.d = true;
        this.b.a();
    }
}
