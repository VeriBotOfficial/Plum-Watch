package com.bykv.vk.openvk.preload.geckox.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: AppUtils.java */
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f9215a;

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            GeckoLogger.w("gecko-debug-tag", "getVersion:", e);
            return AbstractJsonLexerKt.NULL;
        }
    }

    public static String b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            if (applicationInfo == null) {
                return "";
            }
            return applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            GeckoLogger.w("gecko-debug-tag", "getApplicationName:", th);
            return "";
        }
    }

    public static String a() {
        if (!TextUtils.isEmpty(f9215a)) {
            return f9215a;
        }
        String b = b();
        f9215a = b;
        if (!TextUtils.isEmpty(b)) {
            return f9215a;
        }
        String c = c();
        f9215a = c;
        if (!TextUtils.isEmpty(c)) {
            return f9215a;
        }
        return f9215a;
    }

    private static String b() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String c() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public static void a(Throwable th) {
        GeckoLogger.w("gecko-debug-tag", "throwIfDebug:", th);
    }
}
