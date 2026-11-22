package io.agora.mediaplayer;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface IMediaPlayerCustomDataProvider {
    int onReadData(ByteBuffer buffer, int bufferSize);

    long onSeek(long offset, int whence);
}
