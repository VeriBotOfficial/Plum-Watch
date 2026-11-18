package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class VF {
    public static byte[] A00;
    public static final DateFormat A01;
    public static final AtomicBoolean A02;

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{BuiltinOptions.ReadVariableOptions, -66, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ReadVariableOptions, -66, BuiltinOptions.ScatterNdOptions, ProtocolBytes.SOF, BuiltinOptions.BroadcastToOptions, BuiltinOptions.IfOptions, -105, BuiltinOptions.ScatterNdOptions, ProtocolBytes.SOF, -103, BuiltinOptions.IfOptions, BuiltinOptions.ScatterNdOptions, ProtocolBytes.SOF, -41, -38, -28, -19, -11, -38, -37, -40, -21, -35, -11, -30, -27, -35, -35, -37, -24, -98, -98, OtaCommandGenerator.CMD_NOTIFY_STATUS, -61, -61, OtaCommandGenerator.CMD_NOTIFY_STATUS, -55, -55, -124, -87, -87, -87};
    }

    static {
        A03();
        A01 = new SimpleDateFormat(A01(34, 12, 49), Locale.US);
        A02 = new AtomicBoolean();
    }

    public static String A00() {
        return A01.format(Calendar.getInstance().getTime());
    }

    public static void A02() {
        A02.set(true);
    }

    public static void A04(String str, String str2) {
        if (!A02.get()) {
            return;
        }
        Log.i(A01(17, 17, 113), String.format(Locale.US, A01(0, 6, 38), A00(), str2));
    }

    public static void A05(String str, String str2, String str3) {
        if (!A02.get()) {
            return;
        }
        Log.i(A01(17, 17, 113), String.format(Locale.US, A01(6, 11, 23), A00(), str3, str2));
    }
}
