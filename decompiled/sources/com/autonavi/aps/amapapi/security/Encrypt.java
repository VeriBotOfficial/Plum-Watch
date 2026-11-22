package com.autonavi.aps.amapapi.security;

import com.amap.api.col.p0003sl.f9;
import com.amap.api.col.p0003sl.fa;
import com.amap.api.col.p0003sl.m9;
import com.amap.location.support.security.Base64;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.net.telnet.TelnetCommand;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes12.dex */
public class Encrypt {
    public static final String KEY_ALGORITHM = "RSA";
    public static final String KEY_TRANSFORMATION = "CUlNBL0VDQi9QS0NTMVBhZGRpbmc";

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f6688a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final byte[] b = {61, 61, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.EqualOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ATan2Options, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CosOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.AddNOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.TileOptions, BuiltinOptions.SquareOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ShapeOptions, BuiltinOptions.CosOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.TileOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RangeOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PadV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PowOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RankOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquareOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.AbsOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FillOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MirrorPadOptions};
    private static final byte[] c;
    private static final IvParameterSpec d;

    static {
        byte[] bArr = {0, 1, 1, 2, 3, 5, 8, 13, 8, 7, 6, 5, 4, 3, 2, 1};
        c = bArr;
        d = new IvParameterSpec(bArr);
    }

    private static SecretKeySpec a(String str) {
        byte[] bArr;
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(str);
        while (stringBuffer.length() < 16) {
            stringBuffer.append("0");
        }
        if (stringBuffer.length() > 16) {
            stringBuffer.setLength(16);
        }
        try {
            bArr = stringBuffer.toString().getBytes("UTF-8");
        } catch (Throwable th) {
            CoreUtil.reportError(th, "Encrypt", "createKey");
            bArr = null;
        }
        return new SecretKeySpec(bArr, "AES");
    }

    public static byte[] aesDecrypt(byte[] bArr, String str) {
        try {
            SecretKeySpec a2 = a(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(m9.c());
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(2, a2, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "Encrypt", "aesDecrypt");
            return null;
        }
    }

    public static byte[] aesDecryptByCBC(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(2, new SecretKeySpec(bArr, "AES"), d);
        return cipher.doFinal(bArr2);
    }

    public static byte[] aesEncrypt(byte[] bArr, String str) {
        try {
            SecretKeySpec a2 = a(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(m9.c());
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(1, a2, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "Encrypt", "aesEncrypt");
            return null;
        }
    }

    public static byte[] decrypt(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        try {
            BigInteger modPow = new BigInteger(bArr).modPow(bigInteger, bigInteger2);
            byte[] bArr2 = new byte[16];
            BigInteger bigInteger3 = new BigInteger("256");
            int i = 0;
            while (modPow.bitCount() > 0 && i < 16) {
                BigInteger[] divideAndRemainder = modPow.divideAndRemainder(bigInteger3);
                BigInteger bigInteger4 = divideAndRemainder[0];
                bArr2[i] = (byte) divideAndRemainder[1].intValue();
                i++;
                modPow = bigInteger4;
            }
            return bArr2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] decryptAES(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(m9.b("YQUVTL0VDQi9Ob1BhZGRpbmc="));
            cipher.init(2, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] decryptRsponse(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArr.length - 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(2, secretKeySpec, new IvParameterSpec(m9.c()));
            return cipher.doFinal(bArr3);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "Encrypt", "decryptRsponse length = " + (bArr != null ? bArr.length : 0));
            return null;
        }
    }

    public static String encode(String str, String str2) {
        byte[] bArr;
        if (str2 == null) {
            return null;
        }
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bytes);
                bArr = messageDigest.digest();
            } catch (Throwable th) {
                fa.a(th, "MD5", "gmb");
                bArr = null;
            }
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(length * 2);
            for (int i = 0; i < length; i++) {
                char[] cArr = f6688a;
                sb.append(cArr[(bArr[i] >> 4) & 15]);
                sb.append(cArr[bArr[i] & 15]);
            }
            return sb.toString();
        } catch (Throwable th2) {
            CoreUtil.reportError(th2, "Encrypt", "encode");
            return null;
        }
    }

    public static String generatorKey(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return encode("MD5", encode("SHA1", str) + str);
                }
            } catch (Throwable th) {
                CoreUtil.reportError(th, "Encrypt", "generatorKey");
            }
        }
        return null;
    }

    public static synchronized byte[] rsaDecryptByPrivateKey(byte[] bArr, String str) throws Exception {
        byte[] byteArray;
        synchronized (Encrypt.class) {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(f9.a(str)));
            Cipher cipher = Cipher.getInstance(m9.b(KEY_TRANSFORMATION));
            cipher.init(2, generatePrivate);
            int length = bArr.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 > 0) {
                    byte[] doFinal = i3 > 256 ? cipher.doFinal(bArr, i, 256) : cipher.doFinal(bArr, i, i3);
                    byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                    i2++;
                    i = i2 * 256;
                } else {
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
            }
        }
        return byteArray;
    }

    public static synchronized byte[] rsaEncryptByPrivateKey(byte[] bArr, String str) throws Exception {
        byte[] byteArray;
        synchronized (Encrypt.class) {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(f9.a(str)));
            Cipher cipher = Cipher.getInstance(m9.b(KEY_TRANSFORMATION));
            cipher.init(1, generatePrivate);
            int length = bArr.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 > 0) {
                    byte[] doFinal = i3 > 245 ? cipher.doFinal(bArr, i, TelnetCommand.AO) : cipher.doFinal(bArr, i, i3);
                    byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                    i2++;
                    i = i2 * TelnetCommand.AO;
                } else {
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
            }
        }
        return byteArray;
    }

    public static byte[] rsaEncryptCarrier(byte[] bArr) throws Exception {
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new StringBuilder(new String(b)).reverse().toString().getBytes(), 2)));
        Cipher cipher = Cipher.getInstance(m9.b("WUlNBL0VDQi9PQUVQV0lUSFNIQS0xQU5ETUdGMVBBRERJTkc"));
        cipher.init(1, generatePublic);
        return cipher.doFinal(bArr);
    }
}
