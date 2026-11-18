package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    public static WakeLockTracker getInstance() {
        return zza;
    }

    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int r6, String str4) {
    }

    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int r5, List<String> list, boolean z, long j) {
    }

    public void registerEvent(Context context, String str, int r3, String str2, String str3, String str4, int r7, List<String> list) {
    }

    public void registerEvent(Context context, String str, int r3, String str2, String str3, String str4, int r7, List<String> list, long j) {
    }

    public void registerReleaseEvent(Context context, Intent intent) {
    }
}
