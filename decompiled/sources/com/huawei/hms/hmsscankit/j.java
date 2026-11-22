package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import java.lang.reflect.InvocationTargetException;

/* compiled from: RemoteViewInitializer.java */
/* loaded from: classes14.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Context f10448a;

    public static void a(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        context.getClassLoader().loadClass("com.huawei.hms.feature.DynamicModuleInitializer").getDeclaredMethod("initializeModule", Context.class).invoke(null, context);
    }

    static IRemoteCreator b(Context context) {
        Context d;
        Preconditions.checkNotNull(context);
        try {
            d = d(context);
        } catch (ClassNotFoundException unused) {
            com.huawei.hms.scankit.util.a.b("exception", "ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            com.huawei.hms.scankit.util.a.b("exception", "IllegalAccessException");
        } catch (InstantiationException unused3) {
            com.huawei.hms.scankit.util.a.b("exception", "InstantiationException");
        } catch (NoSuchMethodException unused4) {
            com.huawei.hms.scankit.util.a.b("exception", "NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            com.huawei.hms.scankit.util.a.b("exception", "InvocationTargetException");
        }
        if (d == null) {
            return null;
        }
        Object newInstance = d.getClassLoader().loadClass("com.huawei.hms.scankit.Creator").newInstance();
        if (newInstance instanceof IBinder) {
            return IRemoteCreator.Stub.asInterface((IBinder) newInstance);
        }
        return null;
    }

    static IRemoteCreator c(Context context) {
        Preconditions.checkNotNull(context);
        try {
            Object newInstance = context.getClassLoader().loadClass("com.huawei.hms.scankit.Creator").newInstance();
            if (newInstance instanceof IBinder) {
                return IRemoteCreator.Stub.asInterface((IBinder) newInstance);
            }
            return null;
        } catch (ClassNotFoundException unused) {
            com.huawei.hms.scankit.util.a.b("exception", "ClassNotFoundException");
            return null;
        } catch (IllegalAccessException unused2) {
            com.huawei.hms.scankit.util.a.b("exception", "IllegalAccessException");
            return null;
        } catch (InstantiationException unused3) {
            com.huawei.hms.scankit.util.a.b("exception", "InvocationTargetException");
            return null;
        }
    }

    public static Context d(Context context) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Log.i("ScankitSDK", "ScankitSDK Version: SCANPLUS2.6.0.300");
        a(context);
        if (f10448a != null) {
            Log.i("ScankitSDK", "context has been inited");
            return f10448a;
        }
        try {
            int remoteVersion = DynamicModule.getRemoteVersion(context.getApplicationContext(), "huawei_module_scankit");
            int e = e(context);
            if (e > remoteVersion) {
                Log.i("ScankitSDK", "local Version is Higher" + e);
                a(context);
                return context;
            }
            Log.i("ScankitSDK", "use remote scankit" + remoteVersion);
            f10448a = DynamicModule.load(context.getApplicationContext(), DynamicModule.PREFER_REMOTE, "huawei_module_scankit").getModuleContext();
            return f10448a;
        } catch (DynamicModule.LoadingException unused) {
            a(context);
            Log.w("ScankitSDK", "Remote Load exception");
            return context;
        } catch (ClassNotFoundException unused2) {
            Log.e("ScankitSDK", "ClassNotFoundException exception");
            a(context);
            return context;
        } catch (IllegalAccessException unused3) {
            Log.e("ScankitSDK", "IllegalAccessException exception");
            a(context);
            return context;
        } catch (NoSuchMethodException unused4) {
            Log.e("ScankitSDK", "NoSuchMethodException exception");
            a(context);
            return context;
        } catch (RuntimeException unused5) {
            Log.e("ScankitSDK", "other RuntimeException exception");
            a(context);
            return context;
        } catch (InvocationTargetException unused6) {
            Log.e("ScankitSDK", "InvocationTargetException exception");
            a(context);
            return context;
        } catch (Exception unused7) {
            Log.e("ScankitSDK", "Exception exception");
            a(context);
            return context;
        } catch (Throwable unused8) {
            Log.e("ScankitSDK", "Throwable exception");
            a(context);
            return context;
        }
    }

    private static int e(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("huawei_module_scankit_local", Integer.MAX_VALUE);
        } catch (PackageManager.NameNotFoundException unused) {
            com.huawei.hms.scankit.util.a.b("exception", "NameNotFoundException");
            return Integer.MAX_VALUE;
        }
    }
}
