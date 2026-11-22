package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes13.dex */
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
                    String str2 = "error!";
                    if ("MD5".equals(str)) {
                        str2 = fxn(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        str2 = fxn(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = fxn(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception unused) {
            }
            fxn.put(str, arrayList);
        }
        return arrayList;
    }

    public static String fxn(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> fxn2 = fxn(context, "SHA1");
        if (fxn2 != null && fxn2.size() != 0) {
            for (int i = 0; i < fxn2.size(); i++) {
                sb.append(fxn2.get(i));
                if (i < fxn2.size() - 1) {
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
            if (messageDigest != null) {
                byte[] digest = messageDigest.digest(byteArray);
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                return sb.substring(0, sb.length() - 1).toString();
            }
            return "error!";
        } catch (Exception unused) {
            return "error!";
        }
    }
}
