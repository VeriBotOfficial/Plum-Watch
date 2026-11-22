package com.amap.api.col.p0003sl;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.l9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SDKSPUtil.java */
/* loaded from: classes11.dex */
public class pa {

    /* renamed from: a, reason: collision with root package name */
    private l9 f1836a;

    public pa(String str) {
        this.f1836a = null;
        try {
            this.f1836a = new l9.a(str, "1.0", "1.0.0").a(new String[]{ParameterNames.INFO}).a();
        } catch (y8 unused) {
        }
    }

    public void a(Context context, l9 l9Var) {
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        arrayList.add(l9Var);
        if (arrayList.size() == 0) {
            jSONArray = new JSONArray();
        } else {
            jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l9 l9Var2 = (l9) it.next();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("a", l9Var2.d());
                    jSONObject.put("b", l9Var2.e());
                    jSONObject.put("c", l9Var2.b());
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; l9Var2.c() != null && i < l9Var2.c().length; i++) {
                        jSONArray2.put(l9Var2.c()[i]);
                    }
                    jSONObject.put("d", jSONArray2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        String jSONArray3 = jSONArray.toString();
        if (TextUtils.isEmpty(jSONArray3)) {
            return;
        }
        oa.a(context, this.f1836a, "rbck", jSONArray3);
    }

    public List<l9> a(Context context) {
        l9 l9Var;
        try {
            JSONArray jSONArray = new JSONArray(oa.a(context, this.f1836a, "rbck"));
            if (jSONArray.length() == 0) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    l9Var = a(jSONArray.getJSONObject(i));
                } catch (JSONException unused) {
                    l9Var = null;
                }
                if (l9Var != null) {
                    arrayList.add(l9Var);
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
            return new ArrayList();
        }
    }

    public l9 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("a");
            String optString2 = jSONObject.optString("b");
            String optString3 = jSONObject.optString("c");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("d");
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
            return new l9.a(optString, optString2, optString).a(optString3).a((String[]) arrayList.toArray(new String[0])).a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
