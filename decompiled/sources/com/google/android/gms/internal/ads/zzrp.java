package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzrp extends Handler {
    final /* synthetic */ zzrr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzrp(zzrr zzrrVar, Looper looper) {
        super(looper);
        this.zza = zzrrVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzrr.zza(this.zza, message);
    }
}
