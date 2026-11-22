package com.alipay.sdk.m.v;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public a f1468a;
    public String b;
    public String[] c;

    public b(String str) {
        this.b = str;
    }

    public static void a(b bVar) {
        String[] c = bVar.c();
        if (c.length == 3 && TextUtils.equals("tid", c[0])) {
            com.alipay.sdk.m.x.a a2 = com.alipay.sdk.m.x.a.a(com.alipay.sdk.m.w.b.c().b());
            if (TextUtils.isEmpty(c[1]) || TextUtils.isEmpty(c[2])) {
                return;
            }
            a2.a(c[1], c[2]);
        }
    }

    public static String[] b(String str) {
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf == -1 || lastIndexOf <= indexOf) {
            return null;
        }
        for (String str2 : str.substring(indexOf + 1, lastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll(Separators.QUOTE, "").replaceAll("\"", ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] c() {
        return this.c;
    }

    public b(String str, a aVar) {
        this.b = str;
        this.f1468a = aVar;
    }

    public static List<b> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            String[] a2 = a(jSONObject.optString("name", ""));
            for (int i = 0; i < a2.length; i++) {
                a a3 = a.a(a2[i]);
                if (a3 != a.None) {
                    b bVar = new b(a2[i], a3);
                    bVar.c = b(a2[i]);
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public String b() {
        return this.b;
    }

    public static String[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }

    public a a() {
        return this.f1468a;
    }
}
