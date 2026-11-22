package com.efs.sdk.launch;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* loaded from: classes14.dex */
public class LaunchConfigManager {

    /* renamed from: a, reason: collision with root package name */
    private final String f9656a = "LaunchConfigManager";
    private final int b = 0;
    private EfsReporter c;
    private int d;
    private int e;
    private boolean f;
    private Context g;

    public LaunchConfigManager(Context context, EfsReporter efsReporter) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor edit2;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit3;
        SharedPreferences.Editor edit4;
        SharedPreferences.Editor edit5;
        this.d = 100;
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.c = efsReporter;
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("efs_launch", 0);
        if (sharedPreferences2 != null) {
            this.e = sharedPreferences2.getInt("apm_startperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences3 = this.g.getSharedPreferences("efs_launch", 0);
        int i = sharedPreferences3 != null ? sharedPreferences3.getInt("apm_startperf_sampling_rate", -1) : -1;
        boolean z = true;
        this.c.getAllSdkConfig(new String[]{"apm_startperf_sampling_rate"}, new IConfigCallback() { // from class: com.efs.sdk.launch.LaunchConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences sharedPreferences4;
                SharedPreferences.Editor edit6;
                try {
                    Object obj = map.get("apm_startperf_sampling_rate");
                    if (obj == null || (sharedPreferences4 = LaunchConfigManager.this.g.getSharedPreferences("efs_launch", 0)) == null || (edit6 = sharedPreferences4.edit()) == null) {
                        return;
                    }
                    edit6.putInt("apm_startperf_sampling_rate", Integer.parseInt(obj.toString()));
                    edit6.commit();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        if (i != -1) {
            this.d = i;
        }
        SharedPreferences sharedPreferences4 = this.g.getSharedPreferences("efs_launch", 0);
        long j = sharedPreferences4 != null ? sharedPreferences4.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
        boolean z2 = sharedPreferences4 != null ? sharedPreferences4.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
        if (this.d != 0) {
            if (!SamplingWhiteListUtil.isHitWL()) {
                boolean z3 = this.d != this.e;
                Long valueOf = Long.valueOf(j);
                int i2 = this.d;
                Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                Long valueOf3 = Long.valueOf(valueOf2.longValue() - valueOf.longValue());
                if (!z2 || valueOf3.longValue() >= 86400000 || z3) {
                    if (valueOf3.longValue() >= 86400000 || z3) {
                        if (i2 == 0 || (i2 != 100 && new Random().nextInt(100) > i2)) {
                            if (LaunchManager.isDebug) {
                                Log.d("LaunchConfigManager", "random not check in!");
                            }
                            z = false;
                        } else if (LaunchManager.isDebug) {
                            Log.d("LaunchConfigManager", "random check in");
                        }
                        SharedPreferences sharedPreferences5 = this.g.getSharedPreferences("efs_launch", 0);
                        if (sharedPreferences5 != null && (edit2 = sharedPreferences5.edit()) != null) {
                            edit2.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z);
                            edit2.commit();
                        }
                        if (sharedPreferences5 != null && (edit = sharedPreferences5.edit()) != null) {
                            edit.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, valueOf2.longValue());
                            edit.commit();
                        }
                    } else if (LaunchManager.isDebug) {
                        Log.d("LaunchConfigManager", "un repeat check in 24 hour!");
                    }
                } else if (LaunchManager.isDebug) {
                    Log.d("LaunchConfigManager", " check in allready");
                }
            }
            this.f = z;
            sharedPreferences = this.g.getSharedPreferences("efs_launch", 0);
            if (sharedPreferences != null || (edit3 = sharedPreferences.edit()) == null) {
            }
            edit3.putInt("apm_startperf_sampling_rate_last", this.d);
            edit3.commit();
            return;
        }
        if (z2 && sharedPreferences4 != null && (edit5 = sharedPreferences4.edit()) != null) {
            edit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
            edit5.commit();
        }
        if (j != 0 && sharedPreferences4 != null && (edit4 = sharedPreferences4.edit()) != null) {
            edit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
            edit4.commit();
        }
        z = false;
        this.f = z;
        sharedPreferences = this.g.getSharedPreferences("efs_launch", 0);
        if (sharedPreferences != null) {
        }
    }

    public boolean enableTracer() {
        return this.f;
    }
}
