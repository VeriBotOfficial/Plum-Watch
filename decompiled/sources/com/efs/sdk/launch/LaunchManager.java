package com.efs.sdk.launch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;

/* loaded from: classes14.dex */
public class LaunchManager {
    public static final String APP_ATTACH_BASE_CONTEXT = "app_attachBaseContext";
    public static final String APP_CONSTRUCT = "app_<init>";
    public static final String APP_ON_CREATE = "app_onCreate";
    public static final String PAGE_ON_CREATE = "page_onCreate";
    public static final String PAGE_ON_RESUME = "page_onResume";
    public static final String PAGE_ON_RE_START = "page_onReStart";
    public static final String PAGE_ON_START = "page_onStart";
    public static final String PAGE_ON_STOP = "page_onStop";
    public static final String PAGE_ON_WINDOW = "page_on_window";

    /* renamed from: a, reason: collision with root package name */
    private static LaunchConfigManager f9658a = null;
    private static Context b = null;
    private static EfsReporter c = null;
    private static boolean d = false;
    public static boolean isDebug = true;

    static /* synthetic */ boolean a() {
        d = true;
        return true;
    }

    public static LaunchConfigManager getLaunchConfigManager() {
        return f9658a;
    }

    public static EfsReporter getReporter() {
        return c;
    }

    public static void init(Context context, final EfsReporter efsReporter) {
        String str;
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    str = "init launch manager error! parameter is null!";
                    Log.e("LaunchManager", str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        final Context applicationContext = context.getApplicationContext();
        if (c.e(applicationContext)) {
            if (!isInit()) {
                b = context.getApplicationContext();
                c = efsReporter;
                a.a(new Runnable() { // from class: com.efs.sdk.launch.LaunchManager.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            LaunchConfigManager unused = LaunchManager.f9658a = new LaunchConfigManager(applicationContext, efsReporter);
                            LaunchManager.a();
                            if (LaunchManager.getLaunchConfigManager() == null || !LaunchManager.getLaunchConfigManager().enableTracer()) {
                                return;
                            }
                            b.a(applicationContext, (String) null);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                });
                return;
            } else if (!isDebug) {
                return;
            } else {
                str = "invalid init ！";
            }
        } else if (!isDebug) {
            return;
        } else {
            str = "Non main process !";
        }
        Log.e("LaunchManager", str);
    }

    public static boolean isInit() {
        return d;
    }

    public static void onTraceApp(Application application, String str, boolean z) {
        String str2;
        if (application != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (str.equals(APP_ATTACH_BASE_CONTEXT) || Looper.getMainLooper() == Looper.myLooper()) {
                        b.a(str, z);
                        return;
                    } else {
                        if (isDebug) {
                            str2 = "Non main thread ！";
                            Log.e("LaunchManager", str2);
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            str2 = "--->>> onTrace parameter is Illegal !";
            Log.e("LaunchManager", str2);
        }
    }

    public static void onTraceBegin(Context context, String str, long j) {
        String str2;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    context.getApplicationContext();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        if (!isDebug) {
                            return;
                        } else {
                            str2 = "Non main thread ！";
                        }
                    } else if (str.length() <= 10) {
                        b.a(str, j);
                        return;
                    } else if (!isDebug) {
                        return;
                    } else {
                        str2 = "--->>> method name over length !";
                    }
                    Log.e("LaunchManager", str2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            str2 = "--->>> onTraceBegin parameter is Illegal !";
            Log.e("LaunchManager", str2);
        }
    }

    public static void onTraceEnd(Context context, String str, long j) {
        String str2;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    context.getApplicationContext();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        if (!isDebug) {
                            return;
                        } else {
                            str2 = "Non main thread ！";
                        }
                    } else if (str.length() <= 10) {
                        b.b(str, j);
                        return;
                    } else if (!isDebug) {
                        return;
                    } else {
                        str2 = "--->>> method name over length !";
                    }
                    Log.e("LaunchManager", str2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            str2 = "--->>> onTraceBegin parameter is Illegal !";
            Log.e("LaunchManager", str2);
        }
    }

    public static void onTracePage(Activity activity, String str, boolean z) {
        String str2;
        if (activity != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    activity.getApplicationContext();
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        b.a(activity, str, z);
                        return;
                    } else {
                        if (isDebug) {
                            str2 = "Non main thread ！";
                            Log.e("LaunchManager", str2);
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            str2 = "--->>> onTrace parameter is Illegal !";
            Log.e("LaunchManager", str2);
        }
    }

    public static void sendLaunchCache(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.a(context, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
