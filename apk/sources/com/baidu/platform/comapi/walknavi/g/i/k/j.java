package com.baidu.platform.comapi.walknavi.g.i.k;

import android.os.Environment;
import java.security.MessageDigest;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes15.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f8748a = Environment.getExternalStorageDirectory() + "/AR/Screenshots/";

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int r3 = 0; r3 < charArray.length; r3++) {
                bArr[r3] = (byte) charArray[r3];
            }
            byte[] bArrDigest = messageDigest.digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                int r1 = b & 255;
                if (r1 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(r1));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
