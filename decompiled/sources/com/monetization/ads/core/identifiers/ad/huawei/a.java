package com.monetization.ads.core.identifiers.ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.alipay.sdk.m.d.b;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import com.yandex.mobile.ads.impl.sp0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f12679a = new LinkedBlockingQueue();

    public final OpenDeviceIdentifierService a() throws InterruptedException {
        return (OpenDeviceIdentifierService) this.f12679a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder binder) {
        IInterface proxy;
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(binder, "binder");
        try {
            int i = OpenDeviceIdentifierService.Stub.f12677a;
            if (binder == null) {
                proxy = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface(b.f1368a);
                proxy = (queryLocalInterface == null || !(queryLocalInterface instanceof OpenDeviceIdentifierService)) ? new OpenDeviceIdentifierService.Stub.Proxy(binder) : (OpenDeviceIdentifierService) queryLocalInterface;
            }
            this.f12679a.put(proxy);
        } catch (Exception unused) {
            sp0.c(new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        try {
            this.f12679a.clear();
        } catch (UnsupportedOperationException unused) {
            sp0.c(new Object[0]);
        }
    }
}
