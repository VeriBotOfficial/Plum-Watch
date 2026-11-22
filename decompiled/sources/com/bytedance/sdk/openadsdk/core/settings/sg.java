package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class sg {
    public static final sg fxn = new sg(null);
    public static String kg = "";
    public boolean bh;
    public String gff;
    public boolean hm;
    public boolean rb;

    public sg(String str) {
        this.gff = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.hm = true;
        this.rb = true;
        this.bh = true;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String optString = optJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(optString)) {
                this.gff = optString;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
            this.hm = arrayList.contains("load_finish");
            this.bh = arrayList.contains("load_fail");
            this.rb = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
