package com.facebook.ads.redexgen.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.iy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2559iy implements InterfaceC12374u {
    public static byte[] A0A;
    public static String[] A0B = {"ZvdLZTVfwuIBTQP4GzYBT5X", "wbAZGHQ6rgrE49QWGCHGfuBznSfuy1uN", "V6XwnsY6foGeZeUf6zKrOXNqPWCT5H6x", "YVOcTVGnehAK6q3v9MTNJvITraIKZiNA", "KHrBPZHANML419JBBjaM9uFMM5JItkLu", "1WIXy5Awt7B4E86DpiV0tl9iGx9sIFx0", "LtMYCkXqs5nSRMey4EGdy6S", "9S3XCAL9m1K226khzcMpmZ28hR6Taq7A"};
    public long A00;
    public long A01;
    public long A02;
    public AnonymousClass56 A03;
    public MC A04;
    public File A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final InterfaceC1655Ln A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{BuiltinOptions.RankOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.RightShiftOptions, 32, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.PadV2Options, 35, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SparseToDenseOptions, 21, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalOrOptions, 35, BuiltinOptions.CumsumOptions, BuiltinOptions.SelectOptions, BuiltinOptions.EqualOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.LogSoftmaxOptions, 35, BuiltinOptions.NegOptions, BuiltinOptions.LessOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LessEqualOptions, 35, BuiltinOptions.CumsumOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PadV2Options, BuiltinOptions.TileOptions, BuiltinOptions.PadV2Options, BuiltinOptions.CumsumOptions, BuiltinOptions.ExpandDimsOptions, 35, BuiltinOptions.CastOptions, BuiltinOptions.LessOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PadV2Options, 35, BuiltinOptions.ArgMaxOptions, 34, 35, 34, BuiltinOptions.CumsumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, BuiltinOptions.TileOptions, 35, BuiltinOptions.CumsumOptions, BuiltinOptions.LessOptions, 32, BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentProdOptions, Byte.MAX_VALUE, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CumsumOptions, 18, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.EqualOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.PadV2Options, BuiltinOptions.MaximumMinimumOptions, 63, BuiltinOptions.CumsumOptions, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.TileOptions, BuiltinOptions.EqualOptions, 35, BuiltinOptions.CumsumOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, 35, BuiltinOptions.CumsumOptions, BuiltinOptions.NotEqualOptions, 35, BuiltinOptions.ExpandDimsOptions, 32, BuiltinOptions.LessOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PadV2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.CastOptions, 35, BuiltinOptions.BroadcastToOptions, 35, BuiltinOptions.ShapeOptions, BuiltinOptions.LogSoftmaxOptions, 34, BuiltinOptions.ArgMaxOptions, 32, BuiltinOptions.PadV2Options, BuiltinOptions.TransposeConvOptions, 22, BuiltinOptions.GreaterOptions, 63, 32, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.MaximumMinimumOptions, 32, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NegOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TileOptions, 32, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NegOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.BatchMatMulOptions, 6, BuiltinOptions.HashtableOptions, 9, 0, 11, 2, 17, 13, 26, 16, 11, 22, 0, 17, BuiltinOptions.HashtableOptions};
    }

    static {
        A02();
    }

    public C2559iy(InterfaceC1655Ln interfaceC1655Ln, long j, int i) {
        C3M.A0A(j > 0 || j == -1, A00(115, 48, 72));
        if (j != -1 && j < 2097152) {
            AnonymousClass44.A07(A00(0, 13, 24), A00(13, 102, 75));
        }
        this.A09 = (InterfaceC1655Ln) C3M.A01(interfaceC1655Ln);
        this.A08 = j == -1 ? Long.MAX_VALUE : j;
        this.A07 = i;
    }

    /* JADX WARN: Finally extract failed */
    private void A01() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.flush();
            AbstractC12174a.A10(this.A06);
            this.A06 = null;
            File file = (File) AbstractC12174a.A0f(this.A05);
            this.A05 = null;
            String[] strArr = A0B;
            if (strArr[7].charAt(29) == strArr[2].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "UqCq1nJSNUsM2UdGgnorxCQ";
            strArr2[6] = "6grM2eqzP4bpAc7X7xQexiC";
            if (1 != 0) {
                this.A09.A4x(file, this.A02);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            AbstractC12174a.A10(this.A06);
            this.A06 = null;
            File fileToCommit = (File) AbstractC12174a.A0f(this.A05);
            this.A05 = null;
            if (0 != 0) {
                this.A09.A4x(fileToCommit, this.A02);
            } else {
                fileToCommit.delete();
            }
            throw th;
        }
    }

    private void A03(AnonymousClass56 anonymousClass56) throws IOException {
        this.A05 = this.A09.AJN((String) AbstractC12174a.A0f(anonymousClass56.A08), anonymousClass56.A04 + this.A00, anonymousClass56.A03 != -1 ? Math.min(anonymousClass56.A03 - this.A00, this.A01) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.A05);
        if (this.A07 > 0) {
            if (this.A04 == null) {
                this.A04 = new MC(fileOutputStream, this.A07);
            } else {
                this.A04.A00(fileOutputStream);
            }
            this.A06 = this.A04;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12374u
    public final void AG0(AnonymousClass56 anonymousClass56) throws C2561j0 {
        C3M.A01(anonymousClass56.A08);
        if (anonymousClass56.A03 == -1 && anonymousClass56.A06(2)) {
            this.A03 = null;
            return;
        }
        this.A03 = anonymousClass56;
        this.A01 = anonymousClass56.A06(4) ? this.A08 : Long.MAX_VALUE;
        this.A00 = 0L;
        try {
            A03(anonymousClass56);
        } catch (IOException e) {
            throw new C2561j0(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12374u
    public final void close() throws C2561j0 {
        if (this.A03 == null) {
            return;
        }
        try {
            A01();
        } catch (IOException e) {
            throw new C2561j0(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12374u
    public final void write(byte[] bArr, int i, int i2) throws C2561j0 {
        AnonymousClass56 anonymousClass56 = this.A03;
        if (anonymousClass56 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.A02 == this.A01) {
                    A01();
                    A03(anonymousClass56);
                }
                int min = (int) Math.min(i2 - i3, this.A01 - this.A02);
                ((OutputStream) AbstractC12174a.A0f(this.A06)).write(bArr, i + i3, min);
                i3 += min;
                this.A02 += min;
                this.A00 += min;
            } catch (IOException e) {
                throw new C2561j0(e);
            }
        }
    }
}
