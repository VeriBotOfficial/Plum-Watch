package com.facebook.ads.redexgen.core;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC1891Uu {
    public static byte[] A00;
    public static String[] A01 = {"t11qfTcdRX3vtzWg9o3D7yzOQIlsgekI", "6i20agDhmSdy9vSyuA65WoFMQBMnYQqu", "rdyvRl0mnrLy9iBwCAplKJJzDaMabc0M", "SOZt7VgRETJYcVg4", "xbstiP5KKiAzncux", "VTcuBCbEWMb14OGNQVtfuGUmCLIRmz1L", "NW0LuK6Vb9eH6jcO6lyYeFn7KSHSxynw", "5brGPIOfpSxIScBaveghLVMlb1271YeU"};
    public static final /* synthetic */ EnumC1891Uu[] A02;
    public static final EnumC1891Uu A03;
    public static final EnumC1891Uu A04;
    public static final EnumC1891Uu A05;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableOptions, 2, 3};
    }

    static {
        A02();
        A03 = new EnumC1891Uu(A01(0, 7, 61), 0);
        A05 = new EnumC1891Uu(A01(10, 2, 108), 1);
        A04 = new EnumC1891Uu(A01(7, 3, 12), 2);
        A02 = A03();
    }

    public EnumC1891Uu(String str, int i) {
    }

    public static VideoAutoplayBehavior A00(@Nullable EnumC1891Uu enumC1891Uu) {
        if (enumC1891Uu == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        switch (C1890Ut.A00[enumC1891Uu.ordinal()]) {
            case 1:
                VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(31) != 'u') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "tGhoRPzzdwkU9rBMhrkq51QPgJKMKCG7";
                strArr[7] = "oLzw2E9OShYSASB843fXRAiyIcSfpUGD";
                return videoAutoplayBehavior;
            case 2:
                return VideoAutoplayBehavior.ON;
            case 3:
                return VideoAutoplayBehavior.OFF;
            default:
                return VideoAutoplayBehavior.DEFAULT;
        }
    }

    public static /* synthetic */ EnumC1891Uu[] A03() {
        EnumC1891Uu[] enumC1891UuArr = new EnumC1891Uu[3];
        enumC1891UuArr[0] = A03;
        if (A01[5].charAt(31) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "zoiTRupMudK7uDXw";
        strArr[4] = "VFYrxWbIb3tlnjHn";
        enumC1891UuArr[1] = A05;
        enumC1891UuArr[2] = A04;
        return enumC1891UuArr;
    }

    public static EnumC1891Uu valueOf(String str) {
        return (EnumC1891Uu) Enum.valueOf(EnumC1891Uu.class, str);
    }

    public static EnumC1891Uu[] values() {
        return (EnumC1891Uu[]) A02.clone();
    }
}
