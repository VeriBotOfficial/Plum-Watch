package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;

/* loaded from: classes4.dex */
public class du {

    /* renamed from: a, reason: collision with root package name */
    private static volatile du f14542a;

    /* renamed from: a, reason: collision with other field name */
    private Context f420a;

    private du(Context context) {
        this.f420a = context;
    }

    public static du a(Context context) {
        if (f14542a == null) {
            synchronized (du.class) {
                if (f14542a == null) {
                    f14542a = new du(context);
                }
            }
        }
        return f14542a;
    }

    public void a(String str, String str2, String str3, int i, long j, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        EventClientReport a2 = dt.a(this.f420a, str2, str3, i, j, str4);
        a2.setAppPackageName(str);
        a2.setSdkVersion(BuildConfig.VERSION_NAME);
        a(a2);
    }

    public void a(String str, String str2, String str3, int i, String str4) {
        a(str, str2, str3, i, System.currentTimeMillis(), str4);
    }

    public void a(String str, Intent intent, int i, String str2) {
        if (intent == null) {
            return;
        }
        a(str, dt.m12090a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i, System.currentTimeMillis(), str2);
    }

    public void a(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    public void b(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    public void a(String str, Intent intent, String str2) {
        if (intent == null) {
            return;
        }
        a(str, dt.m12090a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), 5001, System.currentTimeMillis(), str2);
    }

    public void c(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 4002, System.currentTimeMillis(), str4);
    }

    public void a(String str, int i, long j, long j2) {
        if (i < 0 || j2 < 0 || j <= 0) {
            return;
        }
        PerfClientReport a2 = dt.a(this.f420a, i, j, j2);
        a2.setAppPackageName(str);
        a2.setSdkVersion(BuildConfig.VERSION_NAME);
        a(a2);
    }

    private void a(com.xiaomi.clientreport.data.a aVar) {
        if (aVar instanceof PerfClientReport) {
            ClientReportClient.reportPerf(this.f420a, (PerfClientReport) aVar);
        } else if (aVar instanceof EventClientReport) {
            ClientReportClient.reportEvent(this.f420a, (EventClientReport) aVar);
        }
    }
}
