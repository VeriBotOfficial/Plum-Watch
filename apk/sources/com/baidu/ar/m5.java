package com.baidu.ar;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes16.dex */
public final class m5 {
    public static String a(String str) {
        return (str == null || !str.startsWith("\ufeff")) ? str : str.substring(1);
    }

    public static String a(String str, Charset charset) {
        String strName;
        if (charset != null) {
            try {
                strName = charset.name();
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        } else {
            strName = null;
        }
        return URLEncoder.encode(str, strName);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String b(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        return TextUtils.isEmpty(contentTypeFor) ? "application/octet-stream" : contentTypeFor;
    }

    public static String[] c(String str) {
        int r0;
        if (TextUtils.isEmpty(str) || (r0 = str.indexOf(58)) <= 0 || r0 == str.length() - 1) {
            return null;
        }
        return new String[]{str.substring(0, r0), str.substring(r0 + 1).trim()};
    }
}
