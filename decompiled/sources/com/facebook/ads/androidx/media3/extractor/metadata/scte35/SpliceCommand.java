package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC11692c;
import com.facebook.ads.redexgen.core.C2905or;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{BuiltinOptions.NotEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TransposeConvOptions, 32, BuiltinOptions.FloorModOptions, BuiltinOptions.RankOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 22, 21, 9, 12, 6, 0, BuiltinOptions.BidirectionalSequenceLSTMOptions, 6, 10, 8, 8, 4, 11, 1, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BidirectionalSequenceLSTMOptions, 17, 28, 21, 0, BuiltinOptions.MatrixDiagOptions};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9S() {
        return AbstractC11692c.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C2905or A9T() {
        return AbstractC11692c.A00(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return A02(0, 29, 61) + getClass().getSimpleName();
    }
}
