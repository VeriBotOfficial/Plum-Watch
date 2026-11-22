package com.baidu.bbalbscesium.k.d;

import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final String f7435a;
    final String b;
    final String c;
    final String d;

    private g(String str, String str2, String str3, String str4) {
        this.f7435a = str + str2;
        this.b = str2.toUpperCase(Locale.ENGLISH);
        this.c = str3;
        this.d = str4;
    }

    public static g a(String str) throws NoSuchAlgorithmException {
        String[] b = b(str);
        String str2 = b[0];
        String str3 = b[1];
        String str4 = b[2];
        if (str3 != null && str3.length() == 0) {
            str3 = null;
        }
        if (str4 != null && str4.length() == 0) {
            str4 = null;
        }
        return new g(str2, "", str3, str4);
    }

    private static String[] b(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            throw new NoSuchAlgorithmException("No transformation given");
        }
        String[] strArr = new String[3];
        StringTokenizer stringTokenizer = new StringTokenizer(str, "/");
        int i = 0;
        while (stringTokenizer.hasMoreTokens() && i < 3) {
            try {
                strArr[i] = stringTokenizer.nextToken().trim();
                i++;
            } catch (NoSuchElementException unused) {
                throw new NoSuchAlgorithmException("Invalid transformation format:" + str);
            }
        }
        if (i == 0 || i == 2 || stringTokenizer.hasMoreTokens()) {
            throw new NoSuchAlgorithmException("Invalid transformation format:" + str);
        }
        String str2 = strArr[0];
        if (str2 == null || str2.length() == 0) {
            throw new NoSuchAlgorithmException("Invalid transformation:algorithm not specified-" + str);
        }
        return strArr;
    }

    public void a(c cVar) throws NoSuchAlgorithmException, NoSuchPaddingException {
        String str = this.c;
        if (str != null) {
            cVar.a(str);
        }
        String str2 = this.d;
        if (str2 != null) {
            cVar.b(str2);
        }
    }
}
