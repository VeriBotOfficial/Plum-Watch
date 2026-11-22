package com.facebook.ads.androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC11692c;
import com.facebook.ads.redexgen.core.AbstractC12174a;
import com.facebook.ads.redexgen.core.C2905or;
import com.facebook.ads.redexgen.core.HT;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static byte[] A06;
    public static String[] A07 = {"ghaGnAUOt2SitSRHHz423X90tSKTPAXx", "FBrp2nvQgqmyeffboeTEyGvTZbETTMzG", "eMo1BdFVOzvhBgFL81jHh", "7Uh1kBGFxd7GLg5A0JuRGjBqdN4vVDce", "ZLGEUlzQT0qHH0ct6", "61ApNNUKl6RqFIc15O7NgM3p8KU8Sqmx", "LSx5TaQkP", "Wz18oCr93"};
    public static final Parcelable.Creator<IcyHeaders> CREATOR;
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{BuiltinOptions.WhileOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, 29, 22, 11, 13, 30, 11, 26, BuiltinOptions.SquareOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessOptions, 34, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessEqualOptions, 63, BuiltinOptions.NegOptions, BuiltinOptions.SelectOptions, BuiltinOptions.NegOptions, 63, BuiltinOptions.NegOptions, 2, BuiltinOptions.CastOptions, 63, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMinOptions, 61, BuiltinOptions.NegOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.UnsortedSegmentProdOptions, 4, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, 5, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, BuiltinOptions.ArgMaxOptions, 63, BuiltinOptions.LogicalAndOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableImportOptions, 35, BuiltinOptions.GreaterOptions, 32, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.VarHandleOptions};
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
        CREATOR = new HT();
    }

    public IcyHeaders(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = AbstractC12174a.A1C(parcel);
        this.A01 = parcel.readInt();
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
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.A00 == icyHeaders.A00) {
            boolean A1E = AbstractC12174a.A1E(this.A02, icyHeaders.A02);
            if (A07[4].length() == 20) {
                throw new RuntimeException();
            }
            A07[5] = "I4GVatcg3Odw2bdDZmPqVg6Hl1I8OBM0";
            if (A1E && AbstractC12174a.A1E(this.A03, icyHeaders.A03) && AbstractC12174a.A1E(this.A04, icyHeaders.A04) && this.A05 == icyHeaders.A05 && this.A01 == icyHeaders.A01) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((17 * 31) + this.A00) * 31) + (this.A02 != null ? this.A02.hashCode() : 0)) * 31) + (this.A03 != null ? this.A03.hashCode() : 0)) * 31) + (this.A04 != null ? this.A04.hashCode() : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A01;
    }

    public final String toString() {
        return A00(40, 18, 62) + this.A03 + A00(11, 10, 63) + this.A02 + A00(0, 11, 12) + this.A00 + A00(21, 19, 56) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        AbstractC12174a.A0w(parcel, this.A05);
        parcel.writeInt(this.A01);
    }
}
