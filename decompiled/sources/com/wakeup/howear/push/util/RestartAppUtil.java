package com.wakeup.howear.push.util;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.autonavi.aps.amapapi.config.Const;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;

/* loaded from: classes3.dex */
public class RestartAppUtil {
    static final String TAG = "RestartAppUtil";

    public static void restartByAlarm(Context context, Class<?> cls) {
        ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + 500, PendingIntent.getActivity(context, 123456, new Intent(context, cls), DivSeparatorView.DEFAULT_DIVIDER_COLOR));
        System.exit(0);
    }

    public static void restartByKillProcess(Context context, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        intent.addFlags(268435456);
        context.startActivity(intent);
        Process.killProcess(Process.myPid());
    }

    public static void restartByClearTop(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(67108864);
            context.startActivity(launchIntentForPackage);
        } else {
            Log.e(TAG, "intent is null can not restart app");
        }
    }

    public static void restartBySystemApi(Context context) {
        ((ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG)).restartPackage(context.getPackageName());
    }

    public static void restartByCompatApi(Context context, Class<?> cls) {
        context.startActivity(Intent.makeRestartActivityTask(new Intent(context, cls).getComponent()));
        System.exit(0);
    }

    public static void restartByJobScheduler(Context context, Class<?> cls) {
        MyJobSchedulerService.setMainIntent(new Intent(context, cls));
        JobInfo.Builder builder = new JobInfo.Builder(0, new ComponentName(context, (Class<?>) MyJobSchedulerService.class));
        builder.setMinimumLatency(1000);
        builder.setOverrideDeadline(2000);
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
        System.exit(0);
    }

    static class MyJobSchedulerService extends JobService {
        private static Intent mIntent;

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }

        MyJobSchedulerService() {
        }

        public static void setMainIntent(Intent intent) {
            mIntent = intent;
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            startActivity(mIntent);
            jobFinished(jobParameters, false);
            return false;
        }
    }
}
