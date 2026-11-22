package com.wakeup.common.utils.game;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class BbySignUtil {
    public static String generateSignature(final Map<String, String> data, String key) throws Exception {
        Set<String> keySet = data.keySet();
        String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            sb.append(str).append("=").append(data.get(str));
            if (i < strArr.length - 1) {
                sb.append("&");
            }
        }
        sb.append(key);
        return MD5(sb.toString()).toLowerCase();
    }

    public static String MD5(String data) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(data.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return sb.toString().toLowerCase();
        } catch (Exception e) {
            e.printStackTrace();
            return data;
        }
    }
}
