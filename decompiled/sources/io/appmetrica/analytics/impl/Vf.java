package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* loaded from: classes6.dex */
public final class Vf implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3276hg f18110a;
    public final /* synthetic */ Xf b;

    public Vf(Xf xf, InterfaceC3276hg interfaceC3276hg) {
        this.b = xf;
        this.f18110a = interfaceC3276hg;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i == 0) {
            try {
                ReferrerDetails installReferrer = this.b.f18136a.getInstallReferrer();
                this.b.b.execute(new Uf(this, new C3151cg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC3126bg.c)));
            } catch (Throwable th) {
                this.b.b.execute(new Wf(this.f18110a, th));
            }
        } else {
            this.b.b.execute(new Wf(this.f18110a, new IllegalStateException("Referrer check failed with error " + i)));
        }
        try {
            this.b.f18136a.endConnection();
        } catch (Throwable unused) {
        }
    }
}
