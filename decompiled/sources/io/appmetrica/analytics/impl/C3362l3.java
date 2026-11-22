package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3362l3 implements Ml {

    /* renamed from: a, reason: collision with root package name */
    public BillingMonitor f18368a;
    public final Context b;
    public final Executor c;
    public final Executor d;
    public final BillingType e;
    public final BillingInfoStorage f;
    public final BillingInfoSender g;
    public final ApplicationStateProvider h;
    public final C3312j3 i;

    public C3362l3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, C3593ua.j().d(), new C3312j3());
    }

    public final void a(Hl hl, Boolean bool) {
        BillingMonitor billingLibraryMonitor;
        if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            synchronized (this) {
                C3312j3 c3312j3 = this.i;
                Context context = this.b;
                Executor executor = this.c;
                Executor executor2 = this.d;
                BillingType billingType = this.e;
                BillingInfoStorage billingInfoStorage = this.f;
                BillingInfoSender billingInfoSender = this.g;
                c3312j3.getClass();
                billingLibraryMonitor = AbstractC3288i3.f18318a[billingType.ordinal()] == 1 ? new BillingLibraryMonitor(context, executor, executor2, billingInfoStorage, billingInfoSender, null, null, 96, null) : new C3093a8();
                this.f18368a = billingLibraryMonitor;
            }
            billingLibraryMonitor.onBillingConfigChanged(hl.x);
            if (this.h.registerStickyObserver(new C3337k3(this)) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f18368a;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C3362l3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, ApplicationStateProvider applicationStateProvider, C3312j3 c3312j3) {
        this.b = context;
        this.c = executor;
        this.d = executor2;
        this.e = billingType;
        this.f = billingInfoStorage;
        this.g = billingInfoSender;
        this.h = applicationStateProvider;
        this.i = c3312j3;
    }

    @Override // io.appmetrica.analytics.impl.Ml
    public final synchronized void a(Hl hl) {
        BillingMonitor billingMonitor;
        synchronized (this) {
            billingMonitor = this.f18368a;
        }
        if (billingMonitor != null) {
            billingMonitor.onBillingConfigChanged(hl.x);
        }
    }
}
