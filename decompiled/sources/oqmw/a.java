package oqmw;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class a {
    public static Map<String, String> a(Object obj) {
        if (obj == null) {
            return null;
        }
        return a(obj.toString());
    }

    private static Map<String, String> a(String str) {
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray2 = jSONObject.optJSONArray("seatbid");
                if (optJSONArray2 != null && optJSONArray2.length() > 0 && (optJSONObject = optJSONArray2.optJSONObject(0)) != null && (optJSONObject.has("price") || optJSONObject.has("oid") || optJSONObject.has("full_u"))) {
                    jSONObject = optJSONObject;
                }
                hashMap.put("price", jSONObject.optString("price", ""));
                hashMap.put("dsp_id", jSONObject.optString("dsp_id", ""));
                hashMap.put("full_u", jSONObject.optString("full_u", ""));
                hashMap.put("tp_logo_u", jSONObject.optString("tp_logo_u", ""));
                hashMap.put("click_u", jSONObject.optString("click_u", ""));
                ArrayList arrayList = new ArrayList();
                JSONObject optJSONObject2 = jSONObject.optJSONObject("tk");
                if (optJSONObject2 != null && (optJSONArray = optJSONObject2.optJSONArray("imp")) != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                }
                hashMap.put("tk_imp", arrayList.isEmpty() ? "" : TextUtils.join(",", arrayList));
                return hashMap;
            } catch (Exception e) {
                Log.e("AdJsonUtils", "Parse error: " + e.getMessage());
            }
        }
        return hashMap;
    }
}
