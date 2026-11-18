package com.sifli.ezip;

import java.util.ArrayList;
import java.util.Iterator;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes16.dex */
public class FileValidator {
    private static final byte[] PNG_HEADER = {-119, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 13, 10, 26, 10};
    private static final byte[] GIF_HEADER_87A = {BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ScatterNdOptions};
    private static final byte[] GIF_HEADER_89A = {BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions};

    public static boolean isPngData(byte[] bArr) {
        if (bArr == null || bArr.length < PNG_HEADER.length) {
            return false;
        }
        int r1 = 0;
        while (true) {
            byte[] bArr2 = PNG_HEADER;
            if (r1 >= bArr2.length) {
                return true;
            }
            if (bArr[r1] != bArr2[r1]) {
                return false;
            }
            r1++;
        }
    }

    public static boolean isGifData(byte[] bArr) {
        if (bArr == null || bArr.length < GIF_HEADER_87A.length) {
            return false;
        }
        int r2 = 0;
        boolean z = true;
        boolean z2 = true;
        while (true) {
            byte[] bArr2 = GIF_HEADER_87A;
            if (r2 >= bArr2.length) {
                return z || z2;
            }
            byte b = bArr[r2];
            if (b != bArr2[r2]) {
                z = false;
            }
            if (b != GIF_HEADER_89A[r2]) {
                z2 = false;
            }
            if (!z && !z2) {
                return false;
            }
            r2++;
        }
    }

    public static boolean isPngData(ArrayList<byte[]> arrayList) {
        Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!isPngData(it.next())) {
                return false;
            }
        }
        return true;
    }
}
