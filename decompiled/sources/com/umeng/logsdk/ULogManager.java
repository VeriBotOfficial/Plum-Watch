package com.umeng.logsdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class ULogManager {
    public static final String TAG = "CodeLogManager";

    /* renamed from: a, reason: collision with root package name */
    private static Context f14008a = null;
    private static ULogConfigManager b = null;
    private static EfsReporter c = null;
    private static boolean d = false;
    private static String e = "";
    private static String f = "";
    private static long h = 0;
    private static long i = 0;
    public static boolean isDebug = true;
    private static JSONArray g = new JSONArray();
    private static long j = 18432;
    private static Handler k = new Handler(Looper.getMainLooper()) { // from class: com.umeng.logsdk.ULogManager.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                ULogManager.a(message);
            } else {
                if (i2 != 1) {
                    return;
                }
                ULogManager.e();
            }
        }
    };
    private static int l = 0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(android.os.Message r6) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.logsdk.ULogManager.a(android.os.Message):void");
    }

    static /* synthetic */ int b() {
        int i2 = l;
        l = i2 + 1;
        return i2;
    }

    static /* synthetic */ int c() {
        int i2 = l;
        l = i2 - 1;
        return i2;
    }

    public static void d(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 1;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString("message", str2);
        message.setData(bundle);
        k.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e() {
        /*
            org.json.JSONArray r0 = com.umeng.logsdk.ULogManager.g
            int r0 = r0.length()
            if (r0 <= 0) goto L93
            long r0 = java.lang.System.currentTimeMillis()
            com.umeng.logsdk.ULogManager.i = r0
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "taskid"
            java.lang.String r2 = ""
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "status"
            r2 = 0
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "time_start"
            long r2 = com.umeng.logsdk.ULogManager.h     // Catch: java.lang.Throwable -> L56
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "time_end"
            long r2 = com.umeng.logsdk.ULogManager.i     // Catch: java.lang.Throwable -> L56
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "uid"
            java.lang.String r2 = getUserID()     // Catch: java.lang.Throwable -> L56
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = com.umeng.logsdk.c.b(r2)     // Catch: java.lang.Throwable -> L56
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "did"
            java.lang.String r2 = getDeviceID()     // Catch: java.lang.Throwable -> L56
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "body"
            org.json.JSONArray r2 = com.umeng.logsdk.ULogManager.g     // Catch: java.lang.Throwable -> L56
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L56
            goto L5f
        L56:
            r0 = move-exception
            goto L5c
        L58:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L5c:
            r0.printStackTrace()
        L5f:
            if (r1 == 0) goto L93
            com.efs.sdk.base.protocol.record.EfsJSONLog r0 = new com.efs.sdk.base.protocol.record.EfsJSONLog
            java.lang.String r2 = "codelogperf"
            r0.<init>(r2)
            long r2 = com.umeng.logsdk.ULogManager.h
            r0.setLogBeginTime(r2)
            long r2 = com.umeng.logsdk.ULogManager.i
            r0.setLogEndTime(r2)
            java.lang.String r2 = "codelog"
            r0.put(r2, r1)
            com.efs.sdk.base.EfsReporter r1 = getReporter()
            if (r1 == 0) goto L93
            boolean r2 = com.umeng.logsdk.ULogManager.isDebug
            if (r2 == 0) goto L89
            java.lang.String r2 = "CodeLogManager"
            java.lang.String r3 = "upload and send."
            android.util.Log.i(r2, r3)
        L89:
            r1.send(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            com.umeng.logsdk.ULogManager.g = r0
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.logsdk.ULogManager.e():void");
    }

    public static void e(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 4;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString("message", str2);
        message.setData(bundle);
        k.sendMessage(message);
    }

    public static String getDeviceID() {
        return e;
    }

    public static EfsReporter getReporter() {
        return c;
    }

    public static ULogConfigManager getULogConfigManager() {
        return b;
    }

    public static String getUserID() {
        return f;
    }

    public static void i(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 2;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString("message", str2);
        message.setData(bundle);
        k.sendMessage(message);
    }

    public static void init(Context context, EfsReporter efsReporter) {
        String str;
        try {
            if (isDebug) {
                Log.i(TAG, "begin init code log.");
            }
            if (context != null && efsReporter != null) {
                if (isInit()) {
                    if (isDebug) {
                        str = "invalid init ！";
                        Log.e(TAG, str);
                    }
                    return;
                }
                f14008a = context.getApplicationContext();
                c = efsReporter;
                b = new ULogConfigManager(f14008a, c);
                registerActivityCallback(context);
                d = true;
                if (isDebug) {
                    Log.i(TAG, "finish init code log.");
                    return;
                }
                return;
            }
            if (isDebug) {
                str = "init code log manager error! parameter is null!";
                Log.e(TAG, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean isInit() {
        return d;
    }

    public static void registerActivityCallback(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.logsdk.ULogManager.2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    ULogManager.b();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    ULogManager.c();
                    if (ULogManager.l == 0) {
                        ULogManager.e();
                    }
                }
            });
        }
    }

    public static void setDeviceID(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 128) {
            e = str;
        } else if (isDebug) {
            Log.e(TAG, "device id over length!");
        }
    }

    public static void setUserID(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 128) {
            f = c.a(str.getBytes());
        } else if (isDebug) {
            Log.e(TAG, "user id over length!");
        }
    }

    public static void setsLogMaxCache(long j2) {
        if (j2 <= 0 || j2 >= 18432) {
            Log.e(TAG, "日志回捞size需要大于0且小于20*1024");
        } else {
            j = j2;
        }
    }

    public static void v(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 0;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString("message", str2);
        message.setData(bundle);
        k.sendMessage(message);
    }

    public static void w(String str, String str2) {
        Message message = new Message();
        message.what = 0;
        message.arg1 = 3;
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString("message", str2);
        message.setData(bundle);
        k.sendMessage(message);
    }
}
