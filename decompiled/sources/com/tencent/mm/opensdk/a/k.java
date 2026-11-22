package com.tencent.mm.opensdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.opensdk.utils.Log;
import com.umeng.analytics.pro.ak;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class k implements Runnable {
    final /* synthetic */ String an;
    final /* synthetic */ Context au;
    final /* synthetic */ String av;
    final /* synthetic */ long aw;
    final /* synthetic */ String ax;

    k(Context context, String str, long j, String str2, String str3) {
        this.au = context;
        this.av = str;
        this.aw = j;
        this.ax = str2;
        this.an = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject a2;
        try {
            SharedPreferences sharedPreferences = this.au.getSharedPreferences("wx_pay_report_pending", 0);
            a2 = i.a(sharedPreferences);
            long currentTimeMillis = System.currentTimeMillis();
            i.a(a2, currentTimeMillis);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ak.aH, this.av);
            jSONObject.put("s", this.aw);
            jSONObject.putOpt("p", this.ax);
            jSONObject.put("w", currentTimeMillis);
            a2.put(this.an, jSONObject);
            i.a(a2);
            sharedPreferences.edit().putString("pending_map", a2.toString()).commit();
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "store save ex: " + th.getMessage());
        }
    }
}
