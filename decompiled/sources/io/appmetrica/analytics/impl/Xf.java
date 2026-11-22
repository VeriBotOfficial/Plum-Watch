package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes6.dex */
public final class Xf implements Va {

    /* renamed from: a, reason: collision with root package name */
    public final InstallReferrerClient f18136a;
    public final ICommonExecutor b;

    public Xf(Context context, ICommonExecutor iCommonExecutor) throws Throwable {
        this(InstallReferrerClient.newBuilder(context).build(), iCommonExecutor);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(InterfaceC3276hg interfaceC3276hg) throws Throwable {
        this.f18136a.startConnection(new Vf(this, interfaceC3276hg));
    }

    public Xf(InstallReferrerClient installReferrerClient, ICommonExecutor iCommonExecutor) {
        this.f18136a = installReferrerClient;
        this.b = iCommonExecutor;
    }
}
