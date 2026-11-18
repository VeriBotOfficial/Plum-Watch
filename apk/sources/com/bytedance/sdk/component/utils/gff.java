package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class gff {
    private static HashMap<String, ArrayList<String>> fxn = new HashMap<>();

    public static ArrayList<String> fxn(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (fxn.get(str) != null) {
                return fxn.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : kg(context, packageName)) {
                    String strFxn = "error!";
                    if ("MD5".equals(str)) {
                        strFxn = fxn(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        strFxn = fxn(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strFxn = fxn(signature, "SHA256");
                    }
                    arrayList.add(strFxn);
                }
            } catch (Exception unused) {
            }
            fxn.put(str, arrayList);
        }
        return arrayList;
    }

    public static String fxn(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayListFxn = fxn(context, "SHA1");
        if (arrayListFxn != null && arrayListFxn.size() != 0) {
            for (int r1 = 0; r1 < arrayListFxn.size(); r1++) {
                sb.append(arrayListFxn.get(r1));
                if (r1 < arrayListFxn.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static Signature[] kg(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String fxn(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception unused) {
            return "error!";
        }
    }
}
