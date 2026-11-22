package com.otaliastudios.cameraview.video.encoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes17.dex */
class AudioNoise {
    private static final int FRAMES = 1;
    private static final Random RANDOM = new Random();
    private final ByteBuffer mNoiseBuffer;

    AudioNoise(AudioConfig audioConfig) {
        Objects.requireNonNull(audioConfig);
        this.mNoiseBuffer = ByteBuffer.allocateDirect(audioConfig.frameSize()).order(ByteOrder.nativeOrder());
        double frameSize = 3.141592653589793d / (audioConfig.frameSize() / 2.0d);
        double d = 0.0d;
        while (this.mNoiseBuffer.hasRemaining()) {
            d += 1.0d;
            short sin = (short) (Math.sin(d * frameSize) * 10.0d);
            this.mNoiseBuffer.put((byte) sin);
            this.mNoiseBuffer.put((byte) (sin >> 8));
        }
        this.mNoiseBuffer.rewind();
    }

    void fill(ByteBuffer byteBuffer) {
        this.mNoiseBuffer.clear();
        if (this.mNoiseBuffer.capacity() == byteBuffer.remaining()) {
            this.mNoiseBuffer.position(0);
        } else {
            ByteBuffer byteBuffer2 = this.mNoiseBuffer;
            byteBuffer2.position(RANDOM.nextInt(byteBuffer2.capacity() - byteBuffer.remaining()));
        }
        ByteBuffer byteBuffer3 = this.mNoiseBuffer;
        byteBuffer3.limit(byteBuffer3.position() + byteBuffer.remaining());
        byteBuffer.put(this.mNoiseBuffer);
    }
}
