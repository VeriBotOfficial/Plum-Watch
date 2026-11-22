package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;
import org.apache.commons.net.telnet.TelnetCommand;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.m6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2738m6 implements InterfaceC1448Dn {
    public static byte[] A00;
    public static String[] A01 = {"RZM4uVKUom5lpktBJEyc25x7FZDN3vpb", "gyiT966obFesLv2pc6lrzZfv63yxEjKJ", "VIDunhCfmmrKAvVQDuOofVowNsnrOYKS", "mSpbf5NAYyyPHT1f9KFsrup9mcKoYOHE", "zbmZ0JzF4Zq1L7424UboTB7UCymQSbun", "dFdj", "MzILoqUyJ5XWrj98JXnqdIxQxE4zJ", "8Kz26tJHiwFUzLhIg6rooXB"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-34, 17, 17, 2, 10, 13, 17, 2, 1, -67, 17, 12, -67, 0, 15, 2, -2, 17, 2, -67, 1, 2, 0, 12, 1, 2, 15, -67, 3, 12, 15, -67, 18, 11, 16, 18, 13, 13, 12, 15, 17, 2, 1, -67, -22, -26, -22, -30, -67, 17, 22, 13, 2, -41, -67, 19, 34, 34, 30, 27, 21, 19, BuiltinOptions.DequantizeOptions, 27, BuiltinOptions.ExpOptions, 32, -31, 21, 23, 19, -33, -24, -30, -22, 29, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.CastOptions, 31, 29, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, -21, 31, BuiltinOptions.ExpOptions, 29, -23, -13, -20, -12, -56, -41, -41, -45, -48, -54, -56, -37, -48, -42, TransmissionUnpacked.HD_VAL_MAGIC_LB, -106, -53, -35, -55, -38, -36, -55, -38, -3, 12, 12, 8, 5, -1, -3, 16, 5, 11, 10, -53, 12, 3, 15, BuiltinOptions.PackOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, 61, BuiltinOptions.PackOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, 9, BuiltinOptions.AbsOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 5, BuiltinOptions.AddNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, -35, -20, -20, -24, -27, -33, -35, TransmissionUnpacked.HD_VAL_MAGIC_HB, -27, -21, -22, -85, -12, -87, -23, -20, -80, -87, -33, -31, -35, -87, -78, -84, -76, 15, 30, 30, 26, 23, 17, 15, 34, 23, 29, 28, -35, BuiltinOptions.DequantizeOptions, -37, 27, 30, -30, -37, BuiltinOptions.LogSoftmaxOptions, 34, 34, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -9, -84, TransmissionUnpacked.HD_VAL_MAGIC_HB, -12, -24, -30, -22, -13, -24, -20, -28, -84, -13, -9, -78, -26, -55, -40, -40, -44, -47, -53, -55, -36, -47, -41, -42, -105, -32, -107, -37, -35, -54, -38, -47, -40, TransmissionUnpacked.HD_VAL_MAGIC_HB, -31, -12, TransmissionUnpacked.HD_VAL_MAGIC_HB, -85, -14, TransmissionUnpacked.HD_VAL_MAGIC_HB, TransmissionUnpacked.HD_VAL_MAGIC_HB, 61, BuiltinOptions.LessEqualOptions, BuiltinOptions.FloorDivOptions, 61, -8, BuiltinOptions.FloorDivOptions, -10, BuiltinOptions.LessEqualOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NegOptions, BuiltinOptions.SquareOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PackOptions, -10, BuiltinOptions.GreaterOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LogicalOrOptions, -45, -60, -41, -45, -114, -41, -116, -46, -46, -64};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1448Dn
    public final InterfaceC2644kN A5C(C2905or c2905or) {
        char c;
        String str = c2905or.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case 1201784583:
                    String mimeType = A00(TelnetCommand.GA, 21, 107);
                    if (str.equals(mimeType)) {
                        c = 0;
                        break;
                    }
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new AnonymousClass95();
            }
        }
        StringBuilder sb = new StringBuilder();
        String mimeType2 = A00(0, 55, 63);
        throw new IllegalArgumentException(sb.append(mimeType2).append(str).toString());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1448Dn
    public final boolean AJc(C2905or c2905or) {
        String str = c2905or.A0W;
        String mimeType = A00(241, 8, 30);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(270, 10, 1);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(127, 20, 124);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(172, 21, 80);
                    if (!mimeType4.equals(str)) {
                        String[] strArr = A01;
                        String str2 = strArr[6];
                        String mimeType5 = strArr[7];
                        if (str2.length() != mimeType5.length()) {
                            A01[4] = "ilKJ2fcQQU31mDfBW0rq4wTAOnRwqntF";
                            String mimeType6 = A00(221, 20, 10);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(193, 28, 33);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(55, 19, 84);
                                    boolean equals = mimeType8.equals(str);
                                    String mimeType9 = A01[5];
                                    if (mimeType9.length() == 4) {
                                        String[] strArr2 = A01;
                                        strArr2[3] = "zagSEBYMwAryKt6uIWB8fghbt3YyxLCs";
                                        strArr2[0] = "njnOkrTqvKyYsDLdiJrWbCfOV0ebYkea";
                                        if (!equals) {
                                            String mimeType10 = A00(147, 25, 30);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(74, 19, 94);
                                                if (!mimeType11.equals(str)) {
                                                    String mimeType12 = A00(93, 19, 9);
                                                    if (!mimeType12.equals(str)) {
                                                        String mimeType13 = A00(112, 15, 62);
                                                        if (!mimeType13.equals(str)) {
                                                            String mimeType14 = A00(TelnetCommand.GA, 21, 107);
                                                            if (!mimeType14.equals(str)) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
        }
        return true;
    }
}
