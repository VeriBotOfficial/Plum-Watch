package com.xiaomi.push.service;

import android.text.TextUtils;
import android.util.Base64;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes4.dex */
public class av {

    /* renamed from: a, reason: collision with root package name */
    private static RSAPublicKey f14766a;

    /* renamed from: a, reason: collision with other field name */
    private static final byte[] f1030a;

    static {
        byte[] bArr = {BuiltinOptions.SliceOptions, -127, -97, BuiltinOptions.SliceOptions, 13, 6, 9, BuiltinOptions.NegOptions, -122, BuiltinOptions.FloorModOptions, -122, -9, 13, 1, 1, 1, 5, 0, 3, -127, -115, 0, BuiltinOptions.SliceOptions, -127, -119, 2, -127, -127, 0, -109, -38, -114, 26, -72, BuiltinOptions.AbsOptions, 16, BuiltinOptions.BidirectionalSequenceRNNOptions, -90, BuiltinOptions.AssignVariableOptions, -30, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.WhereOptions, -3, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.SignOptions, 61, -98, 4, TransmissionUnpacked.HD_VAL_MAGIC_HB, BuiltinOptions.ZerosLikeOptions, 19, -90, -73, -5, -89, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.GreaterOptions, -27, BuiltinOptions.PackOptions, -123, BuiltinOptions.FloorModOptions, -73, -48, BuiltinOptions.TransposeConvOptions, 13, 16, BuiltinOptions.SparseToDenseOptions, -27, -82, 18, -28, BuiltinOptions.CosOptions, 0, -41, 16, BuiltinOptions.BidirectionalSequenceLSTMOptions, -39, 7, BuiltinOptions.AddNOptions, BuiltinOptions.PowOptions, BuiltinOptions.SplitVOptions, -37, BuiltinOptions.ArgMaxOptions, BuiltinOptions.WhereOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ExpOptions, BuiltinOptions.SignOptions, -34, -49, BuiltinOptions.VarHandleOptions, -11, BuiltinOptions.TransposeConvOptions, 28, BuiltinOptions.DynamicUpdateSliceOptions, -74, BuiltinOptions.RandomOptions, -122, -29, -84, BuiltinOptions.AddNOptions, 22, -122, BuiltinOptions.NegOptions, -40, -79, 18, -116, -42, BuiltinOptions.BatchMatMulOptions, -70, BuiltinOptions.GreaterOptions, 11, BuiltinOptions.LogicalAndOptions, -49, -3, -22, -2, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixSetDiagOptions, -116, -75, -99, 34, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 10, ProtocolBytes.SOF, -57, BuiltinOptions.QuantizeOptions, -23, -36, -60, ProtocolBytes.SOF, BuiltinOptions.ZerosLikeOptions, -114, 10, BuiltinOptions.SplitVOptions, BuiltinOptions.SegmentSumOptions, 29, BuiltinOptions.SelectOptions, -24, BuiltinOptions.HashtableSizeOptions, -66, -7, BuiltinOptions.ReverseSequenceOptions, 16, -125, -91, TransmissionUnpacked.HD_VAL_MAGIC_LB, -103, BuiltinOptions.ZerosLikeOptions, -20, BuiltinOptions.LessOptions, BuiltinOptions.DynamicUpdateSliceOptions, -37, -11, 2, 3, 1, 0, 1};
        f1030a = bArr;
        try {
            f14766a = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
        } catch (Throwable unused) {
            com.xiaomi.channel.commonutils.logger.b.d("rsa key pair init failure!!!");
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, f14766a);
            return Base64.encodeToString(a(cipher, 1, str.getBytes("UTF-8"), f14766a.getModulus().bitLength()), 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static byte[] a(Cipher cipher, int i, byte[] bArr, int i2) {
        int i3;
        byte[] doFinal;
        if (cipher == null || bArr == null) {
            return null;
        }
        if (i == 2) {
            i3 = i2 / 8;
        } else {
            i3 = (i2 / 8) - 11;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i4 = 0;
            int i5 = 0;
            while (bArr.length > i4) {
                if (bArr.length - i4 > i3) {
                    doFinal = cipher.doFinal(bArr, i4, i3);
                } else {
                    doFinal = cipher.doFinal(bArr, i4, bArr.length - i4);
                }
                byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                i5++;
                i4 = i5 * i3;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
