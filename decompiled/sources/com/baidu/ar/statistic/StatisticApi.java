package com.baidu.ar.statistic;

import android.content.Context;
import android.os.HandlerThread;
import com.baidu.ar.ab;
import com.baidu.ar.ca;
import com.baidu.ar.h;
import com.baidu.ar.q6;
import com.baidu.ar.x6;
import java.lang.reflect.Constructor;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class StatisticApi {

    /* renamed from: a, reason: collision with root package name */
    public static x6 f7198a;
    public static q6 b;

    public static q6 getPerformanceApi() {
        if (b == null) {
            b = new ca();
        }
        return b;
    }

    public static void init(Context context) {
        if (f7198a == null) {
            try {
                Constructor<?> a2 = ab.a("com.baidu.ar.statistic.StatisticApiImpl", (Class<?>[]) new Class[]{Context.class, HandlerThread.class});
                if (a2 != null) {
                    f7198a = (x6) ab.a(a2, context, null);
                }
            } catch (Throwable th) {
                f7198a = null;
                h.b("Statistic init fail");
                th.printStackTrace();
            }
        }
        if (b == null) {
            b = new ca();
        }
    }

    public static boolean isAllowPerformanceEvent(String str) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            return x6Var.isAllowPerformanceEvent(str);
        }
        return true;
    }

    public static void onEvent(String str) {
        onEvent(str, "");
    }

    public static void onEvent(String str, String str2) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.onEvent(str, str2);
        }
    }

    public static void onEvent(String str, Map<String, String> map) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.onEvent(str, map);
        }
    }

    public static void onEventDebounce(String str, long j, String str2) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.onEventDebounce(str, j, str2);
        }
    }

    public static void onEventDebounce(String str, long j, Map<String, String> map) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.onEventDebounce(str, j, map);
        }
    }

    public static void onEventEnd(String str) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.onEventEnd(str);
        }
    }

    public static void onEventStart(String str) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.onEventStart(str);
        }
    }

    public static void onEventStatus(String str, String str2, boolean z) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.onEventStatus(str, str2, z);
        }
    }

    public static void onPerformance(String str, Map<String, String> map) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.onPerformance(str, map);
        }
    }

    public static void onPerformance(String str, JSONObject jSONObject) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.onPerformance(str, jSONObject);
        }
    }

    public static void pause() {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.pause();
        }
    }

    public static void release() {
        b = null;
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.release();
            f7198a = null;
        }
    }

    public static void resume() {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.resume();
        }
    }

    public static void setPubParam(String str, String str2) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.setPubParam(str, str2);
        }
    }

    public static void setPubParams(Map<String, String> map) {
        x6 x6Var = f7198a;
        if (x6Var != null) {
            x6Var.setPubParams(map);
        }
    }
}
