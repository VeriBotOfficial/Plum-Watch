package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static p f14799a;

    /* renamed from: a, reason: collision with other field name */
    private static a f1085a;

    public interface a {
        void a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized p m12475a(Context context) {
        synchronized (q.class) {
            p pVar = f14799a;
            if (pVar != null) {
                return pVar;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
            String string = sharedPreferences.getString(CommonUrlParts.UUID, null);
            String string2 = sharedPreferences.getString("token", null);
            String string3 = sharedPreferences.getString("security", null);
            String string4 = sharedPreferences.getString("app_id", null);
            String string5 = sharedPreferences.getString("app_token", null);
            String string6 = sharedPreferences.getString("package_name", null);
            int i = sharedPreferences.getInt("env_type", 1);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return null;
            }
            p pVar2 = new p(string, string2, string3, string4, string5, string6, i);
            f14799a = pVar2;
            return pVar2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:3|4|(2:8|(24:10|11|(1:13)(1:117)|14|(1:16)(1:116)|17|(1:19)(1:115)|20|21|22|23|(1:25)(1:111)|26|(6:28|(1:30)|31|(1:35)|36|(1:38))|39|(1:41)|42|(6:45|46|47|49|50|43)|54|55|(3:60|61|(2:63|64)(9:(1:67)|68|69|(2:73|(4:75|76|77|(7:79|(1:81)|82|83|84|85|86)(6:88|89|(1:93)|94|95|96)))|106|(2:91|93)|94|95|96))|110|61|(0)(0)))|118|11|(0)(0)|14|(0)(0)|17|(0)(0)|20|21|22|23|(0)(0)|26|(0)|39|(0)|42|(1:43)|54|55|(4:57|60|61|(0)(0))|110|61|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0086, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0087, code lost:
    
        com.xiaomi.channel.commonutils.logger.b.a(r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[Catch: all -> 0x0348, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003a, B:11:0x0046, B:14:0x0059, B:17:0x0065, B:20:0x0071, B:22:0x007b, B:25:0x008f, B:26:0x0098, B:28:0x00c2, B:30:0x00ce, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0106, B:38:0x010c, B:39:0x0111, B:41:0x0139, B:42:0x0142, B:43:0x017b, B:45:0x0181, B:47:0x0188, B:52:0x0197, B:55:0x01ce, B:57:0x01ee, B:60:0x01f5, B:61:0x020e, B:69:0x021d, B:71:0x023c, B:73:0x0242, B:101:0x0300, B:91:0x0333, B:93:0x0339, B:94:0x0341, B:99:0x0319, B:109:0x0223, B:114:0x0087), top: B:3:0x0007, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2 A[Catch: all -> 0x0348, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003a, B:11:0x0046, B:14:0x0059, B:17:0x0065, B:20:0x0071, B:22:0x007b, B:25:0x008f, B:26:0x0098, B:28:0x00c2, B:30:0x00ce, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0106, B:38:0x010c, B:39:0x0111, B:41:0x0139, B:42:0x0142, B:43:0x017b, B:45:0x0181, B:47:0x0188, B:52:0x0197, B:55:0x01ce, B:57:0x01ee, B:60:0x01f5, B:61:0x020e, B:69:0x021d, B:71:0x023c, B:73:0x0242, B:101:0x0300, B:91:0x0333, B:93:0x0339, B:94:0x0341, B:99:0x0319, B:109:0x0223, B:114:0x0087), top: B:3:0x0007, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139 A[Catch: all -> 0x0348, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003a, B:11:0x0046, B:14:0x0059, B:17:0x0065, B:20:0x0071, B:22:0x007b, B:25:0x008f, B:26:0x0098, B:28:0x00c2, B:30:0x00ce, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0106, B:38:0x010c, B:39:0x0111, B:41:0x0139, B:42:0x0142, B:43:0x017b, B:45:0x0181, B:47:0x0188, B:52:0x0197, B:55:0x01ce, B:57:0x01ee, B:60:0x01f5, B:61:0x020e, B:69:0x021d, B:71:0x023c, B:73:0x0242, B:101:0x0300, B:91:0x0333, B:93:0x0339, B:94:0x0341, B:99:0x0319, B:109:0x0223, B:114:0x0087), top: B:3:0x0007, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0181 A[Catch: all -> 0x0348, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003a, B:11:0x0046, B:14:0x0059, B:17:0x0065, B:20:0x0071, B:22:0x007b, B:25:0x008f, B:26:0x0098, B:28:0x00c2, B:30:0x00ce, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0106, B:38:0x010c, B:39:0x0111, B:41:0x0139, B:42:0x0142, B:43:0x017b, B:45:0x0181, B:47:0x0188, B:52:0x0197, B:55:0x01ce, B:57:0x01ee, B:60:0x01f5, B:61:0x020e, B:69:0x021d, B:71:0x023c, B:73:0x0242, B:101:0x0300, B:91:0x0333, B:93:0x0339, B:94:0x0341, B:99:0x0319, B:109:0x0223, B:114:0x0087), top: B:3:0x0007, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0218 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0333 A[Catch: all -> 0x0348, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003a, B:11:0x0046, B:14:0x0059, B:17:0x0065, B:20:0x0071, B:22:0x007b, B:25:0x008f, B:26:0x0098, B:28:0x00c2, B:30:0x00ce, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0106, B:38:0x010c, B:39:0x0111, B:41:0x0139, B:42:0x0142, B:43:0x017b, B:45:0x0181, B:47:0x0188, B:52:0x0197, B:55:0x01ce, B:57:0x01ee, B:60:0x01f5, B:61:0x020e, B:69:0x021d, B:71:0x023c, B:73:0x0242, B:101:0x0300, B:91:0x0333, B:93:0x0339, B:94:0x0341, B:99:0x0319, B:109:0x0223, B:114:0x0087), top: B:3:0x0007, inners: #0, #3, #5 }] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.xiaomi.push.service.p a(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.q.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.p");
    }

    private static String a(Context context, boolean z) {
        String a2 = b.a(context).a();
        String str = z ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (com.xiaomi.push.y.b()) {
            return "http://10.38.162.35:9085".concat(str);
        }
        if (com.xiaomi.push.n.China.name().equals(a2)) {
            return "https://cn.register.xmpush.xiaomi.com".concat(str);
        }
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m12478a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    private static void a(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putInt("enc_req_fail_count", i);
        edit.commit();
    }

    private static int a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    public static void a(Context context, p pVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putString(CommonUrlParts.UUID, pVar.f1084a);
        edit.putString("security", pVar.c);
        edit.putString("token", pVar.b);
        edit.putString("app_id", pVar.d);
        edit.putString("package_name", pVar.f);
        edit.putString("app_token", pVar.e);
        edit.putInt("env_type", pVar.f14798a);
        edit.commit();
        a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m12477a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f14799a = null;
        a();
    }

    public static void a(a aVar) {
        f1085a = aVar;
    }

    public static void a() {
        a aVar = f1085a;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m12476a(Context context) {
        p m12475a = m12475a(context);
        if (m12475a == null || TextUtils.isEmpty(m12475a.f1084a)) {
            return null;
        }
        String[] split = m12475a.f1084a.split(Separators.AT);
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }
}
