package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.Format;
import java.util.Arrays;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.oH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2871oH implements C1S {
    public static byte[] A05;
    public static final C1R<C2871oH> A06;
    public static final String A07;
    public static final String A08;
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C2905or[] A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{BuiltinOptions.NonMaxSuppressionV4Options, 28, 16, 18, 29, 22, 17, 26, 27, BuiltinOptions.NonMaxSuppressionV4Options, 22, 17, BuiltinOptions.NonMaxSuppressionV4Options, 16, 17, 26, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.PadV2Options, 13, 30, 28, 20, BuiltinOptions.PowOptions, 13, 16, 10, 15, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.TransposeConvOptions, 34, 32, BuiltinOptions.ArgMaxOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, Byte.MAX_VALUE, 35, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, BuiltinOptions.LeakyReluOptions, 64, BuiltinOptions.MatrixSetDiagOptions, 14, 22, BuiltinOptions.SliceOptions, 35, BuiltinOptions.ExpOptions, BuiltinOptions.LessOptions, 5, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SparseToDenseOptions, 63, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, 63, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, 63, BuiltinOptions.ATan2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PackOptions, 61, BuiltinOptions.LessOptions, 61, BuiltinOptions.DequantizeOptions, BuiltinOptions.GreaterOptions};
    }

    static {
        A05();
        A07 = AbstractC12174a.A0h(0);
        A08 = AbstractC12174a.A0h(1);
        A06 = new C1R() { // from class: com.facebook.ads.redexgen.X.oI
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C2871oH.A01(bundle);
            }
        };
    }

    public C2871oH(String str, C2905or... c2905orArr) {
        C3M.A07(c2905orArr.length > 0);
        this.A03 = str;
        this.A04 = c2905orArr;
        this.A01 = c2905orArr.length;
        int A01 = AbstractC11722h.A01(c2905orArr[0].A0W);
        this.A02 = A01 == -1 ? AbstractC11722h.A01(c2905orArr[0].A0S) : A01;
        A04();
    }

    public C2871oH(C2905or... c2905orArr) {
        this(A02(0, 0, 114), c2905orArr);
    }

    public static int A00(int i) {
        return i | 16384;
    }

    public static /* synthetic */ C2871oH A01(Bundle bundle) {
        List A01;
        List<Format> formats = bundle.getParcelableArrayList(A07);
        if (formats == null) {
            A01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = C3S.A01(C2905or.A0b, formats);
        }
        String id2 = bundle.getString(A08, A02(0, 0, 114));
        return new C2871oH(id2, (C2905or[]) A01.toArray(new C2905or[0]));
    }

    public static String A03(String str) {
        return (str == null || str.equals(A02(96, 3, 71))) ? A02(0, 0, 114) : str;
    }

    private void A04() {
        String A03 = A03(this.A04[0].A0V);
        int A00 = A00(this.A04[0].A0E);
        for (int i = 1; i < this.A04.length; i++) {
            String language = this.A04[i].A0V;
            if (!A03.equals(A03(language))) {
                String str = this.A04[0].A0V;
                String str2 = this.A04[i].A0V;
                String language2 = A02(77, 9, 81);
                A06(language2, str, str2, i);
                return;
            }
            if (A00 != A00(this.A04[i].A0E)) {
                String binaryString = Integer.toBinaryString(this.A04[0].A0E);
                String binaryString2 = Integer.toBinaryString(this.A04[i].A0E);
                String language3 = A02(86, 10, 85);
                A06(language3, binaryString, binaryString2, i);
                return;
            }
        }
    }

    public static void A06(String str, String str2, String str3, int i) {
        AnonymousClass44.A08(A02(67, 10, 77), A02(0, 0, 114), new IllegalStateException(A02(57, 10, 33) + str + A02(0, 30, 112) + str2 + A02(39, 17, 88) + str3 + A02(30, 9, 76) + i + A02(56, 1, 24)));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A07(com.facebook.ads.redexgen.core.C2905or r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            com.facebook.ads.redexgen.X.or[] r0 = r2.A04
            int r0 = r0.length
            if (r1 >= r0) goto L10
            com.facebook.ads.redexgen.X.or[] r0 = r2.A04
            r0 = r0[r1]
            if (r3 != r0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L1
        L10:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2871oH.A07(com.facebook.ads.redexgen.X.or):int");
    }

    public final C2905or A08(int i) {
        return this.A04[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2871oH c2871oH = (C2871oH) obj;
        return this.A03.equals(c2871oH.A03) && Arrays.equals(this.A04, c2871oH.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A03.hashCode();
            this.A00 = (((17 * 31) + result) * 31) + Arrays.hashCode(this.A04);
        }
        int result2 = this.A00;
        return result2;
    }
}
