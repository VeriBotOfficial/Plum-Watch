package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.3R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3R {
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"rt6CjKtQUOFxarnmkWqgGWje", "3nuh3b0J3kR9pkmWbi6mdwRc069ydG03", "vgqSEb59pwcvKw9WdixQFoz3Va18KFsr", "h35Isj3aZViVWltuKEoucz22tQqncTnx", "yJGJRoZVng69n9xQNPvqaXzNAukE8cwJ", "ZigbL863Rtw4tWoi2mLflUon", "c977rkHkuANnZfYHmbWrwArrI1mgRqhG", "I5ankwGA25juUPMFKSRh1H9yjdqc0trO"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{BuiltinOptions.HashtableOptions, BuiltinOptions.IfOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.WhileOptions, 64, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.GreaterOptions, 11, 3, 6, 15, 14, BuiltinOptions.ResizeNearestNeighborOptions, 30, 5, BuiltinOptions.ResizeNearestNeighborOptions, 3, 4, 28, 5, 1, 15, BuiltinOptions.ResizeNearestNeighborOptions, 13, 15, 30, 35, BuiltinOptions.ArgMaxOptions, 3, 4, 14, 15, 24, BuiltinOptions.ResizeNearestNeighborOptions, 28, 3, 11, BuiltinOptions.ResizeNearestNeighborOptions, 24, 15, 12, 6, 15, 9, 30, 3, 5, 4, BuiltinOptions.DensifyOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RangeOptions, 64, BuiltinOptions.FloorDivOptions, 5, BuiltinOptions.ReverseV2Options, BuiltinOptions.ResizeNearestNeighborOptions, 5, BuiltinOptions.ReverseSequenceOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.SquaredDifferenceOptions, 64, BuiltinOptions.GatherNdOptions, 64, 5, BuiltinOptions.SquareOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.FloorDivOptions, 64, BuiltinOptions.ReverseSequenceOptions, 5, BuiltinOptions.FloorModOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.RankOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SignOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableImportOptions};
    }

    static {
        A03();
    }

    public static IBinder A00(Bundle bundle, String str) {
        if (AbstractC12174a.A02 >= 18) {
            return bundle.getBinder(str);
        }
        IBinder A012 = A01(bundle, str);
        if (A02[7].charAt(19) == 'S') {
            throw new RuntimeException();
        }
        A02[7] = "R1pRDUJQUvAtWdszhYbqbgNcOgXvgcSI";
        return A012;
    }

    public static IBinder A01(Bundle bundle, String str) {
        Method method = A00;
        String A022 = A02(0, 10, 89);
        if (method == null) {
            try {
                Method getIBinder = Bundle.class.getMethod(A02(88, 10, 111), String.class);
                A00 = getIBinder;
                Method getIBinder2 = A00;
                getIBinder2.setAccessible(true);
                method = A00;
            } catch (NoSuchMethodException e) {
                AnonymousClass44.A09(A022, A02(52, 36, 85), e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            AnonymousClass44.A09(A022, A02(10, 42, 26), e2);
            return null;
        }
    }
}
