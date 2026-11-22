package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3088a3 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f18177a;
    public final /* synthetic */ C3113b3 b;

    public C3088a3(C3113b3 c3113b3, BatteryInfo batteryInfo) {
        this.b = c3113b3;
        this.f18177a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C3138c3 c3138c3 = this.b.f18193a;
        ChargeType chargeType = this.f18177a.chargeType;
        ChargeType chargeType2 = C3138c3.d;
        synchronized (c3138c3) {
            Iterator it = c3138c3.c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
