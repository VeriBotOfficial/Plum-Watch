package com.facebook.ads.redexgen.core;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;

@Deprecated
/* loaded from: assets/audience_network.dex */
public abstract class P4 {

    @Nullable
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"oH0n9xAbcML0pK3kOEyCMAjio6eGJJqD", "GHXQlAAFRKh09bddZmMmvyBDBjZAjYiv", "8JVYZEo4WjVv17g9aGlnSLFSGTnTlVlV", "9RFKXGXKeKZpKk57elbUgU5Rr7HYGf7i", "pphhsLP65zu6ZwDFb6wQsw2VBCTq4rPR", "7bQdqYtwnU89UvKxRDm92gBnYRs5HvHU", "CoVMihrSOvAeKI017KlJ1GeUcMhjoF5o", "1TwObRYenAx9Xxo2pcbqEN0Hah2BLlTA"};

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        if (A02[2].charAt(17) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "6RSw2BIRooHqNQZo6O6uqDXkY67gyuyt";
        strArr[5] = "6n2viGPYj5SHhnpzGoLQcwunY5cXqvEW";
        A01 = new byte[]{BuiltinOptions.RangeOptions, BuiltinOptions.BatchMatMulOptions, Byte.MAX_VALUE, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NegOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.NegOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NegOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NegOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, 34, 35, BuiltinOptions.NegOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.NegOptions, BuiltinOptions.IfOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableImportOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, 15, 63, 61, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, 15, 63, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, 26, 61, 63, BuiltinOptions.ArgMaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions};
    }

    static {
        A04();
        if (Build.VERSION.SDK_INT == 25) {
            try {
                A00 = ViewConfiguration.class.getDeclaredMethod(A03(82, 21, 102), new Class[0]);
            } catch (Exception unused) {
                Log.i(A03(66, 16, 37), A03(0, 66, 48));
            }
        }
    }

    public static float A00(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            float scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
            String[] strArr = A02;
            if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "0Ki4JXOncLynPK6ypbmoO1JP8yrdQeak";
            strArr2[1] = "cqlD2dZIdmZjhBfVp9VUMkw1vxAb5RnC";
            return scaledHorizontalScrollFactor;
        }
        return A02(viewConfiguration, context);
    }

    public static float A01(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        float A022 = A02(viewConfiguration, context);
        String[] strArr = A02;
        if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
            throw new RuntimeException();
        }
        A02[2] = "MeYqCAiPW6zL6oB0sS71srseS72Ki7Wj";
        return A022;
    }

    public static float A02(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 25 && A00 != null) {
            try {
                return ((Integer) A00.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                String A03 = A03(66, 16, 37);
                String[] strArr = A02;
                if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "k1KS2t9KIGKI4w6R1E4j5X81r1grad3n";
                strArr2[1] = "1ij9jDuHWzbgayt92o13kt38ESGEmluu";
                Log.i(A03, A03(0, 66, 48));
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
