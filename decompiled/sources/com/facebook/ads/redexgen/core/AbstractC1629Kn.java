package com.facebook.ads.redexgen.core;

import android.util.Pair;
import androidx.media3.extractor.WavUtil;
import java.io.IOException;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1629Kn {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1627Kl A02(InterfaceC2694lN interfaceC2694lN) throws IOException {
        byte[] bArr;
        C4J c4j = new C4J(16);
        C1628Km A03 = A03(WavUtil.FMT_FOURCC, interfaceC2694lN, c4j);
        C3M.A08(A03.A01 >= 16);
        interfaceC2694lN.AG9(c4j.A0l(), 0, 16);
        c4j.A0f(0);
        int A0G = c4j.A0G();
        int A0G2 = c4j.A0G();
        int A0F = c4j.A0F();
        int A0F2 = c4j.A0F();
        int A0G3 = c4j.A0G();
        int A0G4 = c4j.A0G();
        int i = ((int) A03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC2694lN.AG9(bArr, 0, i);
        } else {
            bArr = AbstractC12174a.A07;
        }
        interfaceC2694lN.AJJ((int) (interfaceC2694lN.A8a() - interfaceC2694lN.A8f()));
        return new C1627Kl(A0G, A0G2, A0F, A0F2, A0G3, A0G4, bArr);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{BuiltinOptions.PackOptions, 16, 13, 22, 19, BuiltinOptions.MatrixDiagOptions, 17, 11, BuiltinOptions.MatrixDiagOptions, 12, 23, 23, BuiltinOptions.MatrixDiagOptions, 20, 25, 10, 31, 29, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, 6, BuiltinOptions.ResizeNearestNeighborOptions, 63, 58, BuiltinOptions.GatherNdOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixDiagOptions, 12, 23, BuiltinOptions.MatrixDiagOptions, 11, 19, 17, 8, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MatrixDiagOptions, 17, 28, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.GreaterEqualOptions, 3, 10, 11, 22, 13, 10, 3, BuiltinOptions.FillOptions, 17, 10, 15, 10, 11, 19, 10, BuiltinOptions.FillOptions, BuiltinOptions.TileOptions, BuiltinOptions.CastOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.FillOptions, 7, 12, 17, 10, 15, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.AddNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixDiagOptions, 28, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ReverseV2Options, 28, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, 6, 28, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FloorModOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC2694lN interfaceC2694lN) throws IOException {
        C4J c4j = new C4J(8);
        C1628Km chunkHeader = C1628Km.A00(interfaceC2694lN, c4j);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC2694lN.AI1();
            return -1L;
        }
        interfaceC2694lN.A3z(8);
        c4j.A0f(0);
        interfaceC2694lN.AG9(c4j.A0l(), 0, 8);
        long sampleDataSize = c4j.A0N();
        interfaceC2694lN.AJJ(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC2694lN interfaceC2694lN) throws IOException {
        interfaceC2694lN.AI1();
        C1628Km A03 = A03(1684108385, interfaceC2694lN, new C4J(8));
        interfaceC2694lN.AJJ(8);
        return Pair.create(Long.valueOf(interfaceC2694lN.A8f()), Long.valueOf(A03.A01));
    }

    public static C1628Km A03(int i, InterfaceC2694lN interfaceC2694lN, C4J c4j) throws IOException {
        C1628Km A002 = C1628Km.A00(interfaceC2694lN, c4j);
        while (A002.A00 != i) {
            AnonymousClass44.A07(A04(91, 15, 125), A04(40, 28, 39) + A002.A00);
            long j = A002.A01 + 8;
            if (j <= 2147483647L) {
                interfaceC2694lN.AJJ((int) j);
                A002 = C1628Km.A00(interfaceC2694lN, c4j);
            } else {
                throw C11732i.A00(A04(0, 40, 59) + A002.A00);
            }
        }
        return A002;
    }

    public static boolean A06(InterfaceC2694lN interfaceC2694lN) throws IOException {
        C4J c4j = new C4J(8);
        C1628Km A002 = C1628Km.A00(interfaceC2694lN, c4j);
        if (A002.A00 != 1380533830) {
            int i = A002.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i != 1380333108) {
                return false;
            }
        }
        interfaceC2694lN.AG9(c4j.A0l(), 0, 4);
        c4j.A0f(0);
        int A0C = c4j.A0C();
        if (A0C != 1463899717) {
            AnonymousClass44.A05(A04(91, 15, 125), A04(68, 23, 127) + A0C);
            return false;
        }
        return true;
    }
}
