package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.g;
import io.appmetrica.analytics.billingv6.impl.s;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"io/appmetrica/analytics/billingv6/internal/BillingLibraryMonitor$updateBilling$1", "Lio/appmetrica/analytics/coreutils/internal/executors/SafeRunnable;", "", "runSafety", "billing-v6_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class BillingLibraryMonitor$updateBilling$1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BillingLibraryMonitor f17668a;
    final /* synthetic */ BillingConfig b;

    BillingLibraryMonitor$updateBilling$1(BillingLibraryMonitor billingLibraryMonitor, BillingConfig billingConfig) {
        this.f17668a = billingLibraryMonitor;
        this.b = billingConfig;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public void runSafety() {
        Context context;
        context = this.f17668a.f17667a;
        BillingClient build = BillingClient.newBuilder(context).setListener(new s()).enablePendingPurchases().build();
        BillingConfig billingConfig = this.b;
        final BillingLibraryMonitor billingLibraryMonitor = this.f17668a;
        ?? r3 = new UtilsProvider() { // from class: io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1
            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public BillingInfoManager getBillingInfoManager() {
                BillingInfoManager billingInfoManager;
                billingInfoManager = BillingLibraryMonitor.this.e;
                return billingInfoManager;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public BillingInfoSender getBillingInfoSender() {
                BillingInfoSender billingInfoSender;
                billingInfoSender = BillingLibraryMonitor.this.d;
                return billingInfoSender;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public Executor getUiExecutor() {
                Executor executor;
                executor = BillingLibraryMonitor.this.c;
                return executor;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public UpdatePolicy getUpdatePolicy() {
                UpdatePolicy updatePolicy;
                updatePolicy = BillingLibraryMonitor.this.f;
                return updatePolicy;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            public Executor getWorkerExecutor() {
                Executor executor;
                executor = BillingLibraryMonitor.this.b;
                return executor;
            }
        };
        build.startConnection(new d(billingConfig, build, r3, new g(build, r3)));
    }
}
