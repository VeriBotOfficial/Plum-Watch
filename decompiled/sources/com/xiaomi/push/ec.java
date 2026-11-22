package com.xiaomi.push;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.ea;
import com.xiaomi.push.service.XMJobService;

/* loaded from: classes4.dex */
public class ec implements ea.a {

    /* renamed from: a, reason: collision with root package name */
    JobScheduler f14550a;

    /* renamed from: a, reason: collision with other field name */
    Context f438a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f439a = false;

    ec(Context context) {
        this.f438a = context;
        this.f14550a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    void a(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f438a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        com.xiaomi.channel.commonutils.logger.b.c("schedule Job = " + builder.build().getId() + " in " + j);
        this.f14550a.schedule(builder.build());
    }

    @Override // com.xiaomi.push.ea.a
    public void a(boolean z) {
        if (z || this.f439a) {
            long b = fh.b();
            if (z) {
                a();
                b -= SystemClock.elapsedRealtime() % b;
            }
            this.f439a = true;
            a(b);
        }
    }

    @Override // com.xiaomi.push.ea.a
    public void a() {
        this.f439a = false;
        this.f14550a.cancel(1);
    }

    @Override // com.xiaomi.push.ea.a
    /* renamed from: a */
    public boolean mo12107a() {
        return this.f439a;
    }
}
