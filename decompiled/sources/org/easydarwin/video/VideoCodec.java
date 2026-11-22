package org.easydarwin.video;

import java.nio.ByteBuffer;
import org.easydarwin.video.Client;

/* loaded from: classes6.dex */
public class VideoCodec {
    public static final int DECODER_H264 = 0;
    public static final int DECODER_H265 = 1;
    protected long mHandle;

    private native void close(long j);

    private native long create(Object obj, int i);

    private native int decode(long j, byte[] bArr, int i, int i2, int[] iArr);

    private native ByteBuffer decodeYUV(long j, byte[] bArr, int i, int i2, int[] iArr);

    private native void decodeYUV2(long j, ByteBuffer byteBuffer, int i, int i2);

    private native void releaseYUV(ByteBuffer byteBuffer);

    static {
        System.loadLibrary("proffmpeg");
        System.loadLibrary("VideoCodecer");
    }

    public int decoder_create(Object obj, int i) {
        long create = create(obj, i);
        this.mHandle = create;
        return create != 0 ? 0 : -1;
    }

    public int decoder_decode(byte[] bArr, int i, int i2, int[] iArr) {
        return decode(this.mHandle, bArr, i, i2, iArr);
    }

    public ByteBuffer decoder_decodeYUV(byte[] bArr, int i, int i2, int[] iArr) {
        return decodeYUV(this.mHandle, bArr, i, i2, iArr);
    }

    public void decoder_releaseBuffer(ByteBuffer byteBuffer) {
        releaseYUV(byteBuffer);
    }

    public void decoder_decodeBuffer(ByteBuffer byteBuffer, int i, int i2) {
        decodeYUV2(this.mHandle, byteBuffer, i, i2);
    }

    public void decoder_close() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        close(j);
        this.mHandle = 0L;
    }

    public static class VideoDecoderLite extends VideoCodec {
        private int[] mSize;
        private Object surface;

        public void create(Object obj, boolean z) {
            this.surface = obj;
            decoder_create(obj, !z ? 1 : 0);
            this.mSize = new int[2];
        }

        public void close() {
            decoder_close();
        }

        protected int decodeFrame(Client.FrameInfo frameInfo, int[] iArr) {
            return decoder_decode(frameInfo.buffer, frameInfo.offset, frameInfo.length, iArr);
        }

        protected ByteBuffer decodeFrameYUV(Client.FrameInfo frameInfo, int[] iArr) {
            return decoder_decodeYUV(frameInfo.buffer, frameInfo.offset, frameInfo.length, iArr);
        }

        protected void releaseBuffer(ByteBuffer byteBuffer) {
            decoder_releaseBuffer(byteBuffer);
        }
    }
}
