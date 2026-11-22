package com.baidu.platform.comapi.walknavi.g.i.k;

import android.os.Environment;
import java.security.MessageDigest;

/* compiled from: Utils.java */
/* loaded from: classes13.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static String f8748a = Environment.getExternalStorageDirectory() + "/AR/Screenshots/";

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                bArr[i] = (byte) charArray[i];
            }
            byte[] digest = messageDigest.digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                int i2 = b & 255;
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
