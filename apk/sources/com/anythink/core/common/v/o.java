package com.anythink.core.common.v;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4423a = "MD5";
    private static char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString().toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString().toUpperCase(Locale.US);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Integer.toHexString((b2 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString().toLowerCase(Locale.US);
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Integer.toHexString((b2 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (int r1 = 0; r1 < bArrDigest.length; r1++) {
                sb.append(b[(bArrDigest[r1] & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4]);
                sb.append(b[bArrDigest[r1] & 15]);
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int r1 = 0; r1 < bArr.length; r1++) {
            sb.append(b[(bArr[r1] & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4]);
            sb.append(b[bArr[r1] & 15]);
        }
        return sb.toString();
    }
}
