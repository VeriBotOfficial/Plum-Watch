package com.otaliastudios.cameraview.video.encoding;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.video.encoding.MediaEncoderEngine;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes17.dex */
public class AudioMediaEncoder extends MediaEncoder {
    private static final boolean PERFORMANCE_DEBUG = false;
    private static final boolean PERFORMANCE_FILL_GAPS = true;
    private static final int PERFORMANCE_MAX_GAPS = 8;
    private AudioNoise mAudioNoise;
    private ByteBufferPool mByteBufferPool;
    private AudioConfig mConfig;
    private long mDebugExecuteAvgDelay;
    private int mDebugExecuteCount;
    private long mDebugSendAvgDelay;
    private int mDebugSendCount;
    private Map<Long, Long> mDebugSendStartMap;
    private AudioEncodingThread mEncoder;
    private InputBufferPool mInputBufferPool;
    private final LinkedBlockingQueue<InputBuffer> mInputBufferQueue;
    private AudioRecordingThread mRecorder;
    private boolean mRequestStop;
    private final AudioTimestamp mTimestamp;
    private static final String TAG = "AudioMediaEncoder";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public AudioMediaEncoder(AudioConfig audioConfig) {
        super("AudioEncoder");
        this.mRequestStop = false;
        this.mInputBufferPool = new InputBufferPool();
        this.mInputBufferQueue = new LinkedBlockingQueue<>();
        this.mDebugSendCount = 0;
        this.mDebugExecuteCount = 0;
        this.mDebugSendAvgDelay = 0L;
        this.mDebugExecuteAvgDelay = 0L;
        this.mDebugSendStartMap = new HashMap();
        this.mConfig = audioConfig.copy();
        this.mTimestamp = new AudioTimestamp(this.mConfig.byteRate());
        this.mEncoder = new AudioEncodingThread();
        this.mRecorder = new AudioRecordingThread();
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected void onPrepare(MediaEncoderEngine.Controller controller, long j) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(this.mConfig.mimeType, this.mConfig.samplingFrequency, this.mConfig.channels);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("channel-mask", this.mConfig.audioFormatChannels());
        createAudioFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, this.mConfig.bitRate);
        try {
            if (this.mConfig.encoder != null) {
                this.mMediaCodec = MediaCodec.createByCodecName(this.mConfig.encoder);
            } else {
                this.mMediaCodec = MediaCodec.createEncoderByType(this.mConfig.mimeType);
            }
            this.mMediaCodec.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mMediaCodec.start();
            this.mByteBufferPool = new ByteBufferPool(this.mConfig.frameSize(), this.mConfig.bufferPoolMaxSize());
            this.mAudioNoise = new AudioNoise(this.mConfig);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected void onStart() {
        this.mRequestStop = false;
        this.mRecorder.start();
        this.mEncoder.start();
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected void onStop() {
        this.mRequestStop = true;
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected void onStopped() {
        super.onStopped();
        this.mRequestStop = false;
        this.mEncoder = null;
        this.mRecorder = null;
        ByteBufferPool byteBufferPool = this.mByteBufferPool;
        if (byteBufferPool != null) {
            byteBufferPool.clear();
            this.mByteBufferPool = null;
        }
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected int getEncodedBitRate() {
        return this.mConfig.bitRate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void skipFrames(int i) {
        try {
            Thread.sleep(AudioTimestamp.bytesToMillis(this.mConfig.frameSize() * i, this.mConfig.byteRate()));
        } catch (InterruptedException unused) {
        }
    }

    private class AudioRecordingThread extends Thread {
        private AudioRecord mAudioRecord;
        private ByteBuffer mCurrentBuffer;
        private int mCurrentReadBytes;
        private long mFirstTimeUs;
        private long mLastTimeUs;

        private AudioRecordingThread() {
            this.mFirstTimeUs = Long.MIN_VALUE;
            setPriority(10);
            int i = AudioMediaEncoder.this.mConfig.samplingFrequency;
            int audioFormatChannels = AudioMediaEncoder.this.mConfig.audioFormatChannels();
            Objects.requireNonNull(AudioMediaEncoder.this.mConfig);
            int minBufferSize = AudioRecord.getMinBufferSize(i, audioFormatChannels, 2);
            int frameSize = AudioMediaEncoder.this.mConfig.frameSize() * AudioMediaEncoder.this.mConfig.audioRecordBufferFrames();
            while (frameSize < minBufferSize) {
                frameSize += AudioMediaEncoder.this.mConfig.frameSize();
            }
            int i2 = AudioMediaEncoder.this.mConfig.samplingFrequency;
            int audioFormatChannels2 = AudioMediaEncoder.this.mConfig.audioFormatChannels();
            Objects.requireNonNull(AudioMediaEncoder.this.mConfig);
            this.mAudioRecord = new AudioRecord(5, i2, audioFormatChannels2, 2, frameSize);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            this.mAudioRecord.startRecording();
            while (true) {
                z = false;
                if (AudioMediaEncoder.this.mRequestStop) {
                    break;
                } else if (!AudioMediaEncoder.this.hasReachedMaxLength()) {
                    read(false);
                }
            }
            AudioMediaEncoder.LOG.w("Stop was requested. We're out of the loop. Will post an endOfStream.");
            while (!z) {
                z = read(true);
            }
            this.mAudioRecord.stop();
            this.mAudioRecord.release();
            this.mAudioRecord = null;
        }

        private boolean read(boolean z) {
            ByteBuffer byteBuffer = AudioMediaEncoder.this.mByteBufferPool.get();
            this.mCurrentBuffer = byteBuffer;
            if (byteBuffer == null) {
                if (z) {
                    AudioMediaEncoder.LOG.v("read thread - eos: true - No buffer, retrying.");
                    return false;
                }
                AudioMediaEncoder.LOG.w("read thread - eos: false - Skipping audio frame,", "encoding is too slow.");
                AudioMediaEncoder.this.skipFrames(6);
                return false;
            }
            byteBuffer.clear();
            this.mCurrentReadBytes = this.mAudioRecord.read(this.mCurrentBuffer, AudioMediaEncoder.this.mConfig.frameSize());
            AudioMediaEncoder.LOG.v("read thread - eos:", Boolean.valueOf(z), "- Read new audio frame. Bytes:", Integer.valueOf(this.mCurrentReadBytes));
            int i = this.mCurrentReadBytes;
            if (i > 0) {
                increaseTime(i, z);
                AudioMediaEncoder.LOG.v("read thread - eos:", Boolean.valueOf(z), "- mLastTimeUs:", Long.valueOf(this.mLastTimeUs));
                this.mCurrentBuffer.limit(this.mCurrentReadBytes);
                enqueue(this.mCurrentBuffer, this.mLastTimeUs, z);
                return true;
            }
            if (i == -3) {
                AudioMediaEncoder.LOG.e("read thread - eos:", Boolean.valueOf(z), "- Got AudioRecord.ERROR_INVALID_OPERATION");
                return true;
            }
            if (i != -2) {
                return true;
            }
            AudioMediaEncoder.LOG.e("read thread - eos:", Boolean.valueOf(z), "- Got AudioRecord.ERROR_BAD_VALUE");
            return true;
        }

        private void increaseTime(int i, boolean z) {
            long increaseUs = AudioMediaEncoder.this.mTimestamp.increaseUs(i);
            this.mLastTimeUs = increaseUs;
            if (this.mFirstTimeUs == Long.MIN_VALUE) {
                this.mFirstTimeUs = increaseUs;
                AudioMediaEncoder.this.notifyFirstFrameMillis(System.currentTimeMillis() - AudioTimestamp.bytesToMillis(i, AudioMediaEncoder.this.mConfig.byteRate()));
            }
            if (!AudioMediaEncoder.this.hasReachedMaxLength() && this.mLastTimeUs - this.mFirstTimeUs > AudioMediaEncoder.this.getMaxLengthUs() && !z) {
                AudioMediaEncoder.LOG.w("read thread - this frame reached the maxLength! deltaUs:", Long.valueOf(this.mLastTimeUs - this.mFirstTimeUs));
                AudioMediaEncoder.this.notifyMaxLengthReached();
            }
            maybeAddNoise();
        }

        private void enqueue(ByteBuffer byteBuffer, long j, boolean z) {
            int remaining = byteBuffer.remaining();
            InputBuffer inputBuffer = AudioMediaEncoder.this.mInputBufferPool.get();
            inputBuffer.source = byteBuffer;
            inputBuffer.timestamp = j;
            inputBuffer.length = remaining;
            inputBuffer.isEndOfStream = z;
            AudioMediaEncoder.this.mInputBufferQueue.add(inputBuffer);
        }

        private void maybeAddNoise() {
            int gapCount = AudioMediaEncoder.this.mTimestamp.getGapCount(AudioMediaEncoder.this.mConfig.frameSize());
            if (gapCount <= 0) {
                return;
            }
            long gapStartUs = AudioMediaEncoder.this.mTimestamp.getGapStartUs(this.mLastTimeUs);
            long bytesToUs = AudioTimestamp.bytesToUs(AudioMediaEncoder.this.mConfig.frameSize(), AudioMediaEncoder.this.mConfig.byteRate());
            AudioMediaEncoder.LOG.w("read thread - GAPS: trying to add", Integer.valueOf(gapCount), "noise buffers. PERFORMANCE_MAX_GAPS:", 8);
            for (int i = 0; i < Math.min(gapCount, 8); i++) {
                ByteBuffer byteBuffer = AudioMediaEncoder.this.mByteBufferPool.get();
                if (byteBuffer == null) {
                    AudioMediaEncoder.LOG.e("read thread - GAPS: aborting because we have no free buffer.");
                    return;
                }
                byteBuffer.clear();
                AudioMediaEncoder.this.mAudioNoise.fill(byteBuffer);
                byteBuffer.rewind();
                enqueue(byteBuffer, gapStartUs, false);
                gapStartUs += bytesToUs;
            }
        }
    }

    private class AudioEncodingThread extends Thread {
        private AudioEncodingThread() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0000, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
            L0:
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder r0 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.this
                java.util.concurrent.LinkedBlockingQueue r0 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.access$900(r0)
                boolean r0 = r0.isEmpty()
                r1 = 3
                if (r0 == 0) goto L13
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder r0 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.this
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.access$600(r0, r1)
                goto L0
            L13:
                com.otaliastudios.cameraview.CameraLogger r0 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.access$400()
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder r2 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.this
                java.util.concurrent.LinkedBlockingQueue r2 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.access$900(r2)
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r3 = "pending operations."
                java.lang.String r4 = "encoding thread - performing"
                java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r3}
                r0.v(r2)
            L30:
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder r0 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.this
                java.util.concurrent.LinkedBlockingQueue r0 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.access$900(r0)
                java.lang.Object r0 = r0.peek()
                com.otaliastudios.cameraview.video.encoding.InputBuffer r0 = (com.otaliastudios.cameraview.video.encoding.InputBuffer) r0
                if (r0 == 0) goto L0
                boolean r2 = r0.isEndOfStream
                if (r2 == 0) goto L54
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder r1 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.this
                r1.acquireInputBuffer(r0)
                r5.encode(r0)
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder r0 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.this
                com.otaliastudios.cameraview.video.encoding.InputBufferPool r0 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.access$800(r0)
                r0.clear()
                return
            L54:
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder r2 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.this
                boolean r2 = r2.tryAcquireInputBuffer(r0)
                if (r2 == 0) goto L60
                r5.encode(r0)
                goto L30
            L60:
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder r0 = com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.this
                com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.access$600(r0, r1)
                goto L30
            */
            throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.video.encoding.AudioMediaEncoder.AudioEncodingThread.run():void");
        }

        private void encode(InputBuffer inputBuffer) {
            long nanoTime = System.nanoTime() / 1000000;
            AudioMediaEncoder.LOG.v("encoding thread - performing pending operation for timestamp:", Long.valueOf(inputBuffer.timestamp), "- encoding.");
            inputBuffer.data.put(inputBuffer.source);
            AudioMediaEncoder.this.mByteBufferPool.recycle(inputBuffer.source);
            AudioMediaEncoder.this.mInputBufferQueue.remove(inputBuffer);
            AudioMediaEncoder.this.encodeInputBuffer(inputBuffer);
            boolean z = inputBuffer.isEndOfStream;
            AudioMediaEncoder.this.mInputBufferPool.recycle(inputBuffer);
            AudioMediaEncoder.LOG.v("encoding thread - performing pending operation for timestamp:", Long.valueOf(inputBuffer.timestamp), "- draining.");
            AudioMediaEncoder.this.drainOutput(z);
        }
    }
}
