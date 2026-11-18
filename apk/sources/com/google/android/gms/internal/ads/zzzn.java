package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzzn {
    public static boolean zza(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int r0 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (r0 == 1) {
                return true;
            }
        }
        return false;
    }
}
