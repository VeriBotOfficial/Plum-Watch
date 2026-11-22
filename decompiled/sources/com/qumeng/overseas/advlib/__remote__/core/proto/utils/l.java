package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.MimeTypeMap;
import com.qumeng.overseas.advlib.open.AliCheatParams;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* loaded from: classes17.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f12859a = Pattern.compile("attachment;\\s*filename\\s*=\\s*(\"?)([^\"]*)\\1\\s*$", 2);

    public static String a(String str) {
        return str;
    }

    public static String a(String str, Map<String, List<String>> map) {
        if (!com.qumeng.overseas.advlib.__remote__.utils.q.b(map)) {
            return "";
        }
        List<String> list = map.get(str);
        return com.qumeng.overseas.advlib.__remote__.utils.q.b(list) ? list.get(0) : "";
    }

    public static String b(String str, Map<String, String> map) {
        return a0.a(str) ? b(map) : a(map);
    }

    public static boolean c(String str) {
        try {
            String path = new URL(str).getPath();
            if (path == null) {
                return false;
            }
            if (path.endsWith(".html")) {
                return true;
            }
            return path.endsWith(".htm");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    static String d(String str) {
        try {
            Matcher a2 = com.qumeng.overseas.advlib.__remote__.utils.r.a(f12859a, str);
            if (a2 == null || !a2.find()) {
                return null;
            }
            return a2.group(2);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static String b(Map<String, String> map) {
        String a2 = a(map);
        return a2.length() > 0 ? "?dsd=" + AliCheatParams.encodeByBase64(a2.substring(1), false) : "";
    }

    public static final String a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String decode;
        int lastIndexOf;
        int lastIndexOf2;
        if (str2 != null) {
            str6 = d(str2);
            if (str6 != null && (lastIndexOf2 = str6.lastIndexOf(47) + 1) > 0) {
                str6 = str6.substring(lastIndexOf2);
            }
        } else {
            str6 = null;
        }
        if (str6 == null && (decode = Uri.decode(str)) != null) {
            int indexOf = decode.indexOf(63);
            if (indexOf > 0) {
                decode = decode.substring(0, indexOf);
            }
            if (!decode.endsWith("/") && (lastIndexOf = decode.lastIndexOf(47) + 1) > 0) {
                str6 = decode.substring(lastIndexOf);
            }
        }
        if (str6 != null) {
            str4 = str6;
        }
        int indexOf2 = str4.indexOf(46);
        if (indexOf2 >= 0) {
            if (str3 != null) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str4.substring(str4.lastIndexOf(46) + 1));
                if (mimeTypeFromExtension != null) {
                    mimeTypeFromExtension.equalsIgnoreCase(str3);
                }
            }
            str4 = str4.substring(0, indexOf2);
        }
        return str4 + ".apk";
    }

    public static boolean b(String str) {
        try {
            if (!TextUtils.isEmpty(str) && c(str)) {
                return Patterns.WEB_URL.matcher(str.toLowerCase()).matches();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z) {
                sb.append('?');
                z = true;
            } else if (z) {
                sb.append(Typography.amp);
            }
            String key = entry.getKey();
            String valueOf = String.valueOf(entry.getValue());
            if (key != null) {
                sb.append(key);
                sb.append(com.alipay.sdk.m.p.a.h);
                try {
                    sb.append(URLEncoder.encode(valueOf, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    sb.append("none");
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
