package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
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
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.gff = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int r1 = 0; r1 < jSONArrayOptJSONArray.length(); r1++) {
                arrayList.add(jSONArrayOptJSONArray.optString(r1));
            }
            this.hm = arrayList.contains("load_finish");
            this.bh = arrayList.contains("load_fail");
            this.rb = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
