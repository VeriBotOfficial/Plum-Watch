package org.apache.commons.net.bsd;

import java.io.IOException;
import java.io.InputStream;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.net.io.SocketInputStream;

/* loaded from: classes8.dex */
public class RCommandClient extends RExecClient {
    public static final int DEFAULT_PORT = 514;
    public static final int MAX_CLIENT_PORT = 1023;
    public static final int MIN_CLIENT_PORT = 512;

    public RCommandClient() {
        setDefaultPort(514);
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(InetAddress inetAddress, int i) throws SocketException, IOException {
        connect(inetAddress, i, InetAddress.getLocalHost());
    }

    public void connect(InetAddress inetAddress, int i, InetAddress inetAddress2) throws SocketException, BindException, IOException {
        int i2 = 1023;
        while (i2 >= 512) {
            try {
                this._socket_ = this._socketFactory_.createSocket(inetAddress, i, inetAddress2, i2);
                break;
            } catch (SocketException unused) {
                i2--;
            }
        }
        if (i2 < 512) {
            throw new BindException("All ports in use or insufficient permssion.");
        }
        _connectAction_();
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws SocketException, IOException, IllegalArgumentException {
        if (i2 < 512 || i2 > 1023) {
            throw new IllegalArgumentException("Invalid port number " + i2);
        }
        super.connect(inetAddress, i, inetAddress2, i2);
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(String str, int i) throws SocketException, IOException, UnknownHostException {
        connect(InetAddress.getByName(str), i, InetAddress.getLocalHost());
    }

    public void connect(String str, int i, InetAddress inetAddress) throws SocketException, IOException {
        connect(InetAddress.getByName(str), i, inetAddress);
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(String str, int i, InetAddress inetAddress, int i2) throws SocketException, IOException, IllegalArgumentException, UnknownHostException {
        if (i2 < 512 || i2 > 1023) {
            throw new IllegalArgumentException("Invalid port number " + i2);
        }
        super.connect(str, i, inetAddress, i2);
    }

    @Override // org.apache.commons.net.bsd.RExecClient
    InputStream createErrorStream() throws IOException {
        ServerSocket createServer = createServer();
        try {
            this._output_.write(Integer.toString(createServer.getLocalPort()).getBytes(StandardCharsets.UTF_8));
            this._output_.write(0);
            this._output_.flush();
            Socket accept = createServer.accept();
            if (createServer != null) {
                createServer.close();
            }
            if (isRemoteVerificationEnabled() && !verifyRemote(accept)) {
                accept.close();
                throw new IOException("Security violation: unexpected connection attempt by " + accept.getInetAddress().getHostAddress());
            }
            return new SocketInputStream(accept, accept.getInputStream());
        } catch (Throwable th) {
            if (createServer != null) {
                try {
                    createServer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private ServerSocket createServer() throws IOException {
        for (int i = 1023; i >= 512; i--) {
            try {
                return this._serverSocketFactory_.createServerSocket(i, 1, getLocalAddress());
            } catch (SocketException unused) {
            }
        }
        throw new BindException("All ports in use.");
    }

    public void rcommand(String str, String str2, String str3) throws IOException {
        rcommand(str, str2, str3, false);
    }

    public void rcommand(String str, String str2, String str3, boolean z) throws IOException {
        rexec(str, str2, str3, z);
    }
}
