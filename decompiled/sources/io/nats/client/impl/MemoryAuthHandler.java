package io.nats.client.impl;

import io.nats.client.AuthHandler;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public class MemoryAuthHandler implements AuthHandler {
    private final StringAuthHandler sah;

    public MemoryAuthHandler(byte[] bArr) {
        CharBuffer decode = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(bArr));
        this.sah = new StringAuthHandler(extract(decode, 1), extract(decode, 2));
    }

    private char[] extract(CharBuffer charBuffer, int i) {
        CharBuffer allocate = CharBuffer.allocate(charBuffer.length());
        boolean z = false;
        int i2 = 0;
        loop0: while (true) {
            int i3 = -1;
            while (charBuffer.length() > 0) {
                char c = charBuffer.get();
                i3++;
                if (c == '\n' || c == '\r') {
                    if (allocate.position() > 0) {
                        break;
                    }
                    z = false;
                } else if (!z && !Character.isWhitespace(c)) {
                    if (c == '-' && i3 == 0) {
                        i2++;
                        z = true;
                    } else if (i2 == i) {
                        allocate.put(c);
                    }
                }
            }
            break loop0;
        }
        if (allocate.position() == 0 && i == 1) {
            charBuffer.position(0);
            while (charBuffer.length() > 0) {
                char c2 = charBuffer.get();
                if (c2 == '\n' || c2 == '\r' || Character.isWhitespace(c2)) {
                    if (allocate.position() > 0) {
                        break;
                    }
                } else {
                    allocate.put(c2);
                }
            }
            allocate.flip();
        } else {
            allocate.flip();
        }
        char[] cArr = new char[allocate.length()];
        allocate.get(cArr);
        allocate.clear();
        for (int i4 = 0; i4 < allocate.capacity(); i4++) {
            allocate.put((char) 0);
        }
        return cArr;
    }

    @Override // io.nats.client.AuthHandler
    public byte[] sign(byte[] bArr) {
        return this.sah.sign(bArr);
    }

    @Override // io.nats.client.AuthHandler
    public char[] getID() {
        return this.sah.getID();
    }

    @Override // io.nats.client.AuthHandler
    public char[] getJWT() {
        return this.sah.getJWT();
    }
}
