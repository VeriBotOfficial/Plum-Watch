package io.nats.client.support;

import io.nats.client.support.WebsocketFrameHeader;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Random;
import org.joda.time.DateTimeConstants;

/* loaded from: classes6.dex */
public class WebsocketOutputStream extends OutputStream {
    private boolean masked;
    private OutputStream wrap;
    private byte[] oneByte = new byte[1];
    private byte[] headerBuffer = new byte[DateTimeConstants.MINUTES_PER_DAY];
    private WebsocketFrameHeader header = new WebsocketFrameHeader().withOp(WebsocketFrameHeader.OpCode.BINARY, true).withNoMask();
    private Random random = new SecureRandom();

    public WebsocketOutputStream(OutputStream outputStream, boolean z) {
        this.wrap = outputStream;
        this.masked = z;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        WebsocketFrameHeader withPayloadLength = new WebsocketFrameHeader().withOp(WebsocketFrameHeader.OpCode.CLOSE, true).withNoMask().withPayloadLength(0L);
        byte[] bArr = this.headerBuffer;
        this.wrap.write(this.headerBuffer, 0, withPayloadLength.read(bArr, 0, bArr.length));
        this.wrap.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.wrap.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.header.withPayloadLength(i2);
        if (this.masked) {
            this.header.withMask(this.random.nextInt());
        }
        WebsocketFrameHeader websocketFrameHeader = this.header;
        byte[] bArr2 = this.headerBuffer;
        int read = websocketFrameHeader.read(bArr2, 0, bArr2.length);
        int min = Math.min(i2, this.headerBuffer.length - read);
        System.arraycopy(bArr, i, this.headerBuffer, read, min);
        this.header.filterPayload(this.headerBuffer, read, min);
        this.wrap.write(this.headerBuffer, 0, read + min);
        if (min < i2) {
            int i3 = i + min;
            int i4 = i2 - min;
            this.header.filterPayload(bArr, i3, i4);
            this.wrap.write(bArr, i3, i4);
        }
    }
}
