package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.i;
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
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpecSelector.java */
/* loaded from: classes17.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<i> f12172a;
    private int b = 0;
    private boolean c;
    private boolean d;

    public b(List<i> list) {
        this.f12172a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.b; i < this.f12172a.size(); i++) {
            if (this.f12172a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public i a(SSLSocket sSLSocket) throws IOException {
        i iVar;
        int i = this.b;
        int size = this.f12172a.size();
        while (true) {
            if (i >= size) {
                iVar = null;
                break;
            }
            iVar = this.f12172a.get(i);
            if (iVar.a(sSLSocket)) {
                this.b = i + 1;
                break;
            }
            i++;
        }
        if (iVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + this.f12172a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        this.c = b(sSLSocket);
        com.mbridge.msdk.thrid.okhttp.internal.a.f12164a.a(iVar, sSLSocket, this.d);
        return iVar;
    }

    public boolean a(IOException iOException) {
        this.d = true;
        if (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
