package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sr {

    /* renamed from: a, reason: collision with root package name */
    private final List<rr> f16887a;
    private int b;
    private boolean c;
    private boolean d;

    public sr(List<rr> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f16887a = connectionSpecs;
    }

    public final rr a(SSLSocket sslSocket) throws IOException {
        boolean z;
        rr rrVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.b;
        int size = this.f16887a.size();
        while (true) {
            z = true;
            if (i >= size) {
                rrVar = null;
                break;
            }
            rrVar = this.f16887a.get(i);
            if (rrVar.a(sslSocket)) {
                this.b = i + 1;
                break;
            }
            i++;
        }
        if (rrVar == null) {
            boolean z2 = this.d;
            List<rr> list = this.f16887a;
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + z2 + ", modes=" + list + ", supported protocols=" + arrays);
        }
        int i2 = this.b;
        int size2 = this.f16887a.size();
        while (true) {
            if (i2 >= size2) {
                z = false;
                break;
            }
            if (this.f16887a.get(i2).a(sslSocket)) {
                break;
            }
            i2++;
        }
        this.c = z;
        rrVar.a(sslSocket, this.d);
        return rrVar;
    }

    public final boolean a(IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.d = true;
        if (!this.c || (e instanceof ProtocolException) || (e instanceof InterruptedIOException)) {
            return false;
        }
        return (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? false : true;
    }
}
