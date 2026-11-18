package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzcw {
    public static final int zza;

    public static PendingIntent zza(Context context, int r1, Intent intent, int r3) {
        return PendingIntent.getBroadcast(context, 0, intent, r3);
    }

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
