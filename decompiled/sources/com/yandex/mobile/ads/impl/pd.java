package com.yandex.mobile.ads.impl;

import android.net.ssl.SSLSockets;
import android.os.Build;
import com.yandex.mobile.ads.impl.rh1;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pd implements l12 {

    public static final class a {
        public static pd a() {
            if (b()) {
                return new pd();
            }
            return null;
        }

        public static boolean b() {
            int i = rh1.c;
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final void a(SSLSocket sslSocket, String str, List<? extends mm1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            int i = rh1.c;
            sSLParameters.setApplicationProtocols((String[]) rh1.a.a(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null || Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final boolean a() {
        return a.b();
    }
}
