package com.vivo.push.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Utility.java */
/* loaded from: classes2.dex */
public final class ah {
    private static String[] b;

    /* renamed from: a, reason: collision with root package name */
    private static String[] f14152a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};
    private static String[] c = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};
    private static String[] d = {"com.vivo.push.sdk.RegistrationReceiver"};
    private static String[] e = new String[0];
    private static Map<String, Bundle> f = new ConcurrentHashMap();

    public static long a(Context context) {
        String a2 = aa.a(context);
        if (TextUtils.isEmpty(a2)) {
            t.a("Utility", "systemPushPkgName is null");
            return -1L;
        }
        return a(context, a2);
    }

    public static long a(Context context, String str) {
        Object a2 = a(context, str, "com.vivo.push.sdk_version");
        if (a2 == null) {
            a2 = a(context, str, "sdk_version");
        }
        if (a2 == null) {
            t.a("Utility", "getSdkVersionCode sdk version is null");
            return -1L;
        }
        try {
            return Long.parseLong(a2.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
            t.a("Utility", "getSdkVersionCode error ", e2);
            return -1L;
        }
    }

    public static String b(Context context, String str) {
        Object a2 = a(context, str, "verification_status");
        if (a2 != null) {
            return a2.toString();
        }
        return "";
    }

    public static Object a(Context context, String str, String str2) {
        Bundle bundle;
        if (context != null && str2 != null && !TextUtils.isEmpty(str)) {
            try {
                Map<String, Bundle> map = f;
                Object obj = (map == null || map.size() <= 0 || (bundle = f.get(str)) == null) ? null : bundle.get(str2);
                if (obj != null) {
                    return obj;
                }
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                    r0 = applicationInfo != null ? applicationInfo.metaData : null;
                    Object obj2 = r0 != null ? r0.get(str2) : obj;
                    try {
                        if (f.size() <= 300) {
                            f.put(str, r0);
                        }
                        return obj2;
                    } catch (Exception e2) {
                        r0 = obj2;
                        e = e2;
                        t.a("Utility", "getMetaValue::".concat(String.valueOf(e)));
                        return r0;
                    }
                } catch (Exception e3) {
                    e = e3;
                    r0 = obj;
                }
            } catch (Exception e4) {
                e = e4;
            }
        }
        return r0;
    }

    public static Object a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
    
        r13 = r13 + 1;
        r8 = r16;
        r7 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r18) throws com.vivo.push.util.VivoPushException {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.b(android.content.Context):void");
    }

    private static void a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (!componentInfo.enabled) {
                    throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
                }
                a(componentInfo, str2);
                return;
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    private static void a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (componentInfo.applicationInfo.packageName.equals(str)) {
            return;
        }
        for (String str2 : f14152a) {
            if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
            }
        }
    }

    public static String b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (r3 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0091, code lost:
    
        if (r3 != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[Catch: Exception -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00aa, blocks: (B:58:0x008e, B:40:0x0093, B:37:0x00a4), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5 A[Catch: Exception -> 0x00b8, TRY_LEAVE, TryCatch #6 {Exception -> 0x00b8, blocks: (B:54:0x00b0, B:47:0x00b5), top: B:53:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.PublicKey c(android.content.Context r10) {
        /*
            r1 = 0
            android.content.ContentResolver r0 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            android.net.Uri r2 = com.vivo.push.x.f14168a     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            android.content.ContentProviderClient r3 = r0.acquireUnstableContentProviderClient(r2)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.String r0 = "Utility"
            if (r3 == 0) goto L28
            java.lang.String r2 = "client is null"
            com.vivo.push.util.t.a(r0, r2)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            android.net.Uri r4 = com.vivo.push.x.f14168a     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L23
            goto L29
        L1f:
            r0 = move-exception
            r10 = r0
            goto Lae
        L23:
            r0 = move-exception
            r10 = r0
            r2 = r1
            goto L9f
        L28:
            r2 = r1
        L29:
            if (r2 != 0) goto L3d
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            android.net.Uri r5 = com.vivo.push.x.f14168a     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            goto L3d
        L3a:
            r0 = move-exception
            r10 = r0
            goto L9f
        L3d:
            if (r2 != 0) goto L4a
            if (r2 == 0) goto L44
            r2.close()     // Catch: java.lang.Exception -> L49
        L44:
            if (r3 == 0) goto L49
            r3.close()     // Catch: java.lang.Exception -> L49
        L49:
            return r1
        L4a:
            boolean r10 = r2.moveToNext()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            if (r10 == 0) goto L8c
            java.lang.String r10 = "pushkey"
            java.lang.String r4 = "name"
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            boolean r10 = r10.equals(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            if (r10 == 0) goto L4a
            java.lang.String r10 = "value"
            int r10 = r2.getColumnIndex(r10)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            java.lang.String r10 = r2.getString(r10)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            java.lang.String r4 = "result key : "
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            com.vivo.push.util.t.d(r0, r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            java.security.PublicKey r10 = com.vivo.push.util.ab.a(r10)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> Lab
            if (r2 == 0) goto L86
            r2.close()     // Catch: java.lang.Exception -> L8b
        L86:
            if (r3 == 0) goto L8b
            r3.close()     // Catch: java.lang.Exception -> L8b
        L8b:
            return r10
        L8c:
            if (r2 == 0) goto L91
            r2.close()     // Catch: java.lang.Exception -> Laa
        L91:
            if (r3 == 0) goto Laa
        L93:
            r3.close()     // Catch: java.lang.Exception -> Laa
            goto Laa
        L97:
            r0 = move-exception
            r10 = r0
            r3 = r1
            goto Lae
        L9b:
            r0 = move-exception
            r10 = r0
            r2 = r1
            r3 = r2
        L9f:
            r10.printStackTrace()     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto La7
            r2.close()     // Catch: java.lang.Exception -> Laa
        La7:
            if (r3 == 0) goto Laa
            goto L93
        Laa:
            return r1
        Lab:
            r0 = move-exception
            r10 = r0
            r1 = r2
        Lae:
            if (r1 == 0) goto Lb3
            r1.close()     // Catch: java.lang.Exception -> Lb8
        Lb3:
            if (r3 == 0) goto Lb8
            r3.close()     // Catch: java.lang.Exception -> Lb8
        Lb8:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.c(android.content.Context):java.security.PublicKey");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2 A[Catch: Exception -> 0x00de, TRY_LEAVE, TryCatch #0 {Exception -> 0x00de, blocks: (B:69:0x00da, B:60:0x00e2), top: B:68:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.d(android.content.Context):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2 A[Catch: Exception -> 0x00ce, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:68:0x00ca, B:59:0x00d2), top: B:67:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r19, java.lang.String r20, java.lang.String r21, long r22) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.a(android.content.Context, java.lang.String, java.lang.String, long):boolean");
    }

    public static boolean a(Context context, String str, boolean z) {
        Cursor a2;
        Cursor cursor = null;
        try {
            try {
                try {
                    Uri uri = com.vivo.push.x.e;
                    String[] strArr = new String[2];
                    strArr[0] = str;
                    strArr[1] = z ? "1" : "0";
                    a2 = a(uri, "appPkgName = ? and agreePrivacyStatement = ? ", strArr, context);
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            cursor.close();
                        } catch (Exception e2) {
                            t.a("Utility", "close", e2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                t.a("Utility", "syncAgreePrivacyStatement", e3);
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (Exception e4) {
            t.a("Utility", "close", e4);
        }
        if (a2 == null) {
            t.a("Utility", "cursor is null");
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception e5) {
                    t.a("Utility", "close", e5);
                }
            }
            return false;
        }
        if (!a2.moveToFirst()) {
            if (a2 != null) {
                a2.close();
            }
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(a2.getString(a2.getColumnIndex("agreePrivacyStatement")));
        if (a2 != null) {
            try {
                a2.close();
                return parseBoolean;
            } catch (Exception e6) {
                t.a("Utility", "close", e6);
            }
        }
        return parseBoolean;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0079: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:43:0x0078 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.database.Cursor a(android.net.Uri r11, java.lang.String r12, java.lang.String[] r13, android.content.Context r14) {
        /*
            java.lang.String r1 = "close"
            java.lang.String r2 = "Utility"
            r3 = 0
            if (r14 != 0) goto L15
            java.lang.String r11 = "context is null"
            com.vivo.push.util.t.a(r2, r11)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L11
            return r3
        Ld:
            r0 = move-exception
            r11 = r0
            goto L7a
        L11:
            r0 = move-exception
            r11 = r0
            r4 = r3
            goto L65
        L15:
            android.content.ContentResolver r0 = r14.getContentResolver()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L11
            android.content.ContentProviderClient r4 = r0.acquireUnstableContentProviderClient(r11)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L11
            if (r4 == 0) goto L2e
            java.lang.String r0 = "client is null"
            com.vivo.push.util.t.a(r2, r0)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L77
            r6 = 0
            r9 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L77
            goto L32
        L2e:
            r5 = r11
            r7 = r12
            r8 = r13
            r11 = r3
        L32:
            if (r11 != 0) goto L46
            android.content.ContentResolver r11 = r14.getContentResolver()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L77
            r9 = r8
            r8 = r7
            r7 = 0
            r10 = 0
            r6 = r5
            r5 = r11
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L77
            goto L46
        L43:
            r0 = move-exception
            r11 = r0
            goto L65
        L46:
            if (r11 != 0) goto L59
            java.lang.String r11 = "cursor is null"
            com.vivo.push.util.t.a(r2, r11)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L77
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.lang.Exception -> L53
            goto L58
        L53:
            r0 = move-exception
            r11 = r0
            com.vivo.push.util.t.a(r2, r1, r11)
        L58:
            return r3
        L59:
            if (r4 == 0) goto L64
            r4.close()     // Catch: java.lang.Exception -> L5f
            return r11
        L5f:
            r0 = move-exception
            r12 = r0
            com.vivo.push.util.t.a(r2, r1, r12)
        L64:
            return r11
        L65:
            java.lang.String r12 = "queryContentResolver"
            com.vivo.push.util.t.a(r2, r12, r11)     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L76
            r4.close()     // Catch: java.lang.Exception -> L71
            goto L76
        L71:
            r0 = move-exception
            r11 = r0
            com.vivo.push.util.t.a(r2, r1, r11)
        L76:
            return r3
        L77:
            r0 = move-exception
            r11 = r0
            r3 = r4
        L7a:
            if (r3 == 0) goto L85
            r3.close()     // Catch: java.lang.Exception -> L80
            goto L85
        L80:
            r0 = move-exception
            r12 = r0
            com.vivo.push.util.t.a(r2, r1, r12)
        L85:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.a(android.net.Uri, java.lang.String, java.lang.String[], android.content.Context):android.database.Cursor");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int d(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "Utility"
            r1 = 0
            if (r3 == 0) goto L47
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto Lc
            goto L47
        Lc:
            java.lang.String r2 = "sdk_version_vivo"
            java.lang.Object r3 = a(r3, r4, r2)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L1c
            java.lang.String r3 = (java.lang.String) r3
        L19:
            r4 = r3
            r3 = r1
            goto L30
        L1c:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L29
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r4 = ""
            goto L30
        L29:
            if (r3 == 0) goto L46
            java.lang.String r3 = r3.toString()
            goto L19
        L30:
            if (r3 <= 0) goto L33
            return r3
        L33:
            int r3 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L38
            return r3
        L38:
            r3 = move-exception
            java.lang.String r4 = "getClientSdkVersion: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r4.concat(r3)
            com.vivo.push.util.t.a(r0, r3)
        L46:
            return r1
        L47:
            java.lang.String r3 = "getClientSdkVersion() error, context is null or pkgName is empty"
            com.vivo.push.util.t.a(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ah.d(android.content.Context, java.lang.String):int");
    }

    public static int c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            t.a("Utility", "getClientSdkVersionCode() error, context is null or pkgName is empty");
            return 0;
        }
        int a2 = (int) a(context, str);
        return a2 <= 0 ? d(context, str) : a2;
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.size() <= 0;
    }
}
