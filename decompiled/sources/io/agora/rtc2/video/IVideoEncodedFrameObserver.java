package io.agora.rtc2.video;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface IVideoEncodedFrameObserver {
    boolean onEncodedVideoFrameReceived(ByteBuffer buffer, EncodedVideoFrameInfo info);
}
