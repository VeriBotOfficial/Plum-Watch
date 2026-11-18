package com.qweather.sdk.c;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: SignUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    public static String a(Map<String, String> map, String str) {
        Set<Map.Entry> setEntrySet = new TreeMap(map).entrySet();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : setEntrySet) {
            if (entry.getValue() != null && !"".equals(((String) entry.getKey()).trim()) && !"sign".equals(((String) entry.getKey()).trim()) && !"".equals(((String) entry.getValue()).trim())) {
                sb.append(((String) entry.getKey()).trim()).append("=").append(((String) entry.getValue()).trim()).append("&");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1).append(str);
        }
        try {
            return new String(a(MessageDigest.getInstance("MD5").digest(sb.toString().getBytes(StandardCharsets.UTF_8))));
        } catch (Exception unused) {
            return "";
        }
    }

    private static char[] a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        char[] cArr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int r4 = 0;
        for (byte b : bArr) {
            int r5 = r4 + 1;
            cArr[r4] = cArr2[(b & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4];
            r4 += 2;
            cArr[r5] = cArr2[b & 15];
        }
        return cArr;
    }
}
