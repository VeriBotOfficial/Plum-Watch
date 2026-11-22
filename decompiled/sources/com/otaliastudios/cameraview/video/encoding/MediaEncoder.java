package com.otaliastudios.cameraview.video.encoding;

import android.media.MediaCodec;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.internal.WorkerHandler;
import com.otaliastudios.cameraview.video.encoding.MediaEncoderEngine;
import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
public abstract class MediaEncoder {
    private static final int INPUT_TIMEOUT_US = 0;
    private static final int OUTPUT_TIMEOUT_US = 0;
    private static final int STATE_LIMIT_REACHED = 5;
    private static final int STATE_NONE = 0;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private static final int STATE_STARTED = 4;
    private static final int STATE_STARTING = 3;
    private static final int STATE_STOPPED = 7;
    private static final int STATE_STOPPING = 6;
    private MediaCodec.BufferInfo mBufferInfo;
    private MediaCodecBuffers mBuffers;
    private MediaEncoderEngine.Controller mController;
    private boolean mMaxLengthReached;
    private long mMaxLengthUs;
    protected MediaCodec mMediaCodec;
    private final String mName;
    private OutputBufferPool mOutputBufferPool;
    private int mTrackIndex;
    protected WorkerHandler mWorker;
    private static final String TAG = "MediaEncoder";
    private static final CameraLogger LOG = CameraLogger.create(TAG);
    private int mState = 0;
    private final Map<String, AtomicInteger> mPendingEvents = new HashMap();
    private long mStartTimeMillis = 0;
    private long mFirstTimeUs = Long.MIN_VALUE;
    private long mLastTimeUs = 0;
    private long mDebugSetStateTimestamp = Long.MIN_VALUE;

    protected abstract int getEncodedBitRate();

    protected void onEvent(String str, Object obj) {
    }

    protected abstract void onPrepare(MediaEncoderEngine.Controller controller, long j);

    protected abstract void onStart();

    protected abstract void onStop();

