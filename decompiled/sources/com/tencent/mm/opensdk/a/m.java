package com.tencent.mm.opensdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.opensdk.a.i;
import com.tencent.mm.opensdk.utils.Log;
import com.umeng.analytics.pro.ak;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class m implements Runnable {
    final /* synthetic */ String an;
    final /* synthetic */ Context au;
    final /* synthetic */ i.a ay;

    m(Context context, String str, i.a aVar) {
        this.au = context;
        this.an = str;
        this.ay = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        JSONObject a2;
        boolean a3;
        i.b bVar = new i.b();
        try {
            if (this.au != null && (str = this.an) != null && str.length() > 0) {
                SharedPreferences sharedPreferences = this.au.getSharedPreferences("wx_pay_report_pending", 0);
                a2 = i.a(sharedPreferences);
                a3 = i.a(a2, System.currentTimeMillis());
                JSONObject optJSONObject = a2.optJSONObject(this.an);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString(ak.aH, null);
                    if (optString != null && optString.length() > 0) {
                        bVar.J = optString;
                        bVar.aq = optJSONObject.optLong("s", 0L);
                        bVar.partnerId = optJSONObject.optString("p", null);
                    }
                    a2.remove(this.an);
                    a3 = true;
                }
                if (a3) {
                    sharedPreferences.edit().putString("pending_map", a2.toString()).commit();
                }
            }
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "store resolve ex: " + th.getMessage());
        }
        try {
            this.ay.a(bVar);
        } catch (Throwable unused) {
        }
    }
}
