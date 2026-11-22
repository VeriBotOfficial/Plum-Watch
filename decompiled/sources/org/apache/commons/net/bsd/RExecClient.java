package org.apache.commons.net.bsd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.SocketInputStream;

/* loaded from: classes8.dex */
public class RExecClient extends SocketClient {
    public static final int DEFAULT_PORT = 512;
    protected static final char NULL_CHAR = 0;
    protected InputStream _errorStream_ = null;
    private boolean remoteVerificationEnabled;

    public RExecClient() {
        setDefaultPort(512);
    }

    InputStream createErrorStream() throws IOException {
        ServerSocket createServerSocket = this._serverSocketFactory_.createServerSocket(0, 1, getLocalAddress());
        try {
            this._output_.write(Integer.toString(createServerSocket.getLocalPort()).getBytes(StandardCharsets.UTF_8));
            this._output_.write(0);
            this._output_.flush();
            Socket accept = createServerSocket.accept();
            if (createServerSocket != null) {
                createServerSocket.close();
            }
            if (this.remoteVerificationEnabled && !verifyRemote(accept)) {
                accept.close();
                throw new IOException("Security violation: unexpected connection attempt by " + accept.getInetAddress().getHostAddress());
            }
            return new SocketInputStream(accept, accept.getInputStream());
        } catch (Throwable th) {
            if (createServerSocket != null) {
                try {
                    createServerSocket.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() throws IOException {
        InputStream inputStream = this._errorStream_;
        if (inputStream != null) {
            inputStream.close();
        }
        this._errorStream_ = null;
        super.disconnect();
    }

    public InputStream getErrorStream() {
        return this._errorStream_;
    }

    public InputStream getInputStream() {
        return this._input_;
    }

    public OutputStream getOutputStream() {
        return this._output_;
    }

    public final boolean isRemoteVerificationEnabled() {
        return this.remoteVerificationEnabled;
    }

    public void rexec(String str, String str2, String str3) throws IOException {
        rexec(str, str2, str3, false);
    }

    public void rexec(String str, String str2, String str3, boolean z) throws IOException {
        if (z) {
            this._errorStream_ = createErrorStream();
        } else {
            this._output_.write(0);
        }
        this._output_.write(str.getBytes(getCharset()));
        this._output_.write(0);
        this._output_.write(str2.getBytes(getCharset()));
        this._output_.write(0);
        this._output_.write(str3.getBytes(getCharset()));
        this._output_.write(0);
        this._output_.flush();
        int read = this._input_.read();
        if (read <= 0) {
            if (read < 0) {
                throw new IOException("Server closed connection.");
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read2 = this._input_.read();
            if (read2 == -1 || read2 == 10) {
                break;
            } else {
                sb.append((char) read2);
            }
        }
        throw new IOException(sb.toString());
    }

    public final void setRemoteVerificationEnabled(boolean z) {
        this.remoteVerificationEnabled = z;
    }
}
