package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c5 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    private final t8 f15158a;
    private final WeakReference<p51> b;

    public /* synthetic */ c5(p51 p51Var) {
        this(p51Var, new t8(), new WeakReference(p51Var));
    }

    public c5(p51 nativeAdEventController, t8 adResultReceiver, WeakReference<p51> eventControllerReference) {
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        Intrinsics.checkNotNullParameter(eventControllerReference, "eventControllerReference");
        this.f15158a = adResultReceiver;
        this.b = eventControllerReference;
        adResultReceiver.a(this);
    }

    public final t8 a() {
        return this.f15158a;
    }

    @Override // com.yandex.mobile.ads.impl.q3
    public final void a(int i, Bundle bundle) {
        p51 p51Var = this.b.get();
        if (p51Var != null) {
            if (i == 19) {
                p51Var.g();
                return;
            }
            if (i != 20) {
                switch (i) {
                    case 6:
                        p51Var.e();
                        break;
                    case 7:
                        p51Var.d();
                        break;
                    case 8:
                        p51Var.c();
                        break;
                    case 9:
                        p51Var.b();
                        break;
                }
                return;
            }
            p51Var.f();
        }
    }
}
