package com.huawei.secure.android.common.webview;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.huawei.secure.android.common.util.LogsUtil;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes17.dex */
public class UriUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10855a = "UriUtil";

    private static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return !URLUtil.isNetworkUrl(str) ? str : getHostByURI(str);
        }
        LogsUtil.i(f10855a, "whiteListUrl is null");
        return null;
    }

    public static String getHostByURI(String str) {
        if (TextUtils.isEmpty(str)) {
            LogsUtil.i(f10855a, "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            LogsUtil.e(f10855a, "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e) {
            LogsUtil.e(f10855a, "getHostByURI error  MalformedURLException : " + e.getMessage());
            return "";
        }
    }

    public static boolean isUrlHostAndPathInWhitelist(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.e(f10855a, "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (isUrlHostAndPathMatchWhitelist(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUrlHostAndPathMatchWhitelist(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.contains("..") && !str.contains(Separators.AT)) {
                if (str2.equals(str) || str.startsWith(str2 + Separators.QUESTION) || str.startsWith(str2 + "#")) {
                    return true;
                }
                if (!str2.endsWith("/")) {
                    return false;
                }
                if (Uri.parse(str).getPathSegments().size() - Uri.parse(str2).getPathSegments().size() != 1) {
                    return false;
                }
                return str.startsWith(str2);
            }
            Log.e(f10855a, "url contains unsafe char");
        }
        return false;
    }

    public static boolean isUrlHostInWhitelist(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.e(f10855a, "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (isUrlHostMatchWhitelist(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUrlHostMatchWhitelist(String str, String str2) {
        String hostByURI = getHostByURI(str);
        if (TextUtils.isEmpty(hostByURI) || TextUtils.isEmpty(str2)) {
            LogsUtil.e(f10855a, "url or whitelist is null");
            return false;
        }
        String a2 = a(str2);
        if (TextUtils.isEmpty(a2)) {
            Log.e(f10855a, "whitelist host is null");
            return false;
        }
        if (a2.equals(hostByURI)) {
            return true;
        }
        if (hostByURI.endsWith(a2)) {
            try {
                String substring = hostByURI.substring(0, hostByURI.length() - a2.length());
                if (substring.endsWith(".")) {
                    return substring.matches("^[A-Za-z0-9.-]+$");
                }
                return false;
            } catch (IndexOutOfBoundsException e) {
                LogsUtil.e(f10855a, "IndexOutOfBoundsException" + e.getMessage());
            } catch (Exception e2) {
                LogsUtil.e(f10855a, "Exception : " + e2.getMessage());
                return false;
            }
        }
        return false;
    }

    public static boolean isUrlHostSameWhitelist(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TextUtils.equals(getHostByURI(str), a(str2));
        }
        Log.e(f10855a, "isUrlHostSameWhitelist: url or host is null");
        return false;
    }

    public static boolean isUrlHostSameWhitelist(String str, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (isUrlHostSameWhitelist(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        LogsUtil.e(f10855a, "whitelist is null");
        return false;
    }
}