    protected MediaEncoder(String str) {
        this.mName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        String str;
        if (this.mDebugSetStateTimestamp == Long.MIN_VALUE) {
            this.mDebugSetStateTimestamp = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.mDebugSetStateTimestamp;
        this.mDebugSetStateTimestamp = System.currentTimeMillis();
        switch (i) {
            case 0:
                str = DialPromoBanner.NONE;
                break;
            case 1:
                str = "PREPARING";
                break;
            case 2:
                str = "PREPARED";
                break;
            case 3:
                str = "STARTING";
                break;
            case 4:
                str = "STARTED";
                break;
            case 5:
                str = "LIMIT_REACHED";
                break;
            case 6:
                str = "STOPPING";
                break;
            case 7:
                str = "STOPPED";
                break;
            default:
                str = null;
                break;
        }
        LOG.w(this.mName, "setState:", str, "millisSinceLastState:", Long.valueOf(currentTimeMillis));
        this.mState = i;
    }

    final void prepare(final MediaEncoderEngine.Controller controller, final long j) {
        int i = this.mState;
        if (i >= 1) {
            LOG.e(this.mName, "Wrong state while preparing. Aborting.", Integer.valueOf(i));
            return;
        }
        this.mController = controller;
        this.mBufferInfo = new MediaCodec.BufferInfo();
        this.mMaxLengthUs = j;
        WorkerHandler workerHandler = WorkerHandler.get(this.mName);
        this.mWorker = workerHandler;
        workerHandler.getThread().setPriority(10);
        LOG.i(this.mName, "Prepare was called. Posting.");
        this.mWorker.post(new Runnable() { // from class: com.otaliastudios.cameraview.video.encoding.MediaEncoder.1
            @Override // java.lang.Runnable
            public void run() {
                MediaEncoder.LOG.i(MediaEncoder.this.mName, "Prepare was called. Executing.");
                MediaEncoder.this.setState(1);
                MediaEncoder.this.onPrepare(controller, j);
                MediaEncoder.this.setState(2);
            }
        });
    }

    final void start() {
        LOG.w(this.mName, "Start was called. Posting.");
        this.mWorker.post(new Runnable() { // from class: com.otaliastudios.cameraview.video.encoding.MediaEncoder.2
            @Override // java.lang.Runnable
            public void run() {
                if (MediaEncoder.this.mState < 2 || MediaEncoder.this.mState >= 3) {
                    MediaEncoder.LOG.e(MediaEncoder.this.mName, "Wrong state while starting. Aborting.", Integer.valueOf(MediaEncoder.this.mState));
                    return;
                }
                MediaEncoder.this.setState(3);
                MediaEncoder.LOG.w(MediaEncoder.this.mName, "Start was called. Executing.");
                MediaEncoder.this.onStart();
            }
        });
    }

    final void notify(final String str, final Object obj) {
        if (!this.mPendingEvents.containsKey(str)) {
            this.mPendingEvents.put(str, new AtomicInteger(0));
        }
        final AtomicInteger atomicInteger = this.mPendingEvents.get(str);
        atomicInteger.incrementAndGet();
        LOG.v(this.mName, "Notify was called. Posting. pendingEvents:", Integer.valueOf(atomicInteger.intValue()));
        this.mWorker.post(new Runnable() { // from class: com.otaliastudios.cameraview.video.encoding.MediaEncoder.3
            @Override // java.lang.Runnable
            public void run() {
                MediaEncoder.LOG.v(MediaEncoder.this.mName, "Notify was called. Executing. pendingEvents:", Integer.valueOf(atomicInteger.intValue()));
                MediaEncoder.this.onEvent(str, obj);
                atomicInteger.decrementAndGet();
            }
        });
    }

    final void stop() {
        int i = this.mState;
        if (i >= 6) {
            LOG.e(this.mName, "Wrong state while stopping. Aborting.", Integer.valueOf(i));
            return;
        }
        setState(6);
        LOG.w(this.mName, "Stop was called. Posting.");
        this.mWorker.post(new Runnable() { // from class: com.otaliastudios.cameraview.video.encoding.MediaEncoder.4
            @Override // java.lang.Runnable
            public void run() {
                MediaEncoder.LOG.w(MediaEncoder.this.mName, "Stop was called. Executing.");
                MediaEncoder.this.onStop();
            }
        });
    }

    protected void onStopped() {
        LOG.w(this.mName, "is being released. Notifying controller and releasing codecs.");
        this.mController.notifyStopped(this.mTrackIndex);
        this.mMediaCodec.stop();
        this.mMediaCodec.release();
        this.mMediaCodec = null;
        this.mOutputBufferPool.clear();
        this.mOutputBufferPool = null;
        this.mBuffers = null;
        setState(7);
        this.mWorker.destroy();
    }

    protected boolean tryAcquireInputBuffer(InputBuffer inputBuffer) {
        if (this.mBuffers == null) {
            this.mBuffers = new MediaCodecBuffers(this.mMediaCodec);
        }
        int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(0L);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        inputBuffer.index = dequeueInputBuffer;
        inputBuffer.data = this.mBuffers.getInputBuffer(dequeueInputBuffer);
        return true;
    }

    protected void acquireInputBuffer(InputBuffer inputBuffer) {
        while (!tryAcquireInputBuffer(inputBuffer)) {
        }
    }

    protected void encodeInputBuffer(InputBuffer inputBuffer) {
        LOG.v(this.mName, "ENCODING - Buffer:", Integer.valueOf(inputBuffer.index), "Bytes:", Integer.valueOf(inputBuffer.length), "Presentation:", Long.valueOf(inputBuffer.timestamp));
        if (inputBuffer.isEndOfStream) {
            this.mMediaCodec.queueInputBuffer(inputBuffer.index, 0, 0, inputBuffer.timestamp, 4);
        } else {
            this.mMediaCodec.queueInputBuffer(inputBuffer.index, 0, inputBuffer.length, inputBuffer.timestamp, 0);
        }
    }

    protected final void drainOutput(boolean z) {
        CameraLogger cameraLogger = LOG;
        cameraLogger.i(this.mName, "DRAINING - EOS:", Boolean.valueOf(z));
        if (this.mMediaCodec == null) {
            cameraLogger.e("drain() was called before prepare() or after releasing.");
            return;
        }
        if (this.mBuffers == null) {
            this.mBuffers = new MediaCodecBuffers(this.mMediaCodec);
        }
        while (true) {
            int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 0L);
            CameraLogger cameraLogger2 = LOG;
            cameraLogger2.i(this.mName, "DRAINING - Got status:", Integer.valueOf(dequeueOutputBuffer));
            if (dequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (dequeueOutputBuffer == -3) {
                this.mBuffers.onOutputBuffersChanged();
            } else if (dequeueOutputBuffer == -2) {
                if (!this.mController.isStarted()) {
                    this.mTrackIndex = this.mController.notifyStarted(this.mMediaCodec.getOutputFormat());
                    setState(4);
                    this.mOutputBufferPool = new OutputBufferPool(this.mTrackIndex);
                }
            } else if (dequeueOutputBuffer < 0) {
                cameraLogger2.e("Unexpected result from dequeueOutputBuffer: " + dequeueOutputBuffer);
            } else {
                ByteBuffer outputBuffer = this.mBuffers.getOutputBuffer(dequeueOutputBuffer);
                if ((this.mBufferInfo.flags & 2) == 0 && this.mController.isStarted() && this.mBufferInfo.size != 0) {
                    outputBuffer.position(this.mBufferInfo.offset);
                    outputBuffer.limit(this.mBufferInfo.offset + this.mBufferInfo.size);
                    if (this.mFirstTimeUs == Long.MIN_VALUE) {
                        long j = this.mBufferInfo.presentationTimeUs;
                        this.mFirstTimeUs = j;
                        cameraLogger2.w(this.mName, "DRAINING - Got the first presentation time:", Long.valueOf(j));
                    }
                    long j2 = this.mBufferInfo.presentationTimeUs;
                    this.mLastTimeUs = j2;
                    this.mBufferInfo.presentationTimeUs = ((this.mStartTimeMillis * 1000) + j2) - this.mFirstTimeUs;
                    cameraLogger2.v(this.mName, "DRAINING - About to write(). Adjusted presentation:", Long.valueOf(this.mBufferInfo.presentationTimeUs));
                    OutputBuffer outputBuffer2 = this.mOutputBufferPool.get();
                    outputBuffer2.info = this.mBufferInfo;
                    outputBuffer2.trackIndex = this.mTrackIndex;
                    outputBuffer2.data = outputBuffer;
                    onWriteOutput(this.mOutputBufferPool, outputBuffer2);
                }
                this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (!z && !this.mMaxLengthReached) {
                    long j3 = this.mFirstTimeUs;
                    if (j3 != Long.MIN_VALUE) {
                        long j4 = this.mLastTimeUs;
                        if (j4 - j3 > this.mMaxLengthUs) {
                            cameraLogger2.w(this.mName, "DRAINING - Reached maxLength! mLastTimeUs:", Long.valueOf(j4), "mStartTimeUs:", Long.valueOf(this.mFirstTimeUs), "mDeltaUs:", Long.valueOf(this.mLastTimeUs - this.mFirstTimeUs), "mMaxLengthUs:", Long.valueOf(this.mMaxLengthUs));
                            onMaxLengthReached();
                            return;
                        }
                    }
                }
                if ((this.mBufferInfo.flags & 4) != 0) {
                    cameraLogger2.w(this.mName, "DRAINING - Got EOS. Releasing the codec.");
                    onStopped();
                    return;
                }
            }
        }
    }

    protected void onWriteOutput(OutputBufferPool outputBufferPool, OutputBuffer outputBuffer) {
        this.mController.write(outputBufferPool, outputBuffer);
    }

    protected long getMaxLengthUs() {
        return this.mMaxLengthUs;
    }

    protected void notifyMaxLengthReached() {
        onMaxLengthReached();
    }

    protected boolean hasReachedMaxLength() {
        return this.mMaxLengthReached;
    }

    private void onMaxLengthReached() {
        if (this.mMaxLengthReached) {
            LOG.w(this.mName, "onMaxLengthReached: Called twice.");
            return;
        }
        this.mMaxLengthReached = true;
        int i = this.mState;
        if (i >= 5) {
            LOG.w(this.mName, "onMaxLengthReached: Reached in wrong state. Aborting.", Integer.valueOf(i));
            return;
        }
        LOG.w(this.mName, "onMaxLengthReached: Requesting a stop.");
        setState(5);
        this.mController.requestStop(this.mTrackIndex);
    }

    protected final void notifyFirstFrameMillis(long j) {
        this.mStartTimeMillis = j;
    }

    protected final int getPendingEvents(String str) {
        return this.mPendingEvents.get(str).intValue();
    }
}
