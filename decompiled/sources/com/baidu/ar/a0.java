package com.baidu.ar;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes12.dex */
public class a0 {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baidu.ar.x a(android.content.Context r4) {
        /*
            java.lang.String r0 = "ar_ability_classification"
            r1 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r1)
            java.lang.String r0 = "s"
            r1 = 0
            java.lang.String r0 = r4.getString(r0, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L1e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
            r2.<init>(r0)     // Catch: org.json.JSONException -> L1a
            goto L1f
        L1a:
            r0 = move-exception
            r0.printStackTrace()
        L1e:
            r2 = r1
        L1f:
            if (r2 == 0) goto L33
            com.baidu.ar.x r0 = new com.baidu.ar.x
            r0.<init>()
            java.lang.String r1 = "v"
            java.lang.String r3 = ""
            java.lang.String r4 = r4.getString(r1, r3)
            r0.f7311a = r4
            r0.b = r2
            return r0
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.a0.a(android.content.Context):com.baidu.ar.x");
    }

    public static void a(Context context, x xVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("ar_ability_classification", 0).edit();
        edit.putString("v", xVar.f7311a);
        edit.putString("s", xVar.b.toString());
        edit.putInt("sv", o.a());
        edit.apply();
    }
}
