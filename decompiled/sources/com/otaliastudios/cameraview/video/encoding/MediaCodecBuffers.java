package com.otaliastudios.cameraview.video.encoding;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes17.dex */
class MediaCodecBuffers {
    private final MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers = null;
    private final ByteBuffer[] mInputBuffers = null;

    void onOutputBuffersChanged() {
    }

    MediaCodecBuffers(MediaCodec mediaCodec) {
        this.mMediaCodec = mediaCodec;
    }

    ByteBuffer getInputBuffer(int i) {
        return this.mMediaCodec.getInputBuffer(i);
    }

    ByteBuffer getOutputBuffer(int i) {
        return this.mMediaCodec.getOutputBuffer(i);
    }
}
