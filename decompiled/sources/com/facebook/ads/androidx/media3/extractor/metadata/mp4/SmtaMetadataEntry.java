package com.facebook.ads.androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AE;
import com.facebook.ads.redexgen.core.AbstractC11692c;
import com.facebook.ads.redexgen.core.C1554Hq;
import com.facebook.ads.redexgen.core.C2905or;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static byte[] A02;
    public static String[] A03 = {"YowUIYllSx7M6YCZVsXGshOnSOoLtc3h", "cbQDhaoj6BnnjM86BUfLE0DUXcchhogH", "2jGri3G66okxwB6aTtVFlcwUPMWoSDUh", "oqqvnpR2rXjWIfcGmkwLVz", "HP58ZBS", "5FsZYBr", "C83yH5O3JL7Th6ZwVIEMqTmMQGSsrvlo", "iqmiLlFC0cAnJcgIyeYDmB"};
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR;
    public final float A00;
    public final int A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{BuiltinOptions.LessEqualOptions, 34, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.RankOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SignOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, 63, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.WhileOptions, BuiltinOptions.FillOptions, BuiltinOptions.ReverseV2Options, 10, 16, BuiltinOptions.GatherNdOptions, BuiltinOptions.ReverseV2Options, 64, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.WhileOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ReverseV2Options, BuiltinOptions.FillOptions, BuiltinOptions.WhereOptions, 13};
        String[] strArr = A03;
        if (strArr[2].charAt(28) == strArr[1].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[2] = "UBLtj7Rjkge8uoQlelG8V5Ug9TCga9yn";
        strArr2[1] = "9YC8uwkWuRyKlQdVdfZWzcDmlZgaZ9BR";
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9S() {
        return AbstractC11692c.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C2905or A9T() {
        return AbstractC11692c.A00(this);
    }

    static {
        A01();
        CREATOR = new C1554Hq();
    }

    public SmtaMetadataEntry(float f, int i) {
        this.A00 = f;
        this.A01 = i;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, C1554Hq c1554Hq) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        if (this.A00 == smtaMetadataEntry.A00) {
            int i = this.A01;
            int i2 = smtaMetadataEntry.A01;
            String[] strArr = A03;
            if (strArr[2].charAt(28) == strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "brpfHyQIMc9PLpoKo97tct";
            strArr2[3] = "b67853lh3a5iLFx744cZ7n";
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = AE.A00(this.A00);
        return (((17 * 31) + result) * 31) + this.A01;
    }

    public final String toString() {
        return A00(24, 23, 55) + this.A00 + A00(0, 24, 5) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }
}
