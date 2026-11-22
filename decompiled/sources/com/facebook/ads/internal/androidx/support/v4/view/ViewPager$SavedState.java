package com.facebook.ads.internal.androidx.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.PF;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public class ViewPager$SavedState extends AbsSavedState {
    public static byte[] A03;
    public static final Parcelable.Creator<ViewPager$SavedState> CREATOR;
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{34, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, 63, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMinOptions, 6};
    }

    static {
        A02();
        CREATOR = new PF();
    }

    public ViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public ViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        return A01(10, 25, 125) + Integer.toHexString(System.identityHashCode(this)) + A01(0, 10, 124) + this.A00 + A01(35, 1, 5);
    }

    @Override // com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }
}
