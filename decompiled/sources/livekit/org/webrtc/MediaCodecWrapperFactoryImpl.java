package livekit.org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {
    MediaCodecWrapperFactoryImpl() {
    }

    private static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void configure(MediaFormat format, Surface surface, MediaCrypto crypto, int flags) {
            this.mediaCodec.configure(format, surface, crypto, flags);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public int dequeueInputBuffer(long timeoutUs) {
            return this.mediaCodec.dequeueInputBuffer(timeoutUs);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void queueInputBuffer(int index, int offset, int size, long presentationTimeUs, int flags) {
            this.mediaCodec.queueInputBuffer(index, offset, size, presentationTimeUs, flags);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo info, long timeoutUs) {
            return this.mediaCodec.dequeueOutputBuffer(info, timeoutUs);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void releaseOutputBuffer(int index, boolean render) {
            this.mediaCodec.releaseOutputBuffer(index, render);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public MediaFormat getInputFormat() {
            return this.mediaCodec.getInputFormat();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public MediaFormat getOutputFormat(int index) {
            return this.mediaCodec.getOutputFormat(index);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public ByteBuffer getInputBuffer(int index) {
            return this.mediaCodec.getInputBuffer(index);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public ByteBuffer getOutputBuffer(int index) {
            return this.mediaCodec.getOutputBuffer(index);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public void setParameters(Bundle params) {
            this.mediaCodec.setParameters(params);
        }

        @Override // livekit.org.webrtc.MediaCodecWrapper
        public MediaCodecInfo getCodecInfo() {
            return this.mediaCodec.getCodecInfo();
        }
    }

    @Override // livekit.org.webrtc.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String name) throws IOException {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(name));
    }
}
