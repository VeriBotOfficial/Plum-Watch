package com.facebook.ads.redexgen.core;

import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public class XT implements ThreadFactory {
    public static byte[] A03;
    public final AtomicInteger A00 = new AtomicInteger(1);
    public final /* synthetic */ XU A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GeluOptions, -127, BuiltinOptions.HashtableImportOptions, BuiltinOptions.MatrixDiagOptions, -90, BuiltinOptions.GatherNdOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixDiagOptions, -105, OtaCommandGenerator.CMD_GET_INFO, -123, -113, -126, BuiltinOptions.RightShiftOptions, -127, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.BitcastOptions, Byte.MIN_VALUE, -116, OtaCommandGenerator.CMD_GET_INFO_TLV, -117, OtaCommandGenerator.CMD_GET_INFO, -126, -113, BuiltinOptions.BitcastOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -123, -116, -113, OtaCommandGenerator.CMD_GET_INFO, BuiltinOptions.BitcastOptions, OtaCommandGenerator.CMD_GET_INFO, BuiltinOptions.RightShiftOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -120, BuiltinOptions.BitcastOptions, -126, -107, -126, Byte.MIN_VALUE, OtaCommandGenerator.CMD_GET_INFO_TLV, OtaCommandGenerator.CMD_GET_INFO, -116, -113};
    }

    public XT(XU xu, String str) {
        this.A01 = xu;
        this.A02 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        T1.A00(A00(10, 35, 22));
        return new Thread(runnable, String.format(Locale.US, A00(0, 10, 44), this.A02, Integer.valueOf(this.A00.getAndIncrement())));
    }
}
