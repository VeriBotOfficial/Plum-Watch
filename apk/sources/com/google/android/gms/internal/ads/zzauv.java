package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public interface zzauv {
    String zzd(Context context, String str, View view);

    String zze(Context context, String str, View view, Activity activity);

    String zzf(Context context);

    String zzg(Context context);

    String zzh(Context context, View view, Activity activity);

    void zzk(MotionEvent motionEvent);

    @Deprecated
    void zzl(int r1, int r2, int r3);

    void zzn(StackTraceElement[] stackTraceElementArr);

    void zzo(View view);
}
