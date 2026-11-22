package com.bytedance.sdk.openadsdk.hm.fxn;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class bh {
    public static AtomicInteger fxn = new AtomicInteger(0);
    public static AtomicInteger kg = new AtomicInteger(0);
    public static AtomicInteger gff = new AtomicInteger(0);
    public static AtomicInteger hm = new AtomicInteger(0);
    public static AtomicInteger rb = new AtomicInteger(0);
    public static AtomicInteger bh = new AtomicInteger(0);

    /* renamed from: sg, reason: collision with root package name */
    public static AtomicInteger f9554sg = new AtomicInteger(0);
    public static AtomicInteger tw = new AtomicInteger(0);
    public static AtomicInteger jq = new AtomicInteger(0);

    public static void fxn() {
        try {
            long fxn2 = com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            if (fxn2 > 0 && System.currentTimeMillis() - fxn2 >= 86400000) {
                kg();
                com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (fxn2 <= 0 || fxn2 > System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
            }
            JSONObject jSONObject = new JSONObject(com.bytedance.sdk.openadsdk.multipro.hm.fxn.kg("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int optInt = jSONObject.optInt("load_get_ad_version", 0);
            if (optInt >= 5702 && (optInt < 5800 || optInt >= 5802)) {
                fxn.addAndGet(jSONObject.optInt("load_times"));
                kg.addAndGet(jSONObject.optInt("load_success"));
                gff.addAndGet(jSONObject.optInt("load_fail"));
                hm.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                rb.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                bh.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                f9554sg.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                tw.addAndGet(jSONObject.optInt("load_fail_by_io"));
                jq.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void kg() {
        try {
            com.bytedance.sdk.openadsdk.ckl.gff.fxn().fxn("pangle_sdk_get_ad_track", com.bytedance.sdk.openadsdk.multipro.hm.fxn.kg("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void gff() {
        try {
            com.bytedance.sdk.openadsdk.multipro.hm.fxn.fxn("tt_sdk_event_get_ad", "get_ad_event_key", hm().toString());
        } catch (Throwable unused) {
        }
    }

    public static JSONObject hm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_times", fxn.get());
            jSONObject.put("load_success", kg.get());
            jSONObject.put("load_fail", gff.get());
            jSONObject.put("load_fail_in_background", jq.get());
            jSONObject.put("load_success_and_parse_success", hm.get());
            jSONObject.put("load_success_and_parse_fail", rb.get());
            jSONObject.put("load_success_and_no_ad", bh.get());
            jSONObject.put("load_fail_by_no_net", f9554sg.get());
            jSONObject.put("load_fail_by_io", tw.get());
            jSONObject.put("load_get_ad_version", BuildConfig.VERSION_CODE);
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void fxn(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
            com.bytedance.sdk.openadsdk.ckl.gff.fxn().fxn("pangle_sdk_client_load_error", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public static void rb() {
        try {
            if (DeviceUtils.kg()) {
                return;
            }
            jq.incrementAndGet();
        } catch (Throwable unused) {
        }
    }
}
