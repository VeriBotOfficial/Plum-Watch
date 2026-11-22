package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdExperienceType;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.No, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1707No {
    public static byte[] A00;
    public static String[] A01 = {"eCm2h", "Nf7MRRwZDvE8y93FmZbCxZ1qYSmL5", "hLhdl", "QFLrF4Ks", "BOssa91vTI1SLJXUpFqc70oF1BItrBHL", "FqkYvgsNMANULI15i6yaohJxBf4", "miT1Gr55rzSuK5J6MchCspbbNM8vv", "VeGA9hanV"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 8;
            String[] strArr = A01;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "4uOWgwLt9zl0NDLT0ztu7wfG2sM7UGLh";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {BuiltinOptions.DensifyOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.RandomOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableSizeOptions, 32, BuiltinOptions.CastOptions, 30, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, 34, BuiltinOptions.LogSoftmaxOptions, 30, 34, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.DequantizeOptions, 30, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.NotEqualOptions, 32, BuiltinOptions.TileOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, 30, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMaxOptions, 32, BuiltinOptions.GreaterEqualOptions};
        String[] strArr = A01;
        if (strArr[0].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "XJhKJAm65tduHMV7V8mUfKCv645Q9";
        strArr2[5] = "xNMnL7L41pq7X174jFC3Kxd5REO";
        A00 = bArr;
    }

    static {
        A03();
    }

    public static AdExperienceType A00(String str) {
        if (str == null) {
            return null;
        }
        if (A01(0, 33, 10).equals(str)) {
            AdExperienceType adExperienceType = AdExperienceType.AD_EXPERIENCE_TYPE_INTERSTITIAL;
            String[] strArr = A01;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "tWHbMLY0jEAGlYHbcSqJBIrBc18go";
            strArr2[5] = "4H5Z0LJ7wdDYVvSZnKKEqH9oXzt";
            return adExperienceType;
        }
        if (A01(33, 42, 73).equals(str)) {
            return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
        }
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public static String A02(AdExperienceType adExperienceType) {
        return adExperienceType.getAdExperienceType();
    }
}
