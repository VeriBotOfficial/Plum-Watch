package com.tencent.mm.opensdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.opensdk.utils.Log;
import com.umeng.analytics.pro.ak;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class l implements Runnable {
    final /* synthetic */ String an;
    final /* synthetic */ Context au;
    final /* synthetic */ String av;

    l(Context context, String str, String str2) {
        this.au = context;
        this.an = str;
        this.av = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject a2;
        try {
            SharedPreferences sharedPreferences = this.au.getSharedPreferences("wx_pay_report_pending", 0);
            a2 = i.a(sharedPreferences);
            JSONObject optJSONObject = a2.optJSONObject(this.an);
            if (optJSONObject == null || !this.av.equals(optJSONObject.optString(ak.aH, null))) {
                return;
            }
            a2.remove(this.an);
            sharedPreferences.edit().putString("pending_map", a2.toString()).commit();
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "store remove ex: " + th.getMessage());
        }
    }
}
