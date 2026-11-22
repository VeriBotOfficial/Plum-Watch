package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SPConfigUtil.java */
/* loaded from: classes11.dex */
public final class s9 {

    /* renamed from: a, reason: collision with root package name */
    private l9 f1875a;

    /* compiled from: SPConfigUtil.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public static Map<String, s9> f1876a = new HashMap();
    }

    /* compiled from: SPConfigUtil.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f1877a;
        private String b;
        private String c;

        public b(String str, String str2, String str3) {
            this.f1877a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                str = this.f1877a;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.b;
            }
            return this.f1877a.equals(str) && this.b.equals(str2);
        }

        public static JSONArray a(List<b> list) {
            JSONArray jSONArray = new JSONArray();
            for (b bVar : list) {
                if (bVar != null && !TextUtils.isEmpty(bVar.c)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(com.heytap.mcssdk.constant.b.C, bVar.f1877a);
                        jSONObject.put("cpuType", bVar.b);
                        jSONObject.put("content", bVar.c);
                    } catch (Throwable unused) {
                        jSONObject = new JSONObject();
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        }

        public static List<b> a(String str) {
            b bVar;
            if (TextUtils.isEmpty(str)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    try {
                        bVar = new b(jSONObject.optString(com.heytap.mcssdk.constant.b.C), jSONObject.optString("cpuType"), jSONObject.optString("content"));
                    } catch (Throwable unused) {
                        bVar = null;
                    }
                    arrayList.add(bVar);
                }
                return arrayList;
            } catch (Throwable unused2) {
                return new ArrayList();
            }
        }
    }

    private s9(l9 l9Var) {
        this.f1875a = l9Var;
    }

    public static s9 a(l9 l9Var) {
        if (l9Var == null || TextUtils.isEmpty(l9Var.d())) {
            return null;
        }
        if (a.f1876a.get(l9Var.d()) == null) {
            a.f1876a.put(l9Var.d(), new s9(l9Var));
        }
        return a.f1876a.get(l9Var.d());
    }

    private static void b(Context context, String str, String str2, String str3) {
        if (str3 == null || TextUtils.isEmpty(str)) {
            return;
        }
        String str4 = "C7ADB20F22F238708BA5EE26D0401DB9" + i9.c(str);
        String concat = "ik".concat(String.valueOf(str2));
        if (TextUtils.isEmpty(concat) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
            return;
        }
        String b2 = m9.b(x8.b(m9.e(str3)));
        SharedPreferences.Editor edit = context.getSharedPreferences(str4, 0).edit();
        edit.putString(concat, b2);
        edit.commit();
    }

    public final String a(Context context, String str, String str2, String str3) {
        l9 l9Var;
        if (context != null && (l9Var = this.f1875a) != null && !TextUtils.isEmpty(l9Var.d())) {
            ArrayList arrayList = (ArrayList) b.a(a(context, this.f1875a.d(), str3));
            if (arrayList.size() == 0) {
                return "";
            }
            for (int i = 0; i < arrayList.size(); i++) {
                b bVar = (b) arrayList.get(i);
                if (bVar.a(str, str2)) {
                    return bVar.c;
                }
            }
        }
        return null;
    }

    public final void a(Context context, String str, String str2, String str3, String str4) {
        l9 l9Var;
        if (context == null || (l9Var = this.f1875a) == null || TextUtils.isEmpty(l9Var.d())) {
            return;
        }
        List<b> a2 = b.a(a(context, this.f1875a.d(), str3));
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) a2;
            if (i < arrayList.size()) {
                b bVar = (b) arrayList.get(i);
                if (bVar.a(str, str2)) {
                    bVar.c = str4;
                    b(context, this.f1875a.d(), str3, b.a(a2).toString());
                    return;
                }
                i++;
            } else {
                arrayList.add(new b(str, str2, str4));
                b(context, this.f1875a.d(), str3, b.a(a2).toString());
                return;
            }
        }
    }

    private static String a(Context context, String str, String str2) {
        String str3 = "C7ADB20F22F238708BA5EE26D0401DB9" + i9.c(str);
        String concat = "ik".concat(String.valueOf(str2));
        return TextUtils.isEmpty(concat) ? "" : m9.c(x8.a(m9.c(context.getSharedPreferences(str3, 0).getString(concat, ""))));
    }
}
