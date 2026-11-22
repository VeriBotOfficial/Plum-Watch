package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class C7 implements InterfaceC2323et {
    public static byte[] A01;
    public final boolean A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.LeakyReluOptions, 14, BuiltinOptions.SliceOptions, 28, 29, 7, 22, 29, 7, BuiltinOptions.RangeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NegOptions, 29, 27, 29, 17, 14, 29, BuiltinOptions.MatrixDiagOptions, 13, 10, 20, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixDiagOptions, 30, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableImportOptions};
    }

    public C7(boolean z) {
        this.A00 = z;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String header : map.get(str)) {
                    String str2 = str + A00(1, 1, 74) + header;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2323et
    public final boolean AAQ() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2323et
    public final void ABN(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 21) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 13) + ((String) obj);
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2323et
    public final void ABO(InterfaceC2306ec interfaceC2306ec) {
        if (interfaceC2306ec != null) {
            String str = A00(11, 13, 6) + interfaceC2306ec.getUrl();
            String str2 = A00(24, 8, 51) + interfaceC2306ec.A94();
            A02(interfaceC2306ec.A86());
        }
    }
}
