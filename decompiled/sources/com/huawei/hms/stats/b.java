package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* compiled from: HiAnalyticsOfCpUtils.java */
/* loaded from: classes14.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static HiAnalyticsInstance f10719a;

    private static HiAnalyticsInstance a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f10719a = analyticsInstance;
        return analyticsInstance;
    }

    public static void b(Context context, int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f10719a.onStreamEvent(i, str, linkedHashMap);
        }
    }

    public static void a(Context context, String str, String str2) {
        if (a(context) != null) {
            f10719a.onEvent(context, str, str2);
        }
    }

    public static void a(Context context, int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f10719a.onEvent(i, str, linkedHashMap);
        }
    }

    public static void a(Context context, int i) {
        if (a(context) != null) {
            f10719a.onReport(i);
        }
    }
}
