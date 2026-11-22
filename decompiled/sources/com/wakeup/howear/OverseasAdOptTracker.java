package com.wakeup.howear;

import com.baidu.mapapi.SDKInitializer;
import com.wakeup.commponent.module.bi.PageEventConstants;
import com.wakeup.commponent.module.bi.PageEventManager;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class OverseasAdOptTracker {
    private static final ConcurrentHashMap<String, String> EXPERIMENT_GROUPS = new ConcurrentHashMap<>();
    public static final String SUB_BANNER_ATTACH = "banner_attach";
    public static final String SUB_BANNER_DETACH = "banner_detach";
    public static final String SUB_INTERS_LOAD_RESULT = "inters_load_result";
    public static final String SUB_INTERS_PRELOAD_TRIGGER = "inters_preload_trigger";
    public static final String SUB_INTERS_SHOW_TRIGGER = "inters_show_trigger";
    public static final String SUB_SPLASH_PRELOAD_RESULT = "splash_preload_result";
    public static final String SUB_SPLASH_PRELOAD_TRIGGER = "splash_preload_trigger";

    private OverseasAdOptTracker() {
    }

    public static void setExperimentGroup(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        EXPERIMENT_GROUPS.put(str, str2);
    }

    private static String currentGroup(String str) {
        String str2 = EXPERIMENT_GROUPS.get(str);
        return str2 != null ? str2 : "not_in_experiment";
    }

    public static void trackSplashPreloadTrigger(String str, String str2, boolean z) {
        JSONObject baseProps = baseProps(SUB_SPLASH_PRELOAD_TRIGGER, "enableSplashPreload");
        putSafe(baseProps, "source", str);
        putSafe(baseProps, "placement_id", str2);
        putSafe(baseProps, "throttle_blocked", Boolean.valueOf(z));
        emit(baseProps);
    }

    public static void trackSplashPreloadResult(String str, String str2, int i, String str3) {
        JSONObject baseProps = baseProps(SUB_SPLASH_PRELOAD_RESULT, "enableSplashPreload");
        putSafe(baseProps, "result", str);
        putSafe(baseProps, "placement_id", str2);
        putSafe(baseProps, SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, Integer.valueOf(i));
        putSafe(baseProps, "error_msg", truncate(str3, 200));
        emit(baseProps);
    }

    public static void trackIntersShowTrigger(boolean z, long j, boolean z2) {
        JSONObject baseProps = baseProps(SUB_INTERS_SHOW_TRIGGER, "enableIntersThrottle");
        putSafe(baseProps, "throttle_blocked", Boolean.valueOf(z));
        putSafe(baseProps, "since_last_ms", Long.valueOf(j));
        putSafe(baseProps, "can_show_ad", Boolean.valueOf(z2));
        emit(baseProps);
    }

    public static void trackIntersLoadResult(String str, int i, String str2) {
        JSONObject baseProps = baseProps(SUB_INTERS_LOAD_RESULT, "enableIntersThrottle");
        putSafe(baseProps, "result", str);
        putSafe(baseProps, SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, Integer.valueOf(i));
        putSafe(baseProps, "error_msg", truncate(str2, 200));
        emit(baseProps);
    }

    public static void trackIntersPreloadTrigger(String str, boolean z) {
        JSONObject baseProps = baseProps(SUB_INTERS_PRELOAD_TRIGGER, "enableIntersThrottle");
        putSafe(baseProps, "placement_id", str);
        putSafe(baseProps, "throttle_blocked", Boolean.valueOf(z));
        emit(baseProps);
    }

    public static void trackBannerAttach(boolean z, long j) {
        JSONObject baseProps = baseProps(SUB_BANNER_ATTACH, "enableBannerLifecycle");
        putSafe(baseProps, "throttle_blocked", Boolean.valueOf(z));
        putSafe(baseProps, "since_last_ms", Long.valueOf(j));
        emit(baseProps);
    }

    public static void trackBannerDetach() {
        emit(baseProps(SUB_BANNER_DETACH, "enableBannerLifecycle"));
    }

    private static JSONObject baseProps(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        putSafe(jSONObject, "sub_event", str);
        putSafe(jSONObject, "experiment_key", str2);
        putSafe(jSONObject, "experiment_group", currentGroup(str2));
        putSafe(jSONObject, "region", "overseas");
        putSafe(jSONObject, "ts", Long.valueOf(System.currentTimeMillis()));
        return jSONObject;
    }

    private static void putSafe(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null || str == null || obj == null) {
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    private static String truncate(String str, int i) {
        if (str == null) {
            return null;
        }
        return str.length() <= i ? str : str.substring(0, i);
    }

    private static void emit(JSONObject jSONObject) {
        try {
            PageEventManager.get().onEventMessage(PageEventConstants.EVENT_OVERSEAS_AD_OPT, jSONObject.toString());
        } catch (Throwable unused) {
        }
    }
}
