package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes6.dex */
public final class I6 extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final H6 f17900a;

    public I6(Handler handler, H6 h6) {
        super(handler);
        this.f17900a = h6;
    }

    public static void a(ResultReceiver resultReceiver, C3338k4 c3338k4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c3338k4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f17900a.a(i, bundle);
    }

    public static void a(ResultReceiver resultReceiver, EnumC3380ll enumC3380ll, C3338k4 c3338k4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", enumC3380ll.f18385a);
            c3338k4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
