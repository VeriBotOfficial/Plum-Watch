package sg.bigo.ads.controller.a;

import android.text.TextUtils;
import android.util.Patterns;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class d {
    public static String a(String str, String str2) {
        try {
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder(str);
            String authority = url.getAuthority();
            int lastIndexOf = str.lastIndexOf(authority);
            if (lastIndexOf >= 0) {
                sb.replace(lastIndexOf, authority.length() + lastIndexOf, str2);
            }
            return sb.toString();
        } catch (Exception e) {
            sg.bigo.ads.common.t.a.a(0, "AntiBanUtils", "replaceHost error： " + e.getMessage());
            return str;
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBanUtils", "\"" + str + "\" is invalid host");
            return false;
        }
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        return Patterns.DOMAIN_NAME.matcher(str).matches();
    }

    public static Map<String, String> b(String str) {
        JSONArray jSONArray;
        HashMap hashMap = new HashMap();
        if (!q.a((CharSequence) str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException unused) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("country", "all");
                        String optString2 = optJSONObject.optString("host", "");
                        if (a(optString2)) {
                            hashMap.put(optString, optString2);
                        }
                    }
                }
            }
        }
        return hashMap;
    }
}
