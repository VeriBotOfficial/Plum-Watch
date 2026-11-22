package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.hispark.crashdump.protocol.ProtocolBytes;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Ud, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1874Ud {
    public static byte[] A00;
    public static final String A01;
    public static final Map<String, Integer> A02;
    public static final AtomicInteger A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-82, OtaCommandGenerator.CMD_OTA_INFO, -50, -27, -9, OtaCommandGenerator.CMD_OTA_INFO, -10, -31, -20, -11, -27, -70, OtaCommandGenerator.CMD_OTA_INFO, OtaCommandGenerator.CMD_GET_INFO, -88, -124, -87, -77, -80, -95, -76, -93, -88, -87, -82, -89, BuiltinOptions.NonMaxSuppressionV5Options, -84, ProtocolBytes.SOF, -93, -95, -84, BuiltinOptions.NonMaxSuppressionV5Options, -93, ProtocolBytes.SOF, -75, -82, -76, -91, -78, -77, BuiltinOptions.ATan2Options, BuiltinOptions.NonMaxSuppressionV5Options, -4, BuiltinOptions.ExpOptions, 22, BuiltinOptions.CastOptions, 24, 32, 24, BuiltinOptions.ExpOptions, BuiltinOptions.MaximumMinimumOptions, 28, BuiltinOptions.ExpOptions, 26, -45, 22, 34, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.MaximumMinimumOptions, 24, BuiltinOptions.CastOptions, -19, -45, -7, 28, 16, 14, 25, TransmissionUnpacked.HD_VAL_MAGIC_HB, 28, 34, 27, BuiltinOptions.ExpOptions, 18, 31, 32, -99, OtaCommandGenerator.CMD_OTA_INFO, OtaCommandGenerator.CMD_OTA_INFO, -91, -80, -91, -85, -86, -99, -88, -101, -91, -86, -94, -85, -35, TransmissionUnpacked.HD_VAL_MAGIC_HB, TransmissionUnpacked.HD_VAL_MAGIC_HB, -31, -23, -20, TransmissionUnpacked.HD_VAL_MAGIC_HB, -84, -86, -66, -80, -79, -67, -88, -82, -63, -84, -82, -71, -67, -78, -72, -73, -17, -5, -7, -70, -14, -19, -17, -15, -18, -5, -5, -9, -70, -19, TransmissionUnpacked.HD_VAL_MAGIC_HB, -1, -70, -40, -37, -49, -51, -40, -21, -49, -37, -31, -38, -32, -47, -34, -33, -87, -90, -71, -90, -95, -78, -95, -86, -80, ProtocolBytes.SOF, 24, 27, 15, 13, 24, 11, 15, 27, BuiltinOptions.ExpOptions, 26, 32, 17, 30, 31, -47, -62, -38, -51, -48, -62, -59, -10, -9, -28, -26, -18, -9, -11, -28, -26, -24, -48, -46, -65, -47, -42, -51, -62, -47, -45, -64, -46, -41, -50, -61, -67, -63, -51, -62, -61};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A06(SQ sq, InterfaceC2307ed interfaceC2307ed, Map<String, ?> map) throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(A01(93, 7, 67), A01(13, 1, 40));
        A0A(sq, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A01(188, 7, 36), A01(157, 14, 115));
        hashMap2.put(A01(195, 12, 37), String.valueOf(3501));
        hashMap2.put(A01(100, 16, 16), A01(14, 1, 62));
        hashMap2.put(A01(178, 10, 74), A01(65, 13, 116));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        if (sq.A05().AAF()) {
            String str = A01(15, 28, 7) + jSONObject.toString(2);
        }
        hashMap2.put(A01(78, 15, 3), jSONObject.toString());
        A0A(sq, hashMap2);
        TP A09 = sq.A09();
        JSONObject A05 = C1843Sx.A05(new C1845Sz(A09.A01(), A09.A02(), hashMap2));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(A05);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(147, 4, 12), new JSONObject(hashMap));
        jSONObject2.put(A01(151, 6, 3), jSONArray);
        C2321er c2321er = new C2321er();
        c2321er.put(A01(DeviceFeatures.AI_AUDIO_SEARCH, 7, 40), jSONObject2.toString());
        interfaceC2307ed.AGE(sq.A05().A7y(), c2321er.A08(), new V7(sq));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0A(SQ sq, Map<String, String> map) {
        map.putAll(sq.A04().A5S());
    }

    static {
        A04();
        A01 = C1874Ud.class.getSimpleName();
        A03 = new AtomicInteger(0);
        A02 = new HashMap();
    }

    public static void A05(SQ sq) {
        if (A0C(sq)) {
            return;
        }
        synchronized (C1874Ud.class) {
            if (A03.get() != 0) {
                return;
            }
            A03.set(1);
            XU.A06.execute(new VD(sq));
        }
    }

    public static void A08(SQ sq, String str) {
        int value;
        int i;
        if (A0C(sq)) {
            return;
        }
        synchronized (C1874Ud.class) {
            if (A03.get() != 2) {
                if (A02.containsKey(str)) {
                    i = A02.get(str).intValue();
                } else {
                    i = 0;
                }
                value = i + 1;
                A02.put(str, Integer.valueOf(value));
            } else {
                SharedPreferences sharedPreferences = sq.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(116, 31, 83), sq), 0);
                value = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, value).apply();
            }
            if (sq.A05().AAF()) {
                String str2 = A01(43, 22, 122) + str + A01(0, 13, 71) + value;
            }
        }
    }

    public static void A09(SQ sq, String str) {
        if (A0C(sq)) {
            return;
        }
        XU.A06.execute(new VC(sq, str));
    }

    public static boolean A0B(double d, int i) {
        return i <= 0 || d >= 1.0d / ((double) i);
    }

    public static boolean A0C(SQ sq) {
        if (sq.A05().AAF()) {
            return false;
        }
        if (!U9.A0U(sq)) {
            return true;
        }
        return A0B(sq.A09().A00(), U9.A0C(sq));
    }
}
