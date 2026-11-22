package com.otaliastudios.cameraview.frame;

import com.otaliastudios.cameraview.engine.offset.Angles;
import com.otaliastudios.cameraview.size.Size;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes17.dex */
public class ByteBufferFrameManager extends FrameManager<byte[]> {
    private static final int BUFFER_MODE_DISPATCH = 0;
    private static final int BUFFER_MODE_ENQUEUE = 1;
    private BufferCallback mBufferCallback;
    private final int mBufferMode;
    private LinkedBlockingQueue<byte[]> mBufferQueue;

    public interface BufferCallback {
        void onBufferAvailable(byte[] bArr);
    }

    public ByteBufferFrameManager(int i, BufferCallback bufferCallback) {
        super(i, byte[].class);
        if (bufferCallback != null) {
            this.mBufferCallback = bufferCallback;
            this.mBufferMode = 0;
        } else {
            this.mBufferQueue = new LinkedBlockingQueue<>(i);
            this.mBufferMode = 1;
        }
    }

    @Override // com.otaliastudios.cameraview.frame.FrameManager
    public void setUp(int i, Size size, Angles angles) {
        super.setUp(i, size, angles);
        int frameBytes = getFrameBytes();
        for (int i2 = 0; i2 < getPoolSize(); i2++) {
            if (this.mBufferMode == 0) {
                this.mBufferCallback.onBufferAvailable(new byte[frameBytes]);
            } else {
                this.mBufferQueue.offer(new byte[frameBytes]);
            }
        }
    }

    public byte[] getBuffer() {
        if (this.mBufferMode != 1) {
            throw new IllegalStateException("Can't call getBuffer() when not in BUFFER_MODE_ENQUEUE.");
        }
        return this.mBufferQueue.poll();
    }

    public void onBufferUnused(byte[] bArr) {
        if (this.mBufferMode != 1) {
            throw new IllegalStateException("Can't call onBufferUnused() when not in BUFFER_MODE_ENQUEUE.");
        }
        if (isSetUp()) {
            this.mBufferQueue.offer(bArr);
        } else {
            LOG.w("onBufferUnused: buffer was returned but we're not set up anymore.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.otaliastudios.cameraview.frame.FrameManager
    public void onFrameDataReleased(byte[] bArr, boolean z) {
        if (z && bArr.length == getFrameBytes()) {
            if (this.mBufferMode == 0) {
                this.mBufferCallback.onBufferAvailable(bArr);
            } else {
                this.mBufferQueue.offer(bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.otaliastudios.cameraview.frame.FrameManager
    public byte[] onCloneFrameData(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Override // com.otaliastudios.cameraview.frame.FrameManager
    public void release() {
        super.release();
        if (this.mBufferMode == 1) {
            this.mBufferQueue.clear();
        }
    }
}
