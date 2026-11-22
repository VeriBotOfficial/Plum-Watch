package com.sifli.ezip;

import java.util.ArrayList;
import java.util.Iterator;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes12.dex */
public class FileValidator {
    private static final byte[] PNG_HEADER = {-119, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 13, 10, 26, 10};
    private static final byte[] GIF_HEADER_87A = {BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ScatterNdOptions};
    private static final byte[] GIF_HEADER_89A = {BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions};

    public static boolean isPngData(byte[] bArr) {
        if (bArr == null || bArr.length < PNG_HEADER.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr2 = PNG_HEADER;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean isGifData(byte[] bArr) {
        if (bArr == null || bArr.length < GIF_HEADER_87A.length) {
            return false;
        }
        int i = 0;
        boolean z = true;
        boolean z2 = true;
        while (true) {
            byte[] bArr2 = GIF_HEADER_87A;
            if (i >= bArr2.length) {
                return z || z2;
            }
            byte b = bArr[i];
            if (b != bArr2[i]) {
                z = false;
            }
            if (b != GIF_HEADER_89A[i]) {
                z2 = false;
            }
            if (!z && !z2) {
                return false;
            }
            i++;
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
