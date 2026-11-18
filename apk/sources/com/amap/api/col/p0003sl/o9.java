package com.amap.api.col.p0003sl;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: AMapLogEntity.java */
/* JADX INFO: loaded from: classes7.dex */
public class o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1810a;
    private int b;
    private long c = System.currentTimeMillis();
    private String d;

    private o9(int r1, String str, String str2) {
        this.f1810a = str2;
        this.b = r1;
        this.d = str;
    }

    public static o9 a(String str, String str2) {
        return new o9(2, str, str2);
    }

    public static o9 b(String str, String str2) {
        return new o9(1, str, str2);
    }

    public int c() {
        return this.b;
    }

    public String a() {
        return this.b == 2 ? "error" : ParameterNames.INFO;
    }

    public String b() {
        new JSONObject();
        return this.f1810a;
    }

    public static String a(Context context, List<o9> list) {
        String string;
        if (list == null) {
            return "";
        }
        try {
            if (list.size() == 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (o9 o9Var : list) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ParameterNames.INFO, o9Var.b());
                    jSONObject.put("session", o9Var.d);
                    jSONObject.put("timestamp", o9Var.c);
                    string = jSONObject.toString();
                } catch (Throwable unused) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    jSONArray.put(string);
                }
            }
            return jSONArray.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }
}
