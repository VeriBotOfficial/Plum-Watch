package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class XS implements ThreadFactory {
    public static byte[] A02;
    public final AtomicLong A01 = new AtomicLong();
    public int A00 = Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{25, 21, 23, BuiltinOptions.CosOptions, 28, 27, 25, 31, 24, 21, 21, 17, BuiltinOptions.CosOptions, 27, 30, 9, BuiltinOptions.MatrixSetDiagOptions, 14, 18, 8, 31, 27, 30, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.NonMaxSuppressionV4Options, 30, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, 14, BuiltinOptions.LogicalOrOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BidirectionalSequenceRNNOptions, 14, BuiltinOptions.LessEqualOptions, 5, 25, 3, 20, 16, 21, 2, BuiltinOptions.LessEqualOptions, 18, 30, 4, 31, 5, 20, 3, BuiltinOptions.LessEqualOptions, 2, 21, 26, BuiltinOptions.LessEqualOptions, 23, 16, 18, 5, 30, 3, 8};
    }

    private final String A00() {
        return String.format(Locale.US, A01(0, 35, 38), Long.valueOf(this.A01.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        T1.A00(A01(35, 27, 45));
        Thread thread = new Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
