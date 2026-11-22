package org.apache.commons.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

/* loaded from: classes8.dex */
public abstract class SocketClient {
    private static final int DEFAULT_CONNECT_TIMEOUT = 60000;
    public static final String NETASCII_EOL = "\r\n";
    private ProtocolCommandSupport commandSupport;
    private Proxy connProxy;
    protected InetSocketAddress remoteInetSocketAddress;
    private static final SocketFactory DEFAULT_SOCKET_FACTORY = SocketFactory.getDefault();
    private static final ServerSocketFactory DEFAULT_SERVER_SOCKET_FACTORY = ServerSocketFactory.getDefault();
    protected int connectTimeout = 60000;
    private int receiveBufferSize = -1;
    private int sendBufferSize = -1;
    private Charset charset = Charset.defaultCharset();
    protected Socket _socket_ = null;
    protected String _hostname_ = null;
    protected InputStream _input_ = null;
    protected OutputStream _output_ = null;
    protected int _timeout_ = 0;
    protected int _defaultPort_ = 0;
    protected SocketFactory _socketFactory_ = DEFAULT_SOCKET_FACTORY;
    protected ServerSocketFactory _serverSocketFactory_ = DEFAULT_SERVER_SOCKET_FACTORY;

    private void _connect(InetSocketAddress inetSocketAddress, InetAddress inetAddress, int i) throws IOException {
        this.remoteInetSocketAddress = inetSocketAddress;
        Socket createSocket = this._socketFactory_.createSocket();
        this._socket_ = createSocket;
        int i2 = this.receiveBufferSize;
        if (i2 != -1) {
            createSocket.setReceiveBufferSize(i2);
        }
        int i3 = this.sendBufferSize;
        if (i3 != -1) {
            this._socket_.setSendBufferSize(i3);
        }
        if (inetAddress != null) {
            this._socket_.bind(new InetSocketAddress(inetAddress, i));
        }
        this._socket_.connect(inetSocketAddress, this.connectTimeout);
        _connectAction_();
    }

    protected void _connectAction_() throws IOException {
        applySocketAttributes();
        this._input_ = this._socket_.getInputStream();
        this._output_ = this._socket_.getOutputStream();
    }

