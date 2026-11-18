package com.anythink.basead.b.e;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, a> f2305a = new HashMap();

    public final void a(JSONArray jSONArray) {
        this.f2305a.clear();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int r0 = 0; r0 < jSONArray.length(); r0++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(r0);
                String strOptString = jSONObject.optString("macro");
                if (!TextUtils.isEmpty(strOptString)) {
                    a aVar = new a();
                    aVar.f2306a = strOptString;
                    aVar.b = jSONObject.optInt("action", 1);
                    aVar.c = jSONObject.optString("value", "");
                    this.f2305a.put(strOptString, aVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final String a(String str, String str2) {
        a aVar;
        Map<String, a> map = this.f2305a;
        if (map == null || (aVar = map.get(str)) == null) {
            return str2;
        }
        int r3 = aVar.b;
        if (r3 == 2) {
            return "";
        }
        if (r3 == 3) {
            return Matcher.quoteReplacement(aVar.c);
        }
        return aVar.f2306a;
    }

    static class a {
        private static final int d = 1;
        private static final int e = 2;
        private static final int f = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2306a;
        public int b;
        public String c;

        a() {
        }

        private String a() {
            int r0 = this.b;
            if (r0 == 2) {
                return "";
            }
            if (r0 == 3) {
                return Matcher.quoteReplacement(this.c);
            }
            return this.f2306a;
        }
    }
}
