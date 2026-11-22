package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.common.d.j;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.baidu.ar.constants.HttpConstants;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.tw.tw;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.core.bx;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.core.mvp;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.core.settings.bh;
import com.bytedance.sdk.openadsdk.multipro.hm.hm;
import com.bytedance.sdk.openadsdk.utils.qhf;
import com.bytedance.sdk.openadsdk.utils.yws;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.umeng.analytics.pro.ak;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ApmHelper {
    private static fxn bh = null;
    private static volatile boolean fxn = false;
    private static String gff;
    private static boolean hm;
    private static final AtomicBoolean kg = new AtomicBoolean(false);
    private static kg rb;

    private interface kg {
        void fxn(String str, String str2, Throwable th);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (kg.compareAndSet(false, true) && !fxn) {
            yws.fxn(new tw("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.fxn) {
                        bh hm2 = rmu.hm();
                        boolean unused = ApmHelper.hm = hm2.wc();
                        String je = qhf.je();
                        if (ApmHelper.hm && !TextUtils.isEmpty(je)) {
                            String unused2 = ApmHelper.gff = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String fxn2 = mvp.fxn(context);
                            try {
                                Npth.setCrashWaitTime(com.bytedance.sdk.openadsdk.ums.fxn.fxn("apm_crash_wait_time", 10000));
                                Npth.enableLoopMonitor(false);
                                Npth.enableAnrInfo(false);
                                Npth.enableNativeDump(false);
                                Npth.enableActivityDump(false);
                                Npth.enableMessageDump(false);
                                MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.CustomRequestHeader
                                    public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                        Pair<String, String> generateRequestHeader = ApmHelper.generateRequestHeader();
                                        httpURLConnection.setRequestProperty("cypher", (String) generateRequestHeader.first);
                                        httpURLConnection.setRequestProperty("transfer-param", (String) generateRequestHeader.second);
                                        httpURLConnection.setRequestProperty("x-pangle-target-idc", rmu.hm().vkm());
                                    }
                                });
                                final MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 7602L, BuildConfig.VERSION_NAME, strArr);
                                initSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.apm.insight.AttachUserData
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> tw = ApmHelper.tw();
                                        if (tw.containsKey(j.w.E)) {
                                            initSDK.addTags(j.w.E, tw.get(j.w.E));
                                            return tw;
                                        }
                                        initSDK.addTags(j.w.E, "-2");
                                        return tw;
                                    }
                                });
                                if (hm2.kwn()) {
                                    initSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                initSDK.config().setDeviceId(fxn2);
                                initSDK.setReportUrl(je);
                                initSDK.addTags("host_appid", ApmHelper.gff);
                                initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                kg unused3 = ApmHelper.rb = new kg() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.kg
                                    public void fxn(String str, String str2, Throwable th) {
                                        initSDK.reportCustomErr(str, str2, th);
                                    }
                                };
                                boolean unused4 = ApmHelper.fxn = true;
                                ApmHelper.gff(fxn2, je);
                                fxn fxnVar = ApmHelper.bh;
                                fxn unused5 = ApmHelper.bh = null;
                                if (fxnVar != null) {
                                    ApmHelper.rb.fxn(fxnVar.fxn, fxnVar.kg, fxnVar.gff);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.fxn = false;
                            }
                        }
                    }
                    ApmHelper.kg.set(false);
                }
            });
        }
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        kg kgVar = rb;
        if (kgVar != null) {
            kgVar.fxn(str, str2, th);
        } else {
            bh = new fxn(str, str2, th);
        }
    }

    private static class fxn {
        public final String fxn;
        public final Throwable gff;
        public final String kg;

        public fxn(String str, String str2, Throwable th) {
            this.fxn = str;
            this.kg = str2;
            this.gff = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> tw() {
        HashMap hashMap = new HashMap();
        jz kg2 = com.bytedance.sdk.openadsdk.utils.kg.kg();
        if (kg2 != null) {
            hashMap.put("adType", String.valueOf(kg2.va()));
            hashMap.put("aid", String.valueOf(kg2.sp()));
            hashMap.put("cid", kg2.gq());
            hashMap.put("reqId", kg2.etc());
            hashMap.put("rit", kg2.ci("-1"));
            int bfa = kg2.bfa();
            if (kg2.qn() != 2) {
                bfa = -1;
            }
            hashMap.put(j.w.E, String.valueOf(bfa));
        }
        return hashMap;
    }

    private static void kg(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        rmu.gff().fxn(kg(str), "https://" + str2 + "/monitor/collect/c/session?version_code=7602&device_platform=android&aid=10000001");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gff(String str, String str2) {
        kg(str, str2);
    }

    public static void reportPvFromBackGround() {
        if (hm) {
            kg(mvp.fxn(rmu.fxn()), qhf.je());
        }
    }

    private static JSONObject kg(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", gff);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put(ak.F, Build.BRAND);
            jSONObject2.put(HttpConstants.SDK_VERSION_NAME, "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            dx.gff("ApmHelper", e.getMessage());
            return jSONObject;
        }
    }

    public static boolean isIsInit() {
        return fxn;
    }

    public static Pair<String, String> generateRequestHeader() {
        String str = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().kg());
            jSONObject.put("ipv6", hm.kg("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", rmu.hm().ils());
        } catch (JSONException unused) {
        }
        JSONObject encryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new bx(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str2 = "0";
        if (encryptType4WithNoWrapBase64 != null) {
            int optInt = encryptType4WithNoWrapBase64.optInt("cypher");
            if (optInt == 4) {
                str = encryptType4WithNoWrapBase64.optString("message");
                str2 = "4";
            } else if (optInt == 3) {
                str = encryptType4WithNoWrapBase64.optString("message");
                str2 = "3";
            } else {
                str = jSONObject.toString();
            }
        }
        return new Pair<>(str2, str);
    }
}