    public void addProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        getCommandSupport().addProtocolCommandListener(protocolCommandListener);
    }

    protected void applySocketAttributes() throws SocketException {
        this._socket_.setSoTimeout(this._timeout_);
    }

    protected OutputStream checkOpenOutputStream() {
        return (OutputStream) Objects.requireNonNull(this._output_, "OutputStream");
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public void connect(InetAddress inetAddress) throws SocketException, IOException {
        this._hostname_ = null;
        connect(inetAddress, this._defaultPort_);
    }

    public void connect(InetAddress inetAddress, int i) throws SocketException, IOException {
        this._hostname_ = null;
        _connect(new InetSocketAddress(inetAddress, i), null, -1);
    }

    public void connect(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws SocketException, IOException {
        this._hostname_ = null;
        _connect(new InetSocketAddress(inetAddress, i), inetAddress2, i2);
    }

    public void connect(String str) throws SocketException, IOException {
        connect(str, this._defaultPort_);
    }

    public void connect(String str, int i) throws SocketException, IOException {
        connect(str, i, (InetAddress) null, -1);
    }

    public void connect(String str, int i, InetAddress inetAddress, int i2) throws SocketException, IOException {
        this._hostname_ = str;
        _connect(new InetSocketAddress(str, i), inetAddress, i2);
    }

    protected void createCommandSupport() {
        this.commandSupport = new ProtocolCommandSupport(this);
    }

    public void disconnect() throws IOException {
        closeQuietly(this._socket_);
        closeQuietly(this._input_);
        closeQuietly(this._output_);
        this._socket_ = null;
        this._hostname_ = null;
        this._input_ = null;
        this._output_ = null;
    }

    protected void fireCommandSent(String str, String str2) {
        if (getCommandSupport().getListenerCount() > 0) {
            getCommandSupport().fireCommandSent(str, str2);
        }
    }

    protected void fireReplyReceived(int i, String str) {
        if (getCommandSupport().getListenerCount() > 0) {
            getCommandSupport().fireReplyReceived(i, str);
        }
    }

    public Charset getCharset() {
        return this.charset;
    }

    @Deprecated
    public String getCharsetName() {
        return this.charset.name();
    }

    protected ProtocolCommandSupport getCommandSupport() {
        return this.commandSupport;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public int getDefaultPort() {
        return this._defaultPort_;
    }

    public int getDefaultTimeout() {
        return this._timeout_;
    }

    public boolean getKeepAlive() throws SocketException {
        return this._socket_.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this._socket_.getLocalAddress();
    }

    public int getLocalPort() {
        return this._socket_.getLocalPort();
    }

    public Proxy getProxy() {
        return this.connProxy;
    }

    protected int getReceiveBufferSize() {
        return this.receiveBufferSize;
    }

    public InetAddress getRemoteAddress() {
        return this._socket_.getInetAddress();
    }

    protected InetSocketAddress getRemoteInetSocketAddress() {
        return this.remoteInetSocketAddress;
    }

    public int getRemotePort() {
        return this._socket_.getPort();
    }

    protected int getSendBufferSize() {
        return this.sendBufferSize;
    }

    public ServerSocketFactory getServerSocketFactory() {
        return this._serverSocketFactory_;
    }

    public int getSoLinger() throws SocketException {
        return this._socket_.getSoLinger();
    }

    public int getSoTimeout() throws SocketException {
        return this._socket_.getSoTimeout();
    }

    public boolean getTcpNoDelay() throws SocketException {
        return this._socket_.getTcpNoDelay();
    }

    public boolean isAvailable() {
        if (isConnected()) {
            try {
                if (this._socket_.getInetAddress() == null || this._socket_.getPort() == 0 || this._socket_.getRemoteSocketAddress() == null || this._socket_.isClosed() || this._socket_.isInputShutdown() || this._socket_.isOutputShutdown()) {
                    return false;
                }
                this._socket_.getInputStream();
                this._socket_.getOutputStream();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public boolean isConnected() {
        Socket socket = this._socket_;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    public void removeProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        getCommandSupport().removeProtocolCommandListener(protocolCommandListener);
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public void setConnectTimeout(int i) {
        this.connectTimeout = i;
    }

    public void setDefaultPort(int i) {
        this._defaultPort_ = i;
    }

    public void setDefaultTimeout(int i) {
        this._timeout_ = i;
    }

    public void setKeepAlive(boolean z) throws SocketException {
        this._socket_.setKeepAlive(z);
    }

    public void setProxy(Proxy proxy) {
        setSocketFactory(new DefaultSocketFactory(proxy));
        this.connProxy = proxy;
    }

    public void setReceiveBufferSize(int i) throws SocketException {
        this.receiveBufferSize = i;
    }

    public void setSendBufferSize(int i) throws SocketException {
        this.sendBufferSize = i;
    }

    public void setServerSocketFactory(ServerSocketFactory serverSocketFactory) {
        if (serverSocketFactory == null) {
            this._serverSocketFactory_ = DEFAULT_SERVER_SOCKET_FACTORY;
        } else {
            this._serverSocketFactory_ = serverSocketFactory;
        }
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        if (socketFactory == null) {
            this._socketFactory_ = DEFAULT_SOCKET_FACTORY;
        } else {
            this._socketFactory_ = socketFactory;
        }
    }

    public void setSoLinger(boolean z, int i) throws SocketException {
        this._socket_.setSoLinger(z, i);
    }

    public void setSoTimeout(int i) throws SocketException {
        this._socket_.setSoTimeout(i);
    }

    public void setTcpNoDelay(boolean z) throws SocketException {
        this._socket_.setTcpNoDelay(z);
    }

    public boolean verifyRemote(Socket socket) {
        return socket.getInetAddress().equals(getRemoteAddress());
    }
}
