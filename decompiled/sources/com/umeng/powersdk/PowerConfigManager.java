package com.umeng.powersdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public class PowerConfigManager {
    private Context b;
    private EfsReporter c;
    private int d;
    private int f;
    private boolean g;

    /* renamed from: a, reason: collision with root package name */
    private final String f14024a = "PageConfigManager";
    private final int e = 0;

    public PowerConfigManager(Context context, EfsReporter efsReporter) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor edit3;
        SharedPreferences.Editor edit4;
        SharedPreferences.Editor edit5;
        this.d = 100;
        this.g = false;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = efsReporter;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("efs_power", 0);
        if (sharedPreferences != null) {
            this.f = sharedPreferences.getInt("apm_powerperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences2 = this.b.getSharedPreferences("efs_power", 0);
        int i = sharedPreferences2 != null ? sharedPreferences2.getInt("apm_powerperf_sampling_rate", -1) : -1;
        boolean z = true;
        this.c.getAllSdkConfig(new String[]{"apm_powerperf_sampling_rate", "apm_powerperf_collect_interval", "apm_powerperf_collect_max_period_sec"}, new IConfigCallback() { // from class: com.umeng.powersdk.PowerConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences.Editor edit6;
                try {
                    SharedPreferences sharedPreferences3 = PowerConfigManager.this.b.getSharedPreferences("efs_power", 0);
                    if (sharedPreferences3 == null || (edit6 = sharedPreferences3.edit()) == null || map == null) {
                        return;
                    }
                    Object obj = map.get("apm_powerperf_sampling_rate");
                    if (obj != null) {
                        edit6.putInt("apm_powerperf_sampling_rate", Integer.parseInt(obj.toString()));
                    }
                    Object obj2 = map.get("apm_powerperf_collect_interval");
                    if (obj2 != null) {
                        edit6.putInt("apm_powerperf_collect_interval", Integer.parseInt(obj2.toString()));
                    }
                    Object obj3 = map.get("apm_powerperf_collect_max_period_sec");
                    if (obj3 != null) {
                        edit6.putInt("apm_powerperf_collect_max_period_sec", Integer.parseInt(obj3.toString()));
                    }
                    edit6.apply();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        if (i != -1) {
            this.d = i;
        }
        if (!SamplingWhiteListUtil.isHitWL()) {
            SharedPreferences sharedPreferences3 = this.b.getSharedPreferences("efs_power", 0);
            long j = sharedPreferences3 != null ? sharedPreferences3.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
            boolean z2 = sharedPreferences3 != null ? sharedPreferences3.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
            int i2 = this.d;
            if (i2 == 0) {
                if (z2 && sharedPreferences3 != null && (edit5 = sharedPreferences3.edit()) != null) {
                    edit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
                    edit5.commit();
                }
                if (j != 0 && sharedPreferences3 != null && (edit4 = sharedPreferences3.edit()) != null) {
                    edit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
                    edit4.commit();
                }
            } else {
                boolean z3 = i2 != this.f;
                Long valueOf = Long.valueOf(j);
                int i3 = this.d;
                Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                Long valueOf3 = Long.valueOf(valueOf2.longValue() - valueOf.longValue());
                if (!z2 || valueOf3.longValue() >= 86400000 || z3) {
                    if (valueOf3.longValue() >= 86400000 || z3) {
                        if (i3 == 0 || (i3 != 100 && new Random().nextInt(100) > i3)) {
                            if (PowerManager.isDebug) {
                                Log.d("PageConfigManager", "check in page rate. random not check in!");
                            }
                            z = false;
                        } else if (PowerManager.isDebug) {
                            Log.d("PageConfigManager", "check in page rate. random check in");
                        }
                        SharedPreferences sharedPreferences4 = this.b.getSharedPreferences("efs_power", 0);
                        if (sharedPreferences4 != null && (edit3 = sharedPreferences4.edit()) != null) {
                            edit3.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z);
                            edit3.apply();
                        }
                        if (sharedPreferences4 != null && (edit2 = sharedPreferences4.edit()) != null) {
                            edit2.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, valueOf2.longValue());
                            edit2.apply();
                        }
                    } else if (PowerManager.isDebug) {
                        Log.d("PageConfigManager", "check in page rate. un repeat check in 24 hour!");
                    }
                } else if (PowerManager.isDebug) {
                    Log.d("PageConfigManager", "check in page rate. check in allready.");
                }
            }
            z = false;
        }
        this.g = z;
        SharedPreferences sharedPreferences5 = this.b.getSharedPreferences("efs_power", 0);
        if (sharedPreferences5 == null || (edit = sharedPreferences5.edit()) == null) {
            return;
        }
        edit.putInt("apm_powerperf_sampling_rate_last", this.d);
        edit.apply();
    }

    public boolean enableTracer() {
        return this.g;
    }
}
