package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Message;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1701Ni {
    public static byte[] A00;
    public static String[] A01 = {"NpBoDzCQyjOF8OFx9MsnsgXANanqzzj6", "RSaml0mwJ5MGBXbUX4Y7eJ496TcnwqpH", "O6M6", "HC1y", "xJAb", "6P21Vz3Cvscq5f42i51asuNZrA3r2siu", "D2rYJRkohSsxhH", "5Vn2BbDuwzZpkNg8pcGLkugAGTBH17kk"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{61, 32, 32, 32, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.GreaterOptions, Byte.MAX_VALUE, BuiltinOptions.Rfft2dOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GreaterOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Rfft2dOptions, Byte.MAX_VALUE, Byte.MAX_VALUE, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AddNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.FillOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.IfOptions, BuiltinOptions.AddNOptions, BuiltinOptions.AbsOptions, BuiltinOptions.RangeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FloorModOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquareOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RangeOptions, 18, 21, 19, 30, 18, 4, 19, 23, 8, 2, 4, 30, 18, 5, 10, 30, 23, 4, 19, 18, 8, 14, 15, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ZerosLikeOptions, 0, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 0, BuiltinOptions.SplitVOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, 0, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, 64, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, 0, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MirrorPadOptions, 0, BuiltinOptions.VarHandleOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.LeakyReluOptions, 64, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LeakyReluOptions, 31, 19, 17, BuiltinOptions.AddNOptions, 26, 29, 31, 25, 30, 19, 19, 23, BuiltinOptions.AddNOptions, 23, 29, 8, 29, 18, 29};
    }

    static {
        A01();
        A02 = C1701Ni.class.getSimpleName();
    }

    public static void A02(C2202cu c2202cu, Message message) {
        Bundle bundle = message.getData().getBundle(A00(55, 17, 118));
        if (bundle != null) {
            TN.A06(c2202cu, bundle.getString(A00(90, 23, 32)), bundle.getString(A00(72, 18, 123)));
        }
    }

    public static boolean A03(Context context, String str) {
        PackageManager packageManager;
        if (!A00(DeviceFeatures.AI_AUDIO_SEARCH, 19, 29).equals(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            boolean validationPassed = FbValidationUtils.isFbSigningCertificateValid(FbValidationUtils.getSigningCertificate(packageManager.getPackageInfo(str, 64)));
            return validationPassed;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A04(com.facebook.ads.redexgen.core.C2202cu r7, boolean r8, android.content.ServiceConnection r9) {
        /*
            com.facebook.ads.redexgen.X.SV r0 = r7.A05()
            boolean r0 = r0.AAF()
            r4 = 1
            r6 = 0
            if (r0 == 0) goto La1
            if (r8 != 0) goto L2a
            boolean r3 = com.facebook.ads.redexgen.core.U7.A1Y(r7)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1701Ni.A01
            r0 = 1
            r1 = r1[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            r0 = 53
            if (r1 == r0) goto La4
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1701Ni.A01
            java.lang.String r1 = "wVoKdL5DefY3vFtz3wgH19EGFsYG1twM"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto La1
        L2a:
            r0 = 1
        L2b:
            if (r0 != 0) goto L37
            java.lang.String r0 = com.facebook.ads.redexgen.core.UA.A05(r8)
            boolean r0 = A03(r7, r0)
            if (r0 == 0) goto L9f
        L37:
            r0 = 1
        L38:
            if (r0 == 0) goto La3
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            if (r8 != 0) goto L51
            com.facebook.ads.redexgen.X.SV r0 = r7.A05()
            boolean r0 = r0.AAF()
            if (r0 == 0) goto L52
            boolean r0 = com.facebook.ads.redexgen.core.U7.A1Y(r7)
            if (r0 == 0) goto L52
        L51:
            r6 = 1
        L52:
            java.lang.String r3 = com.facebook.ads.redexgen.core.UA.A05(r6)
            r2 = 113(0x71, float:1.58E-43)
            r1 = 58
            r0 = 79
            java.lang.String r1 = A00(r2, r1, r0)
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r3, r1)
            android.content.Intent r0 = r5.setComponent(r0)
            boolean r4 = r7.bindService(r0, r9, r4)
            com.facebook.ads.redexgen.X.SV r0 = r7.A05()
            boolean r0 = r0.AAF()
            if (r0 == 0) goto L9e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 13
            r1 = 42
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r3 = r0.append(r4)
            r2 = 0
            r1 = 13
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            r0.toString()
        L9e:
            return r4
        L9f:
            r0 = 0
            goto L38
        La1:
            r0 = 0
            goto L2b
        La3:
            return r6
        La4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1701Ni.A04(com.facebook.ads.redexgen.X.cu, boolean, android.content.ServiceConnection):boolean");
    }
}
