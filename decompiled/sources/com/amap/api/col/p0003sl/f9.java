package com.amap.api.col.p0003sl;

import com.autonavi.aps.amapapi.security.Encrypt;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: Encrypt.java */
/* loaded from: classes11.dex */
public class f9 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f1652a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] b = new byte[128];

    static {
        for (int i = 0; i < 128; i++) {
            b[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            b[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            b[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            b[i4] = (byte) (i4 + 4);
        }
        byte[] bArr = b;
        bArr[43] = BuiltinOptions.LogicalAndOptions;
        bArr[47] = 63;
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, m9.b("EQUVT"));
        Cipher cipher = Cipher.getInstance(m9.b("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        return cipher.doFinal(bArr2);
    }

    public static String b(byte[] bArr) {
        try {
            return a(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String c(byte[] bArr) {
        try {
            return a(bArr);
        } catch (Throwable th) {
            fa.a(th, "er", "e64");
            return null;
        }
    }

    public static byte[] d(byte[] bArr) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(m9.b("EQUVT"));
        byte[] bArr2 = null;
        if (keyGenerator == null) {
            return null;
        }
        keyGenerator.init(256);
        byte[] encoded = keyGenerator.generateKey().getEncoded();
        PublicKey a2 = m9.a();
        if (a2 == null) {
            return null;
        }
        byte[] a3 = a(encoded, a2);
        try {
            bArr2 = a(encoded, bArr, m9.c());
        } catch (Throwable th) {
            fa.a(th, "er", "asEn");
        }
        byte[] bArr3 = new byte[a3.length + bArr2.length];
        System.arraycopy(a3, 0, bArr3, 0, a3.length);
        System.arraycopy(bArr2, 0, bArr3, a3.length, bArr2.length);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, m9.b("EQUVT"));
        Cipher cipher = Cipher.getInstance(m9.b("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr2);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
        return a(bArr, bArr2, bArr3);
    }

    static byte[] a(byte[] bArr, Key key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(m9.b(Encrypt.KEY_TRANSFORMATION));
        cipher.init(1, key);
        return cipher.doFinal(bArr);
    }

    public static byte[] a(String str) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3 = 0;
        if (str == null) {
            return new byte[0];
        }
        byte[] e = m9.e(str);
        int length = e.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                b2 = b[e[i3]];
                if (i >= length || b2 != -1) {
                    break;
                }
                i3 = i;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b3 = b[e[i]];
                if (i2 >= length || b3 != -1) {
                    break;
                }
                i = i2;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & BuiltinOptions.SliceOptions) >>> 4));
            while (i2 != length) {
                int i4 = i2 + 1;
                byte b4 = e[i2];
                if (b4 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                byte b5 = b[b4];
                if (i4 >= length || b5 != -1) {
                    if (b5 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(((b3 & 15) << 4) | ((b5 & BuiltinOptions.LogicalOrOptions) >>> 2));
                    while (i4 != length) {
                        int i5 = i4 + 1;
                        byte b6 = e[i4];
                        if (b6 == 61) {
                            return byteArrayOutputStream.toByteArray();
                        }
                        byte b7 = b[b6];
                        if (i5 < length && b7 == -1) {
                            i4 = i5;
                        } else {
                            if (b7 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(b7 | ((b5 & 3) << 6));
                            i3 = i5;
                        }
                    }
                    return byteArrayOutputStream.toByteArray();
                }
                i2 = i4;
            }
            return byteArrayOutputStream.toByteArray();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            byte b2 = bArr[i];
            int i3 = b2 & 255;
            if (i2 == length) {
                char[] cArr = f1652a;
                stringBuffer.append(cArr[i3 >>> 2]);
                stringBuffer.append(cArr[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i + 2;
            byte b3 = bArr[i2];
            if (i4 == length) {
                char[] cArr2 = f1652a;
                stringBuffer.append(cArr2[i3 >>> 2]);
                stringBuffer.append(cArr2[((b2 & 3) << 4) | ((b3 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4)]);
                stringBuffer.append(cArr2[(b3 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i += 3;
            byte b4 = bArr[i4];
            char[] cArr3 = f1652a;
            stringBuffer.append(cArr3[i3 >>> 2]);
            stringBuffer.append(cArr3[((b2 & 3) << 4) | ((b3 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4)]);
            stringBuffer.append(cArr3[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(cArr3[b4 & 63]);
        }
        return stringBuffer.toString();
    }
}
