package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class dt {

    /* renamed from: a, reason: collision with root package name */
    private static a f14541a;

    /* renamed from: a, reason: collision with other field name */
    private static Map<String, gq> f419a;

    public interface a {
        void uploader(Context context, gk gkVar);
    }

    public static int a(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    public static void a(a aVar) {
        f14541a = aVar;
    }

    private static void a(Context context, gk gkVar) {
        if (m12092a(context.getApplicationContext())) {
            com.xiaomi.push.service.ba.a(context.getApplicationContext(), gkVar);
            return;
        }
        a aVar = f14541a;
        if (aVar != null) {
            aVar.uploader(context, gkVar);
        }
    }

    public static EventClientReport a(String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = str;
        return eventClientReport;
    }

    public static PerfClientReport a() {
        PerfClientReport perfClientReport = new PerfClientReport();
        perfClientReport.production = 1000;
        perfClientReport.reportType = 1000;
        perfClientReport.clientInterfaceId = "P100000";
        return perfClientReport;
    }

    public static EventClientReport a(Context context, String str, String str2, int i, long j, String str3) {
        EventClientReport a2 = a(str);
        a2.eventId = str2;
        a2.eventType = i;
        a2.eventTime = j;
        a2.eventContent = str3;
        return a2;
    }

    public static PerfClientReport a(Context context, int i, long j, long j2) {
        PerfClientReport a2 = a();
        a2.code = i;
        a2.perfCounts = j;
        a2.perfLatencies = j2;
        return a2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m12090a(int i) {
        if (i == 1000) {
            return "E100000";
        }
        if (i == 3000) {
            return "E100002";
        }
        if (i == 2000) {
            return "E100001";
        }
        if (i == 6000) {
            return "E100003";
        }
        return "";
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12092a(Context context) {
        return (context == null || TextUtils.isEmpty(context.getPackageName()) || !"com.xiaomi.xmsf".equals(context.getPackageName())) ? false : true;
    }

    public static void a(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                gk a2 = a(context, it.next());
                if (!com.xiaomi.push.service.az.a(a2, false)) {
                    a(context, a2);
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.d(th.getMessage());
        }
    }

    public static gk a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        gk gkVar = new gk();
        gkVar.d("category_client_report_data");
        gkVar.a("push_sdk_channel");
        gkVar.a(1L);
        gkVar.b(str);
        gkVar.a(true);
        gkVar.b(System.currentTimeMillis());
        gkVar.g(context.getPackageName());
        gkVar.e("com.xiaomi.xmsf");
        gkVar.f(com.xiaomi.push.service.az.a());
        gkVar.c("quality_support");
        return gkVar;
    }

    public static void a(Context context, Config config) {
        ClientReportClient.init(context, config, new dr(context), new ds(context));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m12091a(Context context) {
        ClientReportClient.updateConfig(context, a(context));
    }

    public static Config a(Context context) {
        boolean a2 = com.xiaomi.push.service.ah.a(context).a(gl.PerfUploadSwitch.a(), false);
        boolean a3 = com.xiaomi.push.service.ah.a(context).a(gl.EventUploadNewSwitch.a(), false);
        return Config.getBuilder().setEventUploadSwitchOpen(a3).setEventUploadFrequency(com.xiaomi.push.service.ah.a(context).a(gl.EventUploadFrequency.a(), 86400)).setPerfUploadSwitchOpen(a2).setPerfUploadFrequency(com.xiaomi.push.service.ah.a(context).a(gl.PerfUploadFrequency.a(), 86400)).build(context);
    }

    public static int a(Enum r1) {
        if (r1 == null) {
            return -1;
        }
        if (r1 instanceof gg) {
            return r1.ordinal() + 1001;
        }
        if (r1 instanceof gq) {
            return r1.ordinal() + 2001;
        }
        if (r1 instanceof ee) {
            return r1.ordinal() + 3001;
        }
        return -1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static gq m12089a(String str) {
        if (f419a == null) {
            synchronized (gq.class) {
                if (f419a == null) {
                    f419a = new HashMap();
                    for (gq gqVar : gq.values()) {
                        f419a.put(gqVar.f614a.toLowerCase(), gqVar);
                    }
                }
            }
        }
        gq gqVar2 = f419a.get(str.toLowerCase());
        return gqVar2 != null ? gqVar2 : gq.Invalid;
    }
}
