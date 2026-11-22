package com.otaliastudios.cameraview.video.encoding;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.video.encoding.MediaEncoderEngine;
import com.otaliastudios.cameraview.video.encoding.VideoConfig;
import java.io.IOException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes17.dex */
public abstract class VideoMediaEncoder<C extends VideoConfig> extends MediaEncoder {
    protected C mConfig;
    protected int mFrameNumber;
    protected Surface mSurface;
    private boolean mSyncFrameFound;
    private static final String TAG = "VideoMediaEncoder";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    VideoMediaEncoder(C c) {
        super("VideoEncoder");
        this.mFrameNumber = -1;
        this.mSyncFrameFound = false;
        this.mConfig = c;
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected void onPrepare(MediaEncoderEngine.Controller controller, long j) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.mConfig.mimeType, this.mConfig.width, this.mConfig.height);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, this.mConfig.bitRate);
        createVideoFormat.setInteger("frame-rate", this.mConfig.frameRate);
        createVideoFormat.setInteger("i-frame-interval", 1);
        createVideoFormat.setInteger("rotation-degrees", this.mConfig.rotation);
        try {
            if (this.mConfig.encoder != null) {
                this.mMediaCodec = MediaCodec.createByCodecName(this.mConfig.encoder);
            } else {
                this.mMediaCodec = MediaCodec.createEncoderByType(this.mConfig.mimeType);
            }
            this.mMediaCodec.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mSurface = this.mMediaCodec.createInputSurface();
            this.mMediaCodec.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected void onStart() {
        this.mFrameNumber = 0;
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected void onStop() {
        LOG.i("onStop", "setting mFrameNumber to 1 and signaling the end of input stream.");
        this.mFrameNumber = -1;
        this.mMediaCodec.signalEndOfInputStream();
        drainOutput(true);
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected void onWriteOutput(OutputBufferPool outputBufferPool, OutputBuffer outputBuffer) {
        if (!this.mSyncFrameFound) {
            CameraLogger cameraLogger = LOG;
            cameraLogger.w("onWriteOutput:", "sync frame not found yet. Checking.");
            if ((outputBuffer.info.flags & 1) == 1) {
                cameraLogger.w("onWriteOutput:", "SYNC FRAME FOUND!");
                this.mSyncFrameFound = true;
                super.onWriteOutput(outputBufferPool, outputBuffer);
                return;
            } else {
                cameraLogger.w("onWriteOutput:", "DROPPING FRAME and requesting a sync frame soon.");
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.mMediaCodec.setParameters(bundle);
                outputBufferPool.recycle(outputBuffer);
                return;
            }
        }
        super.onWriteOutput(outputBufferPool, outputBuffer);
    }

    @Override // com.otaliastudios.cameraview.video.encoding.MediaEncoder
    protected int getEncodedBitRate() {
        return this.mConfig.bitRate;
    }

    protected boolean shouldRenderFrame(long j) {
        if (j == 0 || this.mFrameNumber < 0 || hasReachedMaxLength()) {
            return false;
        }
        this.mFrameNumber++;
        return true;
    }
}
