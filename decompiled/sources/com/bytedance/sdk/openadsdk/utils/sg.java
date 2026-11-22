package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes14.dex */
public class sg {
    static int fxn = -1;
    private static long gff;
    static float kg;

    private static void fxn(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            fxn = 1;
        } else {
            fxn = 0;
        }
        kg = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static fxn fxn() {
        if (gff == 0 || SystemClock.elapsedRealtime() - gff > 60000) {
            Intent registerReceiver = com.bytedance.sdk.openadsdk.core.rmu.fxn().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(registerReceiver)));
            if (registerReceiver != null) {
                fxn(registerReceiver);
                gff = SystemClock.elapsedRealtime();
            }
        }
        fxn fxnVar = new fxn(fxn, kg);
        int i = fxnVar.fxn;
        float f = fxnVar.kg;
        return fxnVar;
    }

    public static class fxn {
        public final int fxn;
        public final float kg;

        public fxn(int i, float f) {
            this.fxn = i;
            this.kg = f;
        }
    }
}
