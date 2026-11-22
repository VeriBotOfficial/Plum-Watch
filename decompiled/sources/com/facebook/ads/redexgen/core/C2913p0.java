package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.p0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2913p0 implements C1S {
    public static byte[] A06;
    public static String[] A07 = {"HSHJbKu4LLVwlp8kAtKM", "V6sGPCPiRhBLh6", "pDYVgvWCLxIG9LT", "RWHl9GQtcXYH3V7mNtlpSVait36OCwJs", "0F7", "tg3oN59jNUBk8XSE4kwfd", "NBkHOFenkRKh7SKHrVJVIcIm0kDLsOxD", "OSER18TpRPMUQAQSprsMKIJx0xqzVeT1"};
    public static final C2913p0 A08;
    public static final C1R<C2913p0> A09;
    public static final C2914p1 A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;

    @MetaExoPlayerCustomization("Change back to private after AdsMediaSource fully upgraded")
    public final C2914p1[] A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2913p0 A00(Bundle bundle) {
        C2914p1[] c2914p1Arr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A0B);
        if (parcelableArrayList == null) {
            c2914p1Arr = new C2914p1[0];
        } else {
            c2914p1Arr = new C2914p1[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                c2914p1Arr[i] = C2914p1.A09.A6X((Bundle) parcelableArrayList.get(i));
            }
        }
        return new C2913p0(null, c2914p1Arr, bundle.getLong(A0C, A08.A02), bundle.getLong(A0D, A08.A03), bundle.getInt(A0E, A08.A01));
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A07;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "7EQT2aPGHNOftenQ9VAvD";
            strArr2[1] = "79Hg5O6oUNL8gh";
            copyOfRange[i4] = (byte) (i5 ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, 63, BuiltinOptions.TileOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CosOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalOrOptions, 10, 61, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.EqualOptions, 61, 8, BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, 13, BuiltinOptions.PadV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectOptions, 35, BuiltinOptions.SelectV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.MatrixDiagOptions, 13, 1, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, BuiltinOptions.GatherNdOptions, 64, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.GeluOptions, BuiltinOptions.AddNOptions, 28, 1, BuiltinOptions.LogSoftmaxOptions, 16, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMinOptions, 34, BuiltinOptions.ExpOptions, 35, BuiltinOptions.PadV2Options, 19, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CastOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, 9, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.LogSoftmaxOptions, 29, 24, BuiltinOptions.CosOptions, 15, 8, 29, 8, 25, BuiltinOptions.FloorDivOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ResizeNearestNeighborOptions, 18, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.RangeOptions, 7};
    }

    static {
        A03();
        A08 = new C2913p0(null, new C2914p1[0], 0L, -9223372036854775807L, 0);
        A0A = new C2914p1(0L).A06(0);
        A0B = AbstractC12174a.A0h(1);
        A0C = AbstractC12174a.A0h(2);
        A0D = AbstractC12174a.A0h(3);
        A0E = AbstractC12174a.A0h(4);
        A09 = new C1R() { // from class: com.facebook.ads.redexgen.X.p3
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                C2913p0 A00;
                A00 = C2913p0.A00(bundle);
                return A00;
            }
        };
    }

    public C2913p0(Object obj, C2914p1[] c2914p1Arr, long j, long j2, int i) {
        this.A04 = obj;
        this.A02 = j;
        this.A03 = j2;
        this.A00 = c2914p1Arr.length + i;
        this.A05 = c2914p1Arr;
        this.A01 = i;
    }

    private boolean A04(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = A07(i).A03;
        if (j3 != Long.MIN_VALUE) {
            return j < j3;
        }
        if (A07[3].charAt(17) != 't') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "6w59Aw8BMojzvOgPymJyT";
        strArr[1] = "Ceso9EO8QL9NfZ";
        return j2 == -9223372036854775807L || j < j2;
    }

    public final int A05(long j, long j2) {
        if (j == Long.MIN_VALUE || (j2 != -9223372036854775807L && j >= j2)) {
            return -1;
        }
        int index = this.A01;
        while (index < this.A00 && ((A07(index).A03 != Long.MIN_VALUE && A07(index).A03 <= j) || !A07(index).A08())) {
            index++;
        }
        if (index < this.A00) {
            return index;
        }
        return -1;
    }

    public final int A06(long j, long j2) {
        int i = this.A00 - 1;
        while (i >= 0 && A04(j, j2, i)) {
            i--;
        }
        if (i < 0 || !A07(i).A07()) {
            return -1;
        }
        return i;
    }

    public final C2914p1 A07(int i) {
        if (i < this.A01) {
            return A0A;
        }
        return this.A05[i - this.A01];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2913p0 c2913p0 = (C2913p0) obj;
        if (AbstractC12174a.A1E(this.A04, c2913p0.A04) && this.A00 == c2913p0.A00 && this.A02 == c2913p0.A02 && this.A03 == c2913p0.A03 && this.A01 == c2913p0.A01) {
            C2914p1[] c2914p1Arr = this.A05;
            String[] strArr = A07;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "16faulxPxX0sTjyZsuY2d";
            strArr2[1] = "99yT7gYz4zzQy1";
            if (Arrays.equals(c2914p1Arr, c2913p0.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i = result * 31;
        int result2 = this.A04 == null ? 0 : this.A04.hashCode();
        int i2 = (((i + result2) * 31) + ((int) this.A02)) * 31;
        int result3 = (int) this.A03;
        int result4 = (((i2 + result3) * 31) + this.A01) * 31;
        int result5 = Arrays.hashCode(this.A05);
        return result4 + result5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A02(55, 22, 92));
        sb.append(this.A04);
        sb.append(A02(14, 21, 68));
        sb.append(this.A02);
        sb.append(A02(2, 12, 15));
        int i = 0;
        while (true) {
            C2914p1[] c2914p1Arr = this.A05;
            String[] strArr = A07;
            String str = strArr[0];
            String str2 = strArr[2];
            int i2 = str.length();
            if (i2 == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "HwwbQlKsFzrVvgzZA70k";
            strArr2[2] = "CWSfdfe0R8gD4PU";
            int length = c2914p1Arr.length;
            String A02 = A02(77, 2, 17);
            if (i < length) {
                sb.append(A02(88, 15, 38));
                sb.append(this.A05[i].A03);
                sb.append(A02(35, 7, 31));
                int i3 = 0;
                while (true) {
                    int length2 = this.A05[i].A05.length;
                    String A022 = A02(0, 2, 118);
                    if (i3 < length2) {
                        sb.append(A02(79, 9, 96));
                        int i4 = this.A05[i].A05[i3];
                        switch (i4) {
                            case 0:
                                sb.append('_');
                                break;
                            case 1:
                                sb.append(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                                break;
                            case 2:
                                sb.append('S');
                                break;
                            case 3:
                                sb.append('P');
                                break;
                            case 4:
                                sb.append('!');
                                break;
                            default:
                                sb.append('?');
                                break;
                        }
                        sb.append(A02(42, 13, 61));
                        sb.append(this.A05[i].A06[i3]);
                        sb.append(')');
                        int i5 = this.A05[i].A05.length;
                        if (i3 < i5 - 1) {
                            sb.append(A022);
                        }
                        i3++;
                    } else {
                        sb.append(A02);
                        String[] strArr3 = A07;
                        String str3 = strArr3[5];
                        String str4 = strArr3[1];
                        int i6 = str3.length();
                        if (i6 == str4.length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A07;
                        strArr4[0] = "tpRIwkkikLxaZqXNkXQj";
                        strArr4[2] = "ureQIhKfJpTfNVp";
                        if (i < this.A05.length - 1) {
                            sb.append(A022);
                        }
                        i++;
                    }
                }
            } else {
                sb.append(A02);
                return sb.toString();
            }
        }
    }
}
