package com.otaliastudios.cameraview.video.encoding;

import android.media.MediaCodec;
import com.otaliastudios.cameraview.internal.Pool;

/* loaded from: classes17.dex */
class OutputBufferPool extends Pool<OutputBuffer> {
    OutputBufferPool(final int i) {
        super(Integer.MAX_VALUE, new Pool.Factory<OutputBuffer>() { // from class: com.otaliastudios.cameraview.video.encoding.OutputBufferPool.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.otaliastudios.cameraview.internal.Pool.Factory
            public OutputBuffer create() {
                OutputBuffer outputBuffer = new OutputBuffer();
                outputBuffer.trackIndex = i;
                outputBuffer.info = new MediaCodec.BufferInfo();
                return outputBuffer;
            }
        });
    }
}
