package com.baidu.xclient.gdid.jni;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.baidu.xclient.gdid.j.d;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class a {
    public static Pair<Integer, Integer> a(int i, int i2, int i3) {
        if (i2 <= i || i == 0) {
            i = 1;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i3));
    }

    public static boolean a(int i, int i2) {
        String binaryString = Integer.toBinaryString(i2);
        return i <= binaryString.length() && binaryString.charAt(i - 1) == '1';
    }

    public static boolean a(Context context, JSONObject jSONObject, String str, int i, int i2, int i3) {
        if (com.baidu.sec.privacy.b.b.a(context).a() || a(i2, i3)) {
            return TextUtils.isEmpty(str) || jSONObject.optInt(str, i) == 1;
        }
        return false;
    }

    public static String[] a(String str) {
        String[] split;
        String str2;
        String[] strArr = new String[2];
        try {
            String[] split2 = str.split("\n");
            if (split2 != null) {
                for (String str3 : split2) {
                    if (!TextUtils.isEmpty(str3) && (split = str3.trim().split(":")) != null && split.length == 2 && (str2 = split[0]) != null && split[1] != null) {
                        String trim = str2.trim();
                        if (!trim.equals("Hardware") && !trim.equals("model name")) {
                            if (trim.equals("vendor_id") || trim.equals("Processor")) {
                                strArr[1] = split[1].trim();
                            }
                        }
                        strArr[0] = split[1].trim();
                    }
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
        return strArr;
    }
}
