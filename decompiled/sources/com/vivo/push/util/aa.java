package com.vivo.push.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: PushPackageUtils.java */
/* loaded from: classes2.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f14147a;
    private static String b;

    public static com.vivo.push.model.a a(Context context, com.vivo.push.restructure.b.b bVar) {
        com.vivo.push.model.a aVar;
        com.vivo.push.model.a e;
        Context applicationContext = ContextDelegate.getContext(context).getApplicationContext();
        com.vivo.push.model.a c = c(applicationContext);
        if (c != null) {
            t.d("PushPackageUtils", "get system push info :".concat(String.valueOf(c)));
            return c;
        }
        List<String> a2 = bVar.a(applicationContext);
        com.vivo.push.model.a e2 = e(applicationContext, applicationContext.getPackageName());
        if (a2 == null || a2.size() <= 0) {
            if (e2 != null && e2.d()) {
                c = e2;
            }
            t.a("PushPackageUtils", "findAllPushPackages error: find no package!");
            e2 = c;
        } else {
            com.vivo.push.model.a aVar2 = null;
            String a3 = af.b(applicationContext).a("com.vivo.push.cur_pkg", null);
            if (TextUtils.isEmpty(a3) || !a(applicationContext, a3, "com.vivo.pushservice.action.METHOD") || (aVar = e(applicationContext, a3)) == null || !aVar.d()) {
                aVar = null;
            }
            if (e2 == null || !e2.d()) {
                e2 = null;
            }
            if (aVar == null) {
                aVar = null;
            }
            if (e2 == null || (aVar != null && (!e2.c() ? !(aVar.c() || e2.b() > aVar.b()) : !(aVar.c() && e2.b() > aVar.b())))) {
                e2 = aVar;
            }
            HashMap hashMap = new HashMap();
            if (e2 == null) {
                e2 = null;
            } else if (e2.c()) {
                aVar2 = e2;
                e2 = null;
            }
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                String str = a2.get(i);
                if (!TextUtils.isEmpty(str) && (e = e(applicationContext, str)) != null) {
                    hashMap.put(str, e);
                    if (e.d()) {
                        if (e.c()) {
                            if (aVar2 == null || e.b() > aVar2.b()) {
                                aVar2 = e;
                            }
                        } else if (e2 == null || e.b() > e2.b()) {
                            e2 = e;
                        }
                    }
                }
            }
            if (e2 == null) {
                t.d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                e2 = aVar2;
            }
        }
        if (e2 != null) {
            if (e2.c()) {
                t.a(applicationContext, "查找最优包为:" + e2.a() + Separators.LPAREN + e2.b() + ", Black)");
                t.d("PushPackageUtils", "finSuitablePushPackage" + e2.a() + Separators.LPAREN + e2.b() + ", Black)");
                return e2;
            }
            t.a(applicationContext, "查找最优包为:" + e2.a() + Separators.LPAREN + e2.b() + Separators.RPAREN);
            t.d("PushPackageUtils", "finSuitablePushPackage" + e2.a() + Separators.LPAREN + e2.b() + Separators.RPAREN);
            return e2;
        }
        t.b(applicationContext, "查找最优包为空!");
        t.d("PushPackageUtils", "finSuitablePushPackage is null");
        return e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0104 A[Catch: Exception -> 0x00e4, TRY_ENTER, TryCatch #8 {Exception -> 0x00e4, blocks: (B:92:0x00e0, B:94:0x00e9, B:30:0x0104, B:32:0x0109), top: B:7:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109 A[Catch: Exception -> 0x00e4, TRY_LEAVE, TryCatch #8 {Exception -> 0x00e4, blocks: (B:92:0x00e0, B:94:0x00e9, B:30:0x0104, B:32:0x0109), top: B:7:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119 A[Catch: Exception -> 0x0115, TRY_LEAVE, TryCatch #7 {Exception -> 0x0115, blocks: (B:48:0x0111, B:39:0x0119), top: B:47:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.aa.a(android.content.Context):java.lang.String");
    }

    private static com.vivo.push.model.a c(Context context) {
        String a2 = a(context);
        ApplicationInfo applicationInfo = null;
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        com.vivo.push.model.a aVar = new com.vivo.push.model.a(a2);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a2, 128);
            if (packageInfo != null) {
                aVar.a(packageInfo.versionCode);
                aVar.a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                aVar.a(ah.a(context, a2));
            }
            aVar.a(a(context, a2));
            return aVar;
        } catch (Exception e) {
            e.printStackTrace();
            t.b("PushPackageUtils", "PackageManager NameNotFoundException is null", e);
            return null;
        }
    }

    private static com.vivo.push.model.a e(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(str) && (a(context, str, "com.vivo.pushservice.action.METHOD") || a(context, str, "com.vivo.pushservice.action.RECEIVE"))) {
            com.vivo.push.model.a aVar = new com.vivo.push.model.a(str);
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                if (packageInfo != null) {
                    aVar.a(packageInfo.versionCode);
                    aVar.a(packageInfo.versionName);
                    applicationInfo = packageInfo.applicationInfo;
                } else {
                    applicationInfo = null;
                }
                if (applicationInfo != null) {
                    aVar.a(ah.a(context, str));
                }
                aVar.a(a(context, str));
                return aVar;
            } catch (Exception e) {
                t.a("PushPackageUtils", "getPushPackageInfo exception: ", e);
            }
        }
        return null;
    }

    public static boolean a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(str);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                t.a("PushPackageUtils", "isEnablePush error: can not find push service.");
            } else {
                int size = queryIntentServices.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = queryIntentServices.get(i);
                    if (resolveInfo != null && resolveInfo.serviceInfo != null) {
                        String str2 = resolveInfo.serviceInfo.name;
                        boolean z2 = resolveInfo.serviceInfo.exported;
                        if ("com.vivo.push.sdk.service.PushService".equals(str2) && z2) {
                            boolean z3 = resolveInfo.serviceInfo.enabled;
                            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(str, "com.vivo.push.sdk.service.PushService"));
                            z = componentEnabledSetting == 1 || (componentEnabledSetting == 0 && z3);
                        }
                    }
                }
                return z;
            }
        }
        return false;
    }

    private static boolean a(Context context, String str, String str2) {
        List<ResolveInfo> list;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        return list != null && list.size() > 0;
    }

    public static boolean c(Context context, String str) {
        return a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    public static boolean d(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    private static String f(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                byte[] digest = MessageDigest.getInstance("SHA256").digest(signatureArr[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b2 : digest) {
                    String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                    if (upperCase.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(upperCase);
                }
                return stringBuffer.toString();
            } catch (Exception e) {
                t.a("PushPackageUtils", " getSignatureSHA exception ".concat(String.valueOf(e)));
            }
        }
        return null;
    }

    public static boolean b(Context context) {
        ProviderInfo resolveContentProvider;
        Boolean bool = f14147a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = null;
        if (context != null && !TextUtils.isEmpty("com.vivo.push.sdk.service.SystemPushConfig") && (resolveContentProvider = context.getPackageManager().resolveContentProvider("com.vivo.push.sdk.service.SystemPushConfig", 128)) != null) {
            str = resolveContentProvider.packageName;
        }
        Boolean valueOf = Boolean.valueOf("BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02".equals(f(context, str)));
        f14147a = valueOf;
        return valueOf.booleanValue();
    }

    public static int b(Context context, String str) {
        int i = a(context, str, "com.vivo.pushservice.action.RECEIVE") ? 0 : -1;
        if (a(context, str, "com.vivo.pushclient.action.RECEIVE")) {
            return 1;
        }
        return i;
    }
}
