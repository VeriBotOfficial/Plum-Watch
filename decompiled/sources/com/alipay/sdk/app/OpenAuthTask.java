package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.o.b;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.AnalyticsConfig;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenAuthTask {
    public static final int Duplex = 5000;
    public static final int NOT_INSTALLED = 4001;
    public static final int OK = 9000;
    public static final int SYS_ERR = 4000;
    public static final Map<String, Callback> e = new ConcurrentHashMap();
    public static long f = -1;
    public static final int g = 122;
    public final Activity b;
    public Callback c;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f1314a = false;
    public final Handler d = new Handler(Looper.getMainLooper());

    public enum BizType {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");

        private String appId;

        BizType(String str) {
            this.appId = str;
        }
    }

    public interface Callback {
        void onResult(int i, String str, Bundle bundle);
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1315a;

        static {
            int[] iArr = new int[BizType.values().length];
            f1315a = iArr;
            try {
                iArr[BizType.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1315a[BizType.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1315a[BizType.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f1316a;
        public final String b;
        public final Bundle c;

        public /* synthetic */ b(OpenAuthTask openAuthTask, int i, String str, Bundle bundle, a aVar) {
            this(i, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OpenAuthTask.this.c != null) {
                OpenAuthTask.this.c.onResult(this.f1316a, this.b, this.c);
            }
        }

        public b(int i, String str, Bundle bundle) {
            this.f1316a = i;
            this.b = str;
            this.c = bundle;
        }
    }

    public OpenAuthTask(Activity activity) {
        this.b = activity;
        com.alipay.sdk.m.w.b.c().a(activity);
    }

    public void execute(String str, BizType bizType, Map<String, String> map, Callback callback, boolean z) {
        com.alipay.sdk.m.w.a aVar = new com.alipay.sdk.m.w.a(this.b, String.valueOf(map), "oa-" + bizType);
        this.c = callback;
        if (a(aVar, str, bizType, map, z)) {
            com.alipay.sdk.m.m.a.b(this.b, aVar, "", aVar.d);
        }
    }

    public final boolean a(com.alipay.sdk.m.w.a aVar, String str, BizType bizType, Map<String, String> map, boolean z) {
        PackageInfo packageInfo;
        String str2;
        if (this.f1314a) {
            this.d.post(new b(this, 4000, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.f1314a = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f <= 3000) {
            this.d.post(new b(this, 5000, "3s 内重复支付", null, null));
            return true;
        }
        f = elapsedRealtime;
        com.alipay.sdk.m.l.a.a("");
        String a2 = q.a(32);
        HashMap hashMap = new HashMap(map);
        hashMap.put("mqpPkgName", this.b.getPackageName());
        hashMap.put("mqpScene", "sdk");
        List<b.C0091b> m = com.alipay.sdk.m.o.b.i().m();
        if (!com.alipay.sdk.m.o.b.i().g || m == null) {
            m = com.alipay.sdk.m.l.a.d;
        }
        q.c a3 = q.a(aVar, this.b, m);
        if (a3 == null || a3.a(aVar) || a3.a() || (packageInfo = a3.f1501a) == null || packageInfo.versionCode < 122) {
            if (!z) {
                this.d.post(new b(this, 4001, "支付宝未安装或签名错误", null, null));
                return true;
            }
            hashMap.put("mqpScheme", String.valueOf(str));
            hashMap.put("mqpNotifyName", a2);
            hashMap.put("mqpScene", "landing");
            String a4 = a(bizType, hashMap);
            Intent intent = new Intent(this.b, (Class<?>) H5OpenAuthActivity.class);
            intent.putExtra("url", String.format("https://render.alipay.com/p/s/i?scheme=%s", Uri.encode(a4)));
            a.C0102a.a(aVar, intent);
            this.b.startActivity(intent);
            return false;
        }
        try {
            try {
                HashMap<String, String> a5 = com.alipay.sdk.m.w.a.a(aVar);
                a5.put("ts_scheme", String.valueOf(SystemClock.elapsedRealtime()));
                hashMap.put("mqpLoc", new JSONObject(a5).toString());
            } catch (Throwable th) {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.l, "OpenAuthLocEx", th);
            }
            String a6 = a(bizType, hashMap);
            e.put(a2, this.c);
            try {
                str2 = a(elapsedRealtime, a2, bizType, a6);
            } catch (JSONException e2) {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.l, com.alipay.sdk.m.m.b.q0, e2);
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                this.d.post(new b(this, 4000, "参数错误", null, null));
                return true;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20001129").appendQueryParameter("payload", str2).build());
            intent2.addFlags(268435456);
            intent2.setPackage(a3.f1501a.packageName);
            try {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.l, com.alipay.sdk.m.m.b.Y, "" + elapsedRealtime);
                a.C0102a.a(aVar, a2);
                this.b.startActivity(intent2);
            } catch (Throwable th2) {
                com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.l, "StartWalletEx", th2);
            }
            return false;
        } catch (Throwable unused) {
            this.d.post(new b(this, 4000, "业务参数错误", null, null));
            return true;
        }
    }

    public final String a(BizType bizType, Map<String, String> map) {
        if (bizType != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", bizType.appId);
            if (a.f1315a[bizType.ordinal()] == 1) {
                appendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", "YES");
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return appendQueryParameter.build().toString();
        }
        throw new RuntimeException("missing bizType");
    }

    public final String a(long j, String str, BizType bizType, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsConfig.RTD_START_TIME, String.valueOf(j));
        jSONObject.put("session", str);
        jSONObject.put("package", this.b.getPackageName());
        if (bizType != null) {
            jSONObject.put("appId", bizType.appId);
        }
        jSONObject.put(com.heytap.mcssdk.constant.b.C, "h.a.3.8.42");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(Charset.forName("UTF-8")), 2);
    }

    public static void a(String str, int i, String str2, Bundle bundle) {
        Callback remove = e.remove(str);
        if (remove != null) {
            try {
                remove.onResult(i, str2, bundle);
            } catch (Throwable th) {
                g.a(th);
            }
        }
    }
}
