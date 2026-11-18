package com.baidu.geofence.a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public class a {
    private static String a(String str) {
        String string = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (int r2 = 0; r2 < bArrDigest.length; r2++) {
                int r3 = bArrDigest[r2];
                if (r3 < 0) {
                    r3 += 256;
                }
                if (r3 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(r3));
            }
            string = stringBuffer.toString();
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return string;
        }
    }

    public static String a(HashMap<String, String> map, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(b(map, str));
        return a(stringBuffer.toString() + "99754106633f94d350db34d548d6091a");
    }

    private static String b(HashMap<String, String> map, String str) {
        String strEncode;
        Iterator<String> it = map.keySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Collections.sort(arrayList);
        StringBuffer stringBuffer = new StringBuffer();
        int r2 = 0;
        while (r2 < arrayList.size()) {
            String str2 = (String) arrayList.get(r2);
            stringBuffer.append(str2);
            stringBuffer.append("=");
            if (str == null) {
                try {
                    strEncode = URLEncoder.encode(map.get(str2), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    strEncode = null;
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                    strEncode = null;
                }
            } else {
                strEncode = URLEncoder.encode(map.get(str2), "UTF-8").replaceAll("\\+", "%20").replaceAll("\\%7E", Constants.WAVE_SEPARATOR);
            }
            stringBuffer.append(strEncode);
            r2++;
            if (r2 < arrayList.size() && str != null) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }
}
