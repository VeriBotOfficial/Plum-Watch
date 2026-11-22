package livekit.org.webrtc;

import java.nio.ByteBuffer;
import java.util.Objects;
import livekit.org.webrtc.VideoFrame;

/* loaded from: classes8.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private static native void nativeCropAndScaleI420(ByteBuffer srcY, int srcStrideY, ByteBuffer srcU, int srcStrideU, ByteBuffer srcV, int srcStrideV, int cropX, int cropY, int cropWidth, int cropHeight, ByteBuffer dstY, int dstStrideY, ByteBuffer dstU, int dstStrideU, ByteBuffer dstV, int dstStrideV, int scaleWidth, int scaleHeight);

    private JavaI420Buffer(int width, int height, ByteBuffer dataY, int strideY, ByteBuffer dataU, int strideU, ByteBuffer dataV, int strideV, Runnable releaseCallback) {
        this.width = width;
        this.height = height;
        this.dataY = dataY;
        this.dataU = dataU;
        this.dataV = dataV;
        this.strideY = strideY;
        this.strideU = strideU;
        this.strideV = strideV;
        this.refCountDelegate = new RefCountDelegate(releaseCallback);
    }

    private static void checkCapacity(ByteBuffer data, int width, int height, int stride) {
        int i = (stride * (height - 1)) + width;
        if (data.capacity() >= i) {
            return;
        }
        throw new IllegalArgumentException("Buffer must be at least " + i + " bytes, but was " + data.capacity());
    }

    public static JavaI420Buffer wrap(int width, int height, ByteBuffer dataY, int strideY, ByteBuffer dataU, int strideU, ByteBuffer dataV, int strideV, Runnable releaseCallback) {
        if (dataY == null || dataU == null || dataV == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!dataY.isDirect() || !dataU.isDirect() || !dataV.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        ByteBuffer slice = dataY.slice();
        ByteBuffer slice2 = dataU.slice();
        ByteBuffer slice3 = dataV.slice();
        int i = (width + 1) / 2;
        int i2 = (height + 1) / 2;
        checkCapacity(slice, width, height, strideY);
        checkCapacity(slice2, i, i2, strideU);
        checkCapacity(slice3, i, i2, strideV);
        return new JavaI420Buffer(width, height, slice, strideY, slice2, strideU, slice3, strideV, releaseCallback);
    }

    public static JavaI420Buffer allocate(int width, int height) {
        int i = (height + 1) / 2;
        int i2 = (width + 1) / 2;
        int i3 = width * height;
        int i4 = i2 * i;
        int i5 = i3 + i4;
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i2 * 2 * i) + i3);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        return new JavaI420Buffer(width, height, slice, width, slice2, i2, nativeAllocateByteBuffer.slice(), i2, new Runnable() { // from class: livekit.org.webrtc.JavaI420Buffer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
            }
        });
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // livekit.org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer, livekit.org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer, livekit.org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // livekit.org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int cropX, int cropY, int cropWidth, int cropHeight, int scaleWidth, int scaleHeight) {
        return cropAndScaleI420(this, cropX, cropY, cropWidth, cropHeight, scaleWidth, scaleHeight);
    }

    public static VideoFrame.Buffer cropAndScaleI420(final VideoFrame.I420Buffer buffer, int cropX, int cropY, int cropWidth, int cropHeight, int scaleWidth, int scaleHeight) {
        if (cropWidth == scaleWidth && cropHeight == scaleHeight) {
            ByteBuffer dataY = buffer.getDataY();
            ByteBuffer dataU = buffer.getDataU();
            ByteBuffer dataV = buffer.getDataV();
            int i = cropX / 2;
            int i2 = cropY / 2;
            buffer.retain();
            ByteBuffer slice = dataY.slice();
            int strideY = buffer.getStrideY();
            ByteBuffer slice2 = dataU.slice();
            int strideU = buffer.getStrideU();
            ByteBuffer slice3 = dataV.slice();
            int strideV = buffer.getStrideV();
            Objects.requireNonNull(buffer);
            return wrap(scaleWidth, scaleHeight, slice, strideY, slice2, strideU, slice3, strideV, new Runnable() { // from class: livekit.org.webrtc.JavaI420Buffer$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFrame.I420Buffer.this.release();
                }
            });
        }
        JavaI420Buffer allocate = allocate(scaleWidth, scaleHeight);
        nativeCropAndScaleI420(buffer.getDataY(), buffer.getStrideY(), buffer.getDataU(), buffer.getStrideU(), buffer.getDataV(), buffer.getStrideV(), cropX, cropY, cropWidth, cropHeight, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), scaleWidth, scaleHeight);
        return allocate;
    }
}
