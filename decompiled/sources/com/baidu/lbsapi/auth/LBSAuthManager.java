package com.baidu.lbsapi.auth;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.android.bbalbs.common.util.DeviceId;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class LBSAuthManager {
    public static final int CODE_AUTHENTICATE_SUCC = 0;
    public static final int CODE_AUTHENTICATING = 602;
    public static final int CODE_INNER_ERROR = -1;
    public static final int CODE_KEY_NOT_EXIST = 101;
    public static final int CODE_NETWORK_FAILED = -11;
    public static final int CODE_NETWORK_INVALID = -10;
    public static final int CODE_UNAUTHENTICATE = 601;
    public static final String VERSION = "1.0.34";

    /* renamed from: a, reason: collision with root package name */
    private static Context f7486a = null;
    private static String b = null;
    private static int c = -1;
    private static String d;
    private static String e;
    private static p h;
    private static int i;
    private static LBSAuthManager k;
    private byte[] m;
    private static Hashtable j = new Hashtable();
    private static String n = "";
    private static String o = "";
    private static String p = "";

    /* renamed from: q, reason: collision with root package name */
    private static boolean f7487q = false;
    private static String r = null;
    private e f = null;
    private g g = null;
    private boolean l = false;
    private final Handler s = new l(this, Looper.getMainLooper());

    private LBSAuthManager(Context context) {
        f7486a = context;
        p pVar = h;
        if (pVar != null && !pVar.isAlive()) {
            h = null;
        }
        b.b("BaiduApiAuth SDK Version:1.0.34");
        h();
    }

    private int a(String str) {
        int i2 = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
            i2 = jSONObject.getInt("status");
            if (jSONObject.has("current") && i2 == 0) {
                long j2 = jSONObject.getLong("current");
                long currentTimeMillis = System.currentTimeMillis();
                if ((currentTimeMillis - j2) / 3600000.0d < 24.0d) {
                    if (this.l) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        if (!simpleDateFormat.format(Long.valueOf(currentTimeMillis)).equals(simpleDateFormat.format(Long.valueOf(j2)))) {
                        }
                    }
                }
                i2 = 601;
            }
            if (jSONObject.has("current") && i2 == 602) {
                if ((System.currentTimeMillis() - jSONObject.getLong("current")) / 1000 > 180.0d) {
                    return 601;
                }
            }
            return i2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return i2;
        }
    }

    private String a(int i2) throws IOException {
        FileInputStream fileInputStream;
        try {
            try {
                fileInputStream = new FileInputStream("/proc/" + i2 + "/cmdline");
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
            try {
                byte[] bArr = new byte[256];
                int i3 = 0;
                while (true) {
                    int read = fileInputStream.read();
                    if (read <= 0 || i3 >= 256) {
                        break;
                    }
                    bArr[i3] = (byte) read;
                    i3++;
                }
                if (i3 <= 0) {
                    fileInputStream.close();
                    return null;
                }
                String str = new String(bArr, 0, i3, "UTF-8");
                try {
                    fileInputStream.close();
                    return str;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return str;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    private String a(Context context) {
        if (context == null) {
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Map_Privacy", 0);
        if (sharedPreferences.contains("random_uuid")) {
            String string = sharedPreferences.getString("random_uuid", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("random_uuid", uuid);
        edit.apply();
        return uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r6.equals("") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"
            java.lang.String r1 = ""
            java.lang.String r2 = com.baidu.lbsapi.auth.LBSAuthManager.n
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lf
            java.lang.String r6 = com.baidu.lbsapi.auth.LBSAuthManager.n
            return r6
        Lf:
            java.lang.String r2 = r6.getPackageName()
            r3 = 101(0x65, float:1.42E-43)
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            android.os.Bundle r2 = r6.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            if (r2 != 0) goto L37
            java.util.Hashtable r6 = com.baidu.lbsapi.auth.LBSAuthManager.j     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.Object r6 = r6.get(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            com.baidu.lbsapi.auth.LBSAuthManagerListener r6 = (com.baidu.lbsapi.auth.LBSAuthManagerListener) r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            if (r6 == 0) goto L36
            java.lang.String r2 = "AndroidManifest.xml的application中没有meta-data标签"
            java.lang.String r2 = com.baidu.lbsapi.auth.ErrorMessage.a(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            r6.onAuthResult(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
        L36:
            return r1
        L37:
            android.os.Bundle r6 = r6.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r2 = "com.baidu.lbsapi.API_KEY"
            java.lang.String r6 = r6.getString(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            if (r6 == 0) goto L47
            boolean r1 = r6.equals(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
            if (r1 == 0) goto L58
        L47:
            java.util.Hashtable r1 = com.baidu.lbsapi.auth.LBSAuthManager.j     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
            java.lang.Object r1 = r1.get(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
            com.baidu.lbsapi.auth.LBSAuthManagerListener r1 = (com.baidu.lbsapi.auth.LBSAuthManagerListener) r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
            if (r1 == 0) goto L58
            java.lang.String r2 = com.baidu.lbsapi.auth.ErrorMessage.a(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
            r1.onAuthResult(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
        L58:
            return r6
        L59:
            r1 = r6
        L5a:
            java.util.Hashtable r6 = com.baidu.lbsapi.auth.LBSAuthManager.j
            java.lang.Object r6 = r6.get(r7)
            com.baidu.lbsapi.auth.LBSAuthManagerListener r6 = (com.baidu.lbsapi.auth.LBSAuthManagerListener) r6
            if (r6 == 0) goto L6b
            java.lang.String r7 = com.baidu.lbsapi.auth.ErrorMessage.a(r3, r0)
            r6.onAuthResult(r3, r7)
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.lbsapi.auth.LBSAuthManager.a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3) {
        p pVar;
        synchronized (LBSAuthManager.class) {
            if (str2 == null) {
                str2 = c(str);
            }
            Message obtainMessage = this.s.obtainMessage();
            int i2 = -1;
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (!jSONObject.has("status")) {
                    jSONObject.put("status", -1);
                }
                if (!jSONObject.has("current")) {
                    jSONObject.put("current", System.currentTimeMillis());
                }
                b(str, jSONObject.toString());
                if (jSONObject.has("current")) {
                    jSONObject.remove("current");
                }
                i2 = jSONObject.getInt("status");
                obtainMessage.what = i2;
                if (i2 == 0) {
                    a(jSONObject);
                }
                obtainMessage.obj = jSONObject;
                Bundle bundle = new Bundle();
                bundle.putString("listenerKey", str3);
                obtainMessage.setData(bundle);
                this.s.sendMessage(obtainMessage);
            } catch (JSONException e2) {
                e2.printStackTrace();
                obtainMessage.what = i2;
                obtainMessage.obj = new JSONObject();
                Bundle bundle2 = new Bundle();
                bundle2.putString("listenerKey", str3);
                obtainMessage.setData(bundle2);
                this.s.sendMessage(obtainMessage);
            }
            p pVar2 = h;
            if (pVar2 != null) {
                pVar2.c();
            }
            i--;
            b.a("httpRequest called mAuthCounter-- = " + i);
            if (i == 0 && (pVar = h) != null) {
                pVar.a();
                h = null;
            }
        }
    }

    private void a(HashMap hashMap, String str, String str2) {
        if (hashMap == null || hashMap.size() <= 0 || str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return;
        }
        try {
            String a2 = q.a(str2);
            if (a2 == null || a2.length() <= 0) {
                hashMap.put(str, str2);
            } else {
                hashMap.put(str, a2);
            }
        } catch (Exception e2) {
            hashMap.put(str, str2);
            Log.e("LBSAuthManager", "encodeAuthParam", e2);
        }
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("en")) {
            return;
        }
        if (jSONObject.optInt("en", 0) == 0) {
            if (jSONObject.optString("ck").length() > 0) {
                this.m = c.a(jSONObject.optString("ck").getBytes(StandardCharsets.UTF_8));
            }
        } else {
            a(jSONObject, "ak");
            a(jSONObject, "ck");
            a(jSONObject, "sk");
            a(jSONObject, "uid");
            b(jSONObject);
        }
    }

    private void a(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.length() <= 0 || str == null || str.length() <= 0 || !jSONObject.has(str)) {
            return;
        }
        try {
            byte[] b2 = q.b(jSONObject.optString(str));
            if (b2 != null && b2.length > 0) {
                jSONObject.put(str, new String(b2, StandardCharsets.UTF_8));
                if ("ck".equals(str)) {
                    this.m = b2;
                    return;
                }
                return;
            }
            jSONObject.put(str, "");
            jSONObject.put("decode_status", -1);
        } catch (Exception e2) {
            Log.e("LBSAuthManager", " decodeAuthResult ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str, Hashtable hashtable, String str2, String str3, int i2, String str4, String str5) {
        String str6;
        String a2 = a(f7486a, str2);
        if (a2 == null || a2.equals("")) {
            return;
        }
        HashMap hashMap = new HashMap();
        q.a();
        hashMap.put("pk", q.b() != null ? q.b() : "");
        hashMap.put("url", "https://api.map.baidu.com/sdkcs/verify");
        b.a("url:https://api.map.baidu.com/sdkcs/verify");
        hashMap.put("output", BodyData.TYPE_JSON);
        a(hashMap, "ak", a2);
        b.a("ak:" + ((String) hashMap.get("ak")));
        a(hashMap, "mcode", d.a(f7486a));
        hashMap.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry entry : hashtable.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                    hashMap.put(str7, str8);
                }
            }
        }
        String cuid = !TextUtils.isEmpty(o) ? getCUID() : r;
        b.a("cuid:" + r);
        if (TextUtils.isEmpty(cuid)) {
            hashMap.put("cuid", "");
        } else {
            hashMap.put("cuid", cuid);
        }
        hashMap.put("pcn", f7486a.getPackageName());
        hashMap.put("version", VERSION);
        hashMap.put("macaddr", "");
        try {
            str6 = d.a();
        } catch (Exception unused) {
            str6 = "";
        }
        if (TextUtils.isEmpty(str6)) {
            hashMap.put("language", "");
        } else {
            hashMap.put("language", str6);
        }
        if (z) {
            hashMap.put("force", z ? "1" : "0");
        }
        if (str == null) {
            hashMap.put("from_service", "");
        } else {
            hashMap.put("from_service", str);
        }
        String b2 = b(str);
        if (!TextUtils.isEmpty(b2)) {
            hashMap.put("extend", b2);
        }
        e eVar = new e(f7486a);
        this.f = eVar;
        eVar.a(hashMap, str3, i2, str4, str5, new n(this, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str, Hashtable hashtable, String[] strArr, String str2, String str3, int i2, String str4, String str5) {
        String str6;
        String a2 = a(f7486a, str2);
        if (a2 == null || a2.equals("")) {
            return;
        }
        HashMap hashMap = new HashMap();
        q.a();
        hashMap.put("pk", q.b() != null ? q.b() : "");
        hashMap.put("url", "https://api.map.baidu.com/sdkcs/verify");
        hashMap.put("output", BodyData.TYPE_JSON);
        a(hashMap, "ak", a2);
        hashMap.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry entry : hashtable.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                    hashMap.put(str7, str8);
                }
            }
        }
        String cuid = !TextUtils.isEmpty(o) ? getCUID() : r;
        b.a("sendAuthRequests : cuid: " + cuid);
        if (TextUtils.isEmpty(cuid)) {
            hashMap.put("cuid", "");
        } else {
            hashMap.put("cuid", cuid);
        }
        hashMap.put("pcn", f7486a.getPackageName());
        hashMap.put("version", VERSION);
        hashMap.put("macaddr", "");
        try {
            str6 = d.a();
        } catch (Exception unused) {
            str6 = "";
        }
        if (TextUtils.isEmpty(str6)) {
            hashMap.put("language", "");
        } else {
            hashMap.put("language", str6);
        }
        if (z) {
            hashMap.put("force", z ? "1" : "0");
        }
        if (str == null) {
            hashMap.put("from_service", "");
        } else {
            hashMap.put("from_service", str);
        }
        String b2 = b(str);
        if (!TextUtils.isEmpty(b2)) {
            hashMap.put("extend", b2);
        }
        String[] strArr2 = new String[strArr.length];
        for (int i3 = 0; strArr != null && i3 < strArr.length; i3++) {
            String a3 = q.a(strArr[i3]);
            if (a3 == null || a3.length() <= 0) {
                strArr2[i3] = strArr[i3];
            } else {
                strArr2[i3] = a3;
            }
        }
        g gVar = new g(f7486a);
        this.g = gVar;
        gVar.a(hashMap, strArr2, str3, i2, str4, str5, new o(this, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2) {
        String str3;
        JSONObject jSONObject;
        String a2 = a(f7486a, str2);
        try {
            jSONObject = new JSONObject(c(str));
        } catch (JSONException e2) {
            e2.printStackTrace();
            str3 = "";
        }
        if (!jSONObject.has("ak")) {
            return true;
        }
        if (jSONObject.has("en") && jSONObject.getInt("en") == 1) {
            a(jSONObject, "ak");
        }
        str3 = jSONObject.getString("ak");
        return (a2 == null || str3 == null || a2.equals(str3)) ? false : true;
    }

    private String b(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            str = a(Process.myPid());
        } catch (IOException unused) {
            str = null;
        }
        return str != null ? str : context == null ? "" : context.getPackageName();
    }

    private String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(c(str));
            return !jSONObject.has("extend") ? "" : jSONObject.getString("extend");
        } catch (JSONException unused) {
            return "";
        }
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "status";
        }
        f7486a.getSharedPreferences("authStatus_" + b(f7486a), 0).edit().putString(str, str2).apply();
    }

    private void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        if (jSONObject.has("ck")) {
            jSONObject.remove("ck");
        }
        if (jSONObject.has("en")) {
            jSONObject.remove("en");
        }
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "status";
        }
        return f7486a.getSharedPreferences("authStatus_" + b(f7486a), 0).getString(str, "{\"status\":601}");
    }

    public static LBSAuthManager getInstance(Context context) {
        if (k == null) {
            synchronized (LBSAuthManager.class) {
                if (k == null) {
                    k = new LBSAuthManager(context);
                }
            }
        } else if (context != null) {
            f7486a = context;
        } else if (b.f7488a) {
            b.c("input context is null");
            new RuntimeException("here").printStackTrace();
        }
        return k;
    }

    private void h() {
        synchronized (LBSAuthManager.class) {
            if (h == null) {
                p pVar = new p("auth");
                h = pVar;
                pVar.start();
                while (h.f7501a == null) {
                    try {
                        b.a("wait for create auth thread.");
                        Thread.sleep(3L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public int authenticate(boolean z, String str, Hashtable hashtable, LBSAuthManagerListener lBSAuthManagerListener) {
        synchronized (LBSAuthManager.class) {
            boolean z2 = false;
            if (hashtable != null) {
                String str2 = (String) hashtable.get("zero_auth");
                if (str2 != null && Integer.valueOf(str2).intValue() == 1) {
                    z2 = true;
                }
            }
            this.l = z2;
            String str3 = System.currentTimeMillis() + "";
            if (lBSAuthManagerListener != null) {
                j.put(str3, lBSAuthManagerListener);
            }
            String a2 = a(f7486a, str3);
            if (a2 != null && !a2.equals("")) {
                i++;
                b.a(" mAuthCounter  ++ = " + i);
                String c2 = c(str);
                b.a("getAuthMessage from cache:" + c2);
                int a3 = a(c2);
                if (a3 == 601) {
                    try {
                        b(str, new JSONObject().put("status", 602).toString());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                h();
                p pVar = h;
                if (pVar != null && pVar.f7501a != null) {
                    b.a("mThreadLooper.mHandler = " + h.f7501a);
                    h.f7501a.post(new m(this, a3, z, str, str3, hashtable));
                    return a3;
                }
                return -1;
            }
            return 101;
        }
    }

    public String decodeAESMessage(String str) {
        byte[] bArr;
        if (str != null && str.length() > 0 && (bArr = this.m) != null && bArr.length > 0) {
            try {
                byte[] a2 = c.a(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArr2 = this.m;
                return new String(a.a(bArr2, bArr2, a2), StandardCharsets.UTF_8);
            } catch (Exception e2) {
                Log.e("LBSAuthManager", "decodeAESMessage", e2);
            }
        }
        return null;
    }

    public String getCUID() {
        if (!TextUtils.isEmpty(r)) {
            return r;
        }
        String str = "";
        if (f7486a == null) {
            return "";
        }
        try {
            b.a("mIsPrivacyMode " + f7487q);
            DeviceId.setAndroidId(!TextUtils.isEmpty(o) ? o : a(f7486a));
            str = DeviceId.getCUID(f7486a);
            r = str;
            b.a("getCUID: " + str);
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public String getKey() {
        Context context = f7486a;
        if (context == null) {
            return "";
        }
        try {
            return getPublicKey(context);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String getMCode() {
        Context context = f7486a;
        return context == null ? "" : d.a(context);
    }

    public boolean getPrivacyMode() {
        return f7487q;
    }

    public String getPublicKey(Context context) throws PackageManager.NameNotFoundException {
        if (!TextUtils.isEmpty(n)) {
            return n;
        }
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.baidu.lbsapi.API_KEY");
    }

    public void setAndroidId(String str) {
        if (f7486a == null || TextUtils.isEmpty(str)) {
            return;
        }
        o = str;
    }

    public void setHttpProxyUsernameAndPassword(String str, String str2) {
        d = str;
        e = str2;
    }

    public void setKey(String str) {
        if (f7486a == null || TextUtils.isEmpty(str)) {
            return;
        }
        n = str;
    }

    public void setPackageName(String str) {
        p = str;
    }

    public void setPrivacyMode(boolean z) {
        Context context = f7486a;
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Map_Privacy", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (z) {
            edit.putBoolean("privacyMode", z);
            edit.apply();
        } else {
            z = sharedPreferences.getBoolean("privacyMode", false);
        }
        f7487q = z;
    }

    public void setProxy(String str, int i2) {
        b = str;
        c = i2;
    }
}
