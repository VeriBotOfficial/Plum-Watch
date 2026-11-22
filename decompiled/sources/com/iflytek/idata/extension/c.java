package com.iflytek.idata.extension;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.iflytek.idata.extension.b;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f11231a;
    private b.a b = new a();

    c(Context context) {
        this.f11231a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        IFlyCollectorExt iFlyCollectorExt;
        byte[] d;
        try {
            if (!com.iflytek.idata.extension.d.b.a(this.f11231a) || (d = (iFlyCollectorExt = IFlyCollectorExt.getInstance(this.f11231a)).d()) == null) {
                return;
            }
            b bVar = new b();
            bVar.b(20000);
            bVar.a(1);
            StringBuilder sb = new StringBuilder();
            sb.append("product=freelog&appid=" + iFlyCollectorExt.getAppId());
            String subId = iFlyCollectorExt.getSubId();
            if (!TextUtils.isEmpty(subId)) {
                sb.append("&subid=" + subId);
            }
            sb.append("&size=" + d.length + "&platform=android&source=daas&pv=1.1");
            bVar.a("https://log.iflytek.com/log", sb.toString(), d);
            bVar.a(this.b);
            bVar.a();
        } catch (Throwable th) {
            com.iflytek.idata.extension.d.a.c("Collector", "exception occur while upload:" + th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(HiAnalyticsConstant.Direction.RESPONSE);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("des");
                if (!TextUtils.isEmpty(optString)) {
                    SharedPreferences b = com.iflytek.idata.extension.d.b.b(this.f11231a);
                    String string = b.getString("ifly_dynamic_business_conf", "");
                    SharedPreferences.Editor edit = b.edit();
                    if ("no".equals(optString)) {
                        if (!TextUtils.isEmpty(string)) {
                            edit.putString("ifly_dynamic_business_conf", "");
                            edit.apply();
                        }
                    } else if (!optString.equals(string)) {
                        edit.putString("ifly_dynamic_business_conf", optString);
                        edit.apply();
                    }
                }
                String optString2 = optJSONObject.optString("ver");
                if (TextUtils.isEmpty(optString2) || optString2.equals(IFlyCollectorExt.getInstance(this.f11231a).a())) {
                    return;
                }
                new Thread(new com.iflytek.idata.extension.a(this.f11231a, true)).start();
            }
        } catch (Throwable th) {
            com.iflytek.idata.extension.d.a.b("Collector", "parse result error:" + th.toString());
        }
    }

    class a implements b.a {
        a() {
        }

        @Override // com.iflytek.idata.extension.b.a
        public void a(b bVar, byte[] bArr) {
            if (bArr != null) {
                try {
                    String str = new String(bArr, "utf-8");
                    if (b.a(str)) {
                        return;
                    }
                    com.iflytek.idata.extension.d.a.a("Collector", "upload success");
                    c.this.a(str);
                } catch (Throwable th) {
                    a(new Exception(th));
                }
            }
        }

        @Override // com.iflytek.idata.extension.b.a
        public void a(Exception exc) {
            com.iflytek.idata.extension.d.a.b("Collector", "update error:" + exc);
        }
    }
}
