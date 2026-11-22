package com.qumeng.overseas.advlib.ui.front;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class CpcIntentJobService extends JobService {
    private static final String t = "is_activity";

    public static void a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(1001);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Bundle transientExtras = jobParameters.getTransientExtras();
        Intent intent = (Intent) transientExtras.getParcelable("android.intent.extra.INTENT");
        if (intent != null) {
            if (transientExtras.getBoolean(t)) {
                com.qumeng.overseas.advlib.trdparty.unionset.apply.common.a.a(this, intent, false);
            } else {
                try {
                    startService(intent);
                } catch (Exception e) {
                    n.b("CpcIntentJobService", "scheduleService startService error : " + e.toString(), new Object[0]);
                }
            }
        }
        return false;
    }
}
