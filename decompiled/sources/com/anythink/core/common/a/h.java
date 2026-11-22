package com.anythink.core.common.a;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    final String f3622a = "h";
    Map<String, Integer> b = new ConcurrentHashMap();
    Map<String, Integer> c = new ConcurrentHashMap();
    int d = 0;
    int e = 0;

    public final synchronized void a(g gVar) {
        if (gVar != null) {
            gVar.toString();
            String b = gVar.b();
            int d = gVar.d();
            if (d == 4) {
                a(b);
            } else if (d == 6) {
                b(b);
            }
        }
    }

    public final synchronized void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d++;
            this.b.put(str, Integer.valueOf(a(this.b, str) + 1));
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.e++;
            this.c.put(str, Integer.valueOf(a(this.c, str) + 1));
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<Map.Entry<String, Integer>> it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    int a2 = a(this.b, key);
                    int a3 = a(this.c, key);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("dsp_id", key);
                    jSONObject2.put("show_c", a2);
                    jSONObject2.put("click_c", a3);
                    jSONArray.put(jSONObject2);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("ad_fc", jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static int a(Map<String, Integer> map, String str) {
        Integer num;
        if (map == null || (num = map.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
