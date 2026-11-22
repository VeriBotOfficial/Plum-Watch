package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3113b3 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3138c3 f18193a;

    public C3113b3(C3138c3 c3138c3) {
        this.f18193a = c3138c3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f18193a.b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f18193a.getClass();
        BatteryInfo a2 = C3138c3.a(intent);
        this.f18193a.b = a2;
        if (chargeType != a2.chargeType) {
            this.f18193a.f18208a.execute(new C3088a3(this, a2));
        }
    }
}
