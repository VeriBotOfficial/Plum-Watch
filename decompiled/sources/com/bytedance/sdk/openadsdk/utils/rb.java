package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rb {
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.jz> fxn;
    private static boolean gff;
    private static long kg;

    public static void fxn(com.bytedance.sdk.openadsdk.core.model.jz jzVar) {
        com.bytedance.sdk.openadsdk.core.model.bh bz = jzVar.bz();
        if (bz == null || TextUtils.isEmpty(bz.fxn())) {
            return;
        }
        fxn = new WeakReference<>(jzVar);
    }

    public static void fxn(long j) {
        kg(j);
    }

    private static void kg(final long j) {
        com.bytedance.sdk.openadsdk.core.model.jz jzVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.jz> weakReference = fxn;
        if (weakReference == null || j <= 0 || (jzVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.hm.gff.fxn(System.currentTimeMillis(), jzVar, jzVar.rb(), "store_duration", new com.bytedance.sdk.openadsdk.ckl.gff.fxn() { // from class: com.bytedance.sdk.openadsdk.utils.rb.1
            @Override // com.bytedance.sdk.openadsdk.ckl.gff.fxn, com.bytedance.sdk.openadsdk.ckl.gff.kg
            public JSONObject kg() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        fxn = null;
        gff = false;
    }

    public static void fxn() {
        if (fxn == null || gff) {
            return;
        }
        if (kg > 0) {
            kg(SystemClock.elapsedRealtime() - kg);
        }
        fxn = null;
        kg = 0L;
    }

    public static void kg() {
        if (fxn == null || gff) {
            return;
        }
        kg = SystemClock.elapsedRealtime();
    }

    public static boolean gff() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.jz> weakReference = fxn;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        gff = true;
        return true;
    }
}
