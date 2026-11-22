package com.bykv.vk.openvk.fxn.fxn.fxn.sg;

import android.text.TextUtils;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.phancy.mini.api.file.FileSystemManager;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes13.dex */
public class kg {
    private static final MessageDigest fxn = fxn();
    private static final char[] kg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private kg() {
    }

    private static MessageDigest fxn() {
        try {
            return MessageDigest.getInstance(FileSystemManager.DIGEST_MD5);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String fxn(String str) {
        byte[] digest;
        MessageDigest messageDigest = fxn;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (kg.class) {
            digest = messageDigest.digest(bytes);
        }
        return fxn(digest);
    }

    public static String fxn(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = kg;
            cArr[i] = cArr2[(b & TransmissionUnpacked.HD_VAL_MAGIC_HB) >> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
