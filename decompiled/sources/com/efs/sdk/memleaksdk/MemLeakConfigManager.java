package com.efs.sdk.memleaksdk;

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
public class MemLeakConfigManager {
    private static final int A_DAY = 86400000;
    private static final int MAX_MEMLEAK_TRACE_RATE = 100;
    private boolean mCheckIn;
    private Context mContext;
    private EfsReporter mEfsReporter;
    private int mLastRate;
    private final String TAG = "MemLeakConfigManager";
    private int mCurrentRate = 100;
    private final int DEF_CLOSE_RATE = 0;

    public boolean enableTracer() {
        return this.mCheckIn;
    }

    public MemLeakConfigManager(Context context, EfsReporter efsReporter) {
        this.mCheckIn = false;
        this.mContext = context.getApplicationContext();
        this.mEfsReporter = efsReporter;
        initRate();
        this.mCheckIn = enableMemleakTracer();
        resetRate();
    }

    private void initRate() {
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences("efs_memleak", 0);
        if (sharedPreferences != null) {
            this.mLastRate = sharedPreferences.getInt("apm_memleakperf_sampling_rate_last", 0);
        }
        int currentConfigRate = getCurrentConfigRate();
        if (currentConfigRate != -1) {
            this.mCurrentRate = currentConfigRate;
        }
    }

    private int getCurrentConfigRate() {
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences("efs_memleak", 0);
        int i = sharedPreferences != null ? sharedPreferences.getInt("apm_memleakperf_sampling_rate", -1) : -1;
        this.mEfsReporter.getAllSdkConfig(new String[]{"apm_memleakperf_sampling_rate"}, new IConfigCallback() { // from class: com.efs.sdk.memleaksdk.MemLeakConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public void onChange(Map<String, Object> map) {
                SharedPreferences.Editor edit;
                try {
                    SharedPreferences sharedPreferences2 = MemLeakConfigManager.this.mContext.getSharedPreferences("efs_memleak", 0);
                    if (sharedPreferences2 == null || (edit = sharedPreferences2.edit()) == null || map == null) {
                        return;
                    }
                    Object obj = map.get("apm_memleakperf_sampling_rate");
                    if (obj != null) {
                        edit.putInt("apm_memleakperf_sampling_rate", Integer.parseInt(obj.toString()));
                    }
                    edit.apply();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        return i;
    }

    private void resetRate() {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences("efs_memleak", 0);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putInt("apm_memleakperf_sampling_rate_last", this.mCurrentRate);
        edit.apply();
    }

    private boolean enableMemleakTracer() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor edit2;
        if (SamplingWhiteListUtil.isHitWL()) {
            return true;
        }
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences("efs_memleak", 0);
        long j = sharedPreferences != null ? sharedPreferences.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
        boolean z = sharedPreferences != null ? sharedPreferences.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
        int i = this.mCurrentRate;
        if (i != 0) {
            return checkIn(i != this.mLastRate, Long.valueOf(j), z, this.mCurrentRate);
        }
        if (z && sharedPreferences != null && (edit2 = sharedPreferences.edit()) != null) {
            edit2.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
            edit2.commit();
        }
        if (j != 0 && sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
            edit.commit();
        }
        return false;
    }

    private boolean checkIn(boolean z, Long l, boolean z2, int i) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor edit2;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Long valueOf2 = Long.valueOf(valueOf.longValue() - l.longValue());
        boolean z3 = true;
        if (z2 && valueOf2.longValue() < 86400000 && !z) {
            if (MemLeakManager.isDebug) {
                Log.d("MemLeakConfigManager", "check in page rate. check in allready.");
            }
            return true;
        }
        if (valueOf2.longValue() >= 86400000 || z) {
            if (random(i)) {
                if (MemLeakManager.isDebug) {
                    Log.d("MemLeakConfigManager", "check in page rate. random check in");
                }
            } else {
                if (MemLeakManager.isDebug) {
                    Log.d("MemLeakConfigManager", "check in page rate. random not check in!");
                }
                z3 = false;
            }
            SharedPreferences sharedPreferences = this.mContext.getSharedPreferences("efs_memleak", 0);
            if (sharedPreferences != null && (edit2 = sharedPreferences.edit()) != null) {
                edit2.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z3);
                edit2.apply();
            }
            if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
                edit.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, valueOf.longValue());
                edit.apply();
            }
            return z3;
        }
        if (MemLeakManager.isDebug) {
            Log.d("MemLeakConfigManager", "check in page rate. un repeat check in 24 hour!");
        }
        return false;
    }

    private boolean random(int i) {
        if (i == 0) {
            return false;
        }
        return i == 100 || new Random().nextInt(100) <= i;
    }
}
