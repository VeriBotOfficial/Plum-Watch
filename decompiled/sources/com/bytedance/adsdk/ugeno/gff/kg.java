package com.bytedance.adsdk.ugeno.gff;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.gff.fxn;
import com.bytedance.adsdk.ugeno.rb;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class kg {
    public static String fxn(String str, JSONObject jSONObject) {
        fxn gff;
        fxn.InterfaceC0458fxn fxn;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (gff = rb.fxn().gff()) != null && (fxn = gff.fxn(str.substring(2, str.length() - 1))) != null) {
                    return (String) fxn.fxn(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
