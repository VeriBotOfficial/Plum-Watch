package com.facebook.ads.redexgen.core;

import android.os.SystemClock;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.mx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2790mx implements C8R {
    public static byte[] A01;
    public static String[] A02 = {"JE7C4PJjP7BCbZqkJpMMyURXZ5h", "iMYF6XNZz1LBnq9Lsd18aPb3vu2", "XxqNLC6c7RSVqgSJXO5oI", "nEpRStmmyFjBR5hyZRShRQxXaXf0Mj7x", "WMevU6o4a2paeBy7iKLxLT9X", "1yBfwy19", "IbfL1f4elDnhfhlOaFmHA7", "3K7V2NpliX3hv5M7KS"};
    public final /* synthetic */ C2789mw A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {64, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, 24, BuiltinOptions.NotEqualOptions, 63, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.PowOptions, 63, BuiltinOptions.NotEqualOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalAndOptions, 34, 34, BuiltinOptions.PowOptions, BuiltinOptions.TileOptions, 61, BuiltinOptions.ArgMaxOptions, BuiltinOptions.AssignVariableOptions, 61, BuiltinOptions.SliceOptions, 35, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.AssignVariableOptions, 61, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.ExpandDimsOptions, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, 17, BuiltinOptions.UniqueOptions, BuiltinOptions.FillOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, 17, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.IfOptions, BuiltinOptions.FloorDivOptions, 17, 25, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.IfOptions, BuiltinOptions.CosOptions, 17, BuiltinOptions.FloorDivOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, 17, BuiltinOptions.IfOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SquareOptions, BuiltinOptions.IfOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AddNOptions, BuiltinOptions.QuantizeOptions, 24, 11, 17, BuiltinOptions.CumsumOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixSetDiagOptions, 64, BuiltinOptions.BidirectionalSequenceRNNOptions, 21, BuiltinOptions.CosOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.IfOptions, BuiltinOptions.MatrixSetDiagOptions, 21, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.CosOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 21, 29, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MatrixDiagOptions, 21, BuiltinOptions.RankOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RankOptions, BuiltinOptions.DepthToSpaceOptions, 21, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.WhileOptions, 28, 15, 21};
        if (A02[4].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "crOuuTwIIsvqp0CyO4zKH";
        strArr[6] = "QvBSziwTMADuiMqU3qgYIx";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C2790mx(C2789mw c2789mw) {
        this.A00 = c2789mw;
    }

    @Override // com.facebook.ads.redexgen.core.C8R
    public final void ADi(long j) {
        AnonymousClass44.A07(A00(2, 16, 116), A00(18, 41, 39) + j);
    }

    @Override // com.facebook.ads.redexgen.core.C8R
    public final void AEg(long j) {
        C8J c8j;
        C8J c8j2;
        c8j = this.A00.A0I;
        if (c8j != null) {
            C2789mw c2789mw = this.A00;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "XUD65QsQyQCwJDnhFrO8y";
            strArr2[6] = "L1DcP3KlVDNfGhVI0cZDzs";
            c8j2 = c2789mw.A0I;
            c8j2.AEg(j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C8R
    public final void AEi(long j, long j2, long j3, long j4) {
        long A06;
        long A07;
        StringBuilder append = new StringBuilder().append(A00(59, 52, 71)).append(j);
        String A00 = A00(0, 2, 26);
        StringBuilder append2 = append.append(A00).append(j2).append(A00).append(j3).append(A00).append(j4).append(A00);
        A06 = this.A00.A06();
        StringBuilder append3 = append2.append(A06).append(A00);
        A07 = this.A00.A07();
        String sb = append3.append(A07).toString();
        if (!C2789mw.A0v) {
            String message = A00(2, 16, 116);
            AnonymousClass44.A07(message, sb);
            return;
        }
        throw new C13238g(sb);
    }

    @Override // com.facebook.ads.redexgen.core.C8R
    public final void AFP(long j, long j2, long j3, long j4) {
        long A06;
        long A07;
        StringBuilder append = new StringBuilder().append(A00(111, 50, 67)).append(j);
        String A00 = A00(0, 2, 26);
        StringBuilder append2 = append.append(A00).append(j2).append(A00).append(j3).append(A00).append(j4).append(A00);
        A06 = this.A00.A06();
        StringBuilder append3 = append2.append(A06).append(A00);
        A07 = this.A00.A07();
        String sb = append3.append(A07).toString();
        if (!C2789mw.A0v) {
            String message = A00(2, 16, 116);
            AnonymousClass44.A07(message, sb);
            return;
        }
        throw new C13238g(sb);
    }

    @Override // com.facebook.ads.redexgen.core.C8R
    public final void AFY(int i, long j) {
        C8J c8j;
        long j2;
        C8J c8j2;
        c8j = this.A00.A0I;
        if (c8j != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.A00.A07;
            long j3 = elapsedRealtime - j2;
            c8j2 = this.A00.A0I;
            c8j2.AFZ(i, j, j3);
        }
    }
}
