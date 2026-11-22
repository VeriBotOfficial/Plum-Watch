package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.af;
import com.xiaomi.push.bc;
import com.xiaomi.push.bj;
import com.xiaomi.push.bk;
import com.xiaomi.push.bl;
import com.xiaomi.push.bm;
import com.xiaomi.push.bn;
import com.xiaomi.push.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f14350a;

    /* renamed from: a, reason: collision with other field name */
    private static volatile a f84a;

    /* renamed from: a, reason: collision with other field name */
    private Context f85a;

    /* renamed from: a, reason: collision with other field name */
    private Config f86a;

    /* renamed from: a, reason: collision with other field name */
    private IEventProcessor f87a;

    /* renamed from: a, reason: collision with other field name */
    private IPerfProcessor f88a;

    /* renamed from: a, reason: collision with other field name */
    private String f89a;

    /* renamed from: a, reason: collision with other field name */
    private ExecutorService f91a = Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f90a = new HashMap<>();
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> b = new HashMap<>();

    static {
        f14350a = j.m12357a() ? 30 : 10;
    }

    private a(Context context) {
        this.f85a = context;
    }

    public static a a(Context context) {
        if (f84a == null) {
            synchronized (a.class) {
                if (f84a == null) {
                    f84a = new a(context);
                }
            }
        }
        return f84a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Config m11790a() {
        if (this.f86a == null) {
            this.f86a = Config.defaultConfig(this.f85a);
        }
        return this.f86a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11791a() {
        a(this.f85a).f();
        a(this.f85a).g();
    }

    public void a(String str) {
        this.f89a = str;
    }

    public void a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f86a = config;
        this.f87a = iEventProcessor;
        this.f88a = iPerfProcessor;
        iEventProcessor.setEventMap(this.b);
        this.f88a.setPerfMap(this.f90a);
    }

    public void a(boolean z, boolean z2, long j, long j2) {
        Config config = this.f86a;
        if (config != null) {
            if (z == config.isEventUploadSwitchOpen() && z2 == this.f86a.isPerfUploadSwitchOpen() && j == this.f86a.getEventUploadFrequency() && j2 == this.f86a.getPerfUploadFrequency()) {
                return;
            }
            long eventUploadFrequency = this.f86a.getEventUploadFrequency();
            long perfUploadFrequency = this.f86a.getPerfUploadFrequency();
            Config build = Config.getBuilder().setAESKey(bm.a(this.f85a)).setEventEncrypted(this.f86a.isEventEncrypted()).setEventUploadSwitchOpen(z).setEventUploadFrequency(j).setPerfUploadSwitchOpen(z2).setPerfUploadFrequency(j2).build(this.f85a);
            this.f86a = build;
            if (!build.isEventUploadSwitchOpen()) {
                af.a(this.f85a).m11864a("100886");
            } else if (eventUploadFrequency != build.getEventUploadFrequency()) {
                b.c(this.f85a.getPackageName() + "reset event job " + build.getEventUploadFrequency());
                f();
            }
            if (!this.f86a.isPerfUploadSwitchOpen()) {
                af.a(this.f85a).m11864a("100887");
            } else if (perfUploadFrequency != build.getPerfUploadFrequency()) {
                b.c(this.f85a.getPackageName() + " reset perf job " + build.getPerfUploadFrequency());
                g();
            }
        }
    }

    private void a(af.a aVar, int i) {
        af.a(this.f85a).b(aVar, i);
    }

    public void a(final EventClientReport eventClientReport) {
        if (m11790a().isEventUploadSwitchOpen()) {
            this.f91a.execute(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b(eventClientReport);
                }
            });
        }
    }

    public void a(final PerfClientReport perfClientReport) {
        if (m11790a().isPerfUploadSwitchOpen()) {
            this.f91a.execute(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b(perfClientReport);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(EventClientReport eventClientReport) {
        IEventProcessor iEventProcessor = this.f87a;
        if (iEventProcessor != null) {
            iEventProcessor.mo11793a(eventClientReport);
            if (a() >= 10) {
                d();
                af.a(this.f85a).m11864a("100888");
            } else {
                a(new af.a() { // from class: com.xiaomi.clientreport.manager.a.3
                    @Override // com.xiaomi.push.af.a
                    /* renamed from: a */
                    public String mo11916a() {
                        return "100888";
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (a.this.a() > 0) {
                            a.this.f91a.execute(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    a.this.d();
                                }
                            });
                        }
                    }
                }, f14350a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PerfClientReport perfClientReport) {
        IPerfProcessor iPerfProcessor = this.f88a;
        if (iPerfProcessor != null) {
            iPerfProcessor.mo11793a(perfClientReport);
            if (b() >= 10) {
                e();
                af.a(this.f85a).m11864a("100889");
            } else {
                a(new af.a() { // from class: com.xiaomi.clientreport.manager.a.4
                    @Override // com.xiaomi.push.af.a
                    /* renamed from: a */
                    public String mo11916a() {
                        return "100889";
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (a.this.b() > 0) {
                            a.this.f91a.execute(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    a.this.e();
                                }
                            });
                        }
                    }
                }, f14350a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f87a.b();
        } catch (Exception e) {
            b.d("we: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f88a.b();
        } catch (Exception e) {
            b.d("wp: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap = this.b;
        if (hashMap == null) {
            return 0;
        }
        Iterator<String> it = hashMap.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.b.get(it.next());
            i += arrayList != null ? arrayList.size() : 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> hashMap = this.f90a;
        int i = 0;
        if (hashMap != null) {
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, com.xiaomi.clientreport.data.a> hashMap2 = this.f90a.get(it.next());
                if (hashMap2 != null) {
                    Iterator<String> it2 = hashMap2.keySet().iterator();
                    while (it2.hasNext()) {
                        com.xiaomi.clientreport.data.a aVar = hashMap2.get(it2.next());
                        if (aVar instanceof PerfClientReport) {
                            i = (int) (i + ((PerfClientReport) aVar).perfCounts);
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m11792b() {
        if (m11790a().isEventUploadSwitchOpen()) {
            bl blVar = new bl();
            blVar.a(this.f85a);
            blVar.a(this.f87a);
            this.f91a.execute(blVar);
        }
    }

    public void c() {
        if (m11790a().isPerfUploadSwitchOpen()) {
            bl blVar = new bl();
            blVar.a(this.f88a);
            blVar.a(this.f85a);
            this.f91a.execute(blVar);
        }
    }

    private void f() {
        if (a(this.f85a).m11790a().isEventUploadSwitchOpen()) {
            final bj bjVar = new bj(this.f85a);
            int eventUploadFrequency = (int) a(this.f85a).m11790a().getEventUploadFrequency();
            if (eventUploadFrequency < 1800) {
                eventUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - bn.a(this.f85a).a("sp_client_report_status", "event_last_upload_time", 0L) > eventUploadFrequency * 1000) {
                af.a(this.f85a).a(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.5
                    @Override // java.lang.Runnable
                    public void run() {
                        bjVar.run();
                    }
                }, 10);
            }
            synchronized (a.class) {
                if (!af.a(this.f85a).a((af.a) bjVar, eventUploadFrequency)) {
                    af.a(this.f85a).m11864a("100886");
                    af.a(this.f85a).a((af.a) bjVar, eventUploadFrequency);
                }
            }
        }
    }

    private void g() {
        if (a(this.f85a).m11790a().isPerfUploadSwitchOpen()) {
            final bk bkVar = new bk(this.f85a);
            int perfUploadFrequency = (int) a(this.f85a).m11790a().getPerfUploadFrequency();
            if (perfUploadFrequency < 1800) {
                perfUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - bn.a(this.f85a).a("sp_client_report_status", "perf_last_upload_time", 0L) > perfUploadFrequency * 1000) {
                af.a(this.f85a).a(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.6
                    @Override // java.lang.Runnable
                    public void run() {
                        bkVar.run();
                    }
                }, 15);
            }
            synchronized (a.class) {
                if (!af.a(this.f85a).a((af.a) bkVar, perfUploadFrequency)) {
                    af.a(this.f85a).m11864a("100887");
                    af.a(this.f85a).a((af.a) bkVar, perfUploadFrequency);
                }
            }
        }
    }

    public EventClientReport a(int i, String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.eventContent = str;
        eventClientReport.eventTime = System.currentTimeMillis();
        eventClientReport.eventType = i;
        eventClientReport.eventId = bc.a(6);
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = "E100004";
        eventClientReport.setAppPackageName(this.f85a.getPackageName());
        eventClientReport.setSdkVersion(this.f89a);
        return eventClientReport;
    }
}
