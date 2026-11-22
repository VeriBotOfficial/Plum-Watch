package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.e0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.w0;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SettingManager.java */
/* loaded from: classes17.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12042a = "h";
    private static volatile h b;
    private static volatile g c;
    private static HashMap<String, l> d = new HashMap<>();

    private h() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r5, java.lang.String r6) {
        /*
            com.mbridge.msdk.foundation.controller.d r0 = com.mbridge.msdk.foundation.controller.d.a()
            boolean r0 = r0.e()
            java.lang.String r1 = "mbridge"
            r2 = 0
            if (r0 == 0) goto L1d
            com.mbridge.msdk.foundation.tools.FastKV$Builder r0 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch: java.lang.Exception -> L1d
            com.mbridge.msdk.foundation.same.directory.c r3 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG     // Catch: java.lang.Exception -> L1d
            java.lang.String r3 = com.mbridge.msdk.foundation.same.directory.e.b(r3)     // Catch: java.lang.Exception -> L1d
            r0.<init>(r3, r1)     // Catch: java.lang.Exception -> L1d
            com.mbridge.msdk.foundation.tools.FastKV r0 = r0.build()     // Catch: java.lang.Exception -> L1d
            goto L1e
        L1d:
            r0 = r2
        L1e:
            java.lang.String r3 = "_"
            if (r0 == 0) goto L68
            java.util.Map r2 = r0.getAll()     // Catch: java.lang.Exception -> L26
        L26:
            if (r2 == 0) goto Lb0
            java.util.Set r5 = r2.keySet()     // Catch: java.lang.Exception -> L63
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L63
        L30:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
            r1.<init>()     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Exception -> L63
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L63
            boolean r1 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L63
            if (r1 == 0) goto L30
            java.util.HashMap<java.lang.String, com.mbridge.msdk.setting.l> r1 = com.mbridge.msdk.setting.h.d     // Catch: java.lang.Exception -> L63
            java.lang.Object r4 = r2.get(r0)     // Catch: java.lang.Exception -> L63
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L63
            com.mbridge.msdk.setting.l r4 = com.mbridge.msdk.setting.l.l(r4)     // Catch: java.lang.Exception -> L63
            r1.put(r0, r4)     // Catch: java.lang.Exception -> L63
            goto L30
        L63:
            r5 = move-exception
            r5.printStackTrace()
            goto Lb0
        L68:
            r0 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r1, r0)     // Catch: java.lang.Exception -> Lac
            java.util.Map r5 = r5.getAll()     // Catch: java.lang.Exception -> Lac
            java.util.Set r0 = r5.keySet()     // Catch: java.lang.Exception -> Lac
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lac
        L79:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> Lac
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> Lac
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lac
            r2.<init>()     // Catch: java.lang.Exception -> Lac
            java.lang.StringBuilder r2 = r2.append(r6)     // Catch: java.lang.Exception -> Lac
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Exception -> Lac
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lac
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Exception -> Lac
            if (r2 == 0) goto L79
            java.util.HashMap<java.lang.String, com.mbridge.msdk.setting.l> r2 = com.mbridge.msdk.setting.h.d     // Catch: java.lang.Exception -> Lac
            java.lang.Object r4 = r5.get(r1)     // Catch: java.lang.Exception -> Lac
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lac
            com.mbridge.msdk.setting.l r4 = com.mbridge.msdk.setting.l.l(r4)     // Catch: java.lang.Exception -> Lac
            r2.put(r1, r4)     // Catch: java.lang.Exception -> Lac
            goto L79
        Lac:
            r5 = move-exception
            r5.printStackTrace()
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.setting.h.a(android.content.Context, java.lang.String):void");
    }

    public static h b() {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    public g c() {
        return c != null ? c : a();
    }

    public g d(String str) {
        if (c == null) {
            try {
                String a2 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
                if (!TextUtils.isEmpty(a2)) {
                    JSONObject jSONObject = new JSONObject(a2);
                    if (jSONObject.has("b")) {
                        jSONObject.remove("b");
                    }
                    if (jSONObject.has("c")) {
                        jSONObject.remove("c");
                    }
                    c = g.C(jSONObject.toString());
                    if (c != null) {
                        c.K0();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return c;
    }

    public l e(String str, String str2) {
        l b2 = b(str, str2);
        if (b2 != null && b2.L() == 0) {
            b2.d(1);
        }
        return b2;
    }

    public String f(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + "_" + str2);
    }

    public boolean g(String str, String str2) {
        g d2 = d(str2);
        if (f(str2) && a(str2, 1, str)) {
            new j().b(com.mbridge.msdk.foundation.controller.c.m().d(), str2, com.mbridge.msdk.foundation.controller.c.m().c());
        }
        l e = e(str2, str);
        if (d2 != null && e != null) {
            long q0 = d2.q0() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long o = e.o() + q0;
            if (o > currentTimeMillis) {
                o0.c(f12042a, "unit setting  nexttime is not ready  [settingNextRequestTime= " + o + " currentTime = " + currentTimeMillis + "]");
                return false;
            }
        }
        o0.c(f12042a, "unit setting timeout or not exists");
        return true;
    }

    public void h(String str) {
        try {
            String e = e(str);
            if (TextUtils.isEmpty(e)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(e);
            jSONObject.put("current_time", System.currentTimeMillis());
            h(str, jSONObject.toString());
        } catch (Throwable th) {
            o0.b(f12042a, th.getMessage());
        }
    }

    public void i(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str, str2);
    }

    public void j(String str, String str2) {
        try {
            String a2 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + "_" + str2);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a2);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th) {
            o0.b(f12042a, th.getMessage());
        }
    }

    public boolean f(String str) {
        g d2 = d(str);
        if (d2 != null) {
            long A = d2.A() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long w = d2.w() + A;
            if (w > currentTimeMillis) {
                o0.c(f12042a, "app setting nexttime is not ready  [settingNextRequestTime= " + w + " currentTime = " + currentTimeMillis + "]");
                return false;
            }
        }
        o0.c(f12042a, "app setting timeout or not exists");
        return true;
    }

    public String c(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str);
    }

    public l c(String str, String str2) {
        l a2 = a(str, str2);
        return a2 == null ? l.N() : a2;
    }

    public String e(String str) {
        if (str == null) {
            return "";
        }
        try {
            String a2 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
            return a2 == null ? "" : a2;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    public g b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return a();
            }
            g d2 = d(str);
            return d2 == null ? a() : d2;
        } catch (Exception unused) {
            return a();
        }
    }

    public void h(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str, str2);
        c = g.C(str2);
        if (c != null) {
            c.K0();
        }
        i.a(c);
        e0.a().a(c.Q());
    }

    private l b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.m().b();
        }
        String str3 = str + "_" + str2;
        if (d.containsKey(str3)) {
            return d.get(str3);
        }
        l lVar = null;
        try {
            lVar = l.l(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str3));
            d.put(str3, lVar);
            return lVar;
        } catch (Exception e) {
            e.printStackTrace();
            return lVar;
        }
    }

    public void g(String str) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().c("ivreward_" + str);
    }

    public l d(String str, String str2) {
        l e = e(str, str2);
        return e == null ? l.N() : e;
    }

    public void a(String str) {
        i.a(str, this);
    }

    public g a() {
        return i.a();
    }

    public l a(String str, String str2) {
        return b(str, str2);
    }

    public boolean a(String str, int i, String str2) {
        try {
            Context d2 = com.mbridge.msdk.foundation.controller.c.m().d();
            String str3 = str + "_" + i + "_" + str2;
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long longValue = ((Long) w0.a(d2, str3, 0L)).longValue();
            g d3 = d(str);
            if (d3 == null) {
                d3 = b().a();
            } else {
                j = longValue;
            }
            if (j + (d3.l0() * 1000) > currentTimeMillis) {
                return false;
            }
            w0.b(d2, str3, Long.valueOf(currentTimeMillis));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        String str4 = str + "_" + str2;
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str4, str3);
        d.put(str4, l.l(str3));
    }
}
