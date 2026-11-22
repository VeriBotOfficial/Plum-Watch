package com.alipay.sdk.m.y;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.core.app.ActivityCompat;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public class j {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static String f1486a = "0";
        public static String b = "1";
        public static String c = "2";
        public static String d = "3";
    }

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        String str = a.f1486a;
        if (context != null && (activeNetworkInfo = (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return a.b;
            }
            if (type == 1) {
                str = a.c;
                try {
                    boolean z = 1 != ((TelephonyManager) context.getSystemService("phone")).getSimState();
                    boolean z2 = ActivityCompat.checkSelfPermission(context, "android.permission.CHANGE_NETWORK_STATE") == 0;
                    Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Boolean bool = (Boolean) declaredMethod.invoke(connectivityManager, new Object[0]);
                    if (z && z2 && bool.booleanValue()) {
                        return a.d;
                    }
                } catch (Throwable th) {
                    g.a(th);
                }
            }
        }
        return str;
    }
}
