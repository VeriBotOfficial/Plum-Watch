package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;

/* loaded from: classes4.dex */
public class bl implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f14461a;

    /* renamed from: a, reason: collision with other field name */
    private com.xiaomi.clientreport.processor.c f232a;

    public void a(com.xiaomi.clientreport.processor.c cVar) {
        this.f232a = cVar;
    }

    public void a(Context context) {
        this.f14461a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.xiaomi.clientreport.processor.c cVar = this.f232a;
            if (cVar != null) {
                cVar.a();
            }
            com.xiaomi.channel.commonutils.logger.b.c("begin read and send perf / event");
            com.xiaomi.clientreport.processor.c cVar2 = this.f232a;
            if (cVar2 instanceof IEventProcessor) {
                bn.a(this.f14461a).m11920a("sp_client_report_status", "event_last_upload_time", System.currentTimeMillis());
            } else if (cVar2 instanceof IPerfProcessor) {
                bn.a(this.f14461a).m11920a("sp_client_report_status", "perf_last_upload_time", System.currentTimeMillis());
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }
}
