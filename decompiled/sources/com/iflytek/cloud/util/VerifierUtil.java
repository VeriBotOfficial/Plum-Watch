package com.iflytek.cloud.util;

import android.graphics.Bitmap;
import com.iflytek.msc.MSC;
import java.security.SecureRandom;

/* loaded from: classes17.dex */
public class VerifierUtil {
    public static Bitmap ARGB2Gray(Bitmap bitmap) {
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ALPHA_8);
        if (a(bitmap, createBitmap)) {
            return createBitmap;
        }
        return null;
    }

    private static boolean a(Bitmap bitmap, Bitmap bitmap2) {
        return MSC.doARGB2Gray(bitmap, bitmap2);
    }

    public static String generateNumberPassword(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        SecureRandom secureRandom = new SecureRandom();
        String str = "023456789".charAt(secureRandom.nextInt(9)) + "";
        stringBuffer.append(str);
        for (int i2 = 0; i2 < i - 1; i2++) {
            Boolean bool = Boolean.FALSE;
            while (!bool.booleanValue()) {
                str = "023456789".charAt(secureRandom.nextInt(9)) + "";
                bool = stringBuffer.indexOf(str) >= 0 ? Boolean.FALSE : Integer.parseInt(new StringBuilder().append(stringBuffer.charAt(stringBuffer.length() + (-1))).append("").toString()) * Integer.parseInt(str) == 10 ? Boolean.FALSE : Boolean.TRUE;
            }
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public static int getBitmapsize(Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
