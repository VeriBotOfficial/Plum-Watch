package org.easydarwin.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.easydarwin.video.EasyMuxer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* loaded from: classes6.dex */
public class EasyAACMuxer extends EasyMuxer {
    String TAG;
    private MediaFormat mAudioFormat;
    protected MediaCodec.BufferInfo mBufferInfo;
    protected ByteBuffer[] mBuffers;
    MediaCodec mMediaCodec;

    public EasyAACMuxer(String str, boolean z, long j) {
        super(str, z, j);
        this.TAG = "EasyAACMuxer";
        this.mBufferInfo = new MediaCodec.BufferInfo();
        this.mBuffers = null;
    }

    @Override // org.easydarwin.video.EasyMuxer
    public synchronized void addTrack(MediaFormat mediaFormat, boolean z) {
        super.addTrack(mediaFormat, z);
        if (!z) {
            this.mAudioFormat = mediaFormat;
        }
    }

    public synchronized void pumpPCMStream(byte[] bArr, int i, long j) throws IOException {
        int dequeueInputBuffer;
        if (this.mMediaCodec == null) {
            if (this.mAudioFormat == null) {
                return;
            }
            this.mMediaCodec = MediaCodec.createEncoderByType("audio/mp4a-latm");
            Log.i(this.TAG, String.valueOf(this.mAudioFormat));
            this.mAudioFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
            this.mAudioFormat.setInteger("aac-profile", 2);
            this.mAudioFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, 16000);
            this.mMediaCodec.configure(this.mAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mMediaCodec.start();
            this.mBuffers = this.mMediaCodec.getOutputBuffers();
        }
        do {
            int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 1000L);
            if (dequeueOutputBuffer >= 0) {
                if ((this.mBufferInfo.flags & 2) == 0 && this.mBufferInfo.presentationTimeUs != 0) {
                    Log.d(this.TAG, String.format("dequeueOutputBuffer data length:%d,tmUS:%d", Integer.valueOf(this.mBufferInfo.size), Long.valueOf(this.mBufferInfo.presentationTimeUs)));
                    pumpStream(this.mBuffers[dequeueOutputBuffer], this.mBufferInfo, false);
                    this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            } else if (dequeueOutputBuffer == -3) {
                this.mBuffers = this.mMediaCodec.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                Log.v(this.TAG, "output format changed...");
                Log.v(this.TAG, "output format changed..." + this.mMediaCodec.getOutputFormat());
            } else if (dequeueOutputBuffer == -1) {
                Log.v(this.TAG, "No buffer available...");
            } else {
                Log.e(this.TAG, "Message: " + dequeueOutputBuffer);
            }
            if (dequeueOutputBuffer < 0) {
                break;
            }
        } while (!Thread.currentThread().isInterrupted());
        ByteBuffer[] inputBuffers = this.mMediaCodec.getInputBuffers();
        do {
            dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(1000L);
            if (dequeueInputBuffer >= 0) {
                inputBuffers[dequeueInputBuffer].clear();
                inputBuffers[dequeueInputBuffer].put(bArr, 0, i);
                Log.d(this.TAG, String.format("queueInputBuffer pcm data length:%d,tmUS:%d", Integer.valueOf(i), Long.valueOf(j)));
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
            }
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
        } while (dequeueInputBuffer < 0);
    }

    @Override // org.easydarwin.video.EasyMuxer
    public synchronized void release() {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
        this.mMediaCodec = null;
        super.release();
    }
}
