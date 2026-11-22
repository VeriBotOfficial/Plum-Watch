package sg.bigo.ads.common.b;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f19562a = "";
    private static boolean b = true;

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f19562a) || !b) {
            return f19562a;
        }
        try {
            Class<?> cls = Class.forName("com.appsflyer.AppsFlyerLib");
            Object invoke = cls.getMethod("getAppsFlyerUID", Context.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), context);
            if (invoke instanceof String) {
                f19562a = (String) invoke;
            }
        } catch (Exception unused) {
            b = false;
        }
        return f19562a;
    }
}
