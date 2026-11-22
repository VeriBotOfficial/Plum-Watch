package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.36, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass36 {
    public static byte[] A04;
    public static final AnonymousClass36 A05;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-23, -35, 32, BuiltinOptions.CastOptions, 30, BuiltinOptions.PadV2Options, BuiltinOptions.PadV2Options, 34, BuiltinOptions.LessOptions, 0, BuiltinOptions.GreaterOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PadV2Options, BuiltinOptions.TransposeConvOptions, -6, 14, 2, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.RangeOptions, 31, -33, 19, 2, 7, 13, -28, 13, 16, 11, -1, 18, -7, 17, -1, 11, 14, 10, 3, TransmissionUnpacked.HD_VAL_MAGIC_HB, -1, 18, 3, -37};
    }

    static {
        A01();
        A05 = new AnonymousClass36(-1, -1, -1);
    }

    public AnonymousClass36(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (AbstractC12174a.A15(i3)) {
            i4 = AbstractC12174a.A06(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass36)) {
            return false;
        }
        AnonymousClass36 anonymousClass36 = (AnonymousClass36) obj;
        return this.A03 == anonymousClass36.A03 && this.A01 == anonymousClass36.A01 && this.A02 == anonymousClass36.A02;
    }

    public final int hashCode() {
        return BX.A00(Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return A00(26, 23, 59) + this.A03 + A00(0, 15, 90) + this.A01 + A00(15, 11, 127) + this.A02 + AbstractJsonLexerKt.END_LIST;
    }
}
