package com.baidu.bbalbscesium.k.b;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
final class a {
    a() {
    }

    static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int r6) {
        if (r6 < 0 || byteBuffer2.remaining() < r6 || byteBuffer3.remaining() < r6 || byteBuffer.remaining() < r6) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int r0 = 0; r0 < r6; r0++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }
}
