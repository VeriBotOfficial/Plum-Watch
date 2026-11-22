package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Xh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1953Xh {
    public static byte[] A00;
    public static String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{BuiltinOptions.SplitVOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, 31, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, 31, BuiltinOptions.FloorModOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FloorModOptions, 31, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.UniqueOptions, 31, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.CosOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.SquareOptions, 15, 20, 14, 22, 4, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DensifyOptions};
    }

    static {
        A02();
        A02 = C1953Xh.class.getSimpleName();
    }

    public static Map<String, String> A01(@Nullable C2228dL c2228dL) {
        Window window;
        HashMap hashMap = new HashMap();
        if (c2228dL == null) {
            return hashMap;
        }
        try {
            hashMap.put(A00(40, 3, 0), String.valueOf(A04(c2228dL)));
            Activity A0E = c2228dL.A0E();
            if (A0E != null && (window = A0E.getWindow()) != null) {
                int i = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                hashMap.put(A00(58, 2, 39), Integer.toString(flags));
                int type = 4194304 & i;
                String A002 = A00(1, 1, 118);
                String flagDismissKeyguardEnabled = A00(0, 1, 79);
                hashMap.put(A00(48, 5, 39), type > 0 ? A002 : flagDismissKeyguardEnabled);
                int type2 = 524288 & i;
                if (A01[6].length() == 6) {
                    throw new RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (type2 <= 0) {
                    A002 = flagDismissKeyguardEnabled;
                }
                hashMap.put(A00(53, 5, 50), A002);
            }
        } catch (Exception e) {
            Log.e(A02, A00(2, 30, 15), e);
            InterfaceC1840Su A08 = c2228dL.A08();
            int type3 = AbstractC1841Sv.A2T;
            A08.AAy(A00(43, 5, 77), type3, new C1842Sw(e));
        }
        return hashMap;
    }

    public static boolean A03(C2228dL c2228dL) {
        return !XQ.A04(A01(c2228dL));
    }

    public static boolean A04(C2228dL c2228dL) {
        KeyguardManager keyguardManager = (KeyguardManager) c2228dL.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
