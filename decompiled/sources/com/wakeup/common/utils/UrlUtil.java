package com.wakeup.common.utils;

import com.xiaomi.mipush.sdk.Constants;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes2.dex */
public class UrlUtil {
    private static final String CHARSET_UTF8 = "utf8";

    public static String urlEncode(String url) {
        if (!com.blankj.utilcode.util.StringUtils.isEmpty(url)) {
            try {
                return URLEncoder.encode(url, "UTF-8");
            } catch (Exception e) {
                System.out.println("Url encode error:" + e.getMessage());
            }
        }
        return url;
    }

    public static String generateQueryString(Map<String, String> params, boolean isEncodeKV) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (isEncodeKV) {
                sb.append(percentEncode(entry.getKey())).append("=").append(percentEncode(entry.getValue())).append("&");
            } else {
                sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String percentEncode(String value) {
        if (value == null) {
            return null;
        }
        try {
            return URLEncoder.encode(value, "utf8").replace("+", "%20").replace("*", "%2A").replace("%7E", Constants.WAVE_SEPARATOR);
        } catch (Exception unused) {
            return "";
        }
    }
}
