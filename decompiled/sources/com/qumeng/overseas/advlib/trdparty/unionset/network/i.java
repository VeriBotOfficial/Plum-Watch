package com.qumeng.overseas.advlib.trdparty.unionset.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite;
import com.qumeng.overseas.advlib.__remote__.utils.u;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class i {
    private static volatile i c = null;
    public static final String d = "http://mtlcfg.adseye.com/exchange_rate/USD";

    /* renamed from: a, reason: collision with root package name */
    private volatile ExchangeRateEntity f13419a;
    private volatile long b;

    class a implements Runnable {

        /* renamed from: com.qumeng.overseas.advlib.trdparty.unionset.network.i$a$a, reason: collision with other inner class name */
        class C0878a extends HttpLite.HttpCallback<String> {
            C0878a() {
            }

            @Override // com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite.HttpCallback
            public void onSuccess(String str) {
                JSONObject optJSONObject;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.optInt("code") != 0 || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                        return;
                    }
                    i.this.f13419a = (ExchangeRateEntity) com.qumeng.overseas.advlib.__remote__.utils.l.a(optJSONObject, ExchangeRateEntity.class);
                    oqme.a.c(oqme.a.g0, optJSONObject.toString());
                    com.qumeng.overseas.advlib.__remote__.utils.n.a("ExchangeRateConfig", "exchange rate config: %s", optJSONObject.toString());
                } catch (Throwable th) {
                    com.qumeng.overseas.advlib.__remote__.utils.n.b("ExchangeRateConfig", th.getMessage(), new Object[0]);
                }
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpLite.a().a(i.d, (Map) null, new C0878a());
        }
    }

    public ExchangeRateEntity b() {
        if (this.f13419a == null) {
            String b = oqme.a.b(oqme.a.g0, "");
            if (!TextUtils.isEmpty(b)) {
                try {
                    this.f13419a = (ExchangeRateEntity) com.qumeng.overseas.advlib.__remote__.utils.l.a(new JSONObject(b), ExchangeRateEntity.class);
                } catch (Throwable th) {
                    com.qumeng.overseas.advlib.__remote__.utils.n.b("ExchangeRateConfig", th.getMessage(), new Object[0]);
                }
            }
        }
        return this.f13419a;
    }

    public void c() {
        if (SystemClock.elapsedRealtime() - this.b < 300000) {
            return;
        }
        this.b = SystemClock.elapsedRealtime();
        u.a().a(new a());
    }

    public static i a() {
        if (c == null) {
            synchronized (i.class) {
                if (c == null) {
                    c = new i();
                }
            }
        }
        return c;
    }
}
