package sg.bigo.ads.common.j;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import sg.bigo.ads.common.utils.o;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19643a = "a";

    public static long a(String str, long j) {
        if (!TextUtils.isEmpty(str) && j != 0) {
            try {
                long longValue = Long.valueOf(str).longValue();
                int hashCode = String.valueOf(j).hashCode();
                return ((j ^ longValue) ^ Math.abs(hashCode)) >> 20;
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public static String a(String str, String str2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = f19643a;
            str4 = "data error with empty.";
        } else {
            if (!TextUtils.isEmpty(str2)) {
                String a2 = o.a(str, str2);
                sg.bigo.ads.common.t.a.a(0, 3, f19643a, "data=" + str + ", hexStringSecKey=" + str2 + ", cryptStr=" + a2);
                return a2;
            }
            str3 = f19643a;
            str4 = "cip error with empty.";
        }
        sg.bigo.ads.common.t.a.a(0, str3, str4);
        return null;
    }

    public static String a(String str, String str2, ValueCallback<Exception> valueCallback) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = f19643a;
            str4 = "cip error with empty.";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = f19643a;
            str4 = "string error with empty.";
        } else {
            String a2 = o.a(str, str2, valueCallback);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
            str3 = f19643a;
            str4 = "cip error with empty content.";
        }
        sg.bigo.ads.common.t.a.a(0, str3, str4);
        return null;
    }

    public static byte[] b(String str, String str2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = f19643a;
            str4 = "cip error with empty.";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = f19643a;
            str4 = "string error with empty.";
        } else {
            byte[] b = o.b(str, str2, null);
            if (b != null) {
                return b;
            }
            str3 = f19643a;
            str4 = "cip error with empty content.";
        }
        sg.bigo.ads.common.t.a.a(0, str3, str4);
        return null;
    }
}
