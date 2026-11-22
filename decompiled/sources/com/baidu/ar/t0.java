package com.baidu.ar;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.baidu.ar.record.EncoderParams;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* loaded from: classes12.dex */
public class t0 extends e1 {
    public static final String k = "t0";
    public long j = 0;

    public void a(EncoderParams encoderParams, z8 z8Var) {
        boolean z = false;
        if (encoderParams != null && z8Var != null) {
            this.c = z8Var;
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString(IMediaFormat.KEY_MIME, encoderParams.getAudioCodec());
            mediaFormat.setInteger("aac-profile", 2);
            mediaFormat.setInteger("sample-rate", encoderParams.getAudioSampleRate());
            mediaFormat.setInteger("channel-count", encoderParams.getAudioChannel());
            mediaFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, encoderParams.getAudioBitrate());
            mediaFormat.setInteger("max-input-size", encoderParams.getAudioFrameSize());
            try {
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(encoderParams.getAudioCodec());
                this.d = createEncoderByType;
                createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                if (encoderParams.isVideoIncluded()) {
                    this.g = false;
                } else {
                    this.g = true;
                }
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        p3 p3Var = this.f;
        if (p3Var != null) {
            p3Var.a(z, null);
        }
    }

    @Override // com.baidu.ar.e1
    public void d() {
        if (this.h == 0) {
            this.h = this.e.presentationTimeUs;
        }
        MediaCodec.BufferInfo bufferInfo = this.e;
        long j = bufferInfo.presentationTimeUs - this.h;
        bufferInfo.presentationTimeUs = j;
        long j2 = this.j;
        if (j < j2) {
            long j3 = j2 + 10000;
            this.j = j3;
            bufferInfo.presentationTimeUs = j3;
        }
        this.j = bufferInfo.presentationTimeUs;
        h.a(k, "syncTimestamp mAudioEncoder = " + this.e.size + "|" + this.e.presentationTimeUs);
    }
}
