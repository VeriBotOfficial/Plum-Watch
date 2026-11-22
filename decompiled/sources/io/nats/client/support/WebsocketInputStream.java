package io.nats.client.support;

import io.nats.client.support.WebsocketFrameHeader;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class WebsocketInputStream extends InputStream {
    private InputStream in;
    private byte[] buffer = new byte[WebsocketFrameHeader.MAX_FRAME_HEADER_SIZE];
    private WebsocketFrameHeader header = new WebsocketFrameHeader();
    private byte[] oneByte = new byte[1];

    @Override // java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public WebsocketInputStream(InputStream inputStream) {
        this.in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        while (0 == this.header.getPayloadLength()) {
            if (!readHeader()) {
                return -1;
            }
        }
        if (this.header.getOpCode() == WebsocketFrameHeader.OpCode.CLOSE) {
            this.in.skip(this.header.getPayloadLength());
            return -1;
        }
        long payloadLength = this.header.getPayloadLength();
        int read = this.in.read(bArr, i, Math.min(i2, payloadLength > 2147483647L ? Integer.MAX_VALUE : (int) payloadLength));
        return -1 == read ? read : this.header.filterPayload(bArr, i, read);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = read(this.oneByte, 0, 1);
        return -1 == read ? read : this.oneByte[0];
    }

    private boolean readHeader() throws IOException {
        int i = 0;
        while (i < 2) {
            int read = this.in.read(this.buffer, i, 2 - i);
            if (read < 0) {
                return false;
            }
            i += read;
        }
        int size = WebsocketFrameHeader.size(this.buffer, 0);
        if (size > 2) {
            while (i < size) {
                int read2 = this.in.read(this.buffer, i, size - i);
                if (read2 < 0) {
                    return false;
                }
                i += read2;
            }
        }
        this.header.write(this.buffer, 0, size);
        return true;
    }
}
