package com.tramini.plugin.a.h;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f13750a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (int i = 0; i < digest.length; i++) {
                sb.append(f13750a[(digest[i] & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4]);
                sb.append(f13750a[digest[i] & 15]);
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f13750a[(bArr[i] & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4]);
            sb.append(f13750a[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
