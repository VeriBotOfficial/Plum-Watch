package org.apache.commons.net.imap;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.commons.net.io.CRLFLineReader;
import org.apache.commons.net.util.SSLContextUtils;
import org.apache.commons.net.util.SSLSocketUtils;

/* loaded from: classes8.dex */
public class IMAPSClient extends IMAPClient {
    public static final int DEFAULT_IMAPS_PORT = 993;
    public static final String DEFAULT_PROTOCOL = "TLS";
    private SSLContext context;
    private HostnameVerifier hostnameVerifier;
    private final boolean isImplicit;
    private KeyManager keyManager;
    private final String protocol;
    private String[] protocols;
    private String[] suites;
    private boolean tlsEndpointChecking;
    private TrustManager trustManager;

    public IMAPSClient() {
        this("TLS", false);
    }

    public IMAPSClient(boolean z) {
        this("TLS", z);
    }

    public IMAPSClient(boolean z, SSLContext sSLContext) {
        this("TLS", z, sSLContext);
    }

    public IMAPSClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public IMAPSClient(String str) {
        this(str, false);
    }

    public IMAPSClient(String str, boolean z) {
        this(str, z, null);
    }

    public IMAPSClient(String str, boolean z, SSLContext sSLContext) {
        setDefaultPort(DEFAULT_IMAPS_PORT);
        this.protocol = str;
        this.isImplicit = z;
        this.context = sSLContext;
    }

    @Override // org.apache.commons.net.imap.IMAP, org.apache.commons.net.SocketClient
    protected void _connectAction_() throws IOException {
        if (this.isImplicit) {
            performSSLNegotiation();
        }
        super._connectAction_();
    }

    public boolean execTLS() throws SSLException, IOException {
        if (sendCommand(IMAPCommand.getCommand(IMAPCommand.STARTTLS)) != 0) {
            return false;
        }
        performSSLNegotiation();
        return true;
    }

    public String[] getEnabledCipherSuites() {
        if (this._socket_ instanceof SSLSocket) {
            return ((SSLSocket) this._socket_).getEnabledCipherSuites();
        }
        return null;
    }

    public String[] getEnabledProtocols() {
        if (this._socket_ instanceof SSLSocket) {
            return ((SSLSocket) this._socket_).getEnabledProtocols();
        }
        return null;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    private KeyManager getKeyManager() {
        return this.keyManager;
    }

    public TrustManager getTrustManager() {
        return this.trustManager;
    }

    private void initSSLContext() throws IOException {
        if (this.context == null) {
            this.context = SSLContextUtils.createSSLContext(this.protocol, getKeyManager(), getTrustManager());
        }
    }

    public boolean isEndpointCheckingEnabled() {
        return this.tlsEndpointChecking;
    }

    private void performSSLNegotiation() throws IOException {
        initSSLContext();
        SSLSocketFactory socketFactory = this.context.getSocketFactory();
        String hostAddress = this._hostname_ != null ? this._hostname_ : getRemoteAddress().getHostAddress();
        SSLSocket sSLSocket = (SSLSocket) socketFactory.createSocket(this._socket_, hostAddress, getRemotePort(), true);
        sSLSocket.setEnableSessionCreation(true);
        sSLSocket.setUseClientMode(true);
        if (this.tlsEndpointChecking) {
            SSLSocketUtils.enableEndpointNameVerification(sSLSocket);
        }
        String[] strArr = this.protocols;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.suites;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        sSLSocket.startHandshake();
        this._socket_ = sSLSocket;
        this._input_ = sSLSocket.getInputStream();
        this._output_ = sSLSocket.getOutputStream();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, __DEFAULT_ENCODING));
        this.__writer = new BufferedWriter(new OutputStreamWriter(this._output_, __DEFAULT_ENCODING));
        HostnameVerifier hostnameVerifier = this.hostnameVerifier;
        if (hostnameVerifier != null && !hostnameVerifier.verify(hostAddress, sSLSocket.getSession())) {
            throw new SSLHandshakeException("Hostname doesn't match certificate");
        }
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.suites = (String[]) strArr.clone();
    }

    public void setEnabledProtocols(String[] strArr) {
        this.protocols = (String[]) strArr.clone();
    }

    public void setEndpointCheckingEnabled(boolean z) {
        this.tlsEndpointChecking = z;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setKeyManager(KeyManager keyManager) {
        this.keyManager = keyManager;
    }

    public void setTrustManager(TrustManager trustManager) {
        this.trustManager = trustManager;
    }
}
