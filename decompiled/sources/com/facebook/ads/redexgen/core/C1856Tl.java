package com.facebook.ads.redexgen.core;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Tl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1856Tl implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"t11y9BgCyC0qQkG3mYUymtEDmEyKV4hc", "7ce9erzyyNrxlxET0sEMje4IREmhCp4i", "4ENs57XqgWmyHBJWN23MJhXXMCaaLz6e", "dr2xNsWDGhc5qlQtklfNqpJl8", "q35Tkz9qNjTEzRlngCIyL7KdK6wO30wH", "vPiuZupP6WnF44bZrTOwEQFi3wuHod3P", "O8XwwgRKslyLqfo5O4ZQvZ7SdPHYsu5Q", ""};
    public C1857Tm A00;
    public boolean A01;
    public final RandomAccessFile A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{26, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RangeOptions, 29, 64, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.LogicalOrOptions, -9, 64, BuiltinOptions.ResizeNearestNeighborOptions, -9, BuiltinOptions.PowOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PowOptions, BuiltinOptions.PackOptions, BuiltinOptions.UniqueOptions, -9, 58, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.CosOptions, 63, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, -2, BuiltinOptions.AbsOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AddNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquaredDifferenceOptions, 24, -2, 6, 3, BuiltinOptions.SquareOptions, 10, 3, BuiltinOptions.SquareOptions, 7, 32, BuiltinOptions.CastOptions, BuiltinOptions.ExpOptions};
    }

    static {
        A02();
    }

    public C1856Tl(File file) throws IOException {
        this.A02 = new RandomAccessFile(file, A00(53, 3, 59));
        if (this.A02.length() != 8) {
            this.A02.setLength(8L);
            this.A00 = new C1857Tm(0, 0);
            A01();
            return;
        }
        int readInt = this.A02.readInt();
        int index = this.A02.readInt();
        if (readInt < 0 || index < 0) {
            readInt = 0;
            index = 0;
        }
        this.A00 = new C1857Tm(readInt, index);
    }

    private void A01() throws IOException {
        this.A02.seek(0L);
        this.A02.writeInt(this.A00.A02());
        this.A02.writeInt(this.A00.A03());
        this.A02.getFD().sync();
    }

    public final C1857Tm A03() throws IOException {
        if (!this.A01) {
            return this.A00;
        }
        throw new IOException(A00(0, 28, 100));
    }

    public final void A04(C1857Tm c1857Tm) throws IOException {
        if (!this.A01) {
            int A02 = c1857Tm.A02();
            String[] strArr = A04;
            if (strArr[6].charAt(3) == strArr[1].charAt(3)) {
                throw new RuntimeException();
            }
            A04[2] = "wZJ8kWRxyYeI3b89D2ZfjwX8MEoFWOZU";
            if (A02 >= 0 && c1857Tm.A03() >= 0) {
                this.A00 = c1857Tm;
                A01();
                return;
            }
            throw new IOException(String.format(Locale.US, A00(28, 25, 107), Integer.valueOf(c1857Tm.A02()), Integer.valueOf(c1857Tm.A03())));
        }
        throw new IOException(A00(0, 28, 100));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        this.A02.close();
    }
}
