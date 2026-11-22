package com.facebook.ads.androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC11692c;
import com.facebook.ads.redexgen.core.AbstractC2961q7;
import com.facebook.ads.redexgen.core.C1550Hl;
import com.facebook.ads.redexgen.core.C2905or;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static byte[] A05;
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{13, 1, BuiltinOptions.ReverseV2Options, BuiltinOptions.RangeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.NotEqualOptions, BuiltinOptions.CosOptions, 30, -27, -39, BuiltinOptions.LessOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ArgMaxOptions, 12, 34, BuiltinOptions.TileOptions, 30, -10, 3, -9, BuiltinOptions.MirrorPadOptions, 64, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.NegOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.LogicalOrOptions, 20, -49, -61, 25, 12, 7, 8, 18, -10, 23, 4, 21, 23, -13, 18, 22, 12, 23, 12, 18, 17, -32, 18, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, -27, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ExpandDimsOptions, -27, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.DequantizeOptions, -1, -27, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ExpandDimsOptions, 24, BuiltinOptions.ArgMinOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMinOptions, 21, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, 2};
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
        CREATOR = new C1550Hl();
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A04 = j4;
        this.A03 = j5;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, C1550Hl c1550Hl) {
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
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.A02 == motionPhotoMetadata.A02 && this.A01 == motionPhotoMetadata.A01 && this.A00 == motionPhotoMetadata.A00 && this.A04 == motionPhotoMetadata.A04 && this.A03 == motionPhotoMetadata.A03;
    }

    public final int hashCode() {
        int result = AbstractC2961q7.A00(this.A02);
        int A00 = ((((17 * 31) + result) * 31) + AbstractC2961q7.A00(this.A01)) * 31;
        int result2 = AbstractC2961q7.A00(this.A00);
        int A002 = (((A00 + result2) * 31) + AbstractC2961q7.A00(this.A04)) * 31;
        int result3 = AbstractC2961q7.A00(this.A03);
        return A002 + result3;
    }

    public final String toString() {
        return A00(76, 42, 93) + this.A02 + A00(31, 12, 81) + this.A01 + A00(0, 31, 121) + this.A00 + A00(55, 21, 59) + this.A04 + A00(43, 12, 111) + this.A03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }
}
