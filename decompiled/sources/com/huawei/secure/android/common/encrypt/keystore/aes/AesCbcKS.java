package com.huawei.secure.android.common.encrypt.keystore.aes;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes17.dex */
public class AesCbcKS {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10790a = "CBCKS";
    private static final String b = "AndroidKeyStore";
    private static final String c = "AES/CBC/PKCS7Padding";
    private static final String d = "";
    private static final int e = 16;
    private static final int f = 256;
    private static Map<String, SecretKey> g = new HashMap();

    private static synchronized SecretKey a(String str) {
        SecretKey secretKey;
        SecretKey generateKey;
        synchronized (AesCbcKS.class) {
            b.c(f10790a, "load key");
            secretKey = null;
            try {
                try {
                    try {
                        try {
                            try {
                                KeyStore keyStore = KeyStore.getInstance(b);
                                keyStore.load(null);
                                Key key = keyStore.getKey(str, null);
                                if (key == null || !(key instanceof SecretKey)) {
                                    b.c(f10790a, "generate key");
                                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", b);
                                    keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setKeySize(256).build());
                                    generateKey = keyGenerator.generateKey();
                                } else {
                                    generateKey = (SecretKey) key;
                                }
                                secretKey = generateKey;
                            } catch (NoSuchProviderException e2) {
                                b.b(f10790a, "NoSuchProviderException: " + e2.getMessage());
                            }
                        } catch (KeyStoreException e3) {
                            b.b(f10790a, "KeyStoreException: " + e3.getMessage());
                        }
                    } catch (IOException e4) {
                        b.b(f10790a, "IOException: " + e4.getMessage());
                    } catch (InvalidAlgorithmParameterException e5) {
                        b.b(f10790a, "InvalidAlgorithmParameterException: " + e5.getMessage());
                    }
                } catch (NoSuchAlgorithmException e6) {
                    b.b(f10790a, "NoSuchAlgorithmException: " + e6.getMessage());
                } catch (UnrecoverableKeyException e7) {
                    b.b(f10790a, "UnrecoverableKeyException: " + e7.getMessage());
                }
            } catch (CertificateException e8) {
                b.b(f10790a, "CertificateException: " + e8.getMessage());
            } catch (Exception e9) {
                b.b(f10790a, "Exception: " + e9.getMessage());
            }
            g.put(str, secretKey);
        }
        return secretKey;
    }

    private static boolean a() {
        return true;
    }

    private static SecretKey b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (g.get(str) == null) {
            a(str);
        }
        return g.get(str);
    }

    public static String decrypt(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            b.b(f10790a, "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(decrypt(str, HexUtil.hexStr2ByteArray(str2)), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            b.b(f10790a, "encrypt: UnsupportedEncodingException");
            return "";
        }
    }

    public static String encrypt(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            b.b(f10790a, "encrypt 1 content is null");
            return "";
        }
        try {
            return HexUtil.byteArray2HexStr(encrypt(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            b.b(f10790a, "encrypt: UnsupportedEncodingException");
            return "";
        }
    }

    public static byte[] encrypt(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!a()) {
                b.b(f10790a, "sdk version is too low");
                return bArr2;
            }
            try {
                Cipher cipher = Cipher.getInstance(c);
                SecretKey b2 = b(str);
                if (b2 == null) {
                    b.b(f10790a, "encrypt secret key is null");
                    return bArr2;
                }
                cipher.init(1, b2);
                byte[] doFinal = cipher.doFinal(bArr);
                byte[] iv = cipher.getIV();
                if (iv != null && iv.length == 16) {
                    byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
                    System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
                    return copyOf;
                }
                b.b(f10790a, "IV is invalid.");
                return bArr2;
            } catch (InvalidKeyException e2) {
                b.b(f10790a, "InvalidKeyException: " + e2.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e3) {
                b.b(f10790a, "NoSuchAlgorithmException: " + e3.getMessage());
                return bArr2;
            } catch (BadPaddingException e4) {
                b.b(f10790a, "BadPaddingException: " + e4.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e5) {
                b.b(f10790a, "IllegalBlockSizeException: " + e5.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e6) {
                b.b(f10790a, "NoSuchPaddingException: " + e6.getMessage());
                return bArr2;
            } catch (Exception e7) {
                b.b(f10790a, "Exception: " + e7.getMessage());
                return bArr2;
            }
        }
        b.b(f10790a, "alias or encrypt content is null");
        return bArr2;
    }

    public static byte[] decrypt(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!a()) {
                b.b(f10790a, "sdk version is too low");
                return bArr2;
            }
            if (bArr.length <= 16) {
                b.b(f10790a, "Decrypt source data is invalid.");
                return bArr2;
            }
            SecretKey b2 = b(str);
            if (b2 == null) {
                b.b(f10790a, "decrypt secret key is null");
                return bArr2;
            }
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            try {
                Cipher cipher = Cipher.getInstance(c);
                cipher.init(2, b2, new IvParameterSpec(copyOf));
                return cipher.doFinal(bArr, 16, bArr.length - 16);
            } catch (InvalidAlgorithmParameterException e2) {
                b.b(f10790a, "InvalidAlgorithmParameterException: " + e2.getMessage());
                return bArr2;
            } catch (InvalidKeyException e3) {
                b.b(f10790a, "InvalidKeyException: " + e3.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e4) {
                b.b(f10790a, "NoSuchAlgorithmException: " + e4.getMessage());
                return bArr2;
            } catch (BadPaddingException e5) {
                b.b(f10790a, "BadPaddingException: " + e5.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e6) {
                b.b(f10790a, "IllegalBlockSizeException: " + e6.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e7) {
                b.b(f10790a, "NoSuchPaddingException: " + e7.getMessage());
                return bArr2;
            } catch (Exception e8) {
                b.b(f10790a, "Exception: " + e8.getMessage());
                return bArr2;
            }
        }
        b.b(f10790a, "alias or encrypt content is null");
        return bArr2;
    }
}
