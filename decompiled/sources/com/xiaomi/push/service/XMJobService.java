package com.xiaomi.push.service;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.push.ea;

/* loaded from: classes4.dex */
public class XMJobService extends Service {

    /* renamed from: a, reason: collision with root package name */
    static Service f14696a;

    /* renamed from: a, reason: collision with other field name */
    private IBinder f947a = null;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f947a = new a(this).f14697a;
        f14696a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f14696a = null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f947a;
        return iBinder != null ? iBinder : new Binder();
    }

    static class a extends JobService {

        /* renamed from: a, reason: collision with root package name */
        Binder f14697a;

        /* renamed from: a, reason: collision with other field name */
        private Handler f948a;

        a(Service service) {
            this.f14697a = null;
            this.f14697a = (Binder) com.xiaomi.push.ax.a((Object) this, "onBind", new Intent());
            com.xiaomi.push.ax.a((Object) this, "attachBaseContext", service);
        }

        /* renamed from: com.xiaomi.push.service.XMJobService$a$a, reason: collision with other inner class name */
        private static class HandlerC0955a extends Handler {

            /* renamed from: a, reason: collision with root package name */
            JobService f14698a;

            HandlerC0955a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f14698a = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                JobParameters jobParameters = (JobParameters) message.obj;
                com.xiaomi.channel.commonutils.logger.b.m11781a("Job finished " + jobParameters.getJobId());
                this.f14698a.jobFinished(jobParameters, false);
                if (jobParameters.getJobId() == 1) {
                    ea.a(false);
                }
            }
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, (Class<?>) XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f948a == null) {
                this.f948a = new HandlerC0955a(this);
            }
            Handler handler = this.f948a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (com.xiaomi.push.j.m12358a((Context) this)) {
            return onStartCommand;
        }
        return 2;
    }
}
