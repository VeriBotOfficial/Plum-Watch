package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ResultReceiverC3300ig extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final Sf f18328a;

    public ResultReceiverC3300ig(Handler handler, Sf sf) {
        super(handler);
        this.f18328a = sf;
    }

    public static void a(ResultReceiver resultReceiver, C3151cg c3151cg) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c3151cg == null ? null : c3151cg.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C3151cg c3151cg = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c3151cg = new C3151cg(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f18328a.a(c3151cg);
        }
    }
}
