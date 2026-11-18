package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzkd extends RuntimeException {
    public zzkd(int r2) {
        super(r2 != 1 ? r2 != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
