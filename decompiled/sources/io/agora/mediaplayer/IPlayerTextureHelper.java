package io.agora.mediaplayer;

import android.view.Surface;
import io.agora.base.VideoFrame;

/* loaded from: classes6.dex */
public interface IPlayerTextureHelper {
    void dispose();

    VideoFrame getAvailableTextureInfo(int waitTime);

    long getEglContextHandler();

    VideoFrame getFakeTextureInfo();

    Surface getRenderGlSurface();

    void releaseRenderedTextureInfo(VideoFrame info);

    void resetTextureBufferQueue();

    void setTextureSize(int witdh, int height);
}
