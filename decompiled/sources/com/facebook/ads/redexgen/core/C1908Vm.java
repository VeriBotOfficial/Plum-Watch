package com.facebook.ads.redexgen.core;

import com.wakeup.commponent.module.sport.SportTypeConstant;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1908Vm<T> implements InterfaceC1865Tu<T> {
    public static byte[] A06;
    public static String[] A07 = {"EKA8QeB4steRJ5RPBpFUjw3mjvi5", "fve4ITv79qbm2xvzEK1yqXI", "ABPapESs8CyLRtVNwfFPA7A05iROvZsV", "0Lyphf8QRYP2FOEDF4CKVyWqrMlG", "sjHSRvprFPL1Hzs2shXil", "0UuY0i89chpuUt8804PTKlfzEuvvqf4a", "FkeetCIpWmPLoPieiedf1X3IWnyHYH7Q", "bw9eqk6z"};
    public C1857Tm A00;
    public C1857Tm A01;
    public List<C1908Vm<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C1856Tl A04;
    public final U1 A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {BuiltinOptions.FillOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SignOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SignOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ReadVariableOptions, 61, BuiltinOptions.PowOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ReadVariableOptions, 61, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SignOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.NonMaxSuppressionV5Options, 28, BuiltinOptions.NegOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, Byte.MAX_VALUE, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NotEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, Byte.MAX_VALUE, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterOptions, Byte.MAX_VALUE, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PadV2Options, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ATan2Options, BuiltinOptions.PackOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.PackOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, Byte.MAX_VALUE, 61, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, Byte.MAX_VALUE, BuiltinOptions.GreaterEqualOptions, 58, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PackOptions, Byte.MAX_VALUE, BuiltinOptions.ArgMinOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, 58, Byte.MAX_VALUE, BuiltinOptions.GreaterOptions, 58, BuiltinOptions.LessEqualOptions, BuiltinOptions.NegOptions, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalOrOptions, 58, Byte.MAX_VALUE, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, BuiltinOptions.DequantizeOptions, Byte.MAX_VALUE, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterOptions, Byte.MAX_VALUE, BuiltinOptions.ArgMinOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, 58, Byte.MAX_VALUE, BuiltinOptions.ATan2Options, BuiltinOptions.PackOptions, BuiltinOptions.BatchMatMulOptions, Byte.MAX_VALUE, BuiltinOptions.PackOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalAndOptions, Byte.MAX_VALUE, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterOptions, Byte.MAX_VALUE, BuiltinOptions.SelectOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, 61, BuiltinOptions.LogicalAndOptions, 61, BuiltinOptions.TileOptions, BuiltinOptions.DequantizeOptions, Byte.MAX_VALUE, 61, 58, 58, BuiltinOptions.TransposeConvOptions, Byte.MAX_VALUE, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.AbsOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, 7, BuiltinOptions.GatherNdOptions, BuiltinOptions.FloorModOptions, 7, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ZerosLikeOptions, 7, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 7, BuiltinOptions.GatherNdOptions, BuiltinOptions.FloorModOptions, 7, BuiltinOptions.LeakyReluOptions, BuiltinOptions.FloorModOptions, 64, 8, BuiltinOptions.SelectOptions, BuiltinOptions.MaximumMinimumOptions, 34, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, BuiltinOptions.HashtableSizeOptions, 58, BuiltinOptions.ExpOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.GreaterEqualOptions, 34, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NegOptions, BuiltinOptions.SelectOptions, 58, BuiltinOptions.SelectOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SelectOptions, 61, BuiltinOptions.PadV2Options, 11, BuiltinOptions.GreaterOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ArgMinOptions, 34, BuiltinOptions.HashtableImportOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.CastOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.LessOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.PadV2Options, 63, 34, 32, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ExpOptions, 34, BuiltinOptions.NegOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, 0, BuiltinOptions.CosOptions, BuiltinOptions.SplitVOptions, 0, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, 0, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FillOptions, 0, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AbsOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SignOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SelectOptions, BuiltinOptions.ATan2Options, Byte.MAX_VALUE, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SignOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SelectOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SelectOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.ATan2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SliceOptions, 7, 1, 13, 16, 6, BuiltinOptions.LogSoftmaxOptions, 11, 14, 7, 32, 3, 17, 7, 6, BuiltinOptions.SliceOptions, 7, 1, 13, 16, 6, BuiltinOptions.DequantizeOptions, 3, 22, 3, 0, 3, 17, 7, BuiltinOptions.SquareOptions, 1, 14, 13, 17, 7, 6, BuiltinOptions.UnsortedSegmentMaxOptions, 64, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RangeOptions, 64, BuiltinOptions.CallOnceOptions, BuiltinOptions.FillOptions, BuiltinOptions.RankOptions, 64, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 64, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FillOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.RankOptions, 64, 5, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RankOptions, 5, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RankOptions, 64, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SquaredDifferenceOptions, 2, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RankOptions, BuiltinOptions.ZerosLikeOptions, 64, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 2, BuiltinOptions.FillOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseSequenceOptions, 26, 31, 10, 31};
        if (A07[6].charAt(28) == 'd') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "G0nCZJj0prSQWtMWq2fjymNjpmI3wJ1o";
        strArr[2] = "hmxAaa3VGXWJOtMylrC9mnhyviZ0JnjG";
        A06 = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Vm<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(C1909Vn c1909Vn) {
        if (!this.A02.remove(c1909Vn)) {
            return false;
        }
        if (c1909Vn.A6P() > 0 && c1909Vn.A01().A02.A05(c1909Vn.A01().A01).equals(this.A01)) {
            this.A01 = c1909Vn.A00().A02;
        }
        return true;
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public C1908Vm(C1862Tr c1862Tr, InterfaceC1870Tz interfaceC1870Tz) throws IOException {
        this.A05 = new U1(c1862Tr.A04(A00(515, 4, 103)), interfaceC1870Tz);
        this.A04 = new C1856Tl(new File(c1862Tr.A05(), A00(509, 6, 60)));
        this.A00 = this.A04.A03();
        A05(interfaceC1870Tz);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i, int i2) throws IOException {
        this.A00 = new C1857Tm(i, i2);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Vm<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(C1909Vn c1909Vn) throws U3 {
        if (!this.A03) {
            if (A06(c1909Vn)) {
                if (c1909Vn.A6P() == 0) {
                    return;
                }
                if (this.A00.A04(c1909Vn.A00().A02) == 0) {
                    try {
                        Iterator<C1869Ty> it = c1909Vn.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), c1909Vn.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e) {
                        throw new U3(A00(361, 30, 22), e);
                    }
                }
                throw new U3(A00(0, 54, 30));
            }
            throw new U3(A00(Videoio.CAP_PROP_XI_COOLING, 43, 59));
        }
        throw new U3(A00(Videoio.CAP_PROP_XI_BINNING_SELECTOR, 39, 60));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(com.facebook.ads.redexgen.core.InterfaceC1870Tz r13) throws java.io.IOException {
        /*
            r12 = this;
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            int r0 = r0.A06()
            r5 = 0
            com.facebook.ads.redexgen.X.Tm r3 = new com.facebook.ads.redexgen.X.Tm
            r3.<init>(r0, r5)
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r3.A04(r0)
            r4 = 3
            r11 = 2
            r10 = 1
            if (r0 <= 0) goto L5c
            java.util.Locale r7 = java.util.Locale.US
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A02()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A03()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A02()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A03()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 4
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r5] = r9
            r6[r10] = r8
            r6[r11] = r2
            r6[r4] = r1
            r2 = 54
            r1 = 102(0x66, float:1.43E-43)
            r0 = 13
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r13.AHs(r0)
            r12.A00 = r3
        L5b:
            return
        L5c:
            int r1 = r3.A02()
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A02()
            if (r1 >= r0) goto L5b
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L7c
            com.facebook.ads.redexgen.X.Tm r3 = new com.facebook.ads.redexgen.X.Tm
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            int r0 = r0.A06()
            r3.<init>(r0, r5)
            goto L5c
        L7c:
            java.util.Locale r7 = java.util.Locale.US
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A02()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A03()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r2
            r6[r10] = r1
            r6[r11] = r0
            r2 = 156(0x9c, float:2.19E-43)
            r1 = 101(0x65, float:1.42E-43)
            r0 = 70
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r13.AHs(r0)
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            int r2 = r0.A06()
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            int r1 = r0.A07()
            com.facebook.ads.redexgen.X.Tm r0 = new com.facebook.ads.redexgen.X.Tm
            r0.<init>(r2, r1)
            r12.A00 = r0
            com.facebook.ads.redexgen.X.Tl r1 = r12.A04
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            r1.A04(r0)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1908Vm.A05(com.facebook.ads.redexgen.X.Tz):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1865Tu
    public final synchronized InterfaceC1864Tt A6O(byte[] bArr, int[] iArr) throws U3 {
        C1908Vm<T>.RecordFileBasedFetch c1909Vn;
        if (!this.A03) {
            int i = 0;
            int i2 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    C1860Tp A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i, iArr, i2);
                    int A00 = A0A.A01().A00();
                    int storageOffset = A0A.A01().A01();
                    int i3 = A00 - storageOffset;
                    int storageOffset2 = A0A.A01().A02();
                    i += storageOffset2;
                    i2 += i3;
                    if (A0A.A01().A03() == EnumC1858Tn.A03) {
                        arrayList.add(A0A);
                    }
                    if (A0A.A01().A03() == EnumC1858Tn.A04) {
                        break;
                    }
                    if (A0A.A01().A03() == EnumC1858Tn.A05) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new C1857Tm(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i3);
                    }
                }
                c1909Vn = new C1909Vn(this, arrayList, mayHaveMoreData);
                this.A02.add(c1909Vn);
                if (!arrayList.isEmpty()) {
                    C1857Tm c1857Tm = c1909Vn.A01().A02;
                    int storageOffset6 = c1909Vn.A01().A01;
                    this.A01 = c1857Tm.A05(storageOffset6);
                }
            } catch (IOException e) {
                throw new U3(A00(306, 29, 84), e);
            }
        } else {
            throw new U3(A00(391, 36, 123));
        }
        return c1909Vn;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1865Tu
    public final synchronized int A8k() throws U3 {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                int A02 = this.A00.A02();
                int count = this.A05.A06();
                if (A02 == count) {
                    int count2 = this.A00.A03();
                    A09 -= count2;
                }
            } catch (IOException e) {
                throw new U3(A00(335, 26, 57), e);
            }
        } else {
            throw new U3(A00(Videoio.CAP_PROP_XI_BINNING_SELECTOR, 39, 60));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1865Tu
    public final synchronized void AJW(byte[] bArr) throws U3 {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e) {
                throw new U3(A00(257, 25, 62), e);
            }
        } else {
            throw new U3(A00(Videoio.CAP_PROP_XI_BINNING_SELECTOR, 39, 60));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1865Tu
    public final synchronized void clear() throws U3 {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e) {
            throw new U3(A00(SportTypeConstant.Course_21, 24, 87), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
