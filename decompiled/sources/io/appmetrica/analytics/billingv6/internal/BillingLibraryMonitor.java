package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0016"}, d2 = {"Lio/appmetrica/analytics/billingv6/internal/BillingLibraryMonitor;", "Lio/appmetrica/analytics/billinginterface/internal/monitor/BillingMonitor;", "", "onSessionResumed", "Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;", "billingConfig", "onBillingConfigChanged", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "workerExecutor", "uiExecutor", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;", "billingInfoStorage", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;", "billingInfoSender", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;", "billingInfoManager", "Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;", "updatePolicy", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;)V", "billing-v6_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class BillingLibraryMonitor implements BillingMonitor {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17667a;
    private final Executor b;
    private final Executor c;
    private final BillingInfoSender d;
    private final BillingInfoManager e;
    private final UpdatePolicy f;
    private BillingConfig g;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f17667a = context;
        this.b = executor;
        this.c = executor2;
        this.d = billingInfoSender;
        this.e = billingInfoManager;
        this.f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (Intrinsics.areEqual(this.g, billingConfig)) {
            return;
        }
        this.g = billingConfig;
        if (billingConfig != null) {
            this.c.execute(new BillingLibraryMonitor$updateBilling$1(this, billingConfig));
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        BillingConfig billingConfig = this.g;
        if (billingConfig == null) {
            return;
        }
        this.c.execute(new BillingLibraryMonitor$updateBilling$1(this, billingConfig));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BillingLibraryMonitor(android.content.Context r9, java.util.concurrent.Executor r10, java.util.concurrent.Executor r11, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage r12, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender r13, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager r14, io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 32
            if (r0 == 0) goto L9
            io.appmetrica.analytics.billingv6.impl.e r14 = new io.appmetrica.analytics.billingv6.impl.e
            r14.<init>(r12)
        L9:
            r6 = r14
            r14 = r16 & 64
            if (r14 == 0) goto L17
            io.appmetrica.analytics.billingv6.impl.u r14 = new io.appmetrica.analytics.billingv6.impl.u
            r0 = 1
            r1 = 0
            r14.<init>(r1, r0, r1)
            r7 = r14
            goto L18
        L17:
            r7 = r15
        L18:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor.<init>(android.content.Context, java.util.concurrent.Executor, java.util.concurrent.Executor, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager, io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
