package livekit.org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat format, Surface surface, MediaCrypto crypto, int flags);

    Surface createInputSurface();

    int dequeueInputBuffer(long timeoutUs);

    int dequeueOutputBuffer(MediaCodec.BufferInfo info, long timeoutUs);

    void flush();

    MediaCodecInfo getCodecInfo();

    ByteBuffer getInputBuffer(int index);

    MediaFormat getInputFormat();

    ByteBuffer getOutputBuffer(int index);

    MediaFormat getOutputFormat();

    MediaFormat getOutputFormat(int index);

    void queueInputBuffer(int index, int offset, int size, long presentationTimeUs, int flags);

    void release();

    void releaseOutputBuffer(int index, boolean render);

    void setParameters(Bundle params);

    void start();

    void stop();
}
