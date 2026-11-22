package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* loaded from: classes14.dex */
public class ke {
    public static boolean fxn = fxn();

    private static boolean fxn() {
        SharedPreferences sharedPreferences;
        try {
            if (com.bytedance.sdk.openadsdk.core.rmu.fxn() != null && (sharedPreferences = com.bytedance.sdk.openadsdk.core.rmu.fxn().getSharedPreferences("pag_sp_prop_switch", 0)) != null) {
                return sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff(th.getMessage(), new Object[0]);
        }
        return true;
    }

    public static void fxn(int i) {
        try {
            SharedPreferences.Editor edit = com.bytedance.sdk.openadsdk.core.rmu.fxn().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            edit.putInt("perf_con_use_prop", i);
            edit.apply();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff(th.getMessage(), new Object[0]);
        }
    }
}
