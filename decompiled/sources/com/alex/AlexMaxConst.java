package com.alex;

import com.applovin.sdk.AppLovinSdk;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public class AlexMaxConst {
    private static final String ADAPTER_VERSION = "1.2.6";
    public static final String IS_ADAPTIVE = "is_adaptive";
    public static final String KEY_AD_UNIT_ID = "ad_unit_id";
    public static final String KEY_COUNTRY_CODE = "country_code";
    public static final String KEY_CREATIVE_ID = "creative_id";
    public static final String KEY_FORMAT = "format";
    public static final String KEY_NETWORK_NAME = "network_name";
    public static final String KEY_NETWORK_PLACEMENT_ID = "network_placement_id";
    public static final String KEY_PLACEMENT = "placement";
    public static final String KEY_REVENUE = "revenue";

    public static class REWARD_EXTRA {
        public static final String REWARD_EXTRA_KEY_REWARD_AMOUNT = "alex_reward_amount";
        public static final String REWARD_EXTRA_KEY_REWARD_LABEL = "alex_reward_label";
    }

    public static double getMaxPriceValue(Map<String, Object> map) {
        try {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.contains("dynamic_max_price")) {
                    return Double.parseDouble(map.get(next).toString());
                }
                continue;
            }
            return -1.0d;
        } catch (Throwable unused) {
            return -1.0d;
        }
    }

    public static Object getMaxUnitInfoObj(Map<String, Object> map) {
        try {
            for (String str : map.keySet()) {
                if (str.contains("dynamic_unit_info")) {
                    return map.get(str);
                }
                continue;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getNetworkVersion() {
        try {
            return AppLovinSdk.VERSION;
        } catch (Throwable unused) {
            return "";
        }
    }
}
