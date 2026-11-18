package com.huawei.secure.android.common.util;

import android.gov.nist.core.Separators;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtil {
    private static String a(String str) {
        int r0;
        int r1;
        return (str.isEmpty() || (r0 = str.lastIndexOf(".")) == -1 || (r1 = r0 + 1) == str.length()) ? "" : str.substring(r1).toLowerCase(Locale.ENGLISH);
    }

    public static boolean checkFileExtValid(String str, String[] strArr) {
        if (str != null && !str.isEmpty() && strArr != null) {
            String strA = a(str);
            for (String str2 : strArr) {
                if (strA.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean filePathIsValid(String str, String str2) throws IOException, IllegalArgumentException {
        if (str != null && !str.equals("") && str2 != null && !str2.equals("")) {
            try {
                String strDecode = URLDecoder.decode(str2, "utf-8");
                String strDecode2 = URLDecoder.decode(str, "utf-8");
                if (!strDecode2.contains("..") && !strDecode2.contains("./") && !strDecode2.contains(".\\.\\") && !strDecode2.contains("%00") && !strDecode.contains("..") && !strDecode.contains("./") && !strDecode.contains(".\\.\\") && !strDecode.contains("%00")) {
                    return new File(strDecode2, strDecode).getCanonicalPath().startsWith(new File(strDecode2).getCanonicalPath());
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    public static boolean filePathIsValid(String str) throws UnsupportedEncodingException {
        if (str == null || str.equals("")) {
            return true;
        }
        if (str.contains(Separators.PERCENT)) {
            str = str.replaceAll("%(?![0-9a-fA-F]{2})", "%25");
        }
        String strDecode = URLDecoder.decode(str, "utf-8");
        return (strDecode.contains("..") || strDecode.contains("./") || strDecode.contains(".\\.\\") || strDecode.contains("%00")) ? false : true;
    }
}
