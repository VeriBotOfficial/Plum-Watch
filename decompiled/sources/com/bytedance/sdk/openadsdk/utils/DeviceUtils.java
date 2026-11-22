package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.sdk.openadsdk.core.settings.mvp;
import com.bytedance.sdk.openadsdk.utils.sg;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iflytek.cloud.SpeechConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.tencent.open.SocialConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class DeviceUtils {
    private static int ckl = 0;
    public static String fxn = "";
    private static int jq;
    private static int rlu;
    private static int tw;
    private static int xdg;
    private static int zu;
    private static volatile long kg = System.currentTimeMillis();
    private static volatile boolean gff = false;
    private static volatile boolean hm = false;
    private static volatile boolean rb = false;
    private static volatile boolean bh = true;

    /* renamed from: sg, reason: collision with root package name */
    private static long f9569sg = 0;
    private static String hie = "";
    private static int dgx = 0;
    private static final AtomicBoolean mvp = new AtomicBoolean(false);
    private static AtomicBoolean rmu = new AtomicBoolean(false);

    public static void fxn(Context context) {
        if (gff) {
            return;
        }
        try {
            kg kgVar = new kg();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(kgVar, intentFilter);
            gff = true;
        } catch (Throwable unused) {
        }
    }

    public static long fxn() {
        return kg;
    }

    public static boolean kg() {
        if (SystemClock.elapsedRealtime() - f9569sg >= 20000) {
            f9569sg = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.rmu.fxn().getSystemService("power");
                if (powerManager != null) {
                    bh = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dx.gff("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return bh;
    }

    public static boolean kg(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static boolean gff(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 4;
    }

    public static int hm(Context context) {
        if (gff(context)) {
            return 3;
        }
        return kg(context) ? 2 : 1;
    }

    private static void fxn(JSONObject jSONObject) throws JSONException {
        kg(jSONObject);
    }

    private static void kg(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().fxn(jSONObject);
    }

    public static String rb(Context context) {
        if (!mvp.get()) {
            ckl(context);
        }
        return hie;
    }

    public static int bh(Context context) {
        if (!mvp.get()) {
            ckl(context);
        }
        return dgx;
    }

    private static void ckl(Context context) {
        if (context == null || !mvp.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.ums.fxn.fxn("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                hie = packageInfo.versionName;
                dgx = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject fxn(Context context, boolean z) {
        String hie2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", tw(context));
            fxn(jSONObject);
            jSONObject.put("type", hm(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", qhf.tw(context));
            jSONObject.put(CommonUrlParts.APP_SET_ID, com.bytedance.sdk.openadsdk.core.settings.hm.gff());
            jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, com.bytedance.sdk.openadsdk.core.settings.hm.kg());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.hm.hm());
            jSONObject.put("screen_scale", wc.bh(context));
            jSONObject.put("density", wc.tw(context));
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, wc.gff(context));
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, wc.rb(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.hie.gff.bh());
            com.bytedance.sdk.openadsdk.core.settings.bh hm2 = com.bytedance.sdk.openadsdk.core.rmu.hm();
            if (hm2.ke("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put(CommonUrlParts.UUID, com.bytedance.sdk.openadsdk.core.mvp.gff(context));
            jSONObject.put("rom_version", mve.fxn());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.mvp.kg(context));
            jSONObject.put("timezone", qhf.ke());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.mvp.kg());
            jSONObject.put("carrier_name", ggo.fxn());
            if (z) {
                hie2 = qhf.fxn(context);
            } else {
                hie2 = qhf.hie();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(hie2) * 1024));
            jSONObject.put("locale_language", hm());
            jSONObject.put("screen_bright", Math.ceil(rb() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", 1 ^ (kg() ? 1 : 0));
            jSONObject.put("cpu_num", hie.kg());
            jSONObject.put("cpu_max_freq", hie.gff());
            jSONObject.put("cpu_min_freq", hie.hm());
            sg.fxn fxn2 = sg.fxn();
            jSONObject.put("battery_remaining_pct", (int) fxn2.kg);
            jSONObject.put("is_charging", fxn2.fxn);
            jSONObject.put("total_space", String.valueOf(qhf.kg(context)));
            jSONObject.put("free_space_in", String.valueOf(qhf.rlu()));
            jSONObject.put("sdcard_size", String.valueOf(qhf.zu()));
            jSONObject.put("rooted", qhf.xdg());
            jSONObject.put("enable_assisted_clicking", bh());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.jz.fxn(context, "tt_choose_language"));
            jSONObject.put("airplane", jq(context));
            jSONObject.put("darkmode", xdg(context));
            jSONObject.put("headset", rmu(context));
            jSONObject.put("ringmute", hie(context));
            jSONObject.put("screenscale", je(context));
            jSONObject.put(SpeechConstant.VOLUME, tw());
            jSONObject.put("low_power_mode", ud(context));
            jSONObject.put("enable_draw_feed", qhf.ax());
            if (z) {
                tw.fxn(jSONObject, context);
                jSONObject.put("gp_v_name", rb(context));
                jSONObject.put("gp_v_code", bh(context));
            }
            if (hm2.ke("mnc")) {
                jSONObject.put("mnc", ggo.gff());
            }
            if (hm2.ke("mcc")) {
                jSONObject.put("mcc", ggo.kg());
            }
            jSONObject.put(SocialConstants.PARAM_ACT, com.bytedance.sdk.openadsdk.core.fxn.fxn.kg(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.fxn.fxn.fxn());
            String gff2 = com.bytedance.sdk.openadsdk.core.hie.gff.gff();
            new Object[]{"getEnvcodeForBidding:", Long.valueOf(com.bytedance.sdk.openadsdk.core.hie.gff.hm())};
            if (!TextUtils.isEmpty(gff2)) {
                jSONObject.put("sof_chara", gff2);
            }
            String kg2 = com.bytedance.sdk.openadsdk.multipro.hm.hm.kg("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!kg2.isEmpty()) {
                jSONObject.put("ipv6", kg2);
            }
            jSONObject.put("is_multi", com.bytedance.sdk.openadsdk.multipro.kg.gff());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject sg(Context context) {
        return fxn(context, false);
    }

    public static int gff() {
        return com.bytedance.sdk.openadsdk.core.gff.fxn().kg("limit_ad_track", -1);
    }

    public static String hm() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static float rb() {
        int i = -1;
        try {
            Context fxn2 = com.bytedance.sdk.openadsdk.core.rmu.fxn();
            if (fxn2 != null) {
                i = Settings.System.getInt(fxn2.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    public static int bh() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.rmu.fxn().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static int tw(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static int jq(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static int xdg(Context context) {
        int i;
        try {
            i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i == 32) {
            return 1;
        }
        return i == 16 ? 0 : -1;
    }

    private static int rmu(Context context) {
        return ckl;
    }

    public static int hie(Context context) {
        return tw;
    }

    private static float je(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int sg() {
        return rlu;
    }

    public static int tw() {
        return zu;
    }

    public static int jq() {
        return jq;
    }

    private static int ud(Context context) {
        return xdg;
    }

    public static String hie() {
        if (TextUtils.isEmpty(fxn)) {
            fxn = com.bytedance.sdk.openadsdk.core.gff.fxn().kg("framework_name", "");
        }
        return fxn;
    }

    public static void dgx() {
        com.bytedance.sdk.openadsdk.core.settings.rlu.fxn(new mvp.fxn() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.mvp.fxn
            public void fxn() {
                com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().fxn(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.mvp.fxn
            public void kg() {
                com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().fxn(true);
            }
        });
        Context fxn2 = com.bytedance.sdk.openadsdk.core.rmu.fxn();
        if (fxn2 != null) {
            com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("cpu_count", hie.fxn());
            com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("cpu_max_frequency", hie.fxn(hie.fxn()));
            com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("cpu_min_frequency", hie.kg(hie.fxn()));
            String dgx2 = qhf.dgx();
            if (dgx2 != null) {
                com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("total_memory", dgx2);
            }
            com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("total_internal_storage", qhf.mvp());
            com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("free_internal_storage", com.bytedance.sdk.component.utils.rmu.fxn());
            com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("total_sdcard_storage", qhf.ckl());
            com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("is_root", qhf.rmu() ? 1 : 0);
            if (TextUtils.isEmpty(hie())) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    fxn = PluginErrorDetails.Platform.UNITY;
                } catch (ClassNotFoundException unused) {
                    fxn = "native";
                }
                com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("framework_name", fxn);
            }
            mvp();
            dx(fxn2);
            xdg = iwp(fxn2);
            tw.fxn(fxn2);
        }
    }

    public static void mvp() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.rmu.fxn().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                tw = 1;
            } else if (ringerMode == 1) {
                tw = 2;
            } else {
                tw = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static void dx(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            jq = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            rlu = streamVolume;
            zu = (int) ((streamVolume / jq) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ums(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        yws.kg(new com.bytedance.sdk.component.tw.tw("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.xdg = DeviceUtils.iwp(applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int iwp(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI") && !Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return jz(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int jz(Context context) {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("XIAOMI") ? Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0 : (Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void dgx(Context context) {
        AudioInfoReceiver.kg(context);
    }

    public static void mvp(Context context) {
        Context applicationContext;
        if (rb || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                bx(applicationContext);
            } else {
                fxn.kg(applicationContext);
            }
            rb = true;
        } catch (Throwable unused) {
        }
    }

    private static void bx(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.ums(applicationContext);
            }
        });
    }

    static class kg extends BroadcastReceiver {
        kg() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.bh = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.bh = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.kg = System.currentTimeMillis();
            }
        }
    }

    public static class gff extends com.bytedance.sdk.component.tw.tw {
        public gff() {
            super("gaid_task");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [com.bytedance.sdk.openadsdk.core.gff] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v3 */
        @Override // java.lang.Runnable
        public void run() {
            ?? r4;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.rmu.fxn());
                if (advertisingIdInfo != null) {
                    boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    if (isLimitAdTrackingEnabled) {
                        com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().fxn(1);
                    }
                    DeviceUtils.kg(advertisingIdInfo, isLimitAdTrackingEnabled);
                    r4 = isLimitAdTrackingEnabled;
                } else {
                    r4 = -1;
                }
                if (r4 != -1) {
                    com.bytedance.sdk.openadsdk.core.gff.fxn().fxn("limit_ad_track", r4);
                }
            } catch (IOException e) {
                com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().fxn(2);
                com.bytedance.sdk.component.utils.dx.fxn("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().fxn(2);
                com.bytedance.sdk.component.utils.dx.gff("TTAD.DeviceUtils", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kg(AdvertisingIdClient.Info info, boolean z) {
        if (z || !com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().gff()) {
            return;
        }
        String id2 = info.getId();
        String kg2 = com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().kg();
        if (!TextUtils.isEmpty(id2)) {
            com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().fxn(id2);
            com.bytedance.sdk.openadsdk.core.hie.gff.fxn(id2);
        }
        if (kg2.equals(id2)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mvp.fxn();
    }

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.mvp.tw> fxn = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void kg(Context context) {
            if (DeviceUtils.hm || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.jq.fxn());
                boolean unused = DeviceUtils.hm = true;
            } catch (Throwable unused2) {
            }
        }

        public static void fxn(com.bytedance.sdk.openadsdk.mvp.tw twVar) {
            if (twVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.mvp.tw> copyOnWriteArrayList = fxn;
                if (copyOnWriteArrayList.contains(twVar)) {
                    return;
                }
                copyOnWriteArrayList.add(twVar);
            }
        }

        public static void kg(com.bytedance.sdk.openadsdk.mvp.tw twVar) {
            if (twVar == null) {
                return;
            }
            fxn.remove(twVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = DeviceUtils.rlu = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        if (!fxn.isEmpty()) {
                            yws.fxn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Iterator<com.bytedance.sdk.openadsdk.mvp.tw> it = AudioInfoReceiver.fxn.iterator();
                                    while (it.hasNext()) {
                                        it.next().kg(DeviceUtils.rlu);
                                    }
                                }
                            });
                        }
                        if (DeviceUtils.jq != 0) {
                            int unused2 = DeviceUtils.zu = (int) ((DeviceUtils.rlu / DeviceUtils.jq) * 100.0d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = DeviceUtils.ckl = intent.getIntExtra("state", 0);
                }
            } catch (Exception unused4) {
            }
        }
    }

    private static class fxn extends BroadcastReceiver {
        private fxn() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void kg(Context context) {
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(new fxn(), intentFilter, 2);
                } else {
                    context.registerReceiver(new fxn(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.ums(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.xdg = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }
}
