package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class CF implements InterfaceC2322es {
    public static byte[] A01;
    public final InterfaceC2323et A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.HashtableFindOptions, -114, -114, OtaCommandGenerator.CMD_NOTIFY_STATUS, -101, -97, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.HashtableSizeOptions, -109, -116, -99, -98, OtaCommandGenerator.CMD_NOTIFY_STATUS, -97, -42, -11, 7, -3, -9, -26, -7, 5, 9, -7, 7, 8, -36, -11, 2, -8, 0, -7, 6, -62, 3, 2, -39, 6, 6, 3, 6, -126, -82, -83, -77, -92, -83, -77, BuiltinOptions.HashtableFindOptions, -109, -72, ProtocolBytes.SOF, -92, -126, -127, BuiltinOptions.BucketizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BatchMatMulOptions};
    }

    public CF(InterfaceC2323et interfaceC2323et) {
        this.A00 = interfaceC2323et;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2322es
    public final boolean ADE(C2320eq c2320eq) {
        InterfaceC2306ec A00 = c2320eq.A00();
        if (this.A00.AAQ()) {
            Log.e(CF.class.getSimpleName(), A00(14, 27, 123), c2320eq);
        }
        if (A00 != null && A00.A94() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2322es
    public final HttpURLConnection AG1(String str, Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2322es
    public final InputStream AG2(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2322es
    public final OutputStream AG3(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2322es
    public final void AGM(HttpURLConnection httpURLConnection, EnumC2318eo enumC2318eo, String str) throws IOException {
        httpURLConnection.setRequestMethod(enumC2318eo.A03());
        httpURLConnection.setDoOutput(enumC2318eo.A05());
        httpURLConnection.setDoInput(enumC2318eo.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 38), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 18), A00(53, 5, 20));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2322es
    public final byte[] AGj(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2322es
    public final void AKN(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
