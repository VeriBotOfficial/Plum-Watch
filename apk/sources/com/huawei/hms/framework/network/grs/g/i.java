package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class i {
    public static String a(String str, String str2) {
        return !str.equals(str2) ? b(str, str2) : str;
    }

    private static String b(String str, String str2) throws JSONException {
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("services");
            for (int r1 = 0; r1 < jSONArray.length(); r1++) {
                hashSet.add(jSONArray.getString(r1));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            JSONArray jSONArray2 = new JSONObject(str2).getJSONArray("services");
            for (int r2 = 0; r2 < jSONArray2.length(); r2++) {
                hashSet.add(jSONArray2.getString(r2));
            }
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray3.put((String) it.next());
        }
        jSONObject.put("services", jSONArray3);
        return jSONObject.toString();
    }
}
