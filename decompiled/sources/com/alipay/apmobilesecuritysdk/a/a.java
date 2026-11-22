package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.c;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.phancy.mini.core.resource.MiniPack;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f1293a;
    private com.alipay.apmobilesecuritysdk.b.a b = com.alipay.apmobilesecuritysdk.b.a.a();
    private int c = 4;

    public a(Context context) {
        this.f1293a = context;
    }

    public static String a(Context context) {
        try {
            String b = i.b();
            if (!com.alipay.sdk.m.d0.a.a(b)) {
                return b;
            }
            c c = d.c(context);
            if (c != null) {
                i.a(c);
                String str = c.f1297a;
                if (com.alipay.sdk.m.d0.a.b(str)) {
                    return str;
                }
            }
            com.alipay.apmobilesecuritysdk.e.b c2 = com.alipay.apmobilesecuritysdk.e.a.c(context);
            if (c2 == null) {
                return "";
            }
            i.a(c2);
            String str2 = c2.f1296a;
            return com.alipay.sdk.m.d0.a.b(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context, String str) {
        try {
            b();
            String a2 = i.a(str);
            if (!com.alipay.sdk.m.d0.a.a(a2)) {
                return a2;
            }
            String a3 = g.a(context, str);
            i.a(str, a3);
            return !com.alipay.sdk.m.d0.a.a(a3) ? a3 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private void a(String str, com.alipay.sdk.m.k0.c cVar, Map<String, String> map) {
        h.a(this.f1293a, cVar.b());
        h.d(this.f1293a, cVar.a());
        h.e(this.f1293a, cVar.g);
        h.a(this.f1293a, cVar.h);
        h.f(this.f1293a, cVar.i);
        h.g(this.f1293a, cVar.k);
        i.c(e.b(this.f1293a, map));
        i.a(str, cVar.d);
        i.b(cVar.c);
        i.d(cVar.j);
        i.e(e(map));
        i.f(d(map));
        i.a();
        d.a(this.f1293a, i.g());
        d.b(this.f1293a);
        com.alipay.apmobilesecuritysdk.e.a.a(this.f1293a, new com.alipay.apmobilesecuritysdk.e.b(i.b(), i.c(), i.f()));
        com.alipay.apmobilesecuritysdk.e.a.a(this.f1293a);
        g.a(this.f1293a, str, i.a(str));
        g.b(this.f1293a, str);
        h.a(this.f1293a, str, System.currentTimeMillis());
    }

    private boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(MiniPack.BUILD_TIME_FORMAT);
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = (int) (Math.random() * 24.0d * 60.0d * 60.0d);
        for (int i = 0; i < 3; i++) {
            try {
                String[] split = strArr[i].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parse2);
                    calendar.add(13, random);
                    Date time = calendar.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private boolean a(String str) {
        return com.alipay.sdk.m.d0.a.a(a(this.f1293a, str)) || com.alipay.sdk.m.d0.a.a(a(this.f1293a));
    }

    private boolean a(Map<String, String> map, String str) {
        if (a() || com.alipay.apmobilesecuritysdk.common.a.a(this.f1293a)) {
            return a(str);
        }
        e.a();
        if (!com.alipay.sdk.m.d0.a.a(e.b(this.f1293a, map), i.c())) {
            return true;
        }
        String a2 = com.alipay.sdk.m.d0.a.a(map, "tid", "");
        String a3 = com.alipay.sdk.m.d0.a.a(map, com.alipay.sdk.m.n.b.g, "");
        if (!com.alipay.sdk.m.d0.a.b(a2) || com.alipay.sdk.m.d0.a.a(a2, i.d())) {
            return (com.alipay.sdk.m.d0.a.b(a3) && !com.alipay.sdk.m.d0.a.a(a3, i.e())) || !i.a(this.f1293a, str) || com.alipay.sdk.m.d0.a.a(a(this.f1293a, str)) || com.alipay.sdk.m.d0.a.a(a(this.f1293a));
        }
        return true;
    }

    private int b(Map<String, String> map) {
        String a2 = com.alipay.sdk.m.d0.a.a(map, "appName", "");
        b();
        b(a2);
        boolean a3 = a(map, a2);
        Context context = this.f1293a;
        h.b(context, String.valueOf(com.alipay.sdk.m.f0.b.a(APSecuritySdk.getInstance(context)).m()));
        if (!a3) {
            return 0;
        }
        com.alipay.apmobilesecuritysdk.c.c.a(this.f1293a).b();
        UmidSdkWrapper.startUmidTaskSync(this.f1293a, com.alipay.apmobilesecuritysdk.b.a.a().b());
        com.alipay.sdk.m.k0.c c = c(map);
        int c2 = c != null ? c.c() : 2;
        if (c2 == 1) {
            a(a2, c, map);
            return 0;
        }
        if (c2 == 3) {
            return 1;
        }
        com.alipay.apmobilesecuritysdk.c.a.a(c != null ? "Server error, result:" + c.b : "Server error, returned null");
        return com.alipay.sdk.m.d0.a.a(a(this.f1293a, a2)) ? 4 : 0;
    }

    public static String b(Context context) {
        String a2 = a(context);
        return com.alipay.sdk.m.d0.a.a(a2) ? h.f(context) : a2;
    }

    private static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i = 0; i < 5; i++) {
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + strArr[i]);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void b(String str) {
        a(this.f1293a);
        a(this.f1293a, str);
        i.a();
    }

    private com.alipay.sdk.m.k0.c c(Map<String, String> map) {
        try {
            return com.alipay.sdk.m.i0.d.b(this.f1293a, this.b.c()).a(b.a(this.f1293a, map));
        } catch (Throwable th) {
            th.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th);
            return null;
        }
    }

    private String d(Map<String, String> map) {
        String a2 = com.alipay.sdk.m.d0.a.a(map, com.alipay.sdk.m.n.b.g, "");
        if (!com.alipay.sdk.m.d0.a.b(a2) || com.alipay.sdk.m.d0.a.a(a2, i.e())) {
            return i.e();
        }
        i.f(a2);
        return a2;
    }

    private String e(Map<String, String> map) {
        String a2 = com.alipay.sdk.m.d0.a.a(map, "tid", "");
        if (!com.alipay.sdk.m.d0.a.b(a2) || com.alipay.sdk.m.d0.a.a(a2, i.d())) {
            return i.d();
        }
        i.e(a2);
        return a2;
    }

    public int a(Map<String, String> map) {
        try {
            com.alipay.apmobilesecuritysdk.c.a.a(this.f1293a, com.alipay.sdk.m.d0.a.a(map, "tid", ""), com.alipay.sdk.m.d0.a.a(map, com.alipay.sdk.m.n.b.g, ""), b(this.f1293a));
            this.c = b(map);
            com.alipay.apmobilesecuritysdk.c.a.a(this.f1293a, com.alipay.sdk.m.i0.d.b(this.f1293a, this.b.c()));
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
        }
        return this.c;
    }
}
