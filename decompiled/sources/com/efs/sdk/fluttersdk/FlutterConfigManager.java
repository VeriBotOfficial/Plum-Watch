package com.efs.sdk.fluttersdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Environment;
import android.os.StatFs;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* loaded from: classes14.dex */
public class FlutterConfigManager {
    private EfsReporter c;
    private Context k;

    /* renamed from: a, reason: collision with root package name */
    private final String f9652a = "FlutterConfigManager";
    private final int b = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean l = false;

    public FlutterConfigManager(Context context, EfsReporter efsReporter) {
        this.k = context;
        this.c = efsReporter;
        efsReporter.getAllSdkConfig(new String[]{"flutter_pv_sampling_rate", "flutter_pv_max_count", "flutter_dart_exception_state", "flutter_dart_exception_max_count", "flutter_http_state", "flutter_http_rate", "flutter_page_state", "flutter_page_rate"}, new IConfigCallback() { // from class: com.efs.sdk.fluttersdk.FlutterConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                try {
                    Object obj = map.get("flutter_pv_sampling_rate");
                    if (obj != null) {
                        FlutterConfigManager.this.d = Integer.parseInt(obj.toString());
                        FlutterConfigManager flutterConfigManager = FlutterConfigManager.this;
                        flutterConfigManager.h = FlutterConfigManager.a(flutterConfigManager.d);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    Object obj2 = map.get("flutter_pv_max_count");
                    if (obj2 != null) {
                        FlutterConfigManager.this.e = Integer.parseInt(obj2.toString());
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                try {
                    Object obj3 = map.get("flutter_dart_exception_state");
                    if (obj3 != null) {
                        FlutterConfigManager.this.f = Integer.parseInt(obj3.toString());
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                try {
                    Object obj4 = map.get("flutter_dart_exception_max_count");
                    if (obj4 != null) {
                        FlutterConfigManager.this.g = Integer.parseInt(obj4.toString());
                    }
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                boolean z = true;
                try {
                    Object obj5 = map.get("flutter_page_state");
                    Object obj6 = map.get("flutter_page_rate");
                    if (obj5 != null && obj6 != null) {
                        FlutterConfigManager.this.i = Integer.parseInt(obj5.toString()) == 100 && FlutterConfigManager.a(Integer.parseInt(obj6.toString()));
                    }
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
                try {
                    Object obj7 = map.get("flutter_http_state");
                    Object obj8 = map.get("flutter_http_rate");
                    if (obj7 != null && obj8 != null) {
                        int parseInt = Integer.parseInt(obj7.toString());
                        int parseInt2 = Integer.parseInt(obj8.toString());
                        FlutterConfigManager flutterConfigManager2 = FlutterConfigManager.this;
                        if (parseInt != 100 || !FlutterConfigManager.a(parseInt2)) {
                            z = false;
                        }
                        flutterConfigManager2.j = z;
                    }
                } catch (Throwable th6) {
                    th6.printStackTrace();
                }
                FlutterConfigManager.b(FlutterConfigManager.this);
            }
        });
    }

    static /* synthetic */ boolean a(int i) {
        if (SamplingWhiteListUtil.isHitWL()) {
            return true;
        }
        if (i != 0) {
            return i == 100 || new Random().nextInt(100) <= i;
        }
        return false;
    }

    static /* synthetic */ boolean b(FlutterConfigManager flutterConfigManager) {
        flutterConfigManager.l = true;
        return true;
    }

    public Map<String, Object> getCloudConfig() {
        if (!this.l) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("flutter_pv_max_count", Integer.valueOf(this.e));
        hashMap.put("flutter_dart_exception_state", Integer.valueOf(this.f));
        hashMap.put("flutter_dart_exception_max_count", Integer.valueOf(this.g));
        hashMap.put("flutter_pv_sampling_hit", Boolean.valueOf(this.h));
        hashMap.put("flutter_pv_detail_sampling_hit", Boolean.valueOf(this.i));
        hashMap.put("flutter_http_sampling_hit", Boolean.valueOf(this.j));
        return hashMap;
    }

    public Map<String, Object> getNativeParams() {
        if (!this.l) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            try {
                Intent registerReceiver = this.k.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                hashMap.put("battery", Integer.valueOf(registerReceiver.getIntExtra("level", 0)));
                hashMap.put("temperature", Integer.valueOf(registerReceiver.getIntExtra("temperature", 0)));
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                hashMap.put("disk_ratio", String.format(Locale.getDefault(), "%.2f", Double.valueOf(((statFs.getAvailableBlocksLong() * r3) / (statFs.getBlockCountLong() * statFs.getBlockSizeLong())) * 100.0d)));
                hashMap.putAll(GlobalInfoManager.getInstance().getGlobalInfo().getGlobalInfoMap());
                hashMap.putAll(ControllerCenter.getGlobalEnvStruct().getPublicParamMap());
                return hashMap;
            } catch (Throwable unused) {
                return hashMap;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public boolean isFlutterEnable() {
        return this.h;
    }
}
