package com.facebook.ads.androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC12174a;
import com.facebook.ads.redexgen.core.C2905or;
import com.facebook.ads.redexgen.core.C2D;
import com.facebook.ads.redexgen.core.HN;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class EventMessage implements Metadata.Entry {
    public static byte[] A06;
    public static final C2905or A07;
    public static final C2905or A08;
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{35, BuiltinOptions.SelectOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SparseToDenseOptions, 6, 10, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, 23, 7, 11, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.AbsOptions, 22, BuiltinOptions.UnsortedSegmentMaxOptions, Byte.MAX_VALUE, BuiltinOptions.ScatterNdOptions, BuiltinOptions.DynamicUpdateSliceOptions, 8, 18, BuiltinOptions.FloorDivOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ReverseSequenceOptions, 15, BuiltinOptions.PowOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SliceOptions, 58, BuiltinOptions.PowOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SliceOptions, 61, BuiltinOptions.Conv3DOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.PadV2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.LessOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.TransposeConvOptions, 35, 63, 63, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.NegOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, 34, BuiltinOptions.NegOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SegmentSumOptions, 2, 15, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, Byte.MAX_VALUE, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.CastOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SignOptions, BuiltinOptions.SignOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CastOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.PowOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UniqueOptions, 4, BuiltinOptions.MirrorPadOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, 4, BuiltinOptions.MirrorPadOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, 13, 11, 4, 12, 14, 15, 10, 4, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UniqueOptions};
    }

    static {
        A01();
        A07 = new C2D().A11(A00(39, 15, 32)).A14();
        A08 = new C2D().A11(A00(54, 20, 125)).A14();
        CREATOR = new HN();
    }

    public EventMessage(Parcel parcel) {
        this.A03 = (String) AbstractC12174a.A0f(parcel.readString());
        this.A04 = (String) AbstractC12174a.A0f(parcel.readString());
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = (byte[]) AbstractC12174a.A0f(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final byte[] A9S() {
        if (A9T() != null) {
            return this.A05;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final C2905or A9T() {
        char c;
        String str = this.A03;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals(A00(148, 24, 71))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -795945609:
                if (str.equals(A00(74, 28, 50))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1303648457:
                if (str.equals(A00(102, 46, 114))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return A07;
            case 2:
                return A08;
            default:
                return null;
        }
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
        EventMessage eventMessage = (EventMessage) obj;
        if (this.A01 == eventMessage.A01 && this.A02 == eventMessage.A02 && AbstractC12174a.A1E(this.A03, eventMessage.A03) && AbstractC12174a.A1E(this.A04, eventMessage.A04) && Arrays.equals(this.A05, eventMessage.A05)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 17 * 31;
            int result = this.A03 != null ? this.A03.hashCode() : 0;
            int hashCode = (((i + result) * 31) + (this.A04 != null ? this.A04.hashCode() : 0)) * 31;
            int result2 = (int) (this.A01 ^ (this.A01 >>> 32));
            int result3 = (((hashCode + result2) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31;
            int result4 = Arrays.hashCode(this.A05);
            this.A00 = result3 + result4;
        }
        return this.A00;
    }

    public final String toString() {
        return A00(26, 13, 75) + this.A03 + A00(13, 5, 83) + this.A02 + A00(0, 13, 118) + this.A01 + A00(18, 8, 82) + this.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }
}
