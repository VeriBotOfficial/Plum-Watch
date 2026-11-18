package com.facebook.react.modules.network;

import io.nats.client.Options;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes11.dex */
public class TLSSocketFactory extends SSLSocketFactory {
    private SSLSocketFactory delegate;

    public TLSSocketFactory() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.delegate = sSLContext.getSocketFactory();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int r4, boolean z) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(socket, str, r4, z));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int r3) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, r3));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int r3, InetAddress inetAddress, int r5) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, r3, inetAddress, r5));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int r3) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, r3));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int r3, InetAddress inetAddress2, int r5) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, r3, inetAddress2, r5));
    }

    private Socket enableTLSOnSocket(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1", "TLSv1.1", Options.DEFAULT_SSL_PROTOCOL});
        }
        return socket;
    }
}
