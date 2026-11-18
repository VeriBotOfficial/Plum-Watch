package com.otaliastudios.cameraview.video.encoding;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
class MediaCodecBuffers {
    private final MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers = null;
    private final ByteBuffer[] mInputBuffers = null;

    void onOutputBuffersChanged() {
    }

    MediaCodecBuffers(MediaCodec mediaCodec) {
        this.mMediaCodec = mediaCodec;
    }

    ByteBuffer getInputBuffer(int r2) {
        return this.mMediaCodec.getInputBuffer(r2);
    }

    ByteBuffer getOutputBuffer(int r2) {
        return this.mMediaCodec.getOutputBuffer(r2);
    }
}
