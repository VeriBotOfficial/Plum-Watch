package com.bytedance.sdk.openadsdk.ckl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.m.m.b;
import com.baidu.mapapi.SDKInitializer;
import com.bytedance.sdk.component.tw.tw;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.ckl.fxn.hm;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.core.mvp;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.core.settings.rlu;
import com.bytedance.sdk.openadsdk.core.zu;
import com.bytedance.sdk.openadsdk.utils.qhf;
import com.bytedance.sdk.openadsdk.utils.yws;
import com.phancy.mini.core.api.ApiError;
import com.qumeng.overseas.advlib.trdparty.unionset.network.c;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class gff {
    private static volatile gff fxn;

    private boolean gff(hm hmVar) {
        return hmVar == null;
    }

    private gff() {
    }

    public static gff fxn() {
        if (fxn == null) {
            synchronized (gff.class) {
                if (fxn == null) {
                    fxn = new gff();
                }
            }
        }
        return fxn;
    }

    public static void fxn(final jz jzVar) {
        if (jzVar == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        fxn("bidding_receive", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.1
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", currentTimeMillis);
                if (jzVar.va() == 3) {
                    jSONObject.put("is_icon_only", jzVar.ke() ? 1 : 0);
                }
                return hm.kg().fxn("bidding_receive").kg(jSONObject.toString());
            }
        });
    }

    public static void fxn(jz jzVar, final long j) {
        if (jzVar == null) {
            return;
        }
        fxn("bidding_load", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.11
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                return hm.kg().fxn("bidding_load").kg(jSONObject.toString());
            }
        });
    }

    public static void fxn(final String str, final com.bytedance.sdk.openadsdk.hm.rb.kg.fxn fxnVar) {
        if (fxnVar == null) {
            return;
        }
        fxn(str, false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.16
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject gff = com.bytedance.sdk.openadsdk.hm.rb.kg.fxn.this.gff();
                if (gff == null) {
                    gff = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.hm.rb.kg.gff hm = com.bytedance.sdk.openadsdk.hm.rb.kg.fxn.this.hm();
                if (hm != null) {
                    hm.fxn(gff);
                }
                return hm.kg().fxn(str).fxn(com.bytedance.sdk.openadsdk.hm.rb.kg.fxn.this.fxn().va()).kg(gff.toString());
            }
        });
    }

    public static void kg(final jz jzVar) {
        if (qhf.fxn(jzVar) == null || TextUtils.isEmpty(jzVar.wh())) {
            return;
        }
        fxn("download_gecko_start", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.17
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", jz.this.rhk());
                jSONObject.put("channel_name", jz.this.wh());
                return hm.kg().fxn("download_gecko_start").fxn(jz.this.va()).kg(jSONObject.toString());
            }
        });
    }

    public static void fxn(final jz jzVar, final JSONObject jSONObject) {
        if (qhf.fxn(jzVar) == null || TextUtils.isEmpty(jzVar.wh())) {
            return;
        }
        fxn("download_gecko_end", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.18
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", jz.this.rhk());
                jSONObject2.put("channel_name", jz.this.wh());
                jSONObject2.put("data", jSONObject);
                return hm.kg().fxn("download_gecko_end").fxn(jz.this.va()).kg(jSONObject2.toString());
            }
        });
    }

    public void fxn(final hm hmVar) {
        if (gff(hmVar)) {
            return;
        }
        hmVar.fxn("express_ad_render");
        rmu.rb().fxn(new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.19
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                return hmVar;
            }
        });
    }

    public void kg(final hm hmVar) {
        if (gff(hmVar)) {
            return;
        }
        hmVar.fxn("show_backup_endcard");
        rmu.rb().fxn(new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.20
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                return hmVar;
            }
        });
    }

    public void fxn(final String str) {
        fxn("click_playable_test_tool", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.2
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return hm.kg().fxn("click_playable_test_tool").kg(jSONObject.toString());
            }
        });
    }

    public void fxn(final String str, final int i, final String str2) {
        fxn("use_playable_test_tool_error", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.3
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, i);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return hm.kg().fxn("use_playable_test_tool_error").kg(jSONObject.toString());
            }
        });
    }

    public void fxn(final long j, final long j2) {
        final long j3 = j2 - j;
        fxn("general_label", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.4
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                int i = !zu.kg.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return hm.kg().fxn("general_label").tw(String.valueOf(j3)).kg(jSONObject.toString());
            }
        });
    }

    public static void kg() {
        yws.gff(new tw("showFailLog") { // from class: com.bytedance.sdk.openadsdk.ckl.gff.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    gff.fxn().fxn("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    dx.gff("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public void fxn(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        fxn(str, false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.6
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                return hm.kg().fxn(str).kg(jSONObject.toString());
            }
        });
    }

    public void fxn(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        fxn(str, false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.7
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                return hm.kg().fxn(str).kg(str2);
            }
        });
    }

    public void gff() {
        fxn("blind_mode_status", true, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.8
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                return hm.kg().fxn("blind_mode_status");
            }
        });
    }

    public void fxn(final JSONObject jSONObject) {
        if (jSONObject == null) {
            dx.fxn("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object opt = jSONObject.opt("device_ad_mediation_platform");
        if (!(opt instanceof String) || TextUtils.isEmpty((String) opt)) {
            dx.fxn("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            dx.fxn("adRevenuePangle", c.v, "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            fxn("ad_revenue", true, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.9
                @Override // com.bytedance.sdk.openadsdk.ckl.kg
                public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put(CommonUrlParts.UUID, mvp.gff(rmu.fxn()));
                        String str = "";
                        try {
                            if (mvp.fxn(rmu.fxn()) != null) {
                                str = mvp.fxn(rmu.fxn());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", str);
                        jSONObject.put("platform", "android");
                        jSONObject.put(b.z0, "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return hm.kg().fxn("ad_revenue").kg(jSONObject.toString());
                }
            });
        }
    }

    public static void hm() {
        fxn("disk_log", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.10
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long fxn2 = gff.fxn(file2);
                        j += fxn2;
                        jSONObject.put(file2.getName(), fxn2);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return hm.kg().fxn("disk_log").kg(jSONObject.toString());
            }
        });
    }

    public static long fxn(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        for (File file2 : file.listFiles()) {
            j += fxn(file2);
        }
        return j;
    }

    public static void kg(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final hm kg = hm.kg().fxn(str).kg(str2);
                rmu.rb().fxn(new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.12
                    @Override // com.bytedance.sdk.openadsdk.ckl.kg
                    public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                        return hm.this;
                    }
                }, false);
            }
        } catch (Throwable th) {
            dx.gff("StatsLogManager", th.getMessage());
        }
    }

    public static void fxn(String str, boolean z, kg kgVar) {
        fxn(str, z, 100, kgVar);
    }

    public static void fxn(String str, boolean z, int i, kg kgVar) {
        int fxn2 = rlu.jt().fxn(str, i);
        new Object[]{"type=", str, "  ", Integer.valueOf(fxn2)};
        if (TextUtils.isEmpty(str) || fxn2 == 0 || kgVar == null) {
            return;
        }
        boolean z2 = fxn2 == 100;
        if (!z2) {
            z2 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= fxn2;
        }
        if (z2) {
            rmu.rb().fxn(kgVar, z);
        }
    }

    public static void fxn(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = elapsedRealtime - j;
        final long j4 = elapsedRealtime - j2;
        final long j5 = j2 - j;
        fxn("ad_show_cost_time", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.13
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return hm.kg().fxn("ad_show_cost_time").kg(jSONObject.toString());
            }
        });
    }

    public static void fxn(int i, String str) {
        fxn(i, str, 0, (String) null);
    }

    public static void fxn(final int i, final String str, final int i2, final String str2) {
        fxn("ipv6_req", false, (kg) new kg<com.bytedance.sdk.openadsdk.ckl.fxn.gff>() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.14
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 != -1) {
                    str3 = "start";
                } else {
                    jSONObject.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, i2);
                    jSONObject.put("error_msg", str2);
                    str3 = ApiError.ERROR_MSG_FAIL;
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return hm.kg().fxn("ipv6_req").kg(jSONObject.toString());
            }
        });
    }

    public static void fxn(final String str, final boolean z) {
        fxn("img_error_param", false, new kg() { // from class: com.bytedance.sdk.openadsdk.ckl.gff.15
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put("msg", str);
                } catch (Throwable unused) {
                }
                return hm.kg().fxn("img_error_param").kg(jSONObject.toString());
            }
        });
    }
}
