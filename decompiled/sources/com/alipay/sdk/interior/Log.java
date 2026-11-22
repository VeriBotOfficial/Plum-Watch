package com.alipay.sdk.interior;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.sdk.m.m.a;
import com.alipay.sdk.m.w.b;
import com.alipay.sdk.m.y.g;

/* loaded from: classes11.dex */
public class Log {

    /* renamed from: a, reason: collision with root package name */
    public static long f1325a;

    public interface ISdkLogCallback {
        void onLogLine(String str);
    }

    public static boolean forcedLogReport(Context context) {
        try {
            b.c().a(context);
            long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (elapsedRealtime - f1325a < 600) {
                return false;
            }
            f1325a = elapsedRealtime;
            a.a(context);
            return true;
        } catch (Exception e) {
            g.a(e);
            return false;
        }
    }

    public static void setupLogCallback(ISdkLogCallback iSdkLogCallback) {
        g.a(iSdkLogCallback);
    }
}
