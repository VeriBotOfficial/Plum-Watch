package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class O3 {
    public static O2 A00;
    public static byte[] A01;
    public static String[] A02 = {"g", "j", "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "w";
            strArr2[0] = "P";
            copyOfRange[i4] = (byte) (i5 ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{BuiltinOptions.RankOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixDiagOptions, 27, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.RankOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.DepthToSpaceOptions, 27, BuiltinOptions.CosOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, 27, BuiltinOptions.GeluOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ATan2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.RandomOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.RandomOptions};
    }

    static {
        A02();
    }

    public static O2 A00(C2202cu c2202cu) {
        if (A00 == null) {
            synchronized (O2.class) {
                if (A00 == null) {
                    A00 = new O2(new C2429gf(c2202cu.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c2202cu), 0)));
                }
            }
        }
        return A00;
    }
}
