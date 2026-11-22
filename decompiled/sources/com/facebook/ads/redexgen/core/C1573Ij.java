package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1573Ij {
    public static byte[] A03;
    public static String[] A04 = {"1LFyGIpszZgsQUUW5R18ay4ATJEAL43c", "dt6orGbglcsjMqs", "9FFDgagoC1", "foXErnBO9GEWWKnhx2CBLj59I1mQsasl", "8wc6iy8fDBcca8zNmQv", "", "jjxV28nHyp6my1wOvIi", "qfRjwVGa5Ot2KmC8yJE9Z4CCjcQdKZvd"};
    public static final C2577jH A05;
    public static final C2577jH A06;
    public int A01;
    public final List<C1570Ig> A02 = new ArrayList();
    public int A00 = 0;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
            if (A04[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A04[1] = "QzkInJPgctLD5w2";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{BuiltinOptions.GreaterEqualOptions, 10, 18, 5, 8, 13, 0, BuiltinOptions.FillOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpOptions, 34, BuiltinOptions.FillOptions, 10, 5, 9, 1, BuiltinOptions.PowOptions, 7, 4, 28, BuiltinOptions.DequantizeOptions, 4, 31, 2, 4, 5, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SelectOptions, 10, 31, 10, BuiltinOptions.WhileOptions, BuiltinOptions.SignOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.WhileOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BroadcastToOptions, Byte.MAX_VALUE, BuiltinOptions.AddNOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ATan2Options, 64, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SparseToDenseOptions, 20, 17, 4, 19, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SparseToDenseOptions, 13, 14, 22, BuiltinOptions.GreaterOptions, 14, 21, 8, 14, 15, BuiltinOptions.LogicalAndOptions, BuiltinOptions.CastOptions, 4, 7, 13, 8, 2, 10, 4, 19, 8, 15, 6, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessEqualOptions, 15, BuiltinOptions.FloorDivOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SignOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RankOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BucketizeOptions};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(InterfaceC2694lN interfaceC2694lN, List<Metadata.Entry> list) throws IOException {
        long A8f = interfaceC2694lN.A8f();
        int A8G = (int) ((interfaceC2694lN.A8G() - interfaceC2694lN.A8f()) - this.A01);
        C4J c4j = new C4J(A8G);
        interfaceC2694lN.readFully(c4j.A0l(), 0, A8G);
        for (int i = 0; i < this.A02.size(); i++) {
            C1570Ig c1570Ig = this.A02.get(i);
            c4j.A0f((int) (c1570Ig.A02 - A8f));
            c4j.A0g(4);
            int A0E = c4j.A0E();
            String[] strArr = A04;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A04[7] = "1HViS9NC9rn2qgqFvoB7LQiD1FLq6ChH";
            int A00 = A00(c4j.A0W(A0E));
            int i2 = c1570Ig.A01 - (A0E + 8);
            switch (A00) {
                case 2192:
                    list.add(A01(c4j, i2));
                    break;
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    static {
        A03();
        A06 = C2577jH.A02(AbstractJsonLexerKt.COLON);
        A05 = C2577jH.A02('*');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) throws C11732i {
        char c;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals(A02(16, 15, 81))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1332107749:
                if (str.equals(A02(104, 26, 40))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1251387154:
                if (str.equals(A02(51, 21, 55))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -830665521:
                if (str.equals(A02(72, 32, 91))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1760745220:
                if (str.equals(A02(31, 20, 52))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2816;
            case 2:
                return 2817;
            case 3:
                return 2819;
            case 4:
                return 2820;
            default:
                throw C11732i.A01(A02(0, 16, 94), null);
        }
    }

    public static SlowMotionData A01(C4J c4j, int i) throws C11732i {
        List<SlowMotionData.Segment> segments = new ArrayList<>();
        String dataString = c4j.A0W(i);
        List<String> A062 = A05.A06(dataString);
        for (int i2 = 0; i2 < A062.size(); i2++) {
            List<String> A063 = A06.A06(A062.get(i2));
            if (A063.size() == 3) {
                try {
                    long parseLong = Long.parseLong(A063.get(0));
                    long startTimeMs = Long.parseLong(A063.get(1));
                    segments.add(new SlowMotionData.Segment(parseLong, startTimeMs, 1 << (Integer.parseInt(A063.get(2)) - 1)));
                } catch (NumberFormatException e) {
                    throw C11732i.A01(null, e);
                }
            } else {
                throw C11732i.A01(null, null);
            }
        }
        return new SlowMotionData(segments);
    }

    private void A04(InterfaceC2694lN interfaceC2694lN, C1532Gt c1532Gt) throws IOException {
        C4J c4j = new C4J(8);
        interfaceC2694lN.readFully(c4j.A0l(), 0, 8);
        this.A01 = c4j.A0E() + 8;
        if (c4j.A0C() != 1397048916) {
            c1532Gt.A00 = 0L;
        } else {
            c1532Gt.A00 = interfaceC2694lN.A8f() - (this.A01 - 12);
            this.A00 = 2;
        }
    }

    private void A05(InterfaceC2694lN interfaceC2694lN, C1532Gt c1532Gt) throws IOException {
        long A8G = interfaceC2694lN.A8G();
        int i = (this.A01 - 12) - 8;
        C4J c4j = new C4J(i);
        interfaceC2694lN.readFully(c4j.A0l(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            c4j.A0g(2);
            int i3 = c4j.A0a();
            switch (i3) {
                case 2192:
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    long streamLength = this.A01;
                    long j = A8G - streamLength;
                    long streamLength2 = c4j.A0E();
                    int size = c4j.A0E();
                    this.A02.add(new C1570Ig(i3, j - streamLength2, size));
                    break;
                default:
                    c4j.A0g(8);
                    break;
            }
        }
        if (this.A02.isEmpty()) {
            c1532Gt.A00 = 0L;
            return;
        }
        this.A00 = 3;
        long streamLength3 = this.A02.get(0).A02;
        c1532Gt.A00 = streamLength3;
    }

    public final int A07(InterfaceC2694lN interfaceC2694lN, C1532Gt c1532Gt, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
        long j = 0;
        switch (this.A00) {
            case 0:
                long A8G = interfaceC2694lN.A8G();
                if (A8G != -1 && A8G >= 8) {
                    j = A8G - 8;
                }
                c1532Gt.A00 = j;
                this.A00 = 1;
                return 1;
            case 1:
                A04(interfaceC2694lN, c1532Gt);
                return 1;
            case 2:
                A05(interfaceC2694lN, c1532Gt);
                return 1;
            case 3:
                A06(interfaceC2694lN, slowMotionMetadataEntries);
                c1532Gt.A00 = 0L;
                return 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final void A08() {
        this.A02.clear();
        this.A00 = 0;
    }
}
