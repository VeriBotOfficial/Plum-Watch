package com.anythink.core.basead.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.basead.a.c;
import com.anythink.core.basead.a.d;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.by;
import com.anythink.core.common.h.cc;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.m;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.List;

/* loaded from: classes11.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3556a = "play.google.com";
    public static final String b = "market.android.com";
    public static final String c = "details?";
    public static final String d = "market";
    public static final String e = "market://";
    private static final String f = "e";

    public static cc a(String str) {
        cc ccVar = new cc();
        ccVar.l = 8;
        ccVar.n = false;
        ccVar.m = true;
        ccVar.o = str;
        try {
            if (Uri.parse(str).getScheme().equals(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK)) {
                Intent parseUri = Intent.parseUri(str, 1);
                parseUri.addCategory("android.intent.category.BROWSABLE");
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra) && stringExtra.startsWith("http")) {
                    ccVar.l = 10;
                    ccVar.o = stringExtra;
                    return ccVar;
                }
            }
        } catch (Throwable unused) {
        }
        if (d(str)) {
            String f2 = f(str);
            ccVar.l = 9;
            ccVar.o = f2;
        }
        return ccVar;
    }

    public static cc a(Context context, String str, w wVar) {
        cc ccVar = new cc();
        ccVar.n = !str.startsWith("http");
        ccVar.o = str;
        ccVar.p = false;
        if (!a(str, wVar != null ? wVar.r() : null)) {
            String ax = wVar != null ? wVar.ax() : "";
            if (d(str)) {
                ccVar.o = str;
                boolean e2 = e(str);
                if (a(context, new c.a().a(str).a(e2).b(ax).a())) {
                    ccVar.m = true;
                    if (e2) {
                        ccVar.l = 3;
                        return ccVar;
                    }
                    ccVar.l = 4;
                    return ccVar;
                }
                if (a(context, new c.a().a(str).a(false).b(ax).a())) {
                    ccVar.m = true;
                    ccVar.l = 4;
                    return ccVar;
                }
            } else if (!str.startsWith("http")) {
                ccVar.o = str;
                if (a(context, new c.a().a(str).a(false).b(ax).a())) {
                    ccVar.m = true;
                    ccVar.l = 5;
                    return ccVar;
                }
            } else if (c(str)) {
                String g = g(str);
                ccVar.n = true;
                ccVar.o = g;
                if (a(context, new c.a().a(g).a(true).b(ax).a())) {
                    ccVar.m = true;
                    ccVar.l = 1;
                    return ccVar;
                }
                if (a(context, new c.a().a(g).a(false).b(ax).a())) {
                    ccVar.m = true;
                    ccVar.l = 2;
                }
            }
            return ccVar;
        }
        ccVar.p = true;
        return ccVar;
    }

    public static boolean a(Context context, String str, w wVar, x xVar) {
        return b(context, str, wVar, xVar).a() == 0;
    }

    public static d b(Context context, String str, w wVar, x xVar) {
        if (a(str, xVar != null ? xVar.o : null)) {
            com.anythink.core.common.u.e.a(wVar, xVar, 1, false, 0, "");
            if (wVar != null && TextUtils.isEmpty(wVar.H())) {
                com.anythink.core.common.u.e.b(wVar, xVar, 2);
            }
            return new d.a().a(4).a();
        }
        d b2 = b(context, str, wVar != null ? wVar.ax() : "");
        if (b2.a() != 0 && wVar != null && TextUtils.isEmpty(wVar.H())) {
            com.anythink.core.common.u.e.b(wVar, xVar, 1);
        }
        return b2;
    }

    public static boolean a(String str, y yVar) {
        List<String> bz;
        if (!TextUtils.isEmpty(str) && yVar != null && (bz = yVar.bz()) != null && !bz.isEmpty()) {
            for (int i = 0; i < bz.size(); i++) {
                String str2 = bz.get(i);
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    ab.a("OfferUrlHandler", "needFilterDeeplinkByScheme url:" + str + ",and scheme:" + str2);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context, String str, String str2) {
        return b(context, str, str2).a() == 0;
    }

    private static d b(Context context, String str, String str2) {
        if (c(str)) {
            return b(context, new c.a().a(g(str)).a(true).b(str2).a());
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme != null && !scheme.startsWith("http")) {
            return b(context, new c.a().a(str).a(e(str)).b(str2).a());
        }
        return new d.a().a(2).a();
    }

    public static void b(String str) {
        com.anythink.core.common.v.y.a(str);
    }

    public static boolean c(String str) {
        Uri parse;
        try {
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && parse.getHost() != null) {
                if (parse.getHost().equals("play.google.com")) {
                    return true;
                }
                return parse.getHost().equals("market.android.com");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Uri.parse(str).getScheme().equals("market");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean e(String str) {
        t.b();
        if (!d(str)) {
            return false;
        }
        com.anythink.core.d.b b2 = com.anythink.core.d.d.a(t.b().g()).b(t.b().p());
        return (b2 == null || TextUtils.equals(b2.x(), "1")) && !TextUtils.isEmpty(m.p(t.b().g()));
    }

    private static String f(String str) {
        try {
            return "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String g(String str) {
        try {
            return "market://".concat(String.valueOf(str.substring(str.indexOf(c))));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a(Context context, c cVar) {
        return b(context, cVar).a() == 0;
    }

    private static d b(Context context, c cVar) {
        Intent intent;
        String str = "";
        int i = 1;
        ResolveInfo resolveInfo = null;
        try {
            Uri parse = Uri.parse(cVar.a());
            if (parse.getScheme().equals(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK)) {
                intent = Intent.parseUri(cVar.a(), 1);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
            } else if (parse.getScheme().equals("android-app")) {
                intent = Intent.parseUri(cVar.a(), 2);
                intent.setComponent(null);
                intent.setSelector(null);
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                intent2.setData(parse);
                intent = intent2;
            }
            if (TextUtils.isEmpty(intent.getPackage())) {
                if (cVar.b()) {
                    str = "com.android.vending";
                    intent.setPackage("com.android.vending");
                } else if (d(cVar.a())) {
                    str = a(context, intent, cVar.c());
                    if (!TextUtils.isEmpty(str)) {
                        intent.setPackage(str);
                    }
                }
            }
            intent.addFlags(268435456);
            resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
            context.startActivity(intent);
            i = 0;
        } catch (Throwable unused) {
            if (resolveInfo != null) {
                i = 3;
            }
        }
        return new d.a().a(i).a(str).a();
    }

    public static void a(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
            }
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public static boolean b(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            launchIntentForPackage.setFlags(268435456);
            context.startActivity(launchIntentForPackage);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(w wVar, x xVar) {
        if (wVar == null || xVar == null) {
            return false;
        }
        by R = t.b().R();
        boolean z = R.b() == 1;
        boolean z2 = R.a() == 1;
        String m = m.m();
        if (TextUtils.isEmpty(m)) {
            com.anythink.core.common.u.e.a(xVar, wVar, 5);
            return false;
        }
        if (!z) {
            com.anythink.core.common.u.e.a(xVar, wVar, 3);
            return false;
        }
        if (!z2) {
            com.anythink.core.common.u.e.a(xVar, wVar, 1);
            return false;
        }
        String k = wVar.k();
        String l = wVar.l();
        if (TextUtils.isEmpty(k) || TextUtils.isEmpty(l)) {
            com.anythink.core.common.u.e.a(xVar, wVar, 4);
            return false;
        }
        try {
            Object d2 = m.d(m);
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
            Object newInstance = cls.newInstance();
            cls.getField("userName").set(newInstance, k);
            cls.getField("path").set(newInstance, l);
            cls.getField("miniprogramType").set(newInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(d2, newInstance);
            com.anythink.core.common.u.e.a(xVar, wVar, 0);
            return true;
        } catch (Throwable th) {
            th.getMessage();
            com.anythink.core.common.u.e.a(xVar, wVar, 2);
            return false;
        }
    }

    private static String a(Context context, Intent intent, String str) {
        if (context == null || intent == null || !com.anythink.core.d.d.a(t.b().g()).b(t.b().p()).aZ()) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            s c2 = t.b().c();
            if (c2 != null) {
                str = c2.getDefaultMarketSchemePackageName();
            } else {
                t.b();
                str = "com.android.vending";
            }
        }
        List<ResolveInfo> a2 = com.anythink.core.common.v.y.a(context, intent);
        if (a2 == null || a2.size() <= 1) {
            return "";
        }
        String str2 = a2.get(0).activityInfo.packageName;
        for (int i = 0; i < a2.size(); i++) {
            String str3 = a2.get(i).activityInfo.packageName;
            if (TextUtils.equals(str, a2.get(i).activityInfo.packageName)) {
                return str;
            }
        }
        return str2;
    }
}
