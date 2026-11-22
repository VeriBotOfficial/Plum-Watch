package sg.bigo.ads.ad.banner;

import com.umeng.analytics.pro.ak;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.AdSize;

/* loaded from: classes7.dex */
public final class a {
    public static JSONArray a(List<AdSize> list) {
        JSONArray jSONArray = new JSONArray();
        for (AdSize adSize : list) {
            if (adSize != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("w", adSize.getWidth());
                    jSONObject.put("h", adSize.getHeight());
                    jSONObject.put(ak.aH, AdSize.ADAPTIVE.equals(adSize.f19514a) ? 1 : 0);
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
