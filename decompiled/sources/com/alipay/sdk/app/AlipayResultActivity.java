package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.m.b;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.o;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AlipayResultActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f1310a = new ConcurrentHashMap<>();

    public interface a {
        void a(int i, String str, String str2);
    }

    public final void a(String str, Bundle bundle) {
        a remove = f1310a.remove(str);
        if (remove == null) {
            return;
        }
        try {
            remove.a(bundle.getInt("endCode"), bundle.getString(o.b), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Throwable th;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                String stringExtra = intent.getStringExtra("session");
                Bundle bundleExtra = intent.getBundleExtra("result");
                String stringExtra2 = intent.getStringExtra("scene");
                com.alipay.sdk.m.w.a a2 = a.C0102a.a(stringExtra);
                if (a2 == null) {
                    finish();
                    return;
                }
                com.alipay.sdk.m.m.a.a(a2, b.l, "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        stringExtra = jSONObject.getString("session");
                        com.alipay.sdk.m.m.a.a(a2, b.l, "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th2) {
                            th = th2;
                            bundleExtra = bundle2;
                            com.alipay.sdk.m.m.a.a(a2, b.l, "BSPResEx", th);
                            com.alipay.sdk.m.m.a.a(a2, b.l, b.s0, th);
                            if (TextUtils.isEmpty(stringExtra)) {
                            }
                            com.alipay.sdk.m.m.a.b(this, a2, "", a2.d);
                            finish();
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (!TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    com.alipay.sdk.m.m.a.b(this, a2, "", a2.d);
                    finish();
                    return;
                }
                try {
                    com.alipay.sdk.m.m.a.a(a2, b.l, b.V, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.m.a.a(a2, b.l, b.W, bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString(o.b, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
                    OpenAuthTask.a(stringExtra, 9000, "OK", bundleExtra);
                    com.alipay.sdk.m.m.a.b(this, a2, "", a2.d);
                    finish();
                } catch (Throwable th4) {
                    com.alipay.sdk.m.m.a.b(this, a2, "", a2.d);
                    finish();
                    throw th4;
                }
            } catch (Throwable th5) {
                com.alipay.sdk.m.m.a.a((com.alipay.sdk.m.w.a) null, b.l, "BSPSerError", th5);
                com.alipay.sdk.m.m.a.a((com.alipay.sdk.m.w.a) null, b.l, b.r0, th5);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
