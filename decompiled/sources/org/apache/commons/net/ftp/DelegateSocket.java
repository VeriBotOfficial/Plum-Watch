package org.apache.commons.net.ftp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.Objects;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* loaded from: classes8.dex */
abstract class DelegateSocket extends Socket {
    protected final Socket delegate;

    DelegateSocket(Socket socket) {
        this.delegate = (Socket) Objects.requireNonNull(socket, "delegate");
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) throws IOException {
        this.delegate.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.delegate.close();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) throws IOException {
        this.delegate.connect(socketAddress);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) throws IOException {
        this.delegate.connect(socketAddress, i);
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return this.delegate.getChannel();
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return this.delegate.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
        return new InflaterInputStream(this.delegate.getInputStream());
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() throws SocketException {
        return this.delegate.getKeepAlive();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.delegate.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.delegate.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.delegate.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() throws SocketException {
        return this.delegate.getOOBInline();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        return new DeflaterOutputStream(this.delegate.getOutputStream());
    }

    @Override // java.net.Socket
    public int getPort() {
        return this.delegate.getPort();
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() throws SocketException {
        return this.delegate.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return this.delegate.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() throws SocketException {
        return this.delegate.getReuseAddress();
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() throws SocketException {
        return this.delegate.getSendBufferSize();
    }

    @Override // java.net.Socket
    public int getSoLinger() throws SocketException {
        return this.delegate.getSoLinger();
    }

    @Override // java.net.Socket
    public synchronized int getSoTimeout() throws SocketException {
        return this.delegate.getSoTimeout();
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() throws SocketException {
        return this.delegate.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public int getTrafficClass() throws SocketException {
        return this.delegate.getTrafficClass();
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.delegate.isBound();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.delegate.isClosed();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.delegate.isConnected();
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.delegate.isInputShutdown();
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.delegate.isOutputShutdown();
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) throws IOException {
        this.delegate.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) throws SocketException {
        this.delegate.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z) throws SocketException {
        this.delegate.setOOBInline(z);
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i, int i2, int i3) {
        this.delegate.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.delegate.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) throws SocketException {
        this.delegate.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i) throws SocketException {
        this.delegate.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) throws SocketException {
        this.delegate.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public synchronized void setSoTimeout(int i) throws SocketException {
        this.delegate.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) throws SocketException {
        this.delegate.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) throws SocketException {
        this.delegate.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public void shutdownInput() throws IOException {
        this.delegate.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() throws IOException {
        this.delegate.shutdownOutput();
    }

    @Override // java.net.Socket
    public String toString() {
        return this.delegate.toString();
    }
}
