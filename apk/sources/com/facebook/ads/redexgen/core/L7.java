package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class L7 {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{BuiltinOptions.HardSwishOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquaredDifferenceOptions, 6, BuiltinOptions.ExpandDimsOptions, 3, 3, 30, 3, BuiltinOptions.ReverseV2Options, 18, 29, 30, 2, 24, 31, 22, BuiltinOptions.ReverseV2Options, 3, 20, 2, 30, 4, 3, 18, 20, BuiltinOptions.HashtableOptions, BuiltinOptions.SelectV2Options, 19};
    }

    static {
        A04();
        A01 = L7.class.getSimpleName();
    }

    public static String A01(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String extension = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(extension)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(extension);
    }

    public static String A02(String str) {
        try {
            return A03(MessageDigest.getInstance(A00(26, 3, 55)).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String A03(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(String.format(Locale.US, A00(0, 4, 111), Byte.valueOf(b)));
        }
        return stringBuffer.toString();
    }

    public static void A05(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e(A01, A00(4, 22, 96), e);
            }
        }
    }
}
