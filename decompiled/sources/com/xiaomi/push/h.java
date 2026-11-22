package com.xiaomi.push;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f14646a = {BuiltinOptions.SegmentSumOptions, 23, BuiltinOptions.CosOptions, BuiltinOptions.RandomOptions, BuiltinOptions.FloorModOptions, 0, 4, BuiltinOptions.ScatterNdOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ScatterNdOptions, 2, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CosOptions, BuiltinOptions.CumsumOptions, 18, 32};

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return a(bArr, 2).doFinal(bArr2);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        return a(bArr, 1).doFinal(bArr2);
    }

    private static Cipher a(byte[] bArr, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f14646a);
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(i, secretKeySpec, ivParameterSpec);
        return cipher;
    }
}
