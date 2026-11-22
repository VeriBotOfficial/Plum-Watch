package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.core.StackLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class MessageDigestAlgorithm {
    private static final char[] toHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static String calculateResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, StackLogger stackLogger) {
        String str10;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("trying to authenticate using : " + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + str6 + ", " + str7 + ", " + str8 + ", " + str9);
        }
        if (str2 == null || str6 == null || str7 == null || str3 == null) {
            throw new NullPointerException("Null parameter to MessageDigestAlgorithm.calculateResponse()");
        }
        if (str5 == null || str5.length() == 0) {
            throw new NullPointerException("cnonce_value may not be absent for MD5-Sess algorithm.");
        }
        if (str9 == null || str9.trim().length() == 0 || str9.trim().equalsIgnoreCase("auth")) {
            str10 = str6 + ":" + str7;
        } else {
            if (str8 == null) {
                str8 = "";
            }
            str10 = str6 + ":" + str7 + ":" + H(str8);
        }
        if (str5 != null && str9 != null && str4 != null && (str9.equalsIgnoreCase("auth") || str9.equalsIgnoreCase("auth-int"))) {
            return KD(str2, str3 + ":" + str4 + ":" + str5 + ":" + str9 + ":" + H(str10));
        }
        return KD(str2, str3 + ":" + H(str10));
    }

    static String calculateResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, StackLogger stackLogger) {
        String str12;
        String str13;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("trying to authenticate using : " + str + ", " + str2 + ", " + str3 + ", " + (str4 != null && str4.trim().length() > 0) + ", " + str5 + ", " + str6 + ", " + str7 + ", " + str8 + ", " + str9 + ", " + str10 + ", " + str11);
        }
        if (str2 == null || str3 == null || str4 == null || str8 == null || str9 == null || str5 == null) {
            throw new NullPointerException("Null parameter to MessageDigestAlgorithm.calculateResponse()");
        }
        if (str == null || str.trim().length() == 0 || str.trim().equalsIgnoreCase("MD5")) {
            str12 = str2 + ":" + str3 + ":" + str4;
        } else if (str7 != null && str7.length() != 0) {
            str12 = H(str2 + ":" + str3 + ":" + str4) + ":" + str5 + ":" + str7;
        } else {
            throw new NullPointerException("cnonce_value may not be absent for MD5-Sess algorithm.");
        }
        if (str11 == null || str11.trim().length() == 0 || str11.trim().equalsIgnoreCase("auth")) {
            str13 = str8 + ":" + str9;
        } else {
            if (str10 == null) {
                str10 = "";
            }
            str13 = str8 + ":" + str9 + ":" + H(str10);
        }
        return (str7 == null || str11 == null || str6 == null || !(str11.equalsIgnoreCase("auth") || str11.equalsIgnoreCase("auth-int"))) ? KD(H(str12), str5 + ":" + H(str13)) : KD(H(str12), str5 + ":" + str6 + ":" + str7 + ":" + str11 + ":" + H(str13));
    }

    private static String H(String str) {
        try {
            return toHexString(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to instantiate an MD5 algorithm", e);
        }
    }

    private static String KD(String str, String str2) {
        return H(str + ":" + str2);
    }

    private static String toHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = toHex;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
