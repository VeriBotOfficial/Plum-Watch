package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.mA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2742mA implements C1S {
    public static byte[] A03;
    public static String[] A04 = {"kjXOolT", "y1uosoppcQ2KAnagmdUHUDs2pqKkNOP", "9S5fCrLfVI6Z6wWSlA", "LW4KLvv", "ESAoxwChDjEBJ2YD38hEjiU5IsN", "MD8cz6uZEkXt7x64XO0blzPRBkN5Dhm8", "wv8vTraLOdvtLK52tGc0aCYgNtDO0cFF", "ftZS2reRIxcEfCn6parOlN78mV3R9Y2K"};
    public static final C1R<C2742mA> A05;
    public static final C2742mA A06;
    public static final String A07;
    public int A00;
    public final int A01;
    public final AbstractC1372Am<C2871oH> A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RankOptions, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RankOptions, BuiltinOptions.NonMaxSuppressionV4Options, 26, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.CosOptions, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, 26, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RangeOptions, 26, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, 26, BuiltinOptions.AbsOptions, BuiltinOptions.WhereOptions, 26, BuiltinOptions.WhereOptions, BuiltinOptions.CosOptions, BuiltinOptions.NonMaxSuppressionV4Options, 26, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SignOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ZerosLikeOptions, 20, BuiltinOptions.ReverseV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.FillOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BitcastOptions};
        if (A04[5].charAt(31) == 'Q') {
            throw new RuntimeException();
        }
        A04[4] = "LoVxB454";
        A03 = bArr;
    }

    static {
        A03();
        A06 = new C2742mA(new C2871oH[0]);
        A07 = AbstractC12174a.A0h(0);
        A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.mB
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C2742mA.A00(bundle);
            }
        };
    }

    public C2742mA(C2871oH... c2871oHArr) {
        this.A02 = AbstractC1372Am.A07(c2871oHArr);
        this.A01 = c2871oHArr.length;
        A02();
    }

    public static /* synthetic */ C2742mA A00(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        if (parcelableArrayList == null) {
            return new C2742mA(new C2871oH[0]);
        }
        return new C2742mA((C2871oH[]) C3S.A01(C2871oH.A06, parcelableArrayList).toArray(new C2871oH[0]));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r7 = this;
            r6 = 0
        L1:
            com.facebook.ads.redexgen.X.Am<com.facebook.ads.redexgen.X.oH> r0 = r7.A02
            int r0 = r0.size()
            if (r6 >= r0) goto L50
            int r5 = r6 + 1
        Lb:
            com.facebook.ads.redexgen.X.Am<com.facebook.ads.redexgen.X.oH> r0 = r7.A02
            int r0 = r0.size()
            if (r5 >= r0) goto L4d
            com.facebook.ads.redexgen.X.Am<com.facebook.ads.redexgen.X.oH> r0 = r7.A02
            java.lang.Object r1 = r0.get(r6)
            com.facebook.ads.redexgen.X.oH r1 = (com.facebook.ads.redexgen.core.C2871oH) r1
            com.facebook.ads.redexgen.X.Am<com.facebook.ads.redexgen.X.oH> r0 = r7.A02
            java.lang.Object r0 = r0.get(r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
            r2 = 0
            r1 = 60
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r0)
            r2 = 60
            r1 = 15
            r0 = 90
            java.lang.String r3 = A01(r2, r1, r0)
            r2 = 0
            r1 = 0
            r0 = 115(0x73, float:1.61E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A08(r3, r0, r4)
        L4a:
            int r5 = r5 + 1
            goto Lb
        L4d:
            int r6 = r6 + 1
            goto L1
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2742mA.A02():void");
    }

    public final int A04(C2871oH c2871oH) {
        int index = this.A02.indexOf(c2871oH);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public final C2871oH A05(int i) {
        return this.A02.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2742mA c2742mA = (C2742mA) obj;
        return this.A01 == c2742mA.A01 && this.A02.equals(c2742mA.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = this.A02.hashCode();
        }
        int i = this.A00;
        String[] strArr = A04;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[6] = "ifk0Ba0Zppjn7MlaJBrmzFqZbJ0HKklT";
        return i;
    }
}
