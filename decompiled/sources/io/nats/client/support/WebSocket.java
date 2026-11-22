package io.nats.client.support;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes6.dex */
public class WebSocket extends Socket {
    private static final int MAX_HTTP_HEADERS = 100;
    private static final int MAX_LINE_LEN = 8192;
    private static final String WEBSOCKET_RESPONSE_LINE = "HTTP/1.1 101 Switching Protocols";
    private WebsocketInputStream in;
    private WebsocketOutputStream out;
    private Socket wrap;

    public WebSocket(Socket socket, String str, List<Consumer<HttpRequest>> list) throws IOException {
        this.wrap = socket;
        handshake(socket, str, list);
        this.in = new WebsocketInputStream(socket.getInputStream());
        this.out = new WebsocketOutputStream(socket.getOutputStream(), true);
    }

    private static void handshake(Socket socket, String str, List<Consumer<HttpRequest>> list) throws IOException {
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        HttpRequest httpRequest = new HttpRequest();
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.getEncoder().encodeToString(bArr);
        httpRequest.getHeaders().add("Host", str).add(HttpHeaders.UPGRADE, "websocket").add(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE).add(HttpHeaders.SEC_WEBSOCKET_KEY, encodeToString).add(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, "nats").add(HttpHeaders.SEC_WEBSOCKET_VERSION, "13");
        Iterator<Consumer<HttpRequest>> it = list.iterator();
        while (it.hasNext()) {
            it.next().accept(httpRequest);
        }
        outputStream.write(httpRequest.toString().getBytes(StandardCharsets.UTF_8));
        byte[] bArr2 = new byte[8192];
        String readLine = readLine(bArr2, inputStream);
        if (readLine == null) {
            throw new IllegalStateException("Expected HTTP response line not to exceed 8192");
        }
        if (!readLine.toLowerCase().startsWith(WEBSOCKET_RESPONSE_LINE.toLowerCase())) {
            throw new IllegalStateException("Expected HTTP/1.1 101 Switching Protocols, but got " + readLine);
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String readLine2 = readLine(bArr2, inputStream);
            if (readLine2 == null) {
                throw new IllegalStateException("Expected HTTP header to not exceed 8192");
            }
            if (!"".equals(readLine2)) {
                int indexOf = readLine2.indexOf(58);
                if (indexOf >= 0) {
                    if (hashMap.size() >= 100) {
                        throw new IllegalStateException("Exceeded max HTTP headers=100");
                    }
                    hashMap.put(readLine2.substring(0, indexOf).trim().toLowerCase(), readLine2.substring(indexOf + 1).trim());
                } else {
                    throw new IllegalStateException("Expected HTTP header to contain ':', but got " + readLine2);
                }
            } else {
                if ("websocket".equalsIgnoreCase((String) hashMap.get("upgrade"))) {
                    if (!"upgrade".equalsIgnoreCase((String) hashMap.get("connection"))) {
                        throw new IllegalStateException("Expected HTTP `Connection: Upgrade` header");
                    }
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                        messageDigest.update(encodeToString.getBytes(StandardCharsets.UTF_8));
                        messageDigest.update("258EAFA5-E914-47DA-95CA-C5AB0DC85B11".getBytes(StandardCharsets.UTF_8));
                        String encodeToString2 = Base64.getEncoder().encodeToString(messageDigest.digest());
                        String str2 = (String) hashMap.get("sec-websocket-accept");
                        if (!encodeToString2.equals(str2)) {
                            throw new IllegalStateException("Expected HTTP `Sec-WebSocket-Accept: " + encodeToString2 + ", but got " + str2);
                        }
                        return;
                    } catch (NoSuchAlgorithmException e) {
                        throw new IllegalStateException(e);
                    }
                }
                throw new IllegalStateException("Expected HTTP `Upgrade: websocket` header");
            }
        }
    }

    private static String readLine(byte[] bArr, InputStream inputStream) throws IOException {
        int i = 0;
        int i2 = -1;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                return new String(bArr, 0, i, StandardCharsets.ISO_8859_1);
            }
            if (read == 10) {
                if (13 == i2) {
                    i--;
                }
                return new String(bArr, 0, i, StandardCharsets.ISO_8859_1);
            }
            if (i >= bArr.length) {
                return null;
            }
            bArr[i] = (byte) read;
            i++;
            i2 = read;
        }
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
        return this.in;
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        return this.out;
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        throw new UnsupportedOperationException();
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return this.wrap.getInetAddress();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.wrap.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getPort() {
        return this.wrap.getPort();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.wrap.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return this.wrap.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.wrap.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) throws SocketException {
        this.wrap.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() throws SocketException {
        return this.wrap.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) throws SocketException {
        this.wrap.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public int getSoLinger() throws SocketException {
        return this.wrap.getSoLinger();
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) throws IOException {
        this.wrap.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z) throws SocketException {
        this.wrap.setOOBInline(z);
    }

    @Override // java.net.Socket
    public boolean getOOBInline() throws SocketException {
        return this.wrap.getOOBInline();
    }

    @Override // java.net.Socket
    public void setSoTimeout(int i) throws SocketException {
        this.wrap.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public int getSoTimeout() throws SocketException {
        return this.wrap.getSoTimeout();
    }

    @Override // java.net.Socket
    public void setSendBufferSize(int i) throws SocketException {
        this.wrap.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public int getSendBufferSize() throws SocketException {
        return this.wrap.getSendBufferSize();
    }

    @Override // java.net.Socket
    public void setReceiveBufferSize(int i) throws SocketException {
        this.wrap.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public int getReceiveBufferSize() throws SocketException {
        return this.wrap.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) throws SocketException {
        this.wrap.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() throws SocketException {
        return this.wrap.getKeepAlive();
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) throws SocketException {
        this.wrap.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public int getTrafficClass() throws SocketException {
        return this.wrap.getTrafficClass();
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) throws SocketException {
        this.wrap.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() throws SocketException {
        return this.wrap.getReuseAddress();
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.wrap.close();
    }

    @Override // java.net.Socket
    public void shutdownInput() throws IOException {
        this.wrap.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() throws IOException {
        this.wrap.shutdownOutput();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.wrap.isConnected();
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.wrap.isBound();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.wrap.isClosed();
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.wrap.isInputShutdown();
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.wrap.isOutputShutdown();
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i, int i2, int i3) {
        this.wrap.setPerformancePreferences(i, i2, i3);
    }
}
