package oqmr;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes8.dex */
public class a {
    public static String a(Context context) {
        if (context == null) {
            return "未知";
        }
        try {
            String str = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.E;
            if (!TextUtils.isEmpty(str)) {
                if (!str.startsWith("46000") && !str.startsWith("46002") && !str.startsWith("46007")) {
                    if (!str.startsWith("46001") && !str.startsWith("46006")) {
                        if (str.startsWith("46003")) {
                            return "中国电信";
                        }
                        return str.startsWith("46005") ? "中国电信" : "未知";
                    }
                    return "中国联通";
                }
                return "中国移动";
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "未知";
    }
}
