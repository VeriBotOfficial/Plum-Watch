package com.otaliastudios.cameraview.video.encoding;

import com.otaliastudios.cameraview.internal.Pool;
import java.nio.ByteBuffer;

/* loaded from: classes17.dex */
class ByteBufferPool extends Pool<ByteBuffer> {
    ByteBufferPool(final int i, int i2) {
        super(i2, new Pool.Factory<ByteBuffer>() { // from class: com.otaliastudios.cameraview.video.encoding.ByteBufferPool.1
            @Override // com.otaliastudios.cameraview.internal.Pool.Factory
            public ByteBuffer create() {
                return ByteBuffer.allocateDirect(i);
            }
        });
    }
}
