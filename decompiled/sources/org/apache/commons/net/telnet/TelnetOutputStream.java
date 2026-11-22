package org.apache.commons.net.telnet;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes8.dex */
final class TelnetOutputStream extends OutputStream {
    private final TelnetClient client;
    private final boolean convertCRtoCRLF = true;
    private boolean lastWasCR;

    TelnetOutputStream(TelnetClient telnetClient) {
        this.client = telnetClient;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.client.closeOutputStream();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.client.flushOutputStream();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this.client) {
            while (true) {
                int i3 = i2 - 1;
                if (i2 > 0) {
                    int i4 = i + 1;
                    write(bArr[i]);
                    i = i4;
                    i2 = i3;
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        synchronized (this.client) {
            int i2 = i & 255;
            if (this.client.requestedWont(0)) {
                if (this.lastWasCR) {
                    this.client.sendByte(10);
                    if (i2 == 10) {
                        this.lastWasCR = false;
                        return;
                    }
                }
                if (i2 == 10) {
                    if (!this.lastWasCR) {
                        this.client.sendByte(13);
                    }
                    this.client.sendByte(i2);
                    this.lastWasCR = false;
                } else if (i2 == 13) {
                    this.client.sendByte(13);
                    this.lastWasCR = true;
                } else if (i2 == 255) {
                    this.client.sendByte(255);
                    this.client.sendByte(255);
                    this.lastWasCR = false;
                } else {
                    this.client.sendByte(i2);
                    this.lastWasCR = false;
                }
            } else if (i2 == 255) {
                this.client.sendByte(i2);
                this.client.sendByte(255);
            } else {
                this.client.sendByte(i2);
            }
        }
    }
}
