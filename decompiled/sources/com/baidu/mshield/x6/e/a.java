package com.baidu.mshield.x6.e;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: DataReportCtrl.java */
/* loaded from: classes13.dex */
public class a {
    public static boolean a(Context context, String str) {
        return b(context, str, true);
    }

    public static boolean b(Context context, String str, boolean z) {
        try {
            return a(context, str, z);
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
            return z;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        try {
            String a2 = new com.baidu.mshield.x6.b.b(context).a(str);
            return TextUtils.isEmpty(a2) ? z : new JSONObject(a2).getInt("1") != 0;
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
            return z;
        }
    }

    public static JSONObject b(Context context, String str) {
        try {
            return new JSONObject(new com.baidu.mshield.x6.b.b(context).a(str)).optJSONObject("2");
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
            return new JSONObject();
        }
    }

    public static int a(Context context) {
        try {
            int o = new com.baidu.mshield.x6.b.b(context).o();
            if (o <= 0) {
                o = 60;
            }
            return o / 60;
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
            return 1;
        }
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        try {
            JSONObject b = b(context, str);
            if (b.has(str2)) {
                return b.optInt(str2, z ? 1 : 0) == 1;
            }
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
        return z;
    }
}
