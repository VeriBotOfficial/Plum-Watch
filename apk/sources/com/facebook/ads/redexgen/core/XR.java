package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.concurrent.Executor;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class XR {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, 2, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.NonMaxSuppressionV4Options, 2, BuiltinOptions.HashtableImportOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions};
    }

    public static <P, PR, R> AsyncTask<P, PR, R> A00(Executor executor, AsyncTask<P, PR, R> task, P... params) {
        task.executeOnExecutor(executor, params);
        return task;
    }

    public static void A02() {
        try {
            Class.forName(A01(0, 20, 53));
        } catch (Throwable unused) {
        }
    }
}
