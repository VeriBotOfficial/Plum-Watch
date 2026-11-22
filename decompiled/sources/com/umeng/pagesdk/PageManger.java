package com.umeng.pagesdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import com.wakeup.module.record.Constants;

/* loaded from: classes2.dex */
public class PageManger {
    public static final String TAG = "PageManger";

    /* renamed from: a, reason: collision with root package name */
    private static Context f14015a = null;
    private static boolean b = false;
    private static EfsReporter c = null;
    private static PageConfigManger d = null;
    private static boolean e = true;
    private static float f = 0.0f;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
        return f14015a;
    }

    public static PageConfigManger getPageConfigManger() {
        return d;
    }

    public static float getRefreshRate() {
        return f;
    }

    public static EfsReporter getReporter() {
        return c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        String str;
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    str = "init page manager error! parameter is null!";
                    Log.e(TAG, str);
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isInit()) {
            if (isDebug) {
                str = "invalid init ！";
                Log.e(TAG, str);
                return;
            }
            return;
        }
        f14015a = context.getApplicationContext();
        c = efsReporter;
        d = new PageConfigManger(context, efsReporter);
        b = true;
    }

    public static boolean isControlMainThread() {
        return e;
    }

    public static boolean isInit() {
        return b;
    }

    public static void onTracePageBegin(Activity activity, String str) {
        try {
            onTracePageBegin(activity, str, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void onTracePageBegin(Activity activity, String str, boolean z) {
        String str2;
        if (activity != null) {
            try {
                if (activity.getClass() != null && activity.getClass().getName() != null && !TextUtils.isEmpty(str)) {
                    if (z || !(str.equals("onCreate") || str.equals(Constants.ON_START_KEY) || str.equals(_imp_adbrowser.ACTIVITY_RESUME) || str.equals(_imp_adbrowser.ACTIVITY_PAUSE))) {
                        if (str.length() <= 10) {
                            if (e && !e.a(activity.getApplicationContext()) && isDebug) {
                                Log.e(TAG, "tracePageBegin. Non main process !");
                            }
                            String name = activity.getClass().getName();
                            if (f <= 0.0f) {
                                f = (Build.VERSION.SDK_INT >= 30 ? activity.getDisplay() : activity.getWindowManager().getDefaultDisplay()).getRefreshRate();
                            }
                            d.a(name, str, z);
                            return;
                        }
                        if (!isDebug) {
                            return;
                        } else {
                            str2 = "tracePageBegin. method name is " + str + "method name over length !";
                        }
                    } else if (!isDebug) {
                        return;
                    } else {
                        str2 = "tracePageBegin. parameter illegality!";
                    }
                    Log.e(TAG, str2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            str2 = "tracePageBegin. parameter null!";
            Log.e(TAG, str2);
        }
    }

    public static void onTracePageEnd(Activity activity, String str) {
        try {
            onTracePageEnd(activity, str, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void onTracePageEnd(Activity activity, String str, boolean z) {
        String str2;
        if (activity != null) {
            try {
                if (activity.getClass() != null && activity.getClass().getName() != null && !TextUtils.isEmpty(str)) {
                    if (z || !(str.equals("onCreate") || str.equals(Constants.ON_START_KEY) || str.equals(_imp_adbrowser.ACTIVITY_RESUME) || str.equals(_imp_adbrowser.ACTIVITY_PAUSE))) {
                        if (str.length() <= 10) {
                            if (e && !e.a(activity.getApplicationContext()) && isDebug) {
                                Log.e(TAG, "tracePageBegin. Non main process !");
                            }
                            d.b(activity.getClass().getName(), str, z);
                            return;
                        }
                        if (!isDebug) {
                            return;
                        } else {
                            str2 = "tracePageEnd. method name is " + str + "method name over length !";
                        }
                    } else if (!isDebug) {
                        return;
                    } else {
                        str2 = "tracePageEnd. parameter illegality!";
                    }
                    Log.e(TAG, str2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            str2 = "tracePageEnd. parameter null!";
            Log.e(TAG, str2);
        }
    }

    public static void setControlMainThread(boolean z) {
        e = z;
    }
}
