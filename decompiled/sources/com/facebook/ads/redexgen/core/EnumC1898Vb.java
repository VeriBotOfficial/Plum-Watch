package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1898Vb {
    A0D(A00(Videoio.CAP_PROP_XI_DEFAULT_CC_MATRIX, 25, 36)),
    A0B(A00(Videoio.CAP_PROP_XI_AEAG_ROI_HEIGHT, 25, 122)),
    A0A(A00(414, 28, 93)),
    A0C(A00(Videoio.CAP_PROP_XI_TARGET_TEMP, 28, 4)),
    A09(A00(397, 17, 6)),
    A0H(A00(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, 14, 52)),
    A0G(A00(Videoio.CAP_PROP_XI_HDR_T1, 17, 113)),
    A0F(A00(Videoio.CAP_PROP_XI_TRG_DELAY, 17, 90)),
    A03(A00(307, 7, 54)),
    A07(A00(361, 14, 12)),
    A06(A00(341, 20, 53)),
    A08(A00(375, 22, 65)),
    A05(A00(328, 13, 83)),
    A04(A00(314, 14, 0)),
    A0E(A00(520, 24, 31)),
    A0I(A00(592, 22, 94));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-91, -75, -78, -70, -74, -88, -75, -25, -20, -27, -19, -14, -23, -24, 3, -19, -14, -8, 3, -27, -24, -77, -72, -79, -71, -66, -75, -76, -49, -62, -58, -49, -79, -76, OtaCommandGenerator.CMD_OTA_INFO, -75, -86, -99, -87, -91, -97, -69, -91, -86, -80, -95, -82, ProtocolBytes.SOF, -80, -91, -80, -91, -99, -88, -94, -73, -84, -97, -85, -89, -95, -67, -84, -97, -78, -89, -76, -93, -89, PSSSigner.TRAILER_IMPLICIT, -79, -92, -80, -84, -90, -62, -75, -88, -70, -92, -75, -89, -88, -89, -62, -71, -84, -89, -88, -78, 3, 18, 9, 9, 28, 16, 0, 15, 2, 2, 11, 28, 19, 6, 1, 2, 12, -64, -59, -53, PSSSigner.TRAILER_IMPLICIT, -55, -54, -53, -64, -53, -64, -72, -61, -42, -59, -72, -53, -64, -51, PSSSigner.TRAILER_IMPLICIT, -42, -70, -72, -55, -58, -52, -54, PSSSigner.TRAILER_IMPLICIT, -61, -12, -7, -1, TransmissionUnpacked.HD_VAL_MAGIC_HB, -3, -2, -1, -12, -1, -12, -20, -9, 10, -7, -20, -1, -12, 1, TransmissionUnpacked.HD_VAL_MAGIC_HB, 10, -12, -8, -20, -14, TransmissionUnpacked.HD_VAL_MAGIC_HB, -35, -30, -24, -39, -26, -25, -24, -35, -24, -35, TransmissionUnpacked.HD_VAL_MAGIC_LB, -32, -13, -30, TransmissionUnpacked.HD_VAL_MAGIC_LB, -24, -35, -22, -39, -13, -28, -32, TransmissionUnpacked.HD_VAL_MAGIC_LB, -19, TransmissionUnpacked.HD_VAL_MAGIC_LB, -42, -32, -39, 31, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.NegOptions, 27, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, 31, BuiltinOptions.NegOptions, 31, 23, 34, BuiltinOptions.EqualOptions, BuiltinOptions.LogSoftmaxOptions, 23, BuiltinOptions.NegOptions, 31, BuiltinOptions.GreaterOptions, 27, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterOptions, 31, 26, 27, BuiltinOptions.CastOptions, 7, -6, 2, 4, 9, -6, 20, -10, -8, 9, -2, 11, -2, 9, 14, 20, 1, -10, 10, 3, -8, -3, -6, 7, -9, -22, -4, -26, -9, -23, -22, -23, 4, -24, -26, -9, -12, -6, -8, -22, -15, -50, -63, -45, -67, -50, -64, -63, -64, -37, -52, -56, -67, TransmissionUnpacked.HD_VAL_MAGIC_LB, -67, -66, -56, -63, TransmissionUnpacked.HD_VAL_MAGIC_LB, -56, -38, -60, TransmissionUnpacked.HD_VAL_MAGIC_LB, -57, -56, -57, -30, -39, -52, -57, -56, -46, -72, -85, -90, -89, -79, -63, -82, -89, -93, -90, -85, -80, -87, -63, -78, -82, -93, -69, -93, -92, -82, -89, -17, -1, -4, 4, 0, -14, -1, -70, -65, -72, -64, -59, PSSSigner.TRAILER_IMPLICIT, -69, -74, -64, -59, -53, -74, -72, -69, 13, 18, 11, 19, 24, 15, 14, 9, 28, 32, 9, 11, 14, TransmissionUnpacked.HD_VAL_MAGIC_HB, 5, -6, -19, -7, -11, -17, -21, -11, -6, 0, -15, -2, -1, 0, -11, 0, -11, -19, -8, -57, -36, -47, -60, -48, -52, -58, -62, -47, -60, -41, -52, -39, -56, -4, 17, 6, -7, 5, 1, -5, -9, 10, -3, 15, -7, 10, -4, -3, -4, -9, 14, 1, -4, -3, 7, -61, -46, -55, -55, PSSSigner.TRAILER_IMPLICIT, -48, -64, -49, -62, -62, -53, PSSSigner.TRAILER_IMPLICIT, -45, -58, -63, -62, -52, 29, 34, BuiltinOptions.ArgMaxOptions, 25, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, 29, BuiltinOptions.ArgMaxOptions, 29, 21, 32, 19, 34, 21, BuiltinOptions.ArgMaxOptions, 29, BuiltinOptions.NegOptions, 25, 19, 23, 21, BuiltinOptions.DequantizeOptions, 35, BuiltinOptions.LessOptions, BuiltinOptions.MaximumMinimumOptions, 25, 32, 58, 63, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 58, BuiltinOptions.BidirectionalSequenceLSTMOptions, 58, BuiltinOptions.SparseToDenseOptions, 61, BuiltinOptions.SliceOptions, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 58, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SliceOptions, 58, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PowOptions, BuiltinOptions.NotEqualOptions, -60, -55, -49, -64, -51, -50, -49, -60, -49, -60, PSSSigner.TRAILER_IMPLICIT, -57, -70, -55, PSSSigner.TRAILER_IMPLICIT, -49, -60, -47, -64, -70, -53, -57, PSSSigner.TRAILER_IMPLICIT, -44, PSSSigner.TRAILER_IMPLICIT, -67, -57, -64, -28, -23, -17, -32, -19, -18, -17, -28, -17, -28, -36, -25, -38, -23, -36, -17, -28, -15, -32, -38, -15, -28, -33, -32, -22, -24, -37, -29, -27, -22, -37, TransmissionUnpacked.HD_VAL_MAGIC_LB, -41, -39, -22, -33, -20, -33, -22, -17, TransmissionUnpacked.HD_VAL_MAGIC_LB, -30, -41, -21, -28, -39, -34, -37, -24, 35, 22, BuiltinOptions.ArgMaxOptions, 18, 35, 21, 22, 21, 16, 20, 18, 35, 32, BuiltinOptions.DequantizeOptions, BuiltinOptions.LogSoftmaxOptions, 22, 29, 58, BuiltinOptions.GreaterEqualOptions, 63, BuiltinOptions.LessOptions, 58, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PowOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GreaterEqualOptions, -3, TransmissionUnpacked.HD_VAL_MAGIC_HB, 2, -20, -3, -17, TransmissionUnpacked.HD_VAL_MAGIC_HB, -17, -22, 1, -12, -17, TransmissionUnpacked.HD_VAL_MAGIC_HB, -6, BuiltinOptions.PadV2Options, 30, 25, 26, BuiltinOptions.LogSoftmaxOptions, 20, BuiltinOptions.ExpOptions, 26, 22, 25, 30, 35, 28, 20, BuiltinOptions.CastOptions, BuiltinOptions.ExpOptions, 22, BuiltinOptions.LessEqualOptions, 22, 23, BuiltinOptions.ExpOptions, 26};
    }

    static {
        A01();
    }

    EnumC1898Vb(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }
}
